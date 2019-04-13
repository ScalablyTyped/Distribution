package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceBundle extends js.Object {
  /**
    * The bundle identifier.
    */
  var BundleId: js.UndefOr[BundleId] = js.undefined
  /**
    * The compute type. For more information, see Amazon WorkSpaces Bundles.
    */
  var ComputeType: js.UndefOr[ComputeType] = js.undefined
  /**
    * A description.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * The name of the bundle.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The owner of the bundle. This is the account identifier of the owner, or AMAZON if the bundle is provided by AWS.
    */
  var Owner: js.UndefOr[BundleOwner] = js.undefined
  /**
    * The size of the root volume.
    */
  var RootStorage: js.UndefOr[RootStorage] = js.undefined
  /**
    * The size of the user storage.
    */
  var UserStorage: js.UndefOr[UserStorage] = js.undefined
}

object WorkspaceBundle {
  @scala.inline
  def apply(
    BundleId: BundleId = null,
    ComputeType: ComputeType = null,
    Description: Description = null,
    Name: NonEmptyString = null,
    Owner: BundleOwner = null,
    RootStorage: RootStorage = null,
    UserStorage: UserStorage = null
  ): WorkspaceBundle = {
    val __obj = js.Dynamic.literal()
    if (BundleId != null) __obj.updateDynamic("BundleId")(BundleId)
    if (ComputeType != null) __obj.updateDynamic("ComputeType")(ComputeType)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (RootStorage != null) __obj.updateDynamic("RootStorage")(RootStorage)
    if (UserStorage != null) __obj.updateDynamic("UserStorage")(UserStorage)
    __obj.asInstanceOf[WorkspaceBundle]
  }
}

