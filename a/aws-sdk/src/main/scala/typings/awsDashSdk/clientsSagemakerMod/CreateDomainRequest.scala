package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainRequest extends js.Object {
  /**
    * The mode of authentication that member use to access the domain.
    */
  var AuthMode: typings.awsDashSdk.clientsSagemakerMod.AuthMode = js.native
  /**
    * The default user settings.
    */
  var DefaultUserSettings: UserSettings = js.native
  /**
    * A name for the domain.
    */
  var DomainName: typings.awsDashSdk.clientsSagemakerMod.DomainName = js.native
  /**
    * The AWS Key Management Service encryption key ID.
    */
  var HomeEfsFileSystemKmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    * Security setting to limit to a set of subnets.
    */
  var SubnetIds: Subnets = js.native
  /**
    * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * Security setting to limit the domain's communication to a Amazon Virtual Private Cloud.
    */
  var VpcId: typings.awsDashSdk.clientsSagemakerMod.VpcId = js.native
}

object CreateDomainRequest {
  @scala.inline
  def apply(
    AuthMode: AuthMode,
    DefaultUserSettings: UserSettings,
    DomainName: DomainName,
    SubnetIds: Subnets,
    VpcId: VpcId,
    HomeEfsFileSystemKmsKeyId: KmsKeyId = null,
    Tags: TagList = null
  ): CreateDomainRequest = {
    val __obj = js.Dynamic.literal(AuthMode = AuthMode.asInstanceOf[js.Any], DefaultUserSettings = DefaultUserSettings.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    if (HomeEfsFileSystemKmsKeyId != null) __obj.updateDynamic("HomeEfsFileSystemKmsKeyId")(HomeEfsFileSystemKmsKeyId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainRequest]
  }
}

