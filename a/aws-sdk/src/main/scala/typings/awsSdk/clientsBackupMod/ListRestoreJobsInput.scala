package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRestoreJobsInput extends StObject {
  
  /**
    * The account ID to list the jobs from. Returns only restore jobs associated with the specified account ID.
    */
  var ByAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * Returns only copy jobs completed after a date expressed in Unix format and Coordinated Universal Time (UTC).
    */
  var ByCompleteAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Returns only copy jobs completed before a date expressed in Unix format and Coordinated Universal Time (UTC).
    */
  var ByCompleteBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Returns only restore jobs that were created after the specified date.
    */
  var ByCreatedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Returns only restore jobs that were created before the specified date.
    */
  var ByCreatedBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Returns only restore jobs associated with the specified job status.
    */
  var ByStatus: js.UndefOr[RestoreJobStatus] = js.undefined
  
  /**
    * The maximum number of items to be returned.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsBackupMod.MaxResults] = js.undefined
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListRestoreJobsInput {
  
  inline def apply(): ListRestoreJobsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRestoreJobsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRestoreJobsInput] (val x: Self) extends AnyVal {
    
    inline def setByAccountId(value: AccountId): Self = StObject.set(x, "ByAccountId", value.asInstanceOf[js.Any])
    
    inline def setByAccountIdUndefined: Self = StObject.set(x, "ByAccountId", js.undefined)
    
    inline def setByCompleteAfter(value: js.Date): Self = StObject.set(x, "ByCompleteAfter", value.asInstanceOf[js.Any])
    
    inline def setByCompleteAfterUndefined: Self = StObject.set(x, "ByCompleteAfter", js.undefined)
    
    inline def setByCompleteBefore(value: js.Date): Self = StObject.set(x, "ByCompleteBefore", value.asInstanceOf[js.Any])
    
    inline def setByCompleteBeforeUndefined: Self = StObject.set(x, "ByCompleteBefore", js.undefined)
    
    inline def setByCreatedAfter(value: js.Date): Self = StObject.set(x, "ByCreatedAfter", value.asInstanceOf[js.Any])
    
    inline def setByCreatedAfterUndefined: Self = StObject.set(x, "ByCreatedAfter", js.undefined)
    
    inline def setByCreatedBefore(value: js.Date): Self = StObject.set(x, "ByCreatedBefore", value.asInstanceOf[js.Any])
    
    inline def setByCreatedBeforeUndefined: Self = StObject.set(x, "ByCreatedBefore", js.undefined)
    
    inline def setByStatus(value: RestoreJobStatus): Self = StObject.set(x, "ByStatus", value.asInstanceOf[js.Any])
    
    inline def setByStatusUndefined: Self = StObject.set(x, "ByStatus", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
