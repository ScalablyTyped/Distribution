package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDeploymentRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId
  /**
    *  Name for the branch, for the Job. 
    */
  var branchName: BranchName
  /**
    *  Optional file map that contains file name as the key and file content md5 hash as the value. If this argument is provided, the service will generate different upload url per file. Otherwise, the service will only generate a single upload url for the zipped files. 
    */
  var fileMap: js.UndefOr[FileMap] = js.undefined
}

object CreateDeploymentRequest {
  @scala.inline
  def apply(appId: AppId, branchName: BranchName, fileMap: FileMap = null): CreateDeploymentRequest = {
    val __obj = js.Dynamic.literal(appId = appId, branchName = branchName)
    if (fileMap != null) __obj.updateDynamic("fileMap")(fileMap)
    __obj.asInstanceOf[CreateDeploymentRequest]
  }
}

