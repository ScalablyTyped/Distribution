package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSensitivityInspectionTemplatesResponse extends StObject {
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.undefined
  
  /**
    * An array that specifies the unique identifier and name of the sensitivity inspection template for the account.
    */
  var sensitivityInspectionTemplates: js.UndefOr[listOfSensitivityInspectionTemplatesEntry] = js.undefined
}
object ListSensitivityInspectionTemplatesResponse {
  
  inline def apply(): ListSensitivityInspectionTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSensitivityInspectionTemplatesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSensitivityInspectionTemplatesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSensitivityInspectionTemplates(value: listOfSensitivityInspectionTemplatesEntry): Self = StObject.set(x, "sensitivityInspectionTemplates", value.asInstanceOf[js.Any])
    
    inline def setSensitivityInspectionTemplatesUndefined: Self = StObject.set(x, "sensitivityInspectionTemplates", js.undefined)
    
    inline def setSensitivityInspectionTemplatesVarargs(value: SensitivityInspectionTemplatesEntry*): Self = StObject.set(x, "sensitivityInspectionTemplates", js.Array(value*))
  }
}
