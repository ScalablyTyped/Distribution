package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBuildInput extends js.Object {
  /**
    * A descriptive label that is associated with a build. Build names do not need to be unique. You can use UpdateBuild to change this value later. 
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * The operating system that the game server binaries are built to run on. This value determines the type of fleet resources that you can use for this build. If your game build contains multiple executables, they all must run on the same operating system. If an operating system is not specified when creating a build, Amazon GameLift uses the default value (WINDOWS_2012). This value cannot be changed later.
    */
  var OperatingSystem: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.OperatingSystem] = js.native
  /**
    * Information indicating where your game build files are stored. Use this parameter only when creating a build with files stored in an Amazon S3 bucket that you own. The storage location must specify an Amazon S3 bucket name and key. The location must also specify a role ARN that you set up to allow Amazon GameLift to access your Amazon S3 bucket. The S3 bucket and your new build must be in the same Region.
    */
  var StorageLocation: js.UndefOr[S3Location] = js.native
  /**
    * A list of labels to assign to the new build resource. Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource management, access management and cost allocation. For more information, see  Tagging AWS Resources in the AWS General Reference. Once the resource is created, you can use TagResource, UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * Version information that is associated with a build or script. Version strings do not need to be unique. You can use UpdateBuild to change this value later. 
    */
  var Version: js.UndefOr[NonZeroAndMaxString] = js.native
}

object CreateBuildInput {
  @scala.inline
  def apply(
    Name: NonZeroAndMaxString = null,
    OperatingSystem: OperatingSystem = null,
    StorageLocation: S3Location = null,
    Tags: TagList = null,
    Version: NonZeroAndMaxString = null
  ): CreateBuildInput = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    if (StorageLocation != null) __obj.updateDynamic("StorageLocation")(StorageLocation.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBuildInput]
  }
}

