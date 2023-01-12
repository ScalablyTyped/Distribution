package typings.awsSdk.clientsSchemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSchemaRequest extends StObject {
  
  /**
    * The ID of the client token.
    */
  var ClientTokenId: js.UndefOr[stringMin0Max36] = js.undefined
  
  /**
    * The source of the schema definition.
    */
  var Content: js.UndefOr[stringMin1Max100000] = js.undefined
  
  /**
    * The description of the schema.
    */
  var Description: js.UndefOr[stringMin0Max256] = js.undefined
  
  /**
    * The name of the registry.
    */
  var RegistryName: string
  
  /**
    * The name of the schema.
    */
  var SchemaName: string
  
  /**
    * The schema type for the events schema.
    */
  var Type: js.UndefOr[typings.awsSdk.clientsSchemasMod.Type] = js.undefined
}
object UpdateSchemaRequest {
  
  inline def apply(RegistryName: string, SchemaName: string): UpdateSchemaRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSchemaRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSchemaRequest] (val x: Self) extends AnyVal {
    
    inline def setClientTokenId(value: stringMin0Max36): Self = StObject.set(x, "ClientTokenId", value.asInstanceOf[js.Any])
    
    inline def setClientTokenIdUndefined: Self = StObject.set(x, "ClientTokenId", js.undefined)
    
    inline def setContent(value: stringMin1Max100000): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setDescription(value: stringMin0Max256): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    inline def setSchemaName(value: string): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
