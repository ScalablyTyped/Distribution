package typings.awsSdk.clientsIotfleetwiseMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IoTFleetWise extends Service {
  
  /**
    *  Adds, or associates, a vehicle with a fleet. 
    */
  def associateVehicleFleet(): Request[AssociateVehicleFleetResponse, AWSError] = js.native
  def associateVehicleFleet(callback: js.Function2[/* err */ AWSError, /* data */ AssociateVehicleFleetResponse, Unit]): Request[AssociateVehicleFleetResponse, AWSError] = js.native
  /**
    *  Adds, or associates, a vehicle with a fleet. 
    */
  def associateVehicleFleet(params: AssociateVehicleFleetRequest): Request[AssociateVehicleFleetResponse, AWSError] = js.native
  def associateVehicleFleet(
    params: AssociateVehicleFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateVehicleFleetResponse, Unit]
  ): Request[AssociateVehicleFleetResponse, AWSError] = js.native
  
  /**
    *  Creates a group, or batch, of vehicles.    You must specify a decoder manifest and a vehicle model (model manifest) for each vehicle.   For more information, see Create multiple vehicles (AWS CLI) in the Amazon Web Services IoT FleetWise Developer Guide. 
    */
  def batchCreateVehicle(): Request[BatchCreateVehicleResponse, AWSError] = js.native
  def batchCreateVehicle(callback: js.Function2[/* err */ AWSError, /* data */ BatchCreateVehicleResponse, Unit]): Request[BatchCreateVehicleResponse, AWSError] = js.native
  /**
    *  Creates a group, or batch, of vehicles.    You must specify a decoder manifest and a vehicle model (model manifest) for each vehicle.   For more information, see Create multiple vehicles (AWS CLI) in the Amazon Web Services IoT FleetWise Developer Guide. 
    */
  def batchCreateVehicle(params: BatchCreateVehicleRequest): Request[BatchCreateVehicleResponse, AWSError] = js.native
  def batchCreateVehicle(
    params: BatchCreateVehicleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchCreateVehicleResponse, Unit]
  ): Request[BatchCreateVehicleResponse, AWSError] = js.native
  
  /**
    *  Updates a group, or batch, of vehicles.   You must specify a decoder manifest and a vehicle model (model manifest) for each vehicle.   For more information, see Update multiple vehicles (AWS CLI) in the Amazon Web Services IoT FleetWise Developer Guide. 
    */
  def batchUpdateVehicle(): Request[BatchUpdateVehicleResponse, AWSError] = js.native
  def batchUpdateVehicle(callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateVehicleResponse, Unit]): Request[BatchUpdateVehicleResponse, AWSError] = js.native
  /**
    *  Updates a group, or batch, of vehicles.   You must specify a decoder manifest and a vehicle model (model manifest) for each vehicle.   For more information, see Update multiple vehicles (AWS CLI) in the Amazon Web Services IoT FleetWise Developer Guide. 
    */
  def batchUpdateVehicle(params: BatchUpdateVehicleRequest): Request[BatchUpdateVehicleResponse, AWSError] = js.native
  def batchUpdateVehicle(
    params: BatchUpdateVehicleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateVehicleResponse, Unit]
  ): Request[BatchUpdateVehicleResponse, AWSError] = js.native
  
  @JSName("config")
  var config_IoTFleetWise: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an orchestration of data collection rules. The Amazon Web Services IoT FleetWise Edge Agent software running in vehicles uses campaigns to decide how to collect and transfer data to the cloud. You create campaigns in the cloud. After you or your team approve campaigns, Amazon Web Services IoT FleetWise automatically deploys them to vehicles.  For more information, see Collect and transfer data with campaigns in the Amazon Web Services IoT FleetWise Developer Guide.
    */
  def createCampaign(): Request[CreateCampaignResponse, AWSError] = js.native
  def createCampaign(callback: js.Function2[/* err */ AWSError, /* data */ CreateCampaignResponse, Unit]): Request[CreateCampaignResponse, AWSError] = js.native
  /**
    * Creates an orchestration of data collection rules. The Amazon Web Services IoT FleetWise Edge Agent software running in vehicles uses campaigns to decide how to collect and transfer data to the cloud. You create campaigns in the cloud. After you or your team approve campaigns, Amazon Web Services IoT FleetWise automatically deploys them to vehicles.  For more information, see Collect and transfer data with campaigns in the Amazon Web Services IoT FleetWise Developer Guide.
    */
  def createCampaign(params: CreateCampaignRequest): Request[CreateCampaignResponse, AWSError] = js.native
  def createCampaign(
    params: CreateCampaignRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCampaignResponse, Unit]
  ): Request[CreateCampaignResponse, AWSError] = js.native
  
  /**
    * Creates the decoder manifest associated with a model manifest. To create a decoder manifest, the following must be true:   Every signal decoder has a unique name.   Each signal decoder is associated with a network interface.   Each network interface has a unique ID.   The signal decoders are specified in the model manifest.  
    */
  def createDecoderManifest(): Request[CreateDecoderManifestResponse, AWSError] = js.native
  def createDecoderManifest(callback: js.Function2[/* err */ AWSError, /* data */ CreateDecoderManifestResponse, Unit]): Request[CreateDecoderManifestResponse, AWSError] = js.native
  /**
    * Creates the decoder manifest associated with a model manifest. To create a decoder manifest, the following must be true:   Every signal decoder has a unique name.   Each signal decoder is associated with a network interface.   Each network interface has a unique ID.   The signal decoders are specified in the model manifest.  
    */
  def createDecoderManifest(params: CreateDecoderManifestRequest): Request[CreateDecoderManifestResponse, AWSError] = js.native
  def createDecoderManifest(
    params: CreateDecoderManifestRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDecoderManifestResponse, Unit]
  ): Request[CreateDecoderManifestResponse, AWSError] = js.native
  
  /**
    *  Creates a fleet that represents a group of vehicles.   You must create both a signal catalog and vehicles before you can create a fleet.   For more information, see Fleets in the Amazon Web Services IoT FleetWise Developer Guide.
    */
  def createFleet(): Request[CreateFleetResponse, AWSError] = js.native
  def createFleet(callback: js.Function2[/* err */ AWSError, /* data */ CreateFleetResponse, Unit]): Request[CreateFleetResponse, AWSError] = js.native
  /**
    *  Creates a fleet that represents a group of vehicles.   You must create both a signal catalog and vehicles before you can create a fleet.   For more information, see Fleets in the Amazon Web Services IoT FleetWise Developer Guide.
    */
  def createFleet(params: CreateFleetRequest): Request[CreateFleetResponse, AWSError] = js.native
  def createFleet(
    params: CreateFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFleetResponse, Unit]
  ): Request[CreateFleetResponse, AWSError] = js.native
  
  /**
    *  Creates a vehicle model (model manifest) that specifies signals (attributes, branches, sensors, and actuators).  For more information, see Vehicle models in the Amazon Web Services IoT FleetWise Developer Guide.
    */
  def createModelManifest(): Request[CreateModelManifestResponse, AWSError] = js.native
  def createModelManifest(callback: js.Function2[/* err */ AWSError, /* data */ CreateModelManifestResponse, Unit]): Request[CreateModelManifestResponse, AWSError] = js.native
  /**
    *  Creates a vehicle model (model manifest) that specifies signals (attributes, branches, sensors, and actuators).  For more information, see Vehicle models in the Amazon Web Services IoT FleetWise Developer Guide.
    */
  def createModelManifest(params: CreateModelManifestRequest): Request[CreateModelManifestResponse, AWSError] = js.native
  def createModelManifest(
    params: CreateModelManifestRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateModelManifestResponse, Unit]
  ): Request[CreateModelManifestResponse, AWSError] = js.native
  
  /**
    *  Creates a collection of standardized signals that can be reused to create vehicle models.
    */
  def createSignalCatalog(): Request[CreateSignalCatalogResponse, AWSError] = js.native
  def createSignalCatalog(callback: js.Function2[/* err */ AWSError, /* data */ CreateSignalCatalogResponse, Unit]): Request[CreateSignalCatalogResponse, AWSError] = js.native
  /**
    *  Creates a collection of standardized signals that can be reused to create vehicle models.
    */
  def createSignalCatalog(params: CreateSignalCatalogRequest): Request[CreateSignalCatalogResponse, AWSError] = js.native
  def createSignalCatalog(
    params: CreateSignalCatalogRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSignalCatalogResponse, Unit]
  ): Request[CreateSignalCatalogResponse, AWSError] = js.native
  
  /**
    *  Creates a vehicle, which is an instance of a vehicle model (model manifest). Vehicles created from the same vehicle model consist of the same signals inherited from the vehicle model.   If you have an existing Amazon Web Services IoT Thing, you can use Amazon Web Services IoT FleetWise to create a vehicle and collect data from your thing.   For more information, see Create a vehicle (AWS CLI) in the Amazon Web Services IoT FleetWise Developer Guide.
    */
  def createVehicle(): Request[CreateVehicleResponse, AWSError] = js.native
  def createVehicle(callback: js.Function2[/* err */ AWSError, /* data */ CreateVehicleResponse, Unit]): Request[CreateVehicleResponse, AWSError] = js.native
  /**
    *  Creates a vehicle, which is an instance of a vehicle model (model manifest). Vehicles created from the same vehicle model consist of the same signals inherited from the vehicle model.   If you have an existing Amazon Web Services IoT Thing, you can use Amazon Web Services IoT FleetWise to create a vehicle and collect data from your thing.   For more information, see Create a vehicle (AWS CLI) in the Amazon Web Services IoT FleetWise Developer Guide.
    */
  def createVehicle(params: CreateVehicleRequest): Request[CreateVehicleResponse, AWSError] = js.native
  def createVehicle(
    params: CreateVehicleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVehicleResponse, Unit]
  ): Request[CreateVehicleResponse, AWSError] = js.native
  
  /**
    *  Deletes a data collection campaign. Deleting a campaign suspends all data collection and removes it from any vehicles. 
    */
  def deleteCampaign(): Request[DeleteCampaignResponse, AWSError] = js.native
  def deleteCampaign(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCampaignResponse, Unit]): Request[DeleteCampaignResponse, AWSError] = js.native
  /**
    *  Deletes a data collection campaign. Deleting a campaign suspends all data collection and removes it from any vehicles. 
    */
  def deleteCampaign(params: DeleteCampaignRequest): Request[DeleteCampaignResponse, AWSError] = js.native
  def deleteCampaign(
    params: DeleteCampaignRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCampaignResponse, Unit]
  ): Request[DeleteCampaignResponse, AWSError] = js.native
  
  /**
    *  Deletes a decoder manifest. You can't delete a decoder manifest if it has vehicles associated with it.   If the decoder manifest is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an empty body. 
    */
  def deleteDecoderManifest(): Request[DeleteDecoderManifestResponse, AWSError] = js.native
  def deleteDecoderManifest(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDecoderManifestResponse, Unit]): Request[DeleteDecoderManifestResponse, AWSError] = js.native
  /**
    *  Deletes a decoder manifest. You can't delete a decoder manifest if it has vehicles associated with it.   If the decoder manifest is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an empty body. 
    */
  def deleteDecoderManifest(params: DeleteDecoderManifestRequest): Request[DeleteDecoderManifestResponse, AWSError] = js.native
  def deleteDecoderManifest(
    params: DeleteDecoderManifestRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDecoderManifestResponse, Unit]
  ): Request[DeleteDecoderManifestResponse, AWSError] = js.native
  
  /**
    *  Deletes a fleet. Before you delete a fleet, all vehicles must be dissociated from the fleet. For more information, see Delete a fleet (AWS CLI) in the Amazon Web Services IoT FleetWise Developer Guide.  If the fleet is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an empty body. 
    */
  def deleteFleet(): Request[DeleteFleetResponse, AWSError] = js.native
  def deleteFleet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFleetResponse, Unit]): Request[DeleteFleetResponse, AWSError] = js.native
  /**
    *  Deletes a fleet. Before you delete a fleet, all vehicles must be dissociated from the fleet. For more information, see Delete a fleet (AWS CLI) in the Amazon Web Services IoT FleetWise Developer Guide.  If the fleet is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an empty body. 
    */
  def deleteFleet(params: DeleteFleetRequest): Request[DeleteFleetResponse, AWSError] = js.native
  def deleteFleet(
    params: DeleteFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFleetResponse, Unit]
  ): Request[DeleteFleetResponse, AWSError] = js.native
  
  /**
    *  Deletes a vehicle model (model manifest).  If the vehicle model is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an empty body. 
    */
  def deleteModelManifest(): Request[DeleteModelManifestResponse, AWSError] = js.native
  def deleteModelManifest(callback: js.Function2[/* err */ AWSError, /* data */ DeleteModelManifestResponse, Unit]): Request[DeleteModelManifestResponse, AWSError] = js.native
  /**
    *  Deletes a vehicle model (model manifest).  If the vehicle model is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an empty body. 
    */
  def deleteModelManifest(params: DeleteModelManifestRequest): Request[DeleteModelManifestResponse, AWSError] = js.native
  def deleteModelManifest(
    params: DeleteModelManifestRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteModelManifestResponse, Unit]
  ): Request[DeleteModelManifestResponse, AWSError] = js.native
  
  /**
    *  Deletes a signal catalog.   If the signal catalog is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an empty body. 
    */
  def deleteSignalCatalog(): Request[DeleteSignalCatalogResponse, AWSError] = js.native
  def deleteSignalCatalog(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSignalCatalogResponse, Unit]): Request[DeleteSignalCatalogResponse, AWSError] = js.native
  /**
    *  Deletes a signal catalog.   If the signal catalog is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an empty body. 
    */
  def deleteSignalCatalog(params: DeleteSignalCatalogRequest): Request[DeleteSignalCatalogResponse, AWSError] = js.native
  def deleteSignalCatalog(
    params: DeleteSignalCatalogRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSignalCatalogResponse, Unit]
  ): Request[DeleteSignalCatalogResponse, AWSError] = js.native
  
  /**
    *  Deletes a vehicle and removes it from any campaigns.  If the vehicle is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an empty body. 
    */
  def deleteVehicle(): Request[DeleteVehicleResponse, AWSError] = js.native
  def deleteVehicle(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVehicleResponse, Unit]): Request[DeleteVehicleResponse, AWSError] = js.native
  /**
    *  Deletes a vehicle and removes it from any campaigns.  If the vehicle is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an empty body. 
    */
  def deleteVehicle(params: DeleteVehicleRequest): Request[DeleteVehicleResponse, AWSError] = js.native
  def deleteVehicle(
    params: DeleteVehicleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVehicleResponse, Unit]
  ): Request[DeleteVehicleResponse, AWSError] = js.native
  
  /**
    * Removes, or disassociates, a vehicle from a fleet. Disassociating a vehicle from a fleet doesn't delete the vehicle.  If the vehicle is successfully dissociated from a fleet, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an empty body. 
    */
  def disassociateVehicleFleet(): Request[DisassociateVehicleFleetResponse, AWSError] = js.native
  def disassociateVehicleFleet(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateVehicleFleetResponse, Unit]): Request[DisassociateVehicleFleetResponse, AWSError] = js.native
  /**
    * Removes, or disassociates, a vehicle from a fleet. Disassociating a vehicle from a fleet doesn't delete the vehicle.  If the vehicle is successfully dissociated from a fleet, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an empty body. 
    */
  def disassociateVehicleFleet(params: DisassociateVehicleFleetRequest): Request[DisassociateVehicleFleetResponse, AWSError] = js.native
  def disassociateVehicleFleet(
    params: DisassociateVehicleFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateVehicleFleetResponse, Unit]
  ): Request[DisassociateVehicleFleetResponse, AWSError] = js.native
  
  /**
    *  Retrieves information about a campaign. 
    */
  def getCampaign(): Request[GetCampaignResponse, AWSError] = js.native
  def getCampaign(callback: js.Function2[/* err */ AWSError, /* data */ GetCampaignResponse, Unit]): Request[GetCampaignResponse, AWSError] = js.native
  /**
    *  Retrieves information about a campaign. 
    */
  def getCampaign(params: GetCampaignRequest): Request[GetCampaignResponse, AWSError] = js.native
  def getCampaign(
    params: GetCampaignRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCampaignResponse, Unit]
  ): Request[GetCampaignResponse, AWSError] = js.native
  
  /**
    *  Retrieves information about a created decoder manifest. 
    */
  def getDecoderManifest(): Request[GetDecoderManifestResponse, AWSError] = js.native
  def getDecoderManifest(callback: js.Function2[/* err */ AWSError, /* data */ GetDecoderManifestResponse, Unit]): Request[GetDecoderManifestResponse, AWSError] = js.native
  /**
    *  Retrieves information about a created decoder manifest. 
    */
  def getDecoderManifest(params: GetDecoderManifestRequest): Request[GetDecoderManifestResponse, AWSError] = js.native
  def getDecoderManifest(
    params: GetDecoderManifestRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDecoderManifestResponse, Unit]
  ): Request[GetDecoderManifestResponse, AWSError] = js.native
  
  /**
    *  Retrieves information about a fleet. 
    */
  def getFleet(): Request[GetFleetResponse, AWSError] = js.native
  def getFleet(callback: js.Function2[/* err */ AWSError, /* data */ GetFleetResponse, Unit]): Request[GetFleetResponse, AWSError] = js.native
  /**
    *  Retrieves information about a fleet. 
    */
  def getFleet(params: GetFleetRequest): Request[GetFleetResponse, AWSError] = js.native
  def getFleet(
    params: GetFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFleetResponse, Unit]
  ): Request[GetFleetResponse, AWSError] = js.native
  
  /**
    * Retrieves the logging options.
    */
  def getLoggingOptions(): Request[GetLoggingOptionsResponse, AWSError] = js.native
  def getLoggingOptions(callback: js.Function2[/* err */ AWSError, /* data */ GetLoggingOptionsResponse, Unit]): Request[GetLoggingOptionsResponse, AWSError] = js.native
  /**
    * Retrieves the logging options.
    */
  def getLoggingOptions(params: GetLoggingOptionsRequest): Request[GetLoggingOptionsResponse, AWSError] = js.native
  def getLoggingOptions(
    params: GetLoggingOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLoggingOptionsResponse, Unit]
  ): Request[GetLoggingOptionsResponse, AWSError] = js.native
  
  /**
    *  Retrieves information about a vehicle model (model manifest). 
    */
  def getModelManifest(): Request[GetModelManifestResponse, AWSError] = js.native
  def getModelManifest(callback: js.Function2[/* err */ AWSError, /* data */ GetModelManifestResponse, Unit]): Request[GetModelManifestResponse, AWSError] = js.native
  /**
    *  Retrieves information about a vehicle model (model manifest). 
    */
  def getModelManifest(params: GetModelManifestRequest): Request[GetModelManifestResponse, AWSError] = js.native
  def getModelManifest(
    params: GetModelManifestRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetModelManifestResponse, Unit]
  ): Request[GetModelManifestResponse, AWSError] = js.native
  
  /**
    *  Retrieves information about the status of registering your Amazon Web Services account, IAM, and Amazon Timestream resources so that Amazon Web Services IoT FleetWise can transfer your vehicle data to the Amazon Web Services Cloud.  For more information, including step-by-step procedures, see Setting up Amazon Web Services IoT FleetWise.   This API operation doesn't require input parameters. 
    */
  def getRegisterAccountStatus(): Request[GetRegisterAccountStatusResponse, AWSError] = js.native
  def getRegisterAccountStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetRegisterAccountStatusResponse, Unit]): Request[GetRegisterAccountStatusResponse, AWSError] = js.native
  /**
    *  Retrieves information about the status of registering your Amazon Web Services account, IAM, and Amazon Timestream resources so that Amazon Web Services IoT FleetWise can transfer your vehicle data to the Amazon Web Services Cloud.  For more information, including step-by-step procedures, see Setting up Amazon Web Services IoT FleetWise.   This API operation doesn't require input parameters. 
    */
  def getRegisterAccountStatus(params: GetRegisterAccountStatusRequest): Request[GetRegisterAccountStatusResponse, AWSError] = js.native
  def getRegisterAccountStatus(
    params: GetRegisterAccountStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRegisterAccountStatusResponse, Unit]
  ): Request[GetRegisterAccountStatusResponse, AWSError] = js.native
  
  /**
    *  Retrieves information about a signal catalog. 
    */
  def getSignalCatalog(): Request[GetSignalCatalogResponse, AWSError] = js.native
  def getSignalCatalog(callback: js.Function2[/* err */ AWSError, /* data */ GetSignalCatalogResponse, Unit]): Request[GetSignalCatalogResponse, AWSError] = js.native
  /**
    *  Retrieves information about a signal catalog. 
    */
  def getSignalCatalog(params: GetSignalCatalogRequest): Request[GetSignalCatalogResponse, AWSError] = js.native
  def getSignalCatalog(
    params: GetSignalCatalogRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSignalCatalogResponse, Unit]
  ): Request[GetSignalCatalogResponse, AWSError] = js.native
  
  /**
    *  Retrieves information about a vehicle. 
    */
  def getVehicle(): Request[GetVehicleResponse, AWSError] = js.native
  def getVehicle(callback: js.Function2[/* err */ AWSError, /* data */ GetVehicleResponse, Unit]): Request[GetVehicleResponse, AWSError] = js.native
  /**
    *  Retrieves information about a vehicle. 
    */
  def getVehicle(params: GetVehicleRequest): Request[GetVehicleResponse, AWSError] = js.native
  def getVehicle(
    params: GetVehicleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVehicleResponse, Unit]
  ): Request[GetVehicleResponse, AWSError] = js.native
  
  /**
    *  Retrieves information about the status of a vehicle with any associated campaigns. 
    */
  def getVehicleStatus(): Request[GetVehicleStatusResponse, AWSError] = js.native
  def getVehicleStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetVehicleStatusResponse, Unit]): Request[GetVehicleStatusResponse, AWSError] = js.native
  /**
    *  Retrieves information about the status of a vehicle with any associated campaigns. 
    */
  def getVehicleStatus(params: GetVehicleStatusRequest): Request[GetVehicleStatusResponse, AWSError] = js.native
  def getVehicleStatus(
    params: GetVehicleStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVehicleStatusResponse, Unit]
  ): Request[GetVehicleStatusResponse, AWSError] = js.native
  
  /**
    *  Creates a decoder manifest using your existing CAN DBC file from your local device. 
    */
  def importDecoderManifest(): Request[ImportDecoderManifestResponse, AWSError] = js.native
  def importDecoderManifest(callback: js.Function2[/* err */ AWSError, /* data */ ImportDecoderManifestResponse, Unit]): Request[ImportDecoderManifestResponse, AWSError] = js.native
  /**
    *  Creates a decoder manifest using your existing CAN DBC file from your local device. 
    */
  def importDecoderManifest(params: ImportDecoderManifestRequest): Request[ImportDecoderManifestResponse, AWSError] = js.native
  def importDecoderManifest(
    params: ImportDecoderManifestRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportDecoderManifestResponse, Unit]
  ): Request[ImportDecoderManifestResponse, AWSError] = js.native
  
  /**
    *  Creates a signal catalog using your existing VSS formatted content from your local device. 
    */
  def importSignalCatalog(): Request[ImportSignalCatalogResponse, AWSError] = js.native
  def importSignalCatalog(callback: js.Function2[/* err */ AWSError, /* data */ ImportSignalCatalogResponse, Unit]): Request[ImportSignalCatalogResponse, AWSError] = js.native
  /**
    *  Creates a signal catalog using your existing VSS formatted content from your local device. 
    */
  def importSignalCatalog(params: ImportSignalCatalogRequest): Request[ImportSignalCatalogResponse, AWSError] = js.native
  def importSignalCatalog(
    params: ImportSignalCatalogRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportSignalCatalogResponse, Unit]
  ): Request[ImportSignalCatalogResponse, AWSError] = js.native
  
  /**
    *  Lists information about created campaigns.   This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listCampaigns(): Request[ListCampaignsResponse, AWSError] = js.native
  def listCampaigns(callback: js.Function2[/* err */ AWSError, /* data */ ListCampaignsResponse, Unit]): Request[ListCampaignsResponse, AWSError] = js.native
  /**
    *  Lists information about created campaigns.   This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listCampaigns(params: ListCampaignsRequest): Request[ListCampaignsResponse, AWSError] = js.native
  def listCampaigns(
    params: ListCampaignsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCampaignsResponse, Unit]
  ): Request[ListCampaignsResponse, AWSError] = js.native
  
  /**
    *  Lists the network interfaces specified in a decoder manifest.   This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listDecoderManifestNetworkInterfaces(): Request[ListDecoderManifestNetworkInterfacesResponse, AWSError] = js.native
  def listDecoderManifestNetworkInterfaces(
    callback: js.Function2[/* err */ AWSError, /* data */ ListDecoderManifestNetworkInterfacesResponse, Unit]
  ): Request[ListDecoderManifestNetworkInterfacesResponse, AWSError] = js.native
  /**
    *  Lists the network interfaces specified in a decoder manifest.   This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listDecoderManifestNetworkInterfaces(params: ListDecoderManifestNetworkInterfacesRequest): Request[ListDecoderManifestNetworkInterfacesResponse, AWSError] = js.native
  def listDecoderManifestNetworkInterfaces(
    params: ListDecoderManifestNetworkInterfacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDecoderManifestNetworkInterfacesResponse, Unit]
  ): Request[ListDecoderManifestNetworkInterfacesResponse, AWSError] = js.native
  
  /**
    *  A list of information about signal decoders specified in a decoder manifest.   This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listDecoderManifestSignals(): Request[ListDecoderManifestSignalsResponse, AWSError] = js.native
  def listDecoderManifestSignals(callback: js.Function2[/* err */ AWSError, /* data */ ListDecoderManifestSignalsResponse, Unit]): Request[ListDecoderManifestSignalsResponse, AWSError] = js.native
  /**
    *  A list of information about signal decoders specified in a decoder manifest.   This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listDecoderManifestSignals(params: ListDecoderManifestSignalsRequest): Request[ListDecoderManifestSignalsResponse, AWSError] = js.native
  def listDecoderManifestSignals(
    params: ListDecoderManifestSignalsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDecoderManifestSignalsResponse, Unit]
  ): Request[ListDecoderManifestSignalsResponse, AWSError] = js.native
  
  /**
    *  Lists decoder manifests.   This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listDecoderManifests(): Request[ListDecoderManifestsResponse, AWSError] = js.native
  def listDecoderManifests(callback: js.Function2[/* err */ AWSError, /* data */ ListDecoderManifestsResponse, Unit]): Request[ListDecoderManifestsResponse, AWSError] = js.native
  /**
    *  Lists decoder manifests.   This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listDecoderManifests(params: ListDecoderManifestsRequest): Request[ListDecoderManifestsResponse, AWSError] = js.native
  def listDecoderManifests(
    params: ListDecoderManifestsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDecoderManifestsResponse, Unit]
  ): Request[ListDecoderManifestsResponse, AWSError] = js.native
  
  /**
    *  Retrieves information for each created fleet in an Amazon Web Services account.   This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listFleets(): Request[ListFleetsResponse, AWSError] = js.native
  def listFleets(callback: js.Function2[/* err */ AWSError, /* data */ ListFleetsResponse, Unit]): Request[ListFleetsResponse, AWSError] = js.native
  /**
    *  Retrieves information for each created fleet in an Amazon Web Services account.   This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listFleets(params: ListFleetsRequest): Request[ListFleetsResponse, AWSError] = js.native
  def listFleets(
    params: ListFleetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFleetsResponse, Unit]
  ): Request[ListFleetsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of IDs for all fleets that the vehicle is associated with.  This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listFleetsForVehicle(): Request[ListFleetsForVehicleResponse, AWSError] = js.native
  def listFleetsForVehicle(callback: js.Function2[/* err */ AWSError, /* data */ ListFleetsForVehicleResponse, Unit]): Request[ListFleetsForVehicleResponse, AWSError] = js.native
  /**
    * Retrieves a list of IDs for all fleets that the vehicle is associated with.  This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listFleetsForVehicle(params: ListFleetsForVehicleRequest): Request[ListFleetsForVehicleResponse, AWSError] = js.native
  def listFleetsForVehicle(
    params: ListFleetsForVehicleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFleetsForVehicleResponse, Unit]
  ): Request[ListFleetsForVehicleResponse, AWSError] = js.native
  
  /**
    *  Lists information about nodes specified in a vehicle model (model manifest).   This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listModelManifestNodes(): Request[ListModelManifestNodesResponse, AWSError] = js.native
  def listModelManifestNodes(callback: js.Function2[/* err */ AWSError, /* data */ ListModelManifestNodesResponse, Unit]): Request[ListModelManifestNodesResponse, AWSError] = js.native
  /**
    *  Lists information about nodes specified in a vehicle model (model manifest).   This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listModelManifestNodes(params: ListModelManifestNodesRequest): Request[ListModelManifestNodesResponse, AWSError] = js.native
  def listModelManifestNodes(
    params: ListModelManifestNodesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListModelManifestNodesResponse, Unit]
  ): Request[ListModelManifestNodesResponse, AWSError] = js.native
  
  /**
    *  Retrieves a list of vehicle models (model manifests).   This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listModelManifests(): Request[ListModelManifestsResponse, AWSError] = js.native
  def listModelManifests(callback: js.Function2[/* err */ AWSError, /* data */ ListModelManifestsResponse, Unit]): Request[ListModelManifestsResponse, AWSError] = js.native
  /**
    *  Retrieves a list of vehicle models (model manifests).   This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listModelManifests(params: ListModelManifestsRequest): Request[ListModelManifestsResponse, AWSError] = js.native
  def listModelManifests(
    params: ListModelManifestsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListModelManifestsResponse, Unit]
  ): Request[ListModelManifestsResponse, AWSError] = js.native
  
  /**
    *  Lists of information about the signals (nodes) specified in a signal catalog.   This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listSignalCatalogNodes(): Request[ListSignalCatalogNodesResponse, AWSError] = js.native
  def listSignalCatalogNodes(callback: js.Function2[/* err */ AWSError, /* data */ ListSignalCatalogNodesResponse, Unit]): Request[ListSignalCatalogNodesResponse, AWSError] = js.native
  /**
    *  Lists of information about the signals (nodes) specified in a signal catalog.   This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listSignalCatalogNodes(params: ListSignalCatalogNodesRequest): Request[ListSignalCatalogNodesResponse, AWSError] = js.native
  def listSignalCatalogNodes(
    params: ListSignalCatalogNodesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSignalCatalogNodesResponse, Unit]
  ): Request[ListSignalCatalogNodesResponse, AWSError] = js.native
  
  /**
    *  Lists all the created signal catalogs in an Amazon Web Services account.  You can use to list information about each signal (node) specified in a signal catalog.  This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listSignalCatalogs(): Request[ListSignalCatalogsResponse, AWSError] = js.native
  def listSignalCatalogs(callback: js.Function2[/* err */ AWSError, /* data */ ListSignalCatalogsResponse, Unit]): Request[ListSignalCatalogsResponse, AWSError] = js.native
  /**
    *  Lists all the created signal catalogs in an Amazon Web Services account.  You can use to list information about each signal (node) specified in a signal catalog.  This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listSignalCatalogs(params: ListSignalCatalogsRequest): Request[ListSignalCatalogsResponse, AWSError] = js.native
  def listSignalCatalogs(
    params: ListSignalCatalogsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSignalCatalogsResponse, Unit]
  ): Request[ListSignalCatalogsResponse, AWSError] = js.native
  
  /**
    * Lists the tags (metadata) you have assigned to the resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags (metadata) you have assigned to the resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    *  Retrieves a list of summaries of created vehicles.   This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listVehicles(): Request[ListVehiclesResponse, AWSError] = js.native
  def listVehicles(callback: js.Function2[/* err */ AWSError, /* data */ ListVehiclesResponse, Unit]): Request[ListVehiclesResponse, AWSError] = js.native
  /**
    *  Retrieves a list of summaries of created vehicles.   This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listVehicles(params: ListVehiclesRequest): Request[ListVehiclesResponse, AWSError] = js.native
  def listVehicles(
    params: ListVehiclesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVehiclesResponse, Unit]
  ): Request[ListVehiclesResponse, AWSError] = js.native
  
  /**
    *  Retrieves a list of summaries of all vehicles associated with a fleet.   This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listVehiclesInFleet(): Request[ListVehiclesInFleetResponse, AWSError] = js.native
  def listVehiclesInFleet(callback: js.Function2[/* err */ AWSError, /* data */ ListVehiclesInFleetResponse, Unit]): Request[ListVehiclesInFleetResponse, AWSError] = js.native
  /**
    *  Retrieves a list of summaries of all vehicles associated with a fleet.   This API operation uses pagination. Specify the nextToken parameter in the request to return more results. 
    */
  def listVehiclesInFleet(params: ListVehiclesInFleetRequest): Request[ListVehiclesInFleetResponse, AWSError] = js.native
  def listVehiclesInFleet(
    params: ListVehiclesInFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVehiclesInFleetResponse, Unit]
  ): Request[ListVehiclesInFleetResponse, AWSError] = js.native
  
  /**
    * Creates or updates the logging option.
    */
  def putLoggingOptions(): Request[PutLoggingOptionsResponse, AWSError] = js.native
  def putLoggingOptions(callback: js.Function2[/* err */ AWSError, /* data */ PutLoggingOptionsResponse, Unit]): Request[PutLoggingOptionsResponse, AWSError] = js.native
  /**
    * Creates or updates the logging option.
    */
  def putLoggingOptions(params: PutLoggingOptionsRequest): Request[PutLoggingOptionsResponse, AWSError] = js.native
  def putLoggingOptions(
    params: PutLoggingOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutLoggingOptionsResponse, Unit]
  ): Request[PutLoggingOptionsResponse, AWSError] = js.native
  
  /**
    * Registers your Amazon Web Services account, IAM, and Amazon Timestream resources so Amazon Web Services IoT FleetWise can transfer your vehicle data to the Amazon Web Services Cloud. For more information, including step-by-step procedures, see Setting up Amazon Web Services IoT FleetWise.   An Amazon Web Services account is not the same thing as a "user account". An Amazon Web Services user is an identity that you create using Identity and Access Management (IAM) and takes the form of either an IAM user or an IAM role, both with credentials. A single Amazon Web Services account can, and typically does, contain many users and roles. 
    */
  def registerAccount(): Request[RegisterAccountResponse, AWSError] = js.native
  def registerAccount(callback: js.Function2[/* err */ AWSError, /* data */ RegisterAccountResponse, Unit]): Request[RegisterAccountResponse, AWSError] = js.native
  /**
    * Registers your Amazon Web Services account, IAM, and Amazon Timestream resources so Amazon Web Services IoT FleetWise can transfer your vehicle data to the Amazon Web Services Cloud. For more information, including step-by-step procedures, see Setting up Amazon Web Services IoT FleetWise.   An Amazon Web Services account is not the same thing as a "user account". An Amazon Web Services user is an identity that you create using Identity and Access Management (IAM) and takes the form of either an IAM user or an IAM role, both with credentials. A single Amazon Web Services account can, and typically does, contain many users and roles. 
    */
  def registerAccount(params: RegisterAccountRequest): Request[RegisterAccountResponse, AWSError] = js.native
  def registerAccount(
    params: RegisterAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterAccountResponse, Unit]
  ): Request[RegisterAccountResponse, AWSError] = js.native
  
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes the given tags (metadata) from the resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the given tags (metadata) from the resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    *  Updates a campaign. 
    */
  def updateCampaign(): Request[UpdateCampaignResponse, AWSError] = js.native
  def updateCampaign(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCampaignResponse, Unit]): Request[UpdateCampaignResponse, AWSError] = js.native
  /**
    *  Updates a campaign. 
    */
  def updateCampaign(params: UpdateCampaignRequest): Request[UpdateCampaignResponse, AWSError] = js.native
  def updateCampaign(
    params: UpdateCampaignRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCampaignResponse, Unit]
  ): Request[UpdateCampaignResponse, AWSError] = js.native
  
  /**
    *  Updates a decoder manifest. A decoder manifest can only be updated when the status is DRAFT. Only ACTIVE decoder manifests can be associated with vehicles.
    */
  def updateDecoderManifest(): Request[UpdateDecoderManifestResponse, AWSError] = js.native
  def updateDecoderManifest(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDecoderManifestResponse, Unit]): Request[UpdateDecoderManifestResponse, AWSError] = js.native
  /**
    *  Updates a decoder manifest. A decoder manifest can only be updated when the status is DRAFT. Only ACTIVE decoder manifests can be associated with vehicles.
    */
  def updateDecoderManifest(params: UpdateDecoderManifestRequest): Request[UpdateDecoderManifestResponse, AWSError] = js.native
  def updateDecoderManifest(
    params: UpdateDecoderManifestRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDecoderManifestResponse, Unit]
  ): Request[UpdateDecoderManifestResponse, AWSError] = js.native
  
  /**
    *  Updates the description of an existing fleet.   If the fleet is successfully updated, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an empty HTTP body. 
    */
  def updateFleet(): Request[UpdateFleetResponse, AWSError] = js.native
  def updateFleet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFleetResponse, Unit]): Request[UpdateFleetResponse, AWSError] = js.native
  /**
    *  Updates the description of an existing fleet.   If the fleet is successfully updated, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an empty HTTP body. 
    */
  def updateFleet(params: UpdateFleetRequest): Request[UpdateFleetResponse, AWSError] = js.native
  def updateFleet(
    params: UpdateFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFleetResponse, Unit]
  ): Request[UpdateFleetResponse, AWSError] = js.native
  
  /**
    *  Updates a vehicle model (model manifest). If created vehicles are associated with a vehicle model, it can't be updated.
    */
  def updateModelManifest(): Request[UpdateModelManifestResponse, AWSError] = js.native
  def updateModelManifest(callback: js.Function2[/* err */ AWSError, /* data */ UpdateModelManifestResponse, Unit]): Request[UpdateModelManifestResponse, AWSError] = js.native
  /**
    *  Updates a vehicle model (model manifest). If created vehicles are associated with a vehicle model, it can't be updated.
    */
  def updateModelManifest(params: UpdateModelManifestRequest): Request[UpdateModelManifestResponse, AWSError] = js.native
  def updateModelManifest(
    params: UpdateModelManifestRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateModelManifestResponse, Unit]
  ): Request[UpdateModelManifestResponse, AWSError] = js.native
  
  /**
    *  Updates a signal catalog. 
    */
  def updateSignalCatalog(): Request[UpdateSignalCatalogResponse, AWSError] = js.native
  def updateSignalCatalog(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSignalCatalogResponse, Unit]): Request[UpdateSignalCatalogResponse, AWSError] = js.native
  /**
    *  Updates a signal catalog. 
    */
  def updateSignalCatalog(params: UpdateSignalCatalogRequest): Request[UpdateSignalCatalogResponse, AWSError] = js.native
  def updateSignalCatalog(
    params: UpdateSignalCatalogRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSignalCatalogResponse, Unit]
  ): Request[UpdateSignalCatalogResponse, AWSError] = js.native
  
  /**
    *  Updates a vehicle. 
    */
  def updateVehicle(): Request[UpdateVehicleResponse, AWSError] = js.native
  def updateVehicle(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVehicleResponse, Unit]): Request[UpdateVehicleResponse, AWSError] = js.native
  /**
    *  Updates a vehicle. 
    */
  def updateVehicle(params: UpdateVehicleRequest): Request[UpdateVehicleResponse, AWSError] = js.native
  def updateVehicle(
    params: UpdateVehicleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVehicleResponse, Unit]
  ): Request[UpdateVehicleResponse, AWSError] = js.native
}
