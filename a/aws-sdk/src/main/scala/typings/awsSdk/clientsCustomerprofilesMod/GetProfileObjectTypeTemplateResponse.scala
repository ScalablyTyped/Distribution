package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProfileObjectTypeTemplateResponse extends StObject {
  
  /**
    * Indicates whether a profile should be created when data is received if one doesn’t exist for an object of this type. The default is FALSE. If the AllowProfileCreation flag is set to FALSE, then the service tries to fetch a standard profile and associate this object with the profile. If it is set to TRUE, and if no match is found, then the service creates a new standard profile.
    */
  var AllowProfileCreation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A map of the name and ObjectType field.
    */
  var Fields: js.UndefOr[FieldMap] = js.undefined
  
  /**
    * A list of unique keys that can be used to map data to the profile.
    */
  var Keys: js.UndefOr[KeyMap] = js.undefined
  
  /**
    * The format of your sourceLastUpdatedTimestamp that was previously set up.
    */
  var SourceLastUpdatedTimestampFormat: js.UndefOr[string1To255] = js.undefined
  
  /**
    * The name of the source of the object template.
    */
  var SourceName: js.UndefOr[name] = js.undefined
  
  /**
    * The source of the object template.
    */
  var SourceObject: js.UndefOr[name] = js.undefined
  
  /**
    * A unique identifier for the object template.
    */
  var TemplateId: js.UndefOr[name] = js.undefined
}
object GetProfileObjectTypeTemplateResponse {
  
  inline def apply(): GetProfileObjectTypeTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProfileObjectTypeTemplateResponse]
  }
  
  extension [Self <: GetProfileObjectTypeTemplateResponse](x: Self) {
    
    inline def setAllowProfileCreation(value: Boolean): Self = StObject.set(x, "AllowProfileCreation", value.asInstanceOf[js.Any])
    
    inline def setAllowProfileCreationUndefined: Self = StObject.set(x, "AllowProfileCreation", js.undefined)
    
    inline def setFields(value: FieldMap): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "Fields", js.undefined)
    
    inline def setKeys(value: KeyMap): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "Keys", js.undefined)
    
    inline def setSourceLastUpdatedTimestampFormat(value: string1To255): Self = StObject.set(x, "SourceLastUpdatedTimestampFormat", value.asInstanceOf[js.Any])
    
    inline def setSourceLastUpdatedTimestampFormatUndefined: Self = StObject.set(x, "SourceLastUpdatedTimestampFormat", js.undefined)
    
    inline def setSourceName(value: name): Self = StObject.set(x, "SourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceNameUndefined: Self = StObject.set(x, "SourceName", js.undefined)
    
    inline def setSourceObject(value: name): Self = StObject.set(x, "SourceObject", value.asInstanceOf[js.Any])
    
    inline def setSourceObjectUndefined: Self = StObject.set(x, "SourceObject", js.undefined)
    
    inline def setTemplateId(value: name): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "TemplateId", js.undefined)
  }
}
