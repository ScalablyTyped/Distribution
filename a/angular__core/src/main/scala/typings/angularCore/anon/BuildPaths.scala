package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildPaths extends StObject {
  
  var buildPaths: js.Array[String] = js.native
  
  var testPaths: js.Array[String] = js.native
}
object BuildPaths {
  
  @scala.inline
  def apply(buildPaths: js.Array[String], testPaths: js.Array[String]): BuildPaths = {
    val __obj = js.Dynamic.literal(buildPaths = buildPaths.asInstanceOf[js.Any], testPaths = testPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildPaths]
  }
  
  @scala.inline
  implicit class BuildPathsMutableBuilder[Self <: BuildPaths] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildPaths(value: js.Array[String]): Self = StObject.set(x, "buildPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildPathsVarargs(value: String*): Self = StObject.set(x, "buildPaths", js.Array(value :_*))
    
    @scala.inline
    def setTestPaths(value: js.Array[String]): Self = StObject.set(x, "testPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPathsVarargs(value: String*): Self = StObject.set(x, "testPaths", js.Array(value :_*))
  }
}
