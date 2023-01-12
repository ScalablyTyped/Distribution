package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLiveSourceRequest extends StObject {
  
  /**
    * The name of the live source.
    */
  var LiveSourceName: _String
  
  /**
    * The name of the source location associated with this Live Source.
    */
  var SourceLocationName: _String
}
object DeleteLiveSourceRequest {
  
  inline def apply(LiveSourceName: _String, SourceLocationName: _String): DeleteLiveSourceRequest = {
    val __obj = js.Dynamic.literal(LiveSourceName = LiveSourceName.asInstanceOf[js.Any], SourceLocationName = SourceLocationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLiveSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLiveSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setLiveSourceName(value: _String): Self = StObject.set(x, "LiveSourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationName(value: _String): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
  }
}
