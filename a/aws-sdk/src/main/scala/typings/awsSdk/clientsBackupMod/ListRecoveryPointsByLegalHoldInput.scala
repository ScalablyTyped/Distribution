package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecoveryPointsByLegalHoldInput extends StObject {
  
  /**
    * This is the ID of the legal hold.
    */
  var LegalHoldId: String
  
  /**
    * This is the maximum number of resource list items to be returned.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsBackupMod.MaxResults] = js.undefined
  
  /**
    * This is the next item following a partial list of returned resources. For example, if a request is made to return maxResults number of resources, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListRecoveryPointsByLegalHoldInput {
  
  inline def apply(LegalHoldId: String): ListRecoveryPointsByLegalHoldInput = {
    val __obj = js.Dynamic.literal(LegalHoldId = LegalHoldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecoveryPointsByLegalHoldInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRecoveryPointsByLegalHoldInput] (val x: Self) extends AnyVal {
    
    inline def setLegalHoldId(value: String): Self = StObject.set(x, "LegalHoldId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
