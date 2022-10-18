package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchListObjectParentsResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  
  /**
    * Returns a list of parent reference and LinkName Tuples.
    */
  var ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList] = js.undefined
}
object BatchListObjectParentsResponse {
  
  inline def apply(): BatchListObjectParentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListObjectParentsResponse]
  }
  
  extension [Self <: BatchListObjectParentsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setParentLinks(value: ObjectIdentifierAndLinkNameList): Self = StObject.set(x, "ParentLinks", value.asInstanceOf[js.Any])
    
    inline def setParentLinksUndefined: Self = StObject.set(x, "ParentLinks", js.undefined)
    
    inline def setParentLinksVarargs(value: ObjectIdentifierAndLinkNameTuple*): Self = StObject.set(x, "ParentLinks", js.Array(value*))
  }
}
