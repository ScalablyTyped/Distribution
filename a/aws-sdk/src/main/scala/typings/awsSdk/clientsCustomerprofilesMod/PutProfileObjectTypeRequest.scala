package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutProfileObjectTypeRequest extends StObject {
  
  /**
    * Indicates whether a profile should be created when data is received if one doesn’t exist for an object of this type. The default is FALSE. If the AllowProfileCreation flag is set to FALSE, then the service tries to fetch a standard profile and associate this object with the profile. If it is set to TRUE, and if no match is found, then the service creates a new standard profile.
    */
  var AllowProfileCreation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Description of the profile object type.
    */
  var Description: text
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * The customer-provided key to encrypt the profile object that will be created in this profile object type.
    */
  var EncryptionKey: js.UndefOr[encryptionKey] = js.undefined
  
  /**
    * The number of days until the data in the object expires.
    */
  var ExpirationDays: js.UndefOr[expirationDaysInteger] = js.undefined
  
  /**
    * A map of the name and ObjectType field.
    */
  var Fields: js.UndefOr[FieldMap] = js.undefined
  
  /**
    * A list of unique keys that can be used to map data to the profile.
    */
  var Keys: js.UndefOr[KeyMap] = js.undefined
  
  /**
    * The name of the profile object type.
    */
  var ObjectTypeName: typeName
  
  /**
    * The format of your sourceLastUpdatedTimestamp that was previously set up. 
    */
  var SourceLastUpdatedTimestampFormat: js.UndefOr[string1To255] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * A unique identifier for the object template. For some attributes in the request, the service will use the default value from the object template when TemplateId is present. If these attributes are present in the request, the service may return a BadRequestException. These attributes include: AllowProfileCreation, SourceLastUpdatedTimestampFormat, Fields, and Keys. For example, if AllowProfileCreation is set to true when TemplateId is set, the service may return a BadRequestException.
    */
  var TemplateId: js.UndefOr[name] = js.undefined
}
object PutProfileObjectTypeRequest {
  
  inline def apply(Description: text, DomainName: name, ObjectTypeName: typeName): PutProfileObjectTypeRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], ObjectTypeName = ObjectTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutProfileObjectTypeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutProfileObjectTypeRequest] (val x: Self) extends AnyVal {
    
    inline def setAllowProfileCreation(value: Boolean): Self = StObject.set(x, "AllowProfileCreation", value.asInstanceOf[js.Any])
    
    inline def setAllowProfileCreationUndefined: Self = StObject.set(x, "AllowProfileCreation", js.undefined)
    
    inline def setDescription(value: text): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKey(value: encryptionKey): Self = StObject.set(x, "EncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "EncryptionKey", js.undefined)
    
    inline def setExpirationDays(value: expirationDaysInteger): Self = StObject.set(x, "ExpirationDays", value.asInstanceOf[js.Any])
    
    inline def setExpirationDaysUndefined: Self = StObject.set(x, "ExpirationDays", js.undefined)
    
    inline def setFields(value: FieldMap): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "Fields", js.undefined)
    
    inline def setKeys(value: KeyMap): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "Keys", js.undefined)
    
    inline def setObjectTypeName(value: typeName): Self = StObject.set(x, "ObjectTypeName", value.asInstanceOf[js.Any])
    
    inline def setSourceLastUpdatedTimestampFormat(value: string1To255): Self = StObject.set(x, "SourceLastUpdatedTimestampFormat", value.asInstanceOf[js.Any])
    
    inline def setSourceLastUpdatedTimestampFormatUndefined: Self = StObject.set(x, "SourceLastUpdatedTimestampFormat", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTemplateId(value: name): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "TemplateId", js.undefined)
  }
}
