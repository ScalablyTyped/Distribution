package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRestoreJobsInput extends StObject {
  
  /**
    * The account ID to list the jobs from. Returns only restore jobs associated with the specified account ID.
    */
  var ByAccountId: js.UndefOr[AccountId] = js.native
  
  /**
    * Returns only restore jobs that were created after the specified date.
    */
  var ByCreatedAfter: js.UndefOr[timestamp] = js.native
  
  /**
    * Returns only restore jobs that were created before the specified date.
    */
  var ByCreatedBefore: js.UndefOr[timestamp] = js.native
  
  /**
    * Returns only restore jobs associated with the specified job status.
    */
  var ByStatus: js.UndefOr[RestoreJobStatus] = js.native
  
  /**
    * The maximum number of items to be returned.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.backupMod.MaxResults] = js.native
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListRestoreJobsInput {
  
  @scala.inline
  def apply(): ListRestoreJobsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRestoreJobsInput]
  }
  
  @scala.inline
  implicit class ListRestoreJobsInputMutableBuilder[Self <: ListRestoreJobsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByAccountId(value: AccountId): Self = StObject.set(x, "ByAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByAccountIdUndefined: Self = StObject.set(x, "ByAccountId", js.undefined)
    
    @scala.inline
    def setByCreatedAfter(value: timestamp): Self = StObject.set(x, "ByCreatedAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByCreatedAfterUndefined: Self = StObject.set(x, "ByCreatedAfter", js.undefined)
    
    @scala.inline
    def setByCreatedBefore(value: timestamp): Self = StObject.set(x, "ByCreatedBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByCreatedBeforeUndefined: Self = StObject.set(x, "ByCreatedBefore", js.undefined)
    
    @scala.inline
    def setByStatus(value: RestoreJobStatus): Self = StObject.set(x, "ByStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByStatusUndefined: Self = StObject.set(x, "ByStatus", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
