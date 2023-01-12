package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomLineItemVersionsOutput extends StObject {
  
  /**
    * A list of CustomLineItemVersionListElements that are received.
    */
  var CustomLineItemVersions: js.UndefOr[CustomLineItemVersionList] = js.undefined
  
  /**
    * The pagination token that's used on subsequent calls to retrieve custom line item versions.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListCustomLineItemVersionsOutput {
  
  inline def apply(): ListCustomLineItemVersionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomLineItemVersionsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCustomLineItemVersionsOutput] (val x: Self) extends AnyVal {
    
    inline def setCustomLineItemVersions(value: CustomLineItemVersionList): Self = StObject.set(x, "CustomLineItemVersions", value.asInstanceOf[js.Any])
    
    inline def setCustomLineItemVersionsUndefined: Self = StObject.set(x, "CustomLineItemVersions", js.undefined)
    
    inline def setCustomLineItemVersionsVarargs(value: CustomLineItemVersionListElement*): Self = StObject.set(x, "CustomLineItemVersions", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
