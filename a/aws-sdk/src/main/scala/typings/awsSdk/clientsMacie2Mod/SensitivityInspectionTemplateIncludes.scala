package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensitivityInspectionTemplateIncludes extends StObject {
  
  /**
    * An array of unique identifiers, one for each allow list to include.
    */
  var allowListIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * An array of unique identifiers, one for each custom data identifier to include.
    */
  var customDataIdentifierIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * An array of unique identifiers, one for each managed data identifier to include. Amazon Macie uses these managed data identifiers in addition to managed data identifiers that are subsequently released and recommended for automated sensitive data discovery. To retrieve a list of valid values for the managed data identifiers that are currently available, use the ListManagedDataIdentifiers operation. 
    */
  var managedDataIdentifierIds: js.UndefOr[listOfString] = js.undefined
}
object SensitivityInspectionTemplateIncludes {
  
  inline def apply(): SensitivityInspectionTemplateIncludes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SensitivityInspectionTemplateIncludes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SensitivityInspectionTemplateIncludes] (val x: Self) extends AnyVal {
    
    inline def setAllowListIds(value: listOfString): Self = StObject.set(x, "allowListIds", value.asInstanceOf[js.Any])
    
    inline def setAllowListIdsUndefined: Self = StObject.set(x, "allowListIds", js.undefined)
    
    inline def setAllowListIdsVarargs(value: string*): Self = StObject.set(x, "allowListIds", js.Array(value*))
    
    inline def setCustomDataIdentifierIds(value: listOfString): Self = StObject.set(x, "customDataIdentifierIds", value.asInstanceOf[js.Any])
    
    inline def setCustomDataIdentifierIdsUndefined: Self = StObject.set(x, "customDataIdentifierIds", js.undefined)
    
    inline def setCustomDataIdentifierIdsVarargs(value: string*): Self = StObject.set(x, "customDataIdentifierIds", js.Array(value*))
    
    inline def setManagedDataIdentifierIds(value: listOfString): Self = StObject.set(x, "managedDataIdentifierIds", value.asInstanceOf[js.Any])
    
    inline def setManagedDataIdentifierIdsUndefined: Self = StObject.set(x, "managedDataIdentifierIds", js.undefined)
    
    inline def setManagedDataIdentifierIdsVarargs(value: string*): Self = StObject.set(x, "managedDataIdentifierIds", js.Array(value*))
  }
}
