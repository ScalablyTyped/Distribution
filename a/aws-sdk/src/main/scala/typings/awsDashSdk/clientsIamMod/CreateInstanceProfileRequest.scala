package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInstanceProfileRequest extends js.Object {
  /**
    * The name of the instance profile to create. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var InstanceProfileName: instanceProfileNameType
  /**
    *  The path to the instance profile. For more information about paths, see IAM Identifiers in the IAM User Guide. This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
    */
  var Path: js.UndefOr[pathType] = js.undefined
}

object CreateInstanceProfileRequest {
  @scala.inline
  def apply(InstanceProfileName: instanceProfileNameType, Path: pathType = null): CreateInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceProfileName = InstanceProfileName)
    if (Path != null) __obj.updateDynamic("Path")(Path)
    __obj.asInstanceOf[CreateInstanceProfileRequest]
  }
}

