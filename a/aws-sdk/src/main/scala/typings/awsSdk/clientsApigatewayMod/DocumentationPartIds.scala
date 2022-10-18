package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentationPartIds extends StObject {
  
  /**
    * A list of the returned documentation part identifiers.
    */
  var ids: js.UndefOr[ListOfString] = js.undefined
  
  /**
    * A list of warning messages reported during import of documentation parts.
    */
  var warnings: js.UndefOr[ListOfString] = js.undefined
}
object DocumentationPartIds {
  
  inline def apply(): DocumentationPartIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentationPartIds]
  }
  
  extension [Self <: DocumentationPartIds](x: Self) {
    
    inline def setIds(value: ListOfString): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setWarnings(value: ListOfString): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
