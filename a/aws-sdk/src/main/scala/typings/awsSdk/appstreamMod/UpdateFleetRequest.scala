package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFleetRequest extends js.Object {
  
  /**
    * The fleet attributes to delete.
    */
  var AttributesToDelete: js.UndefOr[FleetAttributes] = js.native
  
  /**
    * The desired capacity for the fleet.
    */
  var ComputeCapacity: js.UndefOr[typings.awsSdk.appstreamMod.ComputeCapacity] = js.native
  
  /**
    * Deletes the VPC association for the specified fleet.
    */
  var DeleteVpcConfig: js.UndefOr[Boolean] = js.native
  
  /**
    * The description to display.
    */
  var Description: js.UndefOr[typings.awsSdk.appstreamMod.Description] = js.native
  
  /**
    * The amount of time that a streaming session remains active after users disconnect. If users try to reconnect to the streaming session after a disconnection or network interruption within this time interval, they are connected to their previous session. Otherwise, they are connected to a new session with a new streaming instance.  Specify a value between 60 and 360000.
    */
  var DisconnectTimeoutInSeconds: js.UndefOr[Integer] = js.native
  
  /**
    * The fleet name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.appstreamMod.DisplayName] = js.native
  
  /**
    * The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory domain. 
    */
  var DomainJoinInfo: js.UndefOr[typings.awsSdk.appstreamMod.DomainJoinInfo] = js.native
  
  /**
    * Enables or disables default internet access for the fleet.
    */
  var EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role to apply to the fleet. To assume a role, a fleet instance calls the AWS Security Token Service (STS) AssumeRole API operation and passes the ARN of the role to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates the appstream_machine_role credential profile on the instance. For more information, see Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming Instances in the Amazon AppStream 2.0 Administration Guide.
    */
  var IamRoleArn: js.UndefOr[Arn] = js.native
  
  /**
    * The amount of time that users can be idle (inactive) before they are disconnected from their streaming session and the DisconnectTimeoutInSeconds time interval begins. Users are notified before they are disconnected due to inactivity. If users try to reconnect to the streaming session before the time interval specified in DisconnectTimeoutInSeconds elapses, they are connected to their previous session. Users are considered idle when they stop providing keyboard or mouse input during their streaming session. File uploads and downloads, audio in, audio out, and pixels changing do not qualify as user activity. If users continue to be idle after the time interval in IdleDisconnectTimeoutInSeconds elapses, they are disconnected.  To prevent users from being disconnected due to inactivity, specify a value of 0. Otherwise, specify a value between 60 and 3600. The default value is 0.  If you enable this feature, we recommend that you specify a value that corresponds exactly to a whole number of minutes (for example, 60, 120, and 180). If you don't do this, the value is rounded to the nearest minute. For example, if you specify a value of 70, users are disconnected after 1 minute of inactivity. If you specify a value that is at the midpoint between two different minutes, the value is rounded up. For example, if you specify a value of 90, users are disconnected after 2 minutes of inactivity.  
    */
  var IdleDisconnectTimeoutInSeconds: js.UndefOr[Integer] = js.native
  
  /**
    * The ARN of the public, private, or shared image to use.
    */
  var ImageArn: js.UndefOr[Arn] = js.native
  
  /**
    * The name of the image used to create the fleet.
    */
  var ImageName: js.UndefOr[String] = js.native
  
  /**
    * The instance type to use when launching fleet instances. The following instance types are available:   stream.standard.medium   stream.standard.large   stream.compute.large   stream.compute.xlarge   stream.compute.2xlarge   stream.compute.4xlarge   stream.compute.8xlarge   stream.memory.large   stream.memory.xlarge   stream.memory.2xlarge   stream.memory.4xlarge   stream.memory.8xlarge   stream.memory.z1d.large   stream.memory.z1d.xlarge   stream.memory.z1d.2xlarge   stream.memory.z1d.3xlarge   stream.memory.z1d.6xlarge   stream.memory.z1d.12xlarge   stream.graphics-design.large   stream.graphics-design.xlarge   stream.graphics-design.2xlarge   stream.graphics-design.4xlarge   stream.graphics-desktop.2xlarge   stream.graphics.g4dn.xlarge   stream.graphics.g4dn.2xlarge   stream.graphics.g4dn.4xlarge   stream.graphics.g4dn.8xlarge   stream.graphics.g4dn.12xlarge   stream.graphics.g4dn.16xlarge   stream.graphics-pro.4xlarge   stream.graphics-pro.8xlarge   stream.graphics-pro.16xlarge  
    */
  var InstanceType: js.UndefOr[String] = js.native
  
  /**
    * The maximum amount of time that a streaming session can remain active, in seconds. If users are still connected to a streaming instance five minutes before this limit is reached, they are prompted to save any open documents before being disconnected. After this time elapses, the instance is terminated and replaced by a new instance. Specify a value between 600 and 360000.
    */
  var MaxUserDurationInSeconds: js.UndefOr[Integer] = js.native
  
  /**
    * A unique name for the fleet.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When APP is specified, only the windows of applications opened by users display. When DESKTOP is specified, the standard desktop that is provided by the operating system displays. The default value is APP.
    */
  var StreamView: js.UndefOr[typings.awsSdk.appstreamMod.StreamView] = js.native
  
  /**
    * The VPC configuration for the fleet.
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.appstreamMod.VpcConfig] = js.native
}
object UpdateFleetRequest {
  
  @scala.inline
  def apply(): UpdateFleetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFleetRequest]
  }
  
  @scala.inline
  implicit class UpdateFleetRequestOps[Self <: UpdateFleetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributesToDeleteVarargs(value: FleetAttribute*): Self = this.set("AttributesToDelete", js.Array(value :_*))
    
    @scala.inline
    def setAttributesToDelete(value: FleetAttributes): Self = this.set("AttributesToDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributesToDelete: Self = this.set("AttributesToDelete", js.undefined)
    
    @scala.inline
    def setComputeCapacity(value: ComputeCapacity): Self = this.set("ComputeCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeCapacity: Self = this.set("ComputeCapacity", js.undefined)
    
    @scala.inline
    def setDeleteVpcConfig(value: Boolean): Self = this.set("DeleteVpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteVpcConfig: Self = this.set("DeleteVpcConfig", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDisconnectTimeoutInSeconds(value: Integer): Self = this.set("DisconnectTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisconnectTimeoutInSeconds: Self = this.set("DisconnectTimeoutInSeconds", js.undefined)
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    
    @scala.inline
    def setDomainJoinInfo(value: DomainJoinInfo): Self = this.set("DomainJoinInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainJoinInfo: Self = this.set("DomainJoinInfo", js.undefined)
    
    @scala.inline
    def setEnableDefaultInternetAccess(value: BooleanObject): Self = this.set("EnableDefaultInternetAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDefaultInternetAccess: Self = this.set("EnableDefaultInternetAccess", js.undefined)
    
    @scala.inline
    def setIamRoleArn(value: Arn): Self = this.set("IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamRoleArn: Self = this.set("IamRoleArn", js.undefined)
    
    @scala.inline
    def setIdleDisconnectTimeoutInSeconds(value: Integer): Self = this.set("IdleDisconnectTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleDisconnectTimeoutInSeconds: Self = this.set("IdleDisconnectTimeoutInSeconds", js.undefined)
    
    @scala.inline
    def setImageArn(value: Arn): Self = this.set("ImageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageArn: Self = this.set("ImageArn", js.undefined)
    
    @scala.inline
    def setImageName(value: String): Self = this.set("ImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageName: Self = this.set("ImageName", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setMaxUserDurationInSeconds(value: Integer): Self = this.set("MaxUserDurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxUserDurationInSeconds: Self = this.set("MaxUserDurationInSeconds", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setStreamView(value: StreamView): Self = this.set("StreamView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamView: Self = this.set("StreamView", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = this.set("VpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfig: Self = this.set("VpcConfig", js.undefined)
  }
}
