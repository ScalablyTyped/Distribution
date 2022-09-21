package typings.awsSdk.backupstorageMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupStorage extends Service {
  
  @JSName("config")
  var config_BackupStorage: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Delete Object from the incremental base Backup.
    */
  def deleteObject(): Request[js.Object, AWSError] = js.native
  def deleteObject(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete Object from the incremental base Backup.
    */
  def deleteObject(params: DeleteObjectInput): Request[js.Object, AWSError] = js.native
  def deleteObject(params: DeleteObjectInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Gets the specified object's chunk.
    */
  def getChunk(): Request[GetChunkOutput, AWSError] = js.native
  def getChunk(callback: js.Function2[/* err */ AWSError, /* data */ GetChunkOutput, Unit]): Request[GetChunkOutput, AWSError] = js.native
  /**
    * Gets the specified object's chunk.
    */
  def getChunk(params: GetChunkInput): Request[GetChunkOutput, AWSError] = js.native
  def getChunk(params: GetChunkInput, callback: js.Function2[/* err */ AWSError, /* data */ GetChunkOutput, Unit]): Request[GetChunkOutput, AWSError] = js.native
  
  /**
    * Get metadata associated with an Object.
    */
  def getObjectMetadata(): Request[GetObjectMetadataOutput, AWSError] = js.native
  def getObjectMetadata(callback: js.Function2[/* err */ AWSError, /* data */ GetObjectMetadataOutput, Unit]): Request[GetObjectMetadataOutput, AWSError] = js.native
  /**
    * Get metadata associated with an Object.
    */
  def getObjectMetadata(params: GetObjectMetadataInput): Request[GetObjectMetadataOutput, AWSError] = js.native
  def getObjectMetadata(
    params: GetObjectMetadataInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetObjectMetadataOutput, Unit]
  ): Request[GetObjectMetadataOutput, AWSError] = js.native
  
  /**
    * List chunks in a given Object
    */
  def listChunks(): Request[ListChunksOutput, AWSError] = js.native
  def listChunks(callback: js.Function2[/* err */ AWSError, /* data */ ListChunksOutput, Unit]): Request[ListChunksOutput, AWSError] = js.native
  /**
    * List chunks in a given Object
    */
  def listChunks(params: ListChunksInput): Request[ListChunksOutput, AWSError] = js.native
  def listChunks(
    params: ListChunksInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChunksOutput, Unit]
  ): Request[ListChunksOutput, AWSError] = js.native
  
  /**
    * List all Objects in a given Backup.
    */
  def listObjects(): Request[ListObjectsOutput, AWSError] = js.native
  def listObjects(callback: js.Function2[/* err */ AWSError, /* data */ ListObjectsOutput, Unit]): Request[ListObjectsOutput, AWSError] = js.native
  /**
    * List all Objects in a given Backup.
    */
  def listObjects(params: ListObjectsInput): Request[ListObjectsOutput, AWSError] = js.native
  def listObjects(
    params: ListObjectsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListObjectsOutput, Unit]
  ): Request[ListObjectsOutput, AWSError] = js.native
  
  /**
    * Complete upload
    */
  def notifyObjectComplete(): Request[NotifyObjectCompleteOutput, AWSError] = js.native
  def notifyObjectComplete(callback: js.Function2[/* err */ AWSError, /* data */ NotifyObjectCompleteOutput, Unit]): Request[NotifyObjectCompleteOutput, AWSError] = js.native
  /**
    * Complete upload
    */
  def notifyObjectComplete(params: NotifyObjectCompleteInput): Request[NotifyObjectCompleteOutput, AWSError] = js.native
  def notifyObjectComplete(
    params: NotifyObjectCompleteInput,
    callback: js.Function2[/* err */ AWSError, /* data */ NotifyObjectCompleteOutput, Unit]
  ): Request[NotifyObjectCompleteOutput, AWSError] = js.native
  
  /**
    * Upload chunk.
    */
  def putChunk(): Request[PutChunkOutput, AWSError] = js.native
  def putChunk(callback: js.Function2[/* err */ AWSError, /* data */ PutChunkOutput, Unit]): Request[PutChunkOutput, AWSError] = js.native
  /**
    * Upload chunk.
    */
  def putChunk(params: PutChunkInput): Request[PutChunkOutput, AWSError] = js.native
  def putChunk(params: PutChunkInput, callback: js.Function2[/* err */ AWSError, /* data */ PutChunkOutput, Unit]): Request[PutChunkOutput, AWSError] = js.native
  
  /**
    * Upload object that can store object metadata String and data blob in single API call using inline chunk field.
    */
  def putObject(): Request[PutObjectOutput, AWSError] = js.native
  def putObject(callback: js.Function2[/* err */ AWSError, /* data */ PutObjectOutput, Unit]): Request[PutObjectOutput, AWSError] = js.native
  /**
    * Upload object that can store object metadata String and data blob in single API call using inline chunk field.
    */
  def putObject(params: PutObjectInput): Request[PutObjectOutput, AWSError] = js.native
  def putObject(
    params: PutObjectInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutObjectOutput, Unit]
  ): Request[PutObjectOutput, AWSError] = js.native
  
  /**
    * Start upload containing one or many chunks.
    */
  def startObject(): Request[StartObjectOutput, AWSError] = js.native
  def startObject(callback: js.Function2[/* err */ AWSError, /* data */ StartObjectOutput, Unit]): Request[StartObjectOutput, AWSError] = js.native
  /**
    * Start upload containing one or many chunks.
    */
  def startObject(params: StartObjectInput): Request[StartObjectOutput, AWSError] = js.native
  def startObject(
    params: StartObjectInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartObjectOutput, Unit]
  ): Request[StartObjectOutput, AWSError] = js.native
}
