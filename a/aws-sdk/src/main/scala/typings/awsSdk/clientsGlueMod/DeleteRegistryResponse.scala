package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRegistryResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the registry being deleted.
    */
  var RegistryArn: js.UndefOr[GlueResourceArn] = js.undefined
  
  /**
    * The name of the registry being deleted.
    */
  var RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined
  
  /**
    * The status of the registry. A successful operation will return the Deleting status.
    */
  var Status: js.UndefOr[RegistryStatus] = js.undefined
}
object DeleteRegistryResponse {
  
  inline def apply(): DeleteRegistryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRegistryResponse]
  }
  
  extension [Self <: DeleteRegistryResponse](x: Self) {
    
    inline def setRegistryArn(value: GlueResourceArn): Self = StObject.set(x, "RegistryArn", value.asInstanceOf[js.Any])
    
    inline def setRegistryArnUndefined: Self = StObject.set(x, "RegistryArn", js.undefined)
    
    inline def setRegistryName(value: SchemaRegistryNameString): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    inline def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
    
    inline def setStatus(value: RegistryStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
