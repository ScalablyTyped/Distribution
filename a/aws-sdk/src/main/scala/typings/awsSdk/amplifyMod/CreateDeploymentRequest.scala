package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId = js.native
  /**
    *  Name for the branch, for the Job. 
    */
  var branchName: BranchName = js.native
  /**
    *  Optional file map that contains file name as the key and file content md5 hash as the value. If this argument is provided, the service will generate different upload url per file. Otherwise, the service will only generate a single upload url for the zipped files. 
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

