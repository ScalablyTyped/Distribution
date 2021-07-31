package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectSpecification extends StObject {
  
  var config: js.UndefOr[ConfigValues] = js.undefined
  
  var originPath: String
  
  var paths: js.Array[String]
}
object ProjectSpecification {
  
  @scala.inline
  def apply(originPath: String, paths: js.Array[String]): ProjectSpecification = {
    val __obj = js.Dynamic.literal(originPath = originPath.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSpecification]
  }
  
  @scala.inline
  implicit class ProjectSpecificationMutableBuilder[Self <: ProjectSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: ConfigValues): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setOriginPath(value: String): Self = StObject.set(x, "originPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
  }
}
