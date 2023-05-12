package typings.awsSdk.clientsIotroborunnerMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IoTRoboRunner extends Service {
  
  @JSName("config")
  var config_IoTRoboRunner: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Grants permission to create a destination
    */
  def createDestination(): Request[CreateDestinationResponse, AWSError] = js.native
  def createDestination(callback: js.Function2[/* err */ AWSError, /* data */ CreateDestinationResponse, Unit]): Request[CreateDestinationResponse, AWSError] = js.native
  /**
    * Grants permission to create a destination
    */
  def createDestination(params: CreateDestinationRequest): Request[CreateDestinationResponse, AWSError] = js.native
  def createDestination(
    params: CreateDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDestinationResponse, Unit]
  ): Request[CreateDestinationResponse, AWSError] = js.native
  
  /**
    * Grants permission to create a site
    */
  def createSite(): Request[CreateSiteResponse, AWSError] = js.native
  def createSite(callback: js.Function2[/* err */ AWSError, /* data */ CreateSiteResponse, Unit]): Request[CreateSiteResponse, AWSError] = js.native
  /**
    * Grants permission to create a site
    */
  def createSite(params: CreateSiteRequest): Request[CreateSiteResponse, AWSError] = js.native
  def createSite(
    params: CreateSiteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSiteResponse, Unit]
  ): Request[CreateSiteResponse, AWSError] = js.native
  
  /**
    * Grants permission to create a worker
    */
  def createWorker(): Request[CreateWorkerResponse, AWSError] = js.native
  def createWorker(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkerResponse, Unit]): Request[CreateWorkerResponse, AWSError] = js.native
  /**
    * Grants permission to create a worker
    */
  def createWorker(params: CreateWorkerRequest): Request[CreateWorkerResponse, AWSError] = js.native
  def createWorker(
    params: CreateWorkerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkerResponse, Unit]
  ): Request[CreateWorkerResponse, AWSError] = js.native
  
  /**
    * Grants permission to create a worker fleet
    */
  def createWorkerFleet(): Request[CreateWorkerFleetResponse, AWSError] = js.native
  def createWorkerFleet(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkerFleetResponse, Unit]): Request[CreateWorkerFleetResponse, AWSError] = js.native
  /**
    * Grants permission to create a worker fleet
    */
  def createWorkerFleet(params: CreateWorkerFleetRequest): Request[CreateWorkerFleetResponse, AWSError] = js.native
  def createWorkerFleet(
    params: CreateWorkerFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkerFleetResponse, Unit]
  ): Request[CreateWorkerFleetResponse, AWSError] = js.native
  
  /**
    * Grants permission to delete a destination
    */
  def deleteDestination(): Request[DeleteDestinationResponse, AWSError] = js.native
  def deleteDestination(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDestinationResponse, Unit]): Request[DeleteDestinationResponse, AWSError] = js.native
  /**
    * Grants permission to delete a destination
    */
  def deleteDestination(params: DeleteDestinationRequest): Request[DeleteDestinationResponse, AWSError] = js.native
  def deleteDestination(
    params: DeleteDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDestinationResponse, Unit]
  ): Request[DeleteDestinationResponse, AWSError] = js.native
  
  /**
    * Grants permission to delete a site
    */
  def deleteSite(): Request[DeleteSiteResponse, AWSError] = js.native
  def deleteSite(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSiteResponse, Unit]): Request[DeleteSiteResponse, AWSError] = js.native
  /**
    * Grants permission to delete a site
    */
  def deleteSite(params: DeleteSiteRequest): Request[DeleteSiteResponse, AWSError] = js.native
  def deleteSite(
    params: DeleteSiteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSiteResponse, Unit]
  ): Request[DeleteSiteResponse, AWSError] = js.native
  
  /**
    * Grants permission to delete a worker
    */
  def deleteWorker(): Request[DeleteWorkerResponse, AWSError] = js.native
  def deleteWorker(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkerResponse, Unit]): Request[DeleteWorkerResponse, AWSError] = js.native
  /**
    * Grants permission to delete a worker
    */
  def deleteWorker(params: DeleteWorkerRequest): Request[DeleteWorkerResponse, AWSError] = js.native
  def deleteWorker(
    params: DeleteWorkerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkerResponse, Unit]
  ): Request[DeleteWorkerResponse, AWSError] = js.native
  
  /**
    * Grants permission to delete a worker fleet
    */
  def deleteWorkerFleet(): Request[DeleteWorkerFleetResponse, AWSError] = js.native
  def deleteWorkerFleet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkerFleetResponse, Unit]): Request[DeleteWorkerFleetResponse, AWSError] = js.native
  /**
    * Grants permission to delete a worker fleet
    */
  def deleteWorkerFleet(params: DeleteWorkerFleetRequest): Request[DeleteWorkerFleetResponse, AWSError] = js.native
  def deleteWorkerFleet(
    params: DeleteWorkerFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkerFleetResponse, Unit]
  ): Request[DeleteWorkerFleetResponse, AWSError] = js.native
  
  /**
    * Grants permission to get a destination
    */
  def getDestination(): Request[GetDestinationResponse, AWSError] = js.native
  def getDestination(callback: js.Function2[/* err */ AWSError, /* data */ GetDestinationResponse, Unit]): Request[GetDestinationResponse, AWSError] = js.native
  /**
    * Grants permission to get a destination
    */
  def getDestination(params: GetDestinationRequest): Request[GetDestinationResponse, AWSError] = js.native
  def getDestination(
    params: GetDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDestinationResponse, Unit]
  ): Request[GetDestinationResponse, AWSError] = js.native
  
  /**
    * Grants permission to get a site
    */
  def getSite(): Request[GetSiteResponse, AWSError] = js.native
  def getSite(callback: js.Function2[/* err */ AWSError, /* data */ GetSiteResponse, Unit]): Request[GetSiteResponse, AWSError] = js.native
  /**
    * Grants permission to get a site
    */
  def getSite(params: GetSiteRequest): Request[GetSiteResponse, AWSError] = js.native
  def getSite(
    params: GetSiteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSiteResponse, Unit]
  ): Request[GetSiteResponse, AWSError] = js.native
  
  /**
    * Grants permission to get a worker
    */
  def getWorker(): Request[GetWorkerResponse, AWSError] = js.native
  def getWorker(callback: js.Function2[/* err */ AWSError, /* data */ GetWorkerResponse, Unit]): Request[GetWorkerResponse, AWSError] = js.native
  /**
    * Grants permission to get a worker
    */
  def getWorker(params: GetWorkerRequest): Request[GetWorkerResponse, AWSError] = js.native
  def getWorker(
    params: GetWorkerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorkerResponse, Unit]
  ): Request[GetWorkerResponse, AWSError] = js.native
  
  /**
    * Grants permission to get a worker fleet
    */
  def getWorkerFleet(): Request[GetWorkerFleetResponse, AWSError] = js.native
  def getWorkerFleet(callback: js.Function2[/* err */ AWSError, /* data */ GetWorkerFleetResponse, Unit]): Request[GetWorkerFleetResponse, AWSError] = js.native
  /**
    * Grants permission to get a worker fleet
    */
  def getWorkerFleet(params: GetWorkerFleetRequest): Request[GetWorkerFleetResponse, AWSError] = js.native
  def getWorkerFleet(
    params: GetWorkerFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorkerFleetResponse, Unit]
  ): Request[GetWorkerFleetResponse, AWSError] = js.native
  
  /**
    * Grants permission to list destinations
    */
  def listDestinations(): Request[ListDestinationsResponse, AWSError] = js.native
  def listDestinations(callback: js.Function2[/* err */ AWSError, /* data */ ListDestinationsResponse, Unit]): Request[ListDestinationsResponse, AWSError] = js.native
  /**
    * Grants permission to list destinations
    */
  def listDestinations(params: ListDestinationsRequest): Request[ListDestinationsResponse, AWSError] = js.native
  def listDestinations(
    params: ListDestinationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDestinationsResponse, Unit]
  ): Request[ListDestinationsResponse, AWSError] = js.native
  
  /**
    * Grants permission to list sites
    */
  def listSites(): Request[ListSitesResponse, AWSError] = js.native
  def listSites(callback: js.Function2[/* err */ AWSError, /* data */ ListSitesResponse, Unit]): Request[ListSitesResponse, AWSError] = js.native
  /**
    * Grants permission to list sites
    */
  def listSites(params: ListSitesRequest): Request[ListSitesResponse, AWSError] = js.native
  def listSites(
    params: ListSitesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSitesResponse, Unit]
  ): Request[ListSitesResponse, AWSError] = js.native
  
  /**
    * Grants permission to list worker fleets
    */
  def listWorkerFleets(): Request[ListWorkerFleetsResponse, AWSError] = js.native
  def listWorkerFleets(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkerFleetsResponse, Unit]): Request[ListWorkerFleetsResponse, AWSError] = js.native
  /**
    * Grants permission to list worker fleets
    */
  def listWorkerFleets(params: ListWorkerFleetsRequest): Request[ListWorkerFleetsResponse, AWSError] = js.native
  def listWorkerFleets(
    params: ListWorkerFleetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkerFleetsResponse, Unit]
  ): Request[ListWorkerFleetsResponse, AWSError] = js.native
  
  /**
    * Grants permission to list workers
    */
  def listWorkers(): Request[ListWorkersResponse, AWSError] = js.native
  def listWorkers(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkersResponse, Unit]): Request[ListWorkersResponse, AWSError] = js.native
  /**
    * Grants permission to list workers
    */
  def listWorkers(params: ListWorkersRequest): Request[ListWorkersResponse, AWSError] = js.native
  def listWorkers(
    params: ListWorkersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkersResponse, Unit]
  ): Request[ListWorkersResponse, AWSError] = js.native
  
  /**
    * Grants permission to update a destination
    */
  def updateDestination(): Request[UpdateDestinationResponse, AWSError] = js.native
  def updateDestination(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDestinationResponse, Unit]): Request[UpdateDestinationResponse, AWSError] = js.native
  /**
    * Grants permission to update a destination
    */
  def updateDestination(params: UpdateDestinationRequest): Request[UpdateDestinationResponse, AWSError] = js.native
  def updateDestination(
    params: UpdateDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDestinationResponse, Unit]
  ): Request[UpdateDestinationResponse, AWSError] = js.native
  
  /**
    * Grants permission to update a site
    */
  def updateSite(): Request[UpdateSiteResponse, AWSError] = js.native
  def updateSite(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSiteResponse, Unit]): Request[UpdateSiteResponse, AWSError] = js.native
  /**
    * Grants permission to update a site
    */
  def updateSite(params: UpdateSiteRequest): Request[UpdateSiteResponse, AWSError] = js.native
  def updateSite(
    params: UpdateSiteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSiteResponse, Unit]
  ): Request[UpdateSiteResponse, AWSError] = js.native
  
  /**
    * Grants permission to update a worker
    */
  def updateWorker(): Request[UpdateWorkerResponse, AWSError] = js.native
  def updateWorker(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkerResponse, Unit]): Request[UpdateWorkerResponse, AWSError] = js.native
  /**
    * Grants permission to update a worker
    */
  def updateWorker(params: UpdateWorkerRequest): Request[UpdateWorkerResponse, AWSError] = js.native
  def updateWorker(
    params: UpdateWorkerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkerResponse, Unit]
  ): Request[UpdateWorkerResponse, AWSError] = js.native
  
  /**
    * Grants permission to update a worker fleet
    */
  def updateWorkerFleet(): Request[UpdateWorkerFleetResponse, AWSError] = js.native
  def updateWorkerFleet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkerFleetResponse, Unit]): Request[UpdateWorkerFleetResponse, AWSError] = js.native
  /**
    * Grants permission to update a worker fleet
    */
  def updateWorkerFleet(params: UpdateWorkerFleetRequest): Request[UpdateWorkerFleetResponse, AWSError] = js.native
  def updateWorkerFleet(
    params: UpdateWorkerFleetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkerFleetResponse, Unit]
  ): Request[UpdateWorkerFleetResponse, AWSError] = js.native
}
