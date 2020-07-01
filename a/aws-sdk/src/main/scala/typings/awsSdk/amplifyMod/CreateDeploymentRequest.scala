package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentRequest extends js.Object {
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId = js.native
  /**
    *  The name for the branch, for the job. 
    */
  var branchName: BranchName = js.native
  /**
    *  An optional file map that contains the file name as the key and the file content md5 hash as the value. If this argument is provided, the service will generate a unique upload URL per file. Otherwise, the service will only generate a single upload URL for the zipped files. 
    */
  var fileMap: js.UndefOr[FileMap] = js.native
}

object CreateDeploymentRequest {
  @scala.inline
  def apply(appId: AppId, branchName: BranchName, fileMap: FileMap = null): CreateDeploymentRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any])
    if (fileMap != null) __obj.updateDynamic("fileMap")(fileMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentRequest]
  }
}

