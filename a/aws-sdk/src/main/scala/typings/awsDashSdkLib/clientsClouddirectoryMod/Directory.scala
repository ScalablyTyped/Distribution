package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directory extends js.Object {
  /**
    * The date and time when the directory was created.
    */
  var CreationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The Amazon Resource Name (ARN) that is associated with the directory. For more information, see arns.
    */
  var DirectoryArn: js.UndefOr[DirectoryArn] = js.undefined
  /**
    * The name of the directory.
    */
  var Name: js.UndefOr[DirectoryName] = js.undefined
  /**
    * The state of the directory. Can be either Enabled, Disabled, or Deleted.
    */
  var State: js.UndefOr[DirectoryState] = js.undefined
}

object Directory {
  @scala.inline
  def apply(
    CreationDateTime: _Date = null,
    DirectoryArn: DirectoryArn = null,
    Name: DirectoryName = null,
    State: DirectoryState = null
  ): Directory = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime)
    if (DirectoryArn != null) __obj.updateDynamic("DirectoryArn")(DirectoryArn)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directory]
  }
}

