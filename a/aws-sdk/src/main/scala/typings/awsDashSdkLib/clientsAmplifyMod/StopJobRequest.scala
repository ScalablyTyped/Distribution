package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopJobRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId
  /**
    *  Name for the branch, for the Job. 
    */
  var branchName: BranchName
  /**
    *  Unique Id for the Job. 
    */
  var jobId: JobId
}

object StopJobRequest {
  @scala.inline
  def apply(appId: AppId, branchName: BranchName, jobId: JobId): StopJobRequest = {
    val __obj = js.Dynamic.literal(appId = appId, branchName = branchName, jobId = jobId)
  
    __obj.asInstanceOf[StopJobRequest]
  }
}

