package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepoStatusChangedEvent extends StObject {
  
  var path: String
  
  /**
    *  This value can be passed to ::isStatusModified or ::isStatusNew to get more
    *  information.
    */
  var pathStatus: Double
}
object RepoStatusChangedEvent {
  
  inline def apply(path: String, pathStatus: Double): RepoStatusChangedEvent = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], pathStatus = pathStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoStatusChangedEvent]
  }
  
  extension [Self <: RepoStatusChangedEvent](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathStatus(value: Double): Self = StObject.set(x, "pathStatus", value.asInstanceOf[js.Any])
  }
}
