package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensitivityInspectionTemplateExcludes extends StObject {
  
  /**
    * An array of unique identifiers, one for each managed data identifier to exclude. To retrieve a list of valid values, use the ListManagedDataIdentifiers operation.
    */
  var managedDataIdentifierIds: js.UndefOr[listOfString] = js.undefined
}
object SensitivityInspectionTemplateExcludes {
  
  inline def apply(): SensitivityInspectionTemplateExcludes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SensitivityInspectionTemplateExcludes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SensitivityInspectionTemplateExcludes] (val x: Self) extends AnyVal {
    
    inline def setManagedDataIdentifierIds(value: listOfString): Self = StObject.set(x, "managedDataIdentifierIds", value.asInstanceOf[js.Any])
    
    inline def setManagedDataIdentifierIdsUndefined: Self = StObject.set(x, "managedDataIdentifierIds", js.undefined)
    
    inline def setManagedDataIdentifierIdsVarargs(value: string*): Self = StObject.set(x, "managedDataIdentifierIds", js.Array(value*))
  }
}
