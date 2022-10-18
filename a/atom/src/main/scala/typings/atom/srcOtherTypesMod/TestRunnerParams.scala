package typings.atom.srcOtherTypesMod

import typings.atom.srcAtomEnvironmentMod.AtomEnvironment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestRunnerParams extends StObject {
  
  /**
    *  A function that can be called to construct an instance of the atom global.
    *  No atom global will be explicitly assigned, but you can assign one in your
    *  runner if desired.
    */
  def buildAtomEnvironment(options: BuildEnvironmentOptions): AtomEnvironment
  
  /**
    *  A function that builds a default instance of the application delegate, suitable
    *  to be passed as the applicationDelegate parameter to buildAtomEnvironment.
    */
  def buildDefaultApplicationDelegate(): js.Object
  
  /**
    *  A boolean indicating whether or not the tests are being run from the command
    *  line via atom --test.
    */
  var headless: Boolean
  
  /** An optional path to a log file to which test output should be logged. */
  var logFile: String
  
  /** An array of paths to tests to run. Could be paths to files or directories. */
  var testPaths: js.Array[String]
}
object TestRunnerParams {
  
  inline def apply(
    buildAtomEnvironment: BuildEnvironmentOptions => AtomEnvironment,
    buildDefaultApplicationDelegate: () => js.Object,
    headless: Boolean,
    logFile: String,
    testPaths: js.Array[String]
  ): TestRunnerParams = {
    val __obj = js.Dynamic.literal(buildAtomEnvironment = js.Any.fromFunction1(buildAtomEnvironment), buildDefaultApplicationDelegate = js.Any.fromFunction0(buildDefaultApplicationDelegate), headless = headless.asInstanceOf[js.Any], logFile = logFile.asInstanceOf[js.Any], testPaths = testPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRunnerParams]
  }
  
  extension [Self <: TestRunnerParams](x: Self) {
    
    inline def setBuildAtomEnvironment(value: BuildEnvironmentOptions => AtomEnvironment): Self = StObject.set(x, "buildAtomEnvironment", js.Any.fromFunction1(value))
    
    inline def setBuildDefaultApplicationDelegate(value: () => js.Object): Self = StObject.set(x, "buildDefaultApplicationDelegate", js.Any.fromFunction0(value))
    
    inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
    
    inline def setLogFile(value: String): Self = StObject.set(x, "logFile", value.asInstanceOf[js.Any])
    
    inline def setTestPaths(value: js.Array[String]): Self = StObject.set(x, "testPaths", value.asInstanceOf[js.Any])
    
    inline def setTestPathsVarargs(value: String*): Self = StObject.set(x, "testPaths", js.Array(value*))
  }
}
