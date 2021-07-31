package typings.awsSdk.apigatewayMod

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
  
  @scala.inline
  def apply(): DocumentationPartIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentationPartIds]
  }
  
  @scala.inline
  implicit class DocumentationPartIdsMutableBuilder[Self <: DocumentationPartIds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIds(value: ListOfString): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: ListOfString): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
