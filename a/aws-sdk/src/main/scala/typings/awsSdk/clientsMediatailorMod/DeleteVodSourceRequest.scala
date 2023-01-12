package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVodSourceRequest extends StObject {
  
  /**
    * The name of the source location associated with this VOD Source.
    */
  var SourceLocationName: _String
  
  /**
    * The name of the VOD source.
    */
  var VodSourceName: _String
}
object DeleteVodSourceRequest {
  
  inline def apply(SourceLocationName: _String, VodSourceName: _String): DeleteVodSourceRequest = {
    val __obj = js.Dynamic.literal(SourceLocationName = SourceLocationName.asInstanceOf[js.Any], VodSourceName = VodSourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVodSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVodSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setSourceLocationName(value: _String): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setVodSourceName(value: _String): Self = StObject.set(x, "VodSourceName", value.asInstanceOf[js.Any])
  }
}
