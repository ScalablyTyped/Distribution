package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Build extends js.Object {
  /**
    * Unique identifier for a build.
    */
  var BuildId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.BuildId] = js.undefined
  /**
    * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Descriptive label that is associated with a build. Build names do not need to be unique. It can be set using CreateBuild or UpdateBuild.
    */
  var Name: js.UndefOr[FreeText] = js.undefined
  /**
    * Operating system that the game server binaries are built to run on. This value determines the type of fleet resources that you can use for this build.
    */
  var OperatingSystem: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.OperatingSystem] = js.undefined
  /**
    * File size of the uploaded game build, expressed in bytes. When the build status is INITIALIZED, this value is 0.
    */
  var SizeOnDisk: js.UndefOr[PositiveLong] = js.undefined
  /**
    * Current status of the build. Possible build statuses include the following:    INITIALIZED -- A new build has been defined, but no files have been uploaded. You cannot create fleets for builds that are in this status. When a build is successfully created, the build status is set to this value.     READY -- The game build has been successfully uploaded. You can now create new fleets for this build.    FAILED -- The game build upload failed. You cannot create new fleets for this build.   
    */
  var Status: js.UndefOr[BuildStatus] = js.undefined
  /**
    * Version that is associated with a build or script. Version strings do not need to be unique. This value can be set using CreateBuild or UpdateBuild.
    */
  var Version: js.UndefOr[FreeText] = js.undefined
}

object Build {
  @scala.inline
  def apply(
    BuildId: BuildId = null,
    CreationTime: Timestamp = null,
    Name: FreeText = null,
    OperatingSystem: OperatingSystem = null,
    SizeOnDisk: js.UndefOr[PositiveLong] = js.undefined,
    Status: BuildStatus = null,
    Version: FreeText = null
  ): Build = {
    val __obj = js.Dynamic.literal()
    if (BuildId != null) __obj.updateDynamic("BuildId")(BuildId)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    if (!js.isUndefined(SizeOnDisk)) __obj.updateDynamic("SizeOnDisk")(SizeOnDisk)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[Build]
  }
}

