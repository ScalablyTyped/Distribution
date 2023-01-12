package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectTypeKey extends StObject {
  
  /**
    * The reference for the key name of the fields map.
    */
  var FieldNames: js.UndefOr[FieldNameList] = js.undefined
  
  /**
    * The types of keys that a ProfileObject can have. Each ProfileObject can have only 1 UNIQUE key but multiple PROFILE keys. PROFILE, ASSET, CASE, or ORDER means that this key can be used to tie an object to a PROFILE, ASSET, CASE, or ORDER respectively. UNIQUE means that it can be used to uniquely identify an object. If a key a is marked as SECONDARY, it will be used to search for profiles after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to match a profile but is not persisted to be used for searching of the profile. A NEW_ONLY key is only used if the profile does not already exist before the object is ingested, otherwise it is only used for matching objects to profiles.
    */
  var StandardIdentifiers: js.UndefOr[StandardIdentifierList] = js.undefined
}
object ObjectTypeKey {
  
  inline def apply(): ObjectTypeKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectTypeKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectTypeKey] (val x: Self) extends AnyVal {
    
    inline def setFieldNames(value: FieldNameList): Self = StObject.set(x, "FieldNames", value.asInstanceOf[js.Any])
    
    inline def setFieldNamesUndefined: Self = StObject.set(x, "FieldNames", js.undefined)
    
    inline def setFieldNamesVarargs(value: name*): Self = StObject.set(x, "FieldNames", js.Array(value*))
    
    inline def setStandardIdentifiers(value: StandardIdentifierList): Self = StObject.set(x, "StandardIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setStandardIdentifiersUndefined: Self = StObject.set(x, "StandardIdentifiers", js.undefined)
    
    inline def setStandardIdentifiersVarargs(value: StandardIdentifier*): Self = StObject.set(x, "StandardIdentifiers", js.Array(value*))
  }
}
