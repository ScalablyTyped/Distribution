package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryDescription extends js.Object {
  /**
    * The access URL for the directory, such as http://&lt;alias&gt;.awsapps.com. If no alias has been created for the directory, &lt;alias&gt; is the directory identifier, such as d-XXXXXXXXXX.
    */
  var AccessUrl: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.AccessUrl] = js.native
  /**
    * The alias for the directory. If no alias has been created for the directory, the alias is the directory identifier, such as d-XXXXXXXXXX.
    */
  var Alias: js.UndefOr[AliasName] = js.native
  /**
    * A DirectoryConnectSettingsDescription object that contains additional information about an AD Connector directory. This member is only present if the directory is an AD Connector directory.
    */
  var ConnectSettings: js.UndefOr[DirectoryConnectSettingsDescription] = js.native
  /**
    * The description for the directory.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.Description] = js.native
  /**
    * The desired number of domain controllers in the directory if the directory is Microsoft AD.
    */
  var DesiredNumberOfDomainControllers: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.DesiredNumberOfDomainControllers] = js.native
  /**
    * The directory identifier.
    */
  var DirectoryId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId] = js.native
  /**
    * The IP addresses of the DNS servers for the directory. For a Simple AD or Microsoft AD directory, these are the IP addresses of the Simple AD or Microsoft AD directory servers. For an AD Connector directory, these are the IP addresses of the DNS servers or domain controllers in the on-premises directory to which the AD Connector is connected.
    */
  var DnsIpAddrs: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.DnsIpAddrs] = js.native
  /**
    * The edition associated with this directory.
    */
  var Edition: js.UndefOr[DirectoryEdition] = js.native
  /**
    * Specifies when the directory was created.
    */
  var LaunchTime: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.LaunchTime] = js.native
  /**
    * The fully qualified name of the directory.
    */
  var Name: js.UndefOr[DirectoryName] = js.native
  /**
    * Describes the AWS Managed Microsoft AD directory in the directory owner account.
    */
  var OwnerDirectoryDescription: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.OwnerDirectoryDescription] = js.native
  /**
    * A RadiusSettings object that contains information about the RADIUS server configured for this directory.
    */
  var RadiusSettings: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.RadiusSettings] = js.native
  /**
    * The status of the RADIUS MFA server connection.
    */
  var RadiusStatus: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.RadiusStatus] = js.native
  /**
    * The method used when sharing a directory to determine whether the directory should be shared within your AWS organization (ORGANIZATIONS) or with any AWS account by sending a shared directory request (HANDSHAKE).
    */
  var ShareMethod: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.ShareMethod] = js.native
  /**
    * A directory share request that is sent by the directory owner to the directory consumer. The request includes a typed message to help the directory consumer administrator determine whether to approve or reject the share invitation.
    */
  var ShareNotes: js.UndefOr[Notes] = js.native
  /**
    * Current directory status of the shared AWS Managed Microsoft AD directory.
    */
  var ShareStatus: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.ShareStatus] = js.native
  /**
    * The short name of the directory.
    */
  var ShortName: js.UndefOr[DirectoryShortName] = js.native
  /**
    * The directory size.
    */
  var Size: js.UndefOr[DirectorySize] = js.native
  /**
    * Indicates if single sign-on is enabled for the directory. For more information, see EnableSso and DisableSso.
    */
  var SsoEnabled: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.SsoEnabled] = js.native
  /**
    * The current stage of the directory.
    */
  var Stage: js.UndefOr[DirectoryStage] = js.native
  /**
    * The date and time that the stage was last updated.
    */
  var StageLastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime] = js.native
  /**
    * Additional information about the directory stage.
    */
  var StageReason: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.StageReason] = js.native
  /**
    * The directory size.
    */
  var Type: js.UndefOr[DirectoryType] = js.native
  /**
    * A DirectoryVpcSettingsDescription object that contains additional information about a directory. This member is only present if the directory is a Simple AD or Managed AD directory.
    */
  var VpcSettings: js.UndefOr[DirectoryVpcSettingsDescription] = js.native
}

