package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID associated with the S3 Batch Operations job.
    */
  var AccountId: typings.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * The ID for the job whose information you want to retrieve.
    */
  var JobId: typings.awsSdk.clientsS3controlMod.JobId
}
object DescribeJobRequest {
  
  inline def apply(AccountId: AccountId, JobId: JobId): DescribeJobRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeJobRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
