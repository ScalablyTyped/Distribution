package typings.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildPaths extends js.Object {
  
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
  implicit class BuildPathsOps[Self <: BuildPaths] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuildPathsVarargs(value: String*): Self = this.set("buildPaths", js.Array(value :_*))
    
    @scala.inline
    def setBuildPaths(value: js.Array[String]): Self = this.set("buildPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPathsVarargs(value: String*): Self = this.set("testPaths", js.Array(value :_*))
    
    @scala.inline
    def setTestPaths(value: js.Array[String]): Self = this.set("testPaths", value.asInstanceOf[js.Any])
  }
}
