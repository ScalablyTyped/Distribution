package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLocationSmbRequest extends js.Object {
  /**
    * The Amazon Resource Names (ARNs) of agents to use for a Simple Message Block (SMB) location. 
    */
  var AgentArns: AgentArnList
  /**
    * The name of the domain that the SMB server belongs to.
    */
  var Domain: js.UndefOr[SmbDomain] = js.undefined
  /**
    * The mount options that are available for DataSync to use to access an SMB location.
    */
  var MountOptions: js.UndefOr[SmbMountOptions] = js.undefined
  /**
    * The password of the user who has permission to access the SMB server.
    */
  var Password: SmbPassword
  /**
    * The name of the SMB server. This value is the IP address or Domain Name Service (DNS) name of the SMB server. An agent that is installed on-premises uses this host name to mount the SMB server in a network.  This name must either be DNS-compliant or must be an IP version 4 (IPv4) address. 
    */
  var ServerHostname: typings.awsDashSdk.clientsDatasyncMod.ServerHostname
  /**
    * The subdirectory in the SMB file system that is used to read data from the SMB source location or write data to the SMB destination. The SMB path should be a path that's exported by the SMB server, or a subdirectory of that path. The path should be such that it can be mounted by other SMB clients in your network. To transfer all the data in the folder you specified, DataSync needs to have permissions to mount the SMB share, as well as to access all the data in that share. To ensure this, either ensure that the user/password specified belongs to the user who can mount the share, and who has the appropriate permissions for all of the files and directories that you want DataSync to access, or use credentials of a member of the Backup Operators group to mount the share. Doing either enables the agent to access the data. For the agent to access directories, you must additionally enable all execute access.
    */
  var Subdirectory: NonEmptySubdirectory
  /**
    * The key-value pair that represents the tag that you want to add to the location. The value can be an empty string. We recommend using tags to name your resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The user who can mount the share, has the permissions to access files and directories in the SMB share.
    */
  var User: SmbUser
}

object CreateLocationSmbRequest {
  @scala.inline
  def apply(
    AgentArns: AgentArnList,
    Password: SmbPassword,
    ServerHostname: ServerHostname,
    Subdirectory: NonEmptySubdirectory,
    User: SmbUser,
    Domain: SmbDomain = null,
    MountOptions: SmbMountOptions = null,
    Tags: TagList = null
  ): CreateLocationSmbRequest = {
    val __obj = js.Dynamic.literal(AgentArns = AgentArns, Password = Password, ServerHostname = ServerHostname, Subdirectory = Subdirectory, User = User)
    if (Domain != null) __obj.updateDynamic("Domain")(Domain)
    if (MountOptions != null) __obj.updateDynamic("MountOptions")(MountOptions)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateLocationSmbRequest]
  }
}

