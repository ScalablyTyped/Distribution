package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRegistryResponse extends StObject {
  
  /**
    * The Amazon Resource name (ARN) of the updated registry.
    */
  var RegistryArn: js.UndefOr[GlueResourceArn] = js.undefined
  
  /**
    * The name of the updated registry.
    */
  var RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined
}
object UpdateRegistryResponse {
  
  inline def apply(): UpdateRegistryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRegistryResponse]
  }
  
  extension [Self <: UpdateRegistryResponse](x: Self) {
    
    inline def setRegistryArn(value: GlueResourceArn): Self = StObject.set(x, "RegistryArn", value.asInstanceOf[js.Any])
    
    inline def setRegistryArnUndefined: Self = StObject.set(x, "RegistryArn", js.undefined)
    
    inline def setRegistryName(value: SchemaRegistryNameString): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    inline def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
  }
}
