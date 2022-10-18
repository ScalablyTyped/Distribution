package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model extends StObject {
  
  /**
    * The content-type for the model, for example, "application/json".
    */
  var ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined
  
  /**
    * The description of the model.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  
  /**
    * The model identifier.
    */
  var ModelId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name of the model. Must be alphanumeric.
    */
  var Name: StringWithLengthBetween1And128
  
  /**
    * The schema for the model. For application/json models, this should be JSON schema draft 4 model.
    */
  var Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.undefined
}
object Model {
  
  inline def apply(Name: StringWithLengthBetween1And128): Model = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
  
  extension [Self <: Model](x: Self) {
    
    inline def setContentType(value: StringWithLengthBetween1And256): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setDescription(value: StringWithLengthBetween0And1024): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setModelId(value: Id): Self = StObject.set(x, "ModelId", value.asInstanceOf[js.Any])
    
    inline def setModelIdUndefined: Self = StObject.set(x, "ModelId", js.undefined)
    
    inline def setName(value: StringWithLengthBetween1And128): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: StringWithLengthBetween0And32K): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "Schema", js.undefined)
  }
}