object DirectoryDescription {
  @scala.inline
  def apply(
    AccessUrl: AccessUrl = null,
    Alias: AliasName = null,
    ConnectSettings: DirectoryConnectSettingsDescription = null,
    Description: Description = null,
    DesiredNumberOfDomainControllers: Int | Double = null,
    DirectoryId: DirectoryId = null,
    DnsIpAddrs: DnsIpAddrs = null,
    Edition: DirectoryEdition = null,
    LaunchTime: LaunchTime = null,
    Name: DirectoryName = null,
    OwnerDirectoryDescription: OwnerDirectoryDescription = null,
    RadiusSettings: RadiusSettings = null,
    RadiusStatus: RadiusStatus = null,
    ShareMethod: ShareMethod = null,
    ShareNotes: Notes = null,
    ShareStatus: ShareStatus = null,
    ShortName: DirectoryShortName = null,
    Size: DirectorySize = null,
    SsoEnabled: js.UndefOr[Boolean] = js.undefined,
    Stage: DirectoryStage = null,
    StageLastUpdatedDateTime: LastUpdatedDateTime = null,
    StageReason: StageReason = null,
    Type: DirectoryType = null,
    VpcSettings: DirectoryVpcSettingsDescription = null
  ): DirectoryDescription = {
    val __obj = js.Dynamic.literal()
    if (AccessUrl != null) __obj.updateDynamic("AccessUrl")(AccessUrl.asInstanceOf[js.Any])
    if (Alias != null) __obj.updateDynamic("Alias")(Alias.asInstanceOf[js.Any])
    if (ConnectSettings != null) __obj.updateDynamic("ConnectSettings")(ConnectSettings.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DesiredNumberOfDomainControllers != null) __obj.updateDynamic("DesiredNumberOfDomainControllers")(DesiredNumberOfDomainControllers.asInstanceOf[js.Any])
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    if (DnsIpAddrs != null) __obj.updateDynamic("DnsIpAddrs")(DnsIpAddrs.asInstanceOf[js.Any])
    if (Edition != null) __obj.updateDynamic("Edition")(Edition.asInstanceOf[js.Any])
    if (LaunchTime != null) __obj.updateDynamic("LaunchTime")(LaunchTime.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OwnerDirectoryDescription != null) __obj.updateDynamic("OwnerDirectoryDescription")(OwnerDirectoryDescription.asInstanceOf[js.Any])
    if (RadiusSettings != null) __obj.updateDynamic("RadiusSettings")(RadiusSettings.asInstanceOf[js.Any])
    if (RadiusStatus != null) __obj.updateDynamic("RadiusStatus")(RadiusStatus.asInstanceOf[js.Any])
    if (ShareMethod != null) __obj.updateDynamic("ShareMethod")(ShareMethod.asInstanceOf[js.Any])
    if (ShareNotes != null) __obj.updateDynamic("ShareNotes")(ShareNotes.asInstanceOf[js.Any])
    if (ShareStatus != null) __obj.updateDynamic("ShareStatus")(ShareStatus.asInstanceOf[js.Any])
    if (ShortName != null) __obj.updateDynamic("ShortName")(ShortName.asInstanceOf[js.Any])
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    if (!js.isUndefined(SsoEnabled)) __obj.updateDynamic("SsoEnabled")(SsoEnabled.asInstanceOf[js.Any])
    if (Stage != null) __obj.updateDynamic("Stage")(Stage.asInstanceOf[js.Any])
    if (StageLastUpdatedDateTime != null) __obj.updateDynamic("StageLastUpdatedDateTime")(StageLastUpdatedDateTime.asInstanceOf[js.Any])
    if (StageReason != null) __obj.updateDynamic("StageReason")(StageReason.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (VpcSettings != null) __obj.updateDynamic("VpcSettings")(VpcSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryDescription]
  }
}

