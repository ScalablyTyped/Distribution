package typings.atom.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectHistory extends StObject {
  
  var lastOpened: Date
  
  var paths: js.Array[String]
}
object ProjectHistory {
  
  @scala.inline
  def apply(lastOpened: Date, paths: js.Array[String]): ProjectHistory = {
    val __obj = js.Dynamic.literal(lastOpened = lastOpened.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectHistory]
  }
  
  @scala.inline
  implicit class ProjectHistoryMutableBuilder[Self <: ProjectHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastOpened(value: Date): Self = StObject.set(x, "lastOpened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
  }
}
