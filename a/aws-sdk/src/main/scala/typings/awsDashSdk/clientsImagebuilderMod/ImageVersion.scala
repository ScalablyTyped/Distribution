package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageVersion extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the image semantic verion.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  /**
    * The date at which this image semantic version was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  /**
    * The name of the image semantic version.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The owner of the image semantic version.
    */
  var owner: js.UndefOr[NonEmptyString] = js.native
  /**
    * The platform of the image semantic version.
    */
  var platform: js.UndefOr[Platform] = js.native
  /**
    * The semantic version of the image semantic version.
    */
  var version: js.UndefOr[VersionNumber] = js.native
}

object ImageVersion {
  @scala.inline
  def apply(
    arn: ImageBuilderArn = null,
    dateCreated: DateTime = null,
    name: ResourceName = null,
    owner: NonEmptyString = null,
    platform: Platform = null,
    version: VersionNumber = null
  ): ImageVersion = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (dateCreated != null) __obj.updateDynamic("dateCreated")(dateCreated.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageVersion]
  }
}

