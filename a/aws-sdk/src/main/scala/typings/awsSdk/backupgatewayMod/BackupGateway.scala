package typings.awsSdk.backupgatewayMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupGateway extends Service {
  
  /**
    * Associates a backup gateway with your server. After you complete the association process, you can back up and restore your VMs through the gateway.
    */
  def associateGatewayToServer(): Request[AssociateGatewayToServerOutput, AWSError] = js.native
  def associateGatewayToServer(callback: js.Function2[/* err */ AWSError, /* data */ AssociateGatewayToServerOutput, Unit]): Request[AssociateGatewayToServerOutput, AWSError] = js.native
  /**
    * Associates a backup gateway with your server. After you complete the association process, you can back up and restore your VMs through the gateway.
    */
  def associateGatewayToServer(params: AssociateGatewayToServerInput): Request[AssociateGatewayToServerOutput, AWSError] = js.native
  def associateGatewayToServer(
    params: AssociateGatewayToServerInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateGatewayToServerOutput, Unit]
  ): Request[AssociateGatewayToServerOutput, AWSError] = js.native
  
  @JSName("config")
  var config_BackupGateway: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a backup gateway. After you create a gateway, you can associate it with a server using the AssociateGatewayToServer operation.
    */
  def createGateway(): Request[CreateGatewayOutput, AWSError] = js.native
  def createGateway(callback: js.Function2[/* err */ AWSError, /* data */ CreateGatewayOutput, Unit]): Request[CreateGatewayOutput, AWSError] = js.native
  /**
    * Creates a backup gateway. After you create a gateway, you can associate it with a server using the AssociateGatewayToServer operation.
    */
  def createGateway(params: CreateGatewayInput): Request[CreateGatewayOutput, AWSError] = js.native
  def createGateway(
    params: CreateGatewayInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGatewayOutput, Unit]
  ): Request[CreateGatewayOutput, AWSError] = js.native
  
  /**
    * Deletes a backup gateway.
    */
  def deleteGateway(): Request[DeleteGatewayOutput, AWSError] = js.native
  def deleteGateway(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGatewayOutput, Unit]): Request[DeleteGatewayOutput, AWSError] = js.native
  /**
    * Deletes a backup gateway.
    */
  def deleteGateway(params: DeleteGatewayInput): Request[DeleteGatewayOutput, AWSError] = js.native
  def deleteGateway(
    params: DeleteGatewayInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGatewayOutput, Unit]
  ): Request[DeleteGatewayOutput, AWSError] = js.native
  
  /**
    * Deletes a hypervisor.
    */
  def deleteHypervisor(): Request[DeleteHypervisorOutput, AWSError] = js.native
  def deleteHypervisor(callback: js.Function2[/* err */ AWSError, /* data */ DeleteHypervisorOutput, Unit]): Request[DeleteHypervisorOutput, AWSError] = js.native
  /**
    * Deletes a hypervisor.
    */
  def deleteHypervisor(params: DeleteHypervisorInput): Request[DeleteHypervisorOutput, AWSError] = js.native
  def deleteHypervisor(
    params: DeleteHypervisorInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteHypervisorOutput, Unit]
  ): Request[DeleteHypervisorOutput, AWSError] = js.native
  
  /**
    * Disassociates a backup gateway from the specified server. After the disassociation process finishes, the gateway can no longer access the virtual machines on the server.
    */
  def disassociateGatewayFromServer(): Request[DisassociateGatewayFromServerOutput, AWSError] = js.native
  def disassociateGatewayFromServer(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateGatewayFromServerOutput, Unit]): Request[DisassociateGatewayFromServerOutput, AWSError] = js.native
  /**
    * Disassociates a backup gateway from the specified server. After the disassociation process finishes, the gateway can no longer access the virtual machines on the server.
    */
  def disassociateGatewayFromServer(params: DisassociateGatewayFromServerInput): Request[DisassociateGatewayFromServerOutput, AWSError] = js.native
  def disassociateGatewayFromServer(
    params: DisassociateGatewayFromServerInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateGatewayFromServerOutput, Unit]
  ): Request[DisassociateGatewayFromServerOutput, AWSError] = js.native
  
  /**
    * By providing the ARN (Amazon Resource Name), this API returns the gateway.
    */
  def getGateway(): Request[GetGatewayOutput, AWSError] = js.native
  def getGateway(callback: js.Function2[/* err */ AWSError, /* data */ GetGatewayOutput, Unit]): Request[GetGatewayOutput, AWSError] = js.native
  /**
    * By providing the ARN (Amazon Resource Name), this API returns the gateway.
    */
  def getGateway(params: GetGatewayInput): Request[GetGatewayOutput, AWSError] = js.native
  def getGateway(
    params: GetGatewayInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGatewayOutput, Unit]
  ): Request[GetGatewayOutput, AWSError] = js.native
  
  /**
    * Connect to a hypervisor by importing its configuration.
    */
  def importHypervisorConfiguration(): Request[ImportHypervisorConfigurationOutput, AWSError] = js.native
  def importHypervisorConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ ImportHypervisorConfigurationOutput, Unit]): Request[ImportHypervisorConfigurationOutput, AWSError] = js.native
  /**
    * Connect to a hypervisor by importing its configuration.
    */
  def importHypervisorConfiguration(params: ImportHypervisorConfigurationInput): Request[ImportHypervisorConfigurationOutput, AWSError] = js.native
  def importHypervisorConfiguration(
    params: ImportHypervisorConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportHypervisorConfigurationOutput, Unit]
  ): Request[ImportHypervisorConfigurationOutput, AWSError] = js.native
  
  /**
    * Lists backup gateways owned by an Amazon Web Services account in an Amazon Web Services Region. The returned list is ordered by gateway Amazon Resource Name (ARN).
    */
  def listGateways(): Request[ListGatewaysOutput, AWSError] = js.native
  def listGateways(callback: js.Function2[/* err */ AWSError, /* data */ ListGatewaysOutput, Unit]): Request[ListGatewaysOutput, AWSError] = js.native
  /**
    * Lists backup gateways owned by an Amazon Web Services account in an Amazon Web Services Region. The returned list is ordered by gateway Amazon Resource Name (ARN).
    */
  def listGateways(params: ListGatewaysInput): Request[ListGatewaysOutput, AWSError] = js.native
  def listGateways(
    params: ListGatewaysInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGatewaysOutput, Unit]
  ): Request[ListGatewaysOutput, AWSError] = js.native
  
  /**
    * Lists your hypervisors.
    */
  def listHypervisors(): Request[ListHypervisorsOutput, AWSError] = js.native
  def listHypervisors(callback: js.Function2[/* err */ AWSError, /* data */ ListHypervisorsOutput, Unit]): Request[ListHypervisorsOutput, AWSError] = js.native
  /**
    * Lists your hypervisors.
    */
  def listHypervisors(params: ListHypervisorsInput): Request[ListHypervisorsOutput, AWSError] = js.native
  def listHypervisors(
    params: ListHypervisorsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListHypervisorsOutput, Unit]
  ): Request[ListHypervisorsOutput, AWSError] = js.native
  
  /**
    * Lists the tags applied to the resource identified by its Amazon Resource Name (ARN).
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Lists the tags applied to the resource identified by its Amazon Resource Name (ARN).
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  
  /**
    * Lists your virtual machines.
    */
  def listVirtualMachines(): Request[ListVirtualMachinesOutput, AWSError] = js.native
  def listVirtualMachines(callback: js.Function2[/* err */ AWSError, /* data */ ListVirtualMachinesOutput, Unit]): Request[ListVirtualMachinesOutput, AWSError] = js.native
  /**
    * Lists your virtual machines.
    */
  def listVirtualMachines(params: ListVirtualMachinesInput): Request[ListVirtualMachinesOutput, AWSError] = js.native
  def listVirtualMachines(
    params: ListVirtualMachinesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVirtualMachinesOutput, Unit]
  ): Request[ListVirtualMachinesOutput, AWSError] = js.native
  
  /**
    * Set the maintenance start time for a gateway.
    */
  def putMaintenanceStartTime(): Request[PutMaintenanceStartTimeOutput, AWSError] = js.native
  def putMaintenanceStartTime(callback: js.Function2[/* err */ AWSError, /* data */ PutMaintenanceStartTimeOutput, Unit]): Request[PutMaintenanceStartTimeOutput, AWSError] = js.native
  /**
    * Set the maintenance start time for a gateway.
    */
  def putMaintenanceStartTime(params: PutMaintenanceStartTimeInput): Request[PutMaintenanceStartTimeOutput, AWSError] = js.native
  def putMaintenanceStartTime(
    params: PutMaintenanceStartTimeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutMaintenanceStartTimeOutput, Unit]
  ): Request[PutMaintenanceStartTimeOutput, AWSError] = js.native
  
  /**
    * Tag the resource.
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Tag the resource.
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  
  /**
    * Tests your hypervisor configuration to validate that backup gateway can connect with the hypervisor and its resources.
    */
  def testHypervisorConfiguration(): Request[TestHypervisorConfigurationOutput, AWSError] = js.native
  def testHypervisorConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ TestHypervisorConfigurationOutput, Unit]): Request[TestHypervisorConfigurationOutput, AWSError] = js.native
  /**
    * Tests your hypervisor configuration to validate that backup gateway can connect with the hypervisor and its resources.
    */
  def testHypervisorConfiguration(params: TestHypervisorConfigurationInput): Request[TestHypervisorConfigurationOutput, AWSError] = js.native
  def testHypervisorConfiguration(
    params: TestHypervisorConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TestHypervisorConfigurationOutput, Unit]
  ): Request[TestHypervisorConfigurationOutput, AWSError] = js.native
  
  /**
    * Removes tags from the resource.
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Removes tags from the resource.
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
  
  /**
    * Updates a gateway's name. Specify which gateway to update using the Amazon Resource Name (ARN) of the gateway in your request.
    */
  def updateGatewayInformation(): Request[UpdateGatewayInformationOutput, AWSError] = js.native
  def updateGatewayInformation(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGatewayInformationOutput, Unit]): Request[UpdateGatewayInformationOutput, AWSError] = js.native
  /**
    * Updates a gateway's name. Specify which gateway to update using the Amazon Resource Name (ARN) of the gateway in your request.
    */
  def updateGatewayInformation(params: UpdateGatewayInformationInput): Request[UpdateGatewayInformationOutput, AWSError] = js.native
  def updateGatewayInformation(
    params: UpdateGatewayInformationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGatewayInformationOutput, Unit]
  ): Request[UpdateGatewayInformationOutput, AWSError] = js.native
  
  /**
    * Updates the gateway virtual machine (VM) software. The request immediately triggers the software update.  When you make this request, you get a 200 OK success response immediately. However, it might take some time for the update to complete. 
    */
  def updateGatewaySoftwareNow(): Request[UpdateGatewaySoftwareNowOutput, AWSError] = js.native
  def updateGatewaySoftwareNow(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGatewaySoftwareNowOutput, Unit]): Request[UpdateGatewaySoftwareNowOutput, AWSError] = js.native
  /**
    * Updates the gateway virtual machine (VM) software. The request immediately triggers the software update.  When you make this request, you get a 200 OK success response immediately. However, it might take some time for the update to complete. 
    */
  def updateGatewaySoftwareNow(params: UpdateGatewaySoftwareNowInput): Request[UpdateGatewaySoftwareNowOutput, AWSError] = js.native
  def updateGatewaySoftwareNow(
    params: UpdateGatewaySoftwareNowInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGatewaySoftwareNowOutput, Unit]
  ): Request[UpdateGatewaySoftwareNowOutput, AWSError] = js.native
  
  /**
    * Updates a hypervisor metadata, including its host, username, and password. Specify which hypervisor to update using the Amazon Resource Name (ARN) of the hypervisor in your request.
    */
  def updateHypervisor(): Request[UpdateHypervisorOutput, AWSError] = js.native
  def updateHypervisor(callback: js.Function2[/* err */ AWSError, /* data */ UpdateHypervisorOutput, Unit]): Request[UpdateHypervisorOutput, AWSError] = js.native
  /**
    * Updates a hypervisor metadata, including its host, username, and password. Specify which hypervisor to update using the Amazon Resource Name (ARN) of the hypervisor in your request.
    */
  def updateHypervisor(params: UpdateHypervisorInput): Request[UpdateHypervisorOutput, AWSError] = js.native
  def updateHypervisor(
    params: UpdateHypervisorInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateHypervisorOutput, Unit]
  ): Request[UpdateHypervisorOutput, AWSError] = js.native
}
