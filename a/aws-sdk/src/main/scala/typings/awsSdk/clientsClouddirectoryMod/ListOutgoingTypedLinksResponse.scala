package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOutgoingTypedLinksResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  
  /**
    * Returns a typed link specifier as output.
    */
  var TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined
}
object ListOutgoingTypedLinksResponse {
  
  inline def apply(): ListOutgoingTypedLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOutgoingTypedLinksResponse]
  }
  
  extension [Self <: ListOutgoingTypedLinksResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTypedLinkSpecifiers(value: TypedLinkSpecifierList): Self = StObject.set(x, "TypedLinkSpecifiers", value.asInstanceOf[js.Any])
    
    inline def setTypedLinkSpecifiersUndefined: Self = StObject.set(x, "TypedLinkSpecifiers", js.undefined)
    
    inline def setTypedLinkSpecifiersVarargs(value: TypedLinkSpecifier*): Self = StObject.set(x, "TypedLinkSpecifiers", js.Array(value*))
  }
}
