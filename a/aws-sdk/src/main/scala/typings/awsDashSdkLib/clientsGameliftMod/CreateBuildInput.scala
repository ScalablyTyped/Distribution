package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBuildInput extends js.Object {
  /**
    * Descriptive label that is associated with a build. Build names do not need to be unique. You can use UpdateBuild to change this value later. 
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Operating system that the game server binaries are built to run on. This value determines the type of fleet resources that you can use for this build. If your game build contains multiple executables, they all must run on the same operating system. If an operating system is not specified when creating a build, Amazon GameLift uses the default value (WINDOWS_2012). This value cannot be changed later.
    */
  var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
  /**
    * Information indicating where your game build files are stored. Use this parameter only when creating a build with files stored in an Amazon S3 bucket that you own. The storage location must specify an Amazon S3 bucket name and key, as well as a role ARN that you set up to allow Amazon GameLift to access your Amazon S3 bucket. The S3 bucket must be in the same region that you want to create a new build in.
    */
  var StorageLocation: js.UndefOr[S3Location] = js.undefined
  /**
    * Version that is associated with this build. Version strings do not need to be unique. You can use UpdateBuild to change this value later. 
    */
  var Version: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object CreateBuildInput {
  @scala.inline
  def apply(
    Name: NonZeroAndMaxString = null,
    OperatingSystem: OperatingSystem = null,
    StorageLocation: S3Location = null,
    Version: NonZeroAndMaxString = null
  ): CreateBuildInput = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    if (StorageLocation != null) __obj.updateDynamic("StorageLocation")(StorageLocation)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[CreateBuildInput]
  }
}

