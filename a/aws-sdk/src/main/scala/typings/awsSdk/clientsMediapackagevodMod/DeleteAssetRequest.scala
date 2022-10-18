package typings.awsSdk.clientsMediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAssetRequest extends StObject {
  
  /**
    * The ID of the MediaPackage VOD Asset resource to delete.
    */
  var Id: string
}
object DeleteAssetRequest {
  
  inline def apply(Id: string): DeleteAssetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssetRequest]
  }
  
  extension [Self <: DeleteAssetRequest](x: Self) {
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
