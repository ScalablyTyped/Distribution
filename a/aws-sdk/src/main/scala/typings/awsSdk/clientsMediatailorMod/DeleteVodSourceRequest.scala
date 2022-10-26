package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVodSourceRequest extends StObject {
  
  /**
    * The name of the source location associated with this VOD Source.
    */
  var SourceLocationName: string
  
  /**
    * The name of the VOD source.
    */
  var VodSourceName: string
}
object DeleteVodSourceRequest {
  
  inline def apply(SourceLocationName: string, VodSourceName: string): DeleteVodSourceRequest = {
    val __obj = js.Dynamic.literal(SourceLocationName = SourceLocationName.asInstanceOf[js.Any], VodSourceName = VodSourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVodSourceRequest]
  }
  
  extension [Self <: DeleteVodSourceRequest](x: Self) {
    
    inline def setSourceLocationName(value: string): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setVodSourceName(value: string): Self = StObject.set(x, "VodSourceName", value.asInstanceOf[js.Any])
  }
}
