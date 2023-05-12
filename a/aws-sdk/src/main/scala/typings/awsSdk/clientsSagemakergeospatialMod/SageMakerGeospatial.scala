package typings.awsSdk.clientsSagemakergeospatialMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SageMakerGeospatial extends Service {
  
  @JSName("config")
  var config_SageMakerGeospatial: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Use this operation to delete an Earth Observation job.
    */
  def deleteEarthObservationJob(): Request[DeleteEarthObservationJobOutput, AWSError] = js.native
  def deleteEarthObservationJob(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEarthObservationJobOutput, scala.Unit]): Request[DeleteEarthObservationJobOutput, AWSError] = js.native
  /**
    * Use this operation to delete an Earth Observation job.
    */
  def deleteEarthObservationJob(params: DeleteEarthObservationJobInput): Request[DeleteEarthObservationJobOutput, AWSError] = js.native
  def deleteEarthObservationJob(
    params: DeleteEarthObservationJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEarthObservationJobOutput, scala.Unit]
  ): Request[DeleteEarthObservationJobOutput, AWSError] = js.native
  
  /**
    * Use this operation to delete a Vector Enrichment job.
    */
  def deleteVectorEnrichmentJob(): Request[DeleteVectorEnrichmentJobOutput, AWSError] = js.native
  def deleteVectorEnrichmentJob(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVectorEnrichmentJobOutput, scala.Unit]): Request[DeleteVectorEnrichmentJobOutput, AWSError] = js.native
  /**
    * Use this operation to delete a Vector Enrichment job.
    */
  def deleteVectorEnrichmentJob(params: DeleteVectorEnrichmentJobInput): Request[DeleteVectorEnrichmentJobOutput, AWSError] = js.native
  def deleteVectorEnrichmentJob(
    params: DeleteVectorEnrichmentJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVectorEnrichmentJobOutput, scala.Unit]
  ): Request[DeleteVectorEnrichmentJobOutput, AWSError] = js.native
  
  /**
    * Use this operation to export results of an Earth Observation job and optionally source images used as input to the EOJ to an Amazon S3 location.
    */
  def exportEarthObservationJob(): Request[ExportEarthObservationJobOutput, AWSError] = js.native
  def exportEarthObservationJob(callback: js.Function2[/* err */ AWSError, /* data */ ExportEarthObservationJobOutput, scala.Unit]): Request[ExportEarthObservationJobOutput, AWSError] = js.native
  /**
    * Use this operation to export results of an Earth Observation job and optionally source images used as input to the EOJ to an Amazon S3 location.
    */
  def exportEarthObservationJob(params: ExportEarthObservationJobInput): Request[ExportEarthObservationJobOutput, AWSError] = js.native
  def exportEarthObservationJob(
    params: ExportEarthObservationJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportEarthObservationJobOutput, scala.Unit]
  ): Request[ExportEarthObservationJobOutput, AWSError] = js.native
  
  /**
    * Use this operation to copy results of a Vector Enrichment job to an Amazon S3 location.
    */
  def exportVectorEnrichmentJob(): Request[ExportVectorEnrichmentJobOutput, AWSError] = js.native
  def exportVectorEnrichmentJob(callback: js.Function2[/* err */ AWSError, /* data */ ExportVectorEnrichmentJobOutput, scala.Unit]): Request[ExportVectorEnrichmentJobOutput, AWSError] = js.native
  /**
    * Use this operation to copy results of a Vector Enrichment job to an Amazon S3 location.
    */
  def exportVectorEnrichmentJob(params: ExportVectorEnrichmentJobInput): Request[ExportVectorEnrichmentJobOutput, AWSError] = js.native
  def exportVectorEnrichmentJob(
    params: ExportVectorEnrichmentJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportVectorEnrichmentJobOutput, scala.Unit]
  ): Request[ExportVectorEnrichmentJobOutput, AWSError] = js.native
  
  /**
    * Get the details for a previously initiated Earth Observation job.
    */
  def getEarthObservationJob(): Request[GetEarthObservationJobOutput, AWSError] = js.native
  def getEarthObservationJob(callback: js.Function2[/* err */ AWSError, /* data */ GetEarthObservationJobOutput, scala.Unit]): Request[GetEarthObservationJobOutput, AWSError] = js.native
  /**
    * Get the details for a previously initiated Earth Observation job.
    */
  def getEarthObservationJob(params: GetEarthObservationJobInput): Request[GetEarthObservationJobOutput, AWSError] = js.native
  def getEarthObservationJob(
    params: GetEarthObservationJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEarthObservationJobOutput, scala.Unit]
  ): Request[GetEarthObservationJobOutput, AWSError] = js.native
  
  /**
    * Use this operation to get details of a specific raster data collection.
    */
  def getRasterDataCollection(): Request[GetRasterDataCollectionOutput, AWSError] = js.native
  def getRasterDataCollection(callback: js.Function2[/* err */ AWSError, /* data */ GetRasterDataCollectionOutput, scala.Unit]): Request[GetRasterDataCollectionOutput, AWSError] = js.native
  /**
    * Use this operation to get details of a specific raster data collection.
    */
  def getRasterDataCollection(params: GetRasterDataCollectionInput): Request[GetRasterDataCollectionOutput, AWSError] = js.native
  def getRasterDataCollection(
    params: GetRasterDataCollectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRasterDataCollectionOutput, scala.Unit]
  ): Request[GetRasterDataCollectionOutput, AWSError] = js.native
  
  /**
    * Gets a web mercator tile for the given Earth Observation job.
    */
  def getTile(): Request[GetTileOutput, AWSError] = js.native
  def getTile(callback: js.Function2[/* err */ AWSError, /* data */ GetTileOutput, scala.Unit]): Request[GetTileOutput, AWSError] = js.native
  /**
    * Gets a web mercator tile for the given Earth Observation job.
    */
  def getTile(params: GetTileInput): Request[GetTileOutput, AWSError] = js.native
  def getTile(
    params: GetTileInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTileOutput, scala.Unit]
  ): Request[GetTileOutput, AWSError] = js.native
  
  /**
    * Retrieves details of a Vector Enrichment Job for a given job Amazon Resource Name (ARN).
    */
  def getVectorEnrichmentJob(): Request[GetVectorEnrichmentJobOutput, AWSError] = js.native
  def getVectorEnrichmentJob(callback: js.Function2[/* err */ AWSError, /* data */ GetVectorEnrichmentJobOutput, scala.Unit]): Request[GetVectorEnrichmentJobOutput, AWSError] = js.native
  /**
    * Retrieves details of a Vector Enrichment Job for a given job Amazon Resource Name (ARN).
    */
  def getVectorEnrichmentJob(params: GetVectorEnrichmentJobInput): Request[GetVectorEnrichmentJobOutput, AWSError] = js.native
  def getVectorEnrichmentJob(
    params: GetVectorEnrichmentJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVectorEnrichmentJobOutput, scala.Unit]
  ): Request[GetVectorEnrichmentJobOutput, AWSError] = js.native
  
  /**
    * Use this operation to get a list of the Earth Observation jobs associated with the calling Amazon Web Services account.
    */
  def listEarthObservationJobs(): Request[ListEarthObservationJobOutput, AWSError] = js.native
  def listEarthObservationJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListEarthObservationJobOutput, scala.Unit]): Request[ListEarthObservationJobOutput, AWSError] = js.native
  /**
    * Use this operation to get a list of the Earth Observation jobs associated with the calling Amazon Web Services account.
    */
  def listEarthObservationJobs(params: ListEarthObservationJobInput): Request[ListEarthObservationJobOutput, AWSError] = js.native
  def listEarthObservationJobs(
    params: ListEarthObservationJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEarthObservationJobOutput, scala.Unit]
  ): Request[ListEarthObservationJobOutput, AWSError] = js.native
  
  /**
    * Use this operation to get raster data collections.
    */
  def listRasterDataCollections(): Request[ListRasterDataCollectionsOutput, AWSError] = js.native
  def listRasterDataCollections(callback: js.Function2[/* err */ AWSError, /* data */ ListRasterDataCollectionsOutput, scala.Unit]): Request[ListRasterDataCollectionsOutput, AWSError] = js.native
  /**
    * Use this operation to get raster data collections.
    */
  def listRasterDataCollections(params: ListRasterDataCollectionsInput): Request[ListRasterDataCollectionsOutput, AWSError] = js.native
  def listRasterDataCollections(
    params: ListRasterDataCollectionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRasterDataCollectionsOutput, scala.Unit]
  ): Request[ListRasterDataCollectionsOutput, AWSError] = js.native
  
  /**
    * Lists the tags attached to the resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, scala.Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags attached to the resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, scala.Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of vector enrichment jobs.
    */
  def listVectorEnrichmentJobs(): Request[ListVectorEnrichmentJobOutput, AWSError] = js.native
  def listVectorEnrichmentJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListVectorEnrichmentJobOutput, scala.Unit]): Request[ListVectorEnrichmentJobOutput, AWSError] = js.native
  /**
    * Retrieves a list of vector enrichment jobs.
    */
  def listVectorEnrichmentJobs(params: ListVectorEnrichmentJobInput): Request[ListVectorEnrichmentJobOutput, AWSError] = js.native
  def listVectorEnrichmentJobs(
    params: ListVectorEnrichmentJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVectorEnrichmentJobOutput, scala.Unit]
  ): Request[ListVectorEnrichmentJobOutput, AWSError] = js.native
  
  /**
    * Allows you run image query on a specific raster data collection to get a list of the satellite imagery matching the selected filters.
    */
  def searchRasterDataCollection(): Request[SearchRasterDataCollectionOutput, AWSError] = js.native
  def searchRasterDataCollection(
    callback: js.Function2[/* err */ AWSError, /* data */ SearchRasterDataCollectionOutput, scala.Unit]
  ): Request[SearchRasterDataCollectionOutput, AWSError] = js.native
  /**
    * Allows you run image query on a specific raster data collection to get a list of the satellite imagery matching the selected filters.
    */
  def searchRasterDataCollection(params: SearchRasterDataCollectionInput): Request[SearchRasterDataCollectionOutput, AWSError] = js.native
  def searchRasterDataCollection(
    params: SearchRasterDataCollectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchRasterDataCollectionOutput, scala.Unit]
  ): Request[SearchRasterDataCollectionOutput, AWSError] = js.native
  
  /**
    * Use this operation to create an Earth observation job.
    */
  def startEarthObservationJob(): Request[StartEarthObservationJobOutput, AWSError] = js.native
  def startEarthObservationJob(callback: js.Function2[/* err */ AWSError, /* data */ StartEarthObservationJobOutput, scala.Unit]): Request[StartEarthObservationJobOutput, AWSError] = js.native
  /**
    * Use this operation to create an Earth observation job.
    */
  def startEarthObservationJob(params: StartEarthObservationJobInput): Request[StartEarthObservationJobOutput, AWSError] = js.native
  def startEarthObservationJob(
    params: StartEarthObservationJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartEarthObservationJobOutput, scala.Unit]
  ): Request[StartEarthObservationJobOutput, AWSError] = js.native
  
  /**
    * Creates a Vector Enrichment job for the supplied job type. Currently, there are two supported job types: reverse geocoding and map matching.
    */
  def startVectorEnrichmentJob(): Request[StartVectorEnrichmentJobOutput, AWSError] = js.native
  def startVectorEnrichmentJob(callback: js.Function2[/* err */ AWSError, /* data */ StartVectorEnrichmentJobOutput, scala.Unit]): Request[StartVectorEnrichmentJobOutput, AWSError] = js.native
  /**
    * Creates a Vector Enrichment job for the supplied job type. Currently, there are two supported job types: reverse geocoding and map matching.
    */
  def startVectorEnrichmentJob(params: StartVectorEnrichmentJobInput): Request[StartVectorEnrichmentJobOutput, AWSError] = js.native
  def startVectorEnrichmentJob(
    params: StartVectorEnrichmentJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartVectorEnrichmentJobOutput, scala.Unit]
  ): Request[StartVectorEnrichmentJobOutput, AWSError] = js.native
  
  /**
    * Use this operation to stop an existing earth observation job.
    */
  def stopEarthObservationJob(): Request[StopEarthObservationJobOutput, AWSError] = js.native
  def stopEarthObservationJob(callback: js.Function2[/* err */ AWSError, /* data */ StopEarthObservationJobOutput, scala.Unit]): Request[StopEarthObservationJobOutput, AWSError] = js.native
  /**
    * Use this operation to stop an existing earth observation job.
    */
  def stopEarthObservationJob(params: StopEarthObservationJobInput): Request[StopEarthObservationJobOutput, AWSError] = js.native
  def stopEarthObservationJob(
    params: StopEarthObservationJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StopEarthObservationJobOutput, scala.Unit]
  ): Request[StopEarthObservationJobOutput, AWSError] = js.native
  
  /**
    * Stops the Vector Enrichment job for a given job ARN.
    */
  def stopVectorEnrichmentJob(): Request[StopVectorEnrichmentJobOutput, AWSError] = js.native
  def stopVectorEnrichmentJob(callback: js.Function2[/* err */ AWSError, /* data */ StopVectorEnrichmentJobOutput, scala.Unit]): Request[StopVectorEnrichmentJobOutput, AWSError] = js.native
  /**
    * Stops the Vector Enrichment job for a given job ARN.
    */
  def stopVectorEnrichmentJob(params: StopVectorEnrichmentJobInput): Request[StopVectorEnrichmentJobOutput, AWSError] = js.native
  def stopVectorEnrichmentJob(
    params: StopVectorEnrichmentJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StopVectorEnrichmentJobOutput, scala.Unit]
  ): Request[StopVectorEnrichmentJobOutput, AWSError] = js.native
  
  /**
    * The resource you want to tag.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, scala.Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * The resource you want to tag.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, scala.Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * The resource you want to untag.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, scala.Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * The resource you want to untag.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, scala.Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
}
