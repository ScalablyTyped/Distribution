package typings.atomMochaTestRunner

import org.scalablytyped.runtime.Shortcut
import typings.atom.mod.TestRunner
import typings.mocha.Mocha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("atom-mocha-test-runner", JSImport.Namespace)
  @js.native
  val ^ : TestRunnerExport = js.native
  
  trait AtomMochaOptions extends StObject {
    
    /** Whether or not to colorize output on the terminal. */
    var colors: js.UndefOr[Boolean] = js.undefined
    
    /** Whether or not to assign the created Atom environment to `global.atom`. */
    var globalAtom: js.UndefOr[Boolean] = js.undefined
    
    /** The string to use for the window title in the HTML reporter. */
    var htmlTitle: js.UndefOr[String] = js.undefined
    
    /** Which reporter to use on the terminal. */
    var reporter: js.UndefOr[String] = js.undefined
    
    /** File extensions that indicate that the file contains tests. */
    var testSuffixes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object AtomMochaOptions {
    
    @scala.inline
    def apply(): AtomMochaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AtomMochaOptions]
    }
    
    @scala.inline
    implicit class AtomMochaOptionsMutableBuilder[Self <: AtomMochaOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setGlobalAtom(value: Boolean): Self = StObject.set(x, "globalAtom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalAtomUndefined: Self = StObject.set(x, "globalAtom", js.undefined)
      
      @scala.inline
      def setHtmlTitle(value: String): Self = StObject.set(x, "htmlTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlTitleUndefined: Self = StObject.set(x, "htmlTitle", js.undefined)
      
      @scala.inline
      def setReporter(value: String): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      @scala.inline
      def setTestSuffixes(value: js.Array[String]): Self = StObject.set(x, "testSuffixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestSuffixesUndefined: Self = StObject.set(x, "testSuffixes", js.undefined)
      
      @scala.inline
      def setTestSuffixesVarargs(value: String*): Self = StObject.set(x, "testSuffixes", js.Array(value :_*))
    }
  }
  
  // The test runner function is augmented on export by:
  //   import createRunner from './lib/create-runner'
  //
  //   module.exports = createRunner()
  //   module.exports.createRunner = createRunner
  // Which is what we're trying to model here.
  @js.native
  trait TestRunnerExport extends TestRunner {
    
    def createRunner(): TestRunner = js.native
    def createRunner(options: Unit, mochaConfigFunction: js.Function1[/* mocha */ Mocha, Unit]): TestRunner = js.native
    def createRunner(options: AtomMochaOptions): TestRunner = js.native
    def createRunner(options: AtomMochaOptions, mochaConfigFunction: js.Function1[/* mocha */ Mocha, Unit]): TestRunner = js.native
  }
  
  type _To = TestRunnerExport
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: TestRunnerExport = ^
}
