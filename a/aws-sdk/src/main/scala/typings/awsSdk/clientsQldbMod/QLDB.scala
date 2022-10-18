package typings.awsSdk.clientsQldbMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QLDB extends Service {
  
  /**
    * Ends a given Amazon QLDB journal stream. Before a stream can be canceled, its current status must be ACTIVE. You can't restart a stream after you cancel it. Canceled QLDB stream resources are subject to a 7-day retention period, so they are automatically deleted after this limit expires.
    */
  def cancelJournalKinesisStream(): Request[CancelJournalKinesisStreamResponse, AWSError] = js.native
  def cancelJournalKinesisStream(callback: js.Function2[/* err */ AWSError, /* data */ CancelJournalKinesisStreamResponse, Unit]): Request[CancelJournalKinesisStreamResponse, AWSError] = js.native
  /**
    * Ends a given Amazon QLDB journal stream. Before a stream can be canceled, its current status must be ACTIVE. You can't restart a stream after you cancel it. Canceled QLDB stream resources are subject to a 7-day retention period, so they are automatically deleted after this limit expires.
    */
  def cancelJournalKinesisStream(params: CancelJournalKinesisStreamRequest): Request[CancelJournalKinesisStreamResponse, AWSError] = js.native
  def cancelJournalKinesisStream(
    params: CancelJournalKinesisStreamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelJournalKinesisStreamResponse, Unit]
  ): Request[CancelJournalKinesisStreamResponse, AWSError] = js.native
  
  @JSName("config")
  var config_QLDB: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new ledger in your Amazon Web Services account in the current Region.
    */
  def createLedger(): Request[CreateLedgerResponse, AWSError] = js.native
  def createLedger(callback: js.Function2[/* err */ AWSError, /* data */ CreateLedgerResponse, Unit]): Request[CreateLedgerResponse, AWSError] = js.native
  /**
    * Creates a new ledger in your Amazon Web Services account in the current Region.
    */
  def createLedger(params: CreateLedgerRequest): Request[CreateLedgerResponse, AWSError] = js.native
  def createLedger(
    params: CreateLedgerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLedgerResponse, Unit]
  ): Request[CreateLedgerResponse, AWSError] = js.native
  
  /**
    * Deletes a ledger and all of its contents. This action is irreversible. If deletion protection is enabled, you must first disable it before you can delete the ledger. You can disable it by calling the UpdateLedger operation to set the flag to false.
    */
  def deleteLedger(): Request[js.Object, AWSError] = js.native
  def deleteLedger(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a ledger and all of its contents. This action is irreversible. If deletion protection is enabled, you must first disable it before you can delete the ledger. You can disable it by calling the UpdateLedger operation to set the flag to false.
    */
  def deleteLedger(params: DeleteLedgerRequest): Request[js.Object, AWSError] = js.native
  def deleteLedger(
    params: DeleteLedgerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Returns detailed information about a given Amazon QLDB journal stream. The output includes the Amazon Resource Name (ARN), stream name, current status, creation time, and the parameters of the original stream creation request. This action does not return any expired journal streams. For more information, see Expiration for terminal streams in the Amazon QLDB Developer Guide.
    */
  def describeJournalKinesisStream(): Request[DescribeJournalKinesisStreamResponse, AWSError] = js.native
  def describeJournalKinesisStream(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJournalKinesisStreamResponse, Unit]): Request[DescribeJournalKinesisStreamResponse, AWSError] = js.native
  /**
    * Returns detailed information about a given Amazon QLDB journal stream. The output includes the Amazon Resource Name (ARN), stream name, current status, creation time, and the parameters of the original stream creation request. This action does not return any expired journal streams. For more information, see Expiration for terminal streams in the Amazon QLDB Developer Guide.
    */
  def describeJournalKinesisStream(params: DescribeJournalKinesisStreamRequest): Request[DescribeJournalKinesisStreamResponse, AWSError] = js.native
  def describeJournalKinesisStream(
    params: DescribeJournalKinesisStreamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJournalKinesisStreamResponse, Unit]
  ): Request[DescribeJournalKinesisStreamResponse, AWSError] = js.native
  
  /**
    * Returns information about a journal export job, including the ledger name, export ID, creation time, current status, and the parameters of the original export creation request. This action does not return any expired export jobs. For more information, see Export job expiration in the Amazon QLDB Developer Guide. If the export job with the given ExportId doesn't exist, then throws ResourceNotFoundException. If the ledger with the given Name doesn't exist, then throws ResourceNotFoundException.
    */
  def describeJournalS3Export(): Request[DescribeJournalS3ExportResponse, AWSError] = js.native
  def describeJournalS3Export(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJournalS3ExportResponse, Unit]): Request[DescribeJournalS3ExportResponse, AWSError] = js.native
  /**
    * Returns information about a journal export job, including the ledger name, export ID, creation time, current status, and the parameters of the original export creation request. This action does not return any expired export jobs. For more information, see Export job expiration in the Amazon QLDB Developer Guide. If the export job with the given ExportId doesn't exist, then throws ResourceNotFoundException. If the ledger with the given Name doesn't exist, then throws ResourceNotFoundException.
    */
  def describeJournalS3Export(params: DescribeJournalS3ExportRequest): Request[DescribeJournalS3ExportResponse, AWSError] = js.native
  def describeJournalS3Export(
    params: DescribeJournalS3ExportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJournalS3ExportResponse, Unit]
  ): Request[DescribeJournalS3ExportResponse, AWSError] = js.native
  
  /**
    * Returns information about a ledger, including its state, permissions mode, encryption at rest settings, and when it was created.
    */
  def describeLedger(): Request[DescribeLedgerResponse, AWSError] = js.native
  def describeLedger(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLedgerResponse, Unit]): Request[DescribeLedgerResponse, AWSError] = js.native
  /**
    * Returns information about a ledger, including its state, permissions mode, encryption at rest settings, and when it was created.
    */
  def describeLedger(params: DescribeLedgerRequest): Request[DescribeLedgerResponse, AWSError] = js.native
  def describeLedger(
    params: DescribeLedgerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLedgerResponse, Unit]
  ): Request[DescribeLedgerResponse, AWSError] = js.native
  
  /**
    * Exports journal contents within a date and time range from a ledger into a specified Amazon Simple Storage Service (Amazon S3) bucket. A journal export job can write the data objects in either the text or binary representation of Amazon Ion format, or in JSON Lines text format. In JSON Lines format, each journal block in the exported data object is a valid JSON object that is delimited by a newline. You can use this format to easily integrate JSON exports with analytics tools such as Glue and Amazon Athena because these services can parse newline-delimited JSON automatically. For more information about the format, see JSON Lines. If the ledger with the given Name doesn't exist, then throws ResourceNotFoundException. If the ledger with the given Name is in CREATING status, then throws ResourcePreconditionNotMetException. You can initiate up to two concurrent journal export requests for each ledger. Beyond this limit, journal export requests throw LimitExceededException.
    */
  def exportJournalToS3(): Request[ExportJournalToS3Response, AWSError] = js.native
  def exportJournalToS3(callback: js.Function2[/* err */ AWSError, /* data */ ExportJournalToS3Response, Unit]): Request[ExportJournalToS3Response, AWSError] = js.native
  /**
    * Exports journal contents within a date and time range from a ledger into a specified Amazon Simple Storage Service (Amazon S3) bucket. A journal export job can write the data objects in either the text or binary representation of Amazon Ion format, or in JSON Lines text format. In JSON Lines format, each journal block in the exported data object is a valid JSON object that is delimited by a newline. You can use this format to easily integrate JSON exports with analytics tools such as Glue and Amazon Athena because these services can parse newline-delimited JSON automatically. For more information about the format, see JSON Lines. If the ledger with the given Name doesn't exist, then throws ResourceNotFoundException. If the ledger with the given Name is in CREATING status, then throws ResourcePreconditionNotMetException. You can initiate up to two concurrent journal export requests for each ledger. Beyond this limit, journal export requests throw LimitExceededException.
    */
  def exportJournalToS3(params: ExportJournalToS3Request): Request[ExportJournalToS3Response, AWSError] = js.native
  def exportJournalToS3(
    params: ExportJournalToS3Request,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportJournalToS3Response, Unit]
  ): Request[ExportJournalToS3Response, AWSError] = js.native
  
  /**
    * Returns a block object at a specified address in a journal. Also returns a proof of the specified block for verification if DigestTipAddress is provided. For information about the data contents in a block, see Journal contents in the Amazon QLDB Developer Guide. If the specified ledger doesn't exist or is in DELETING status, then throws ResourceNotFoundException. If the specified ledger is in CREATING status, then throws ResourcePreconditionNotMetException. If no block exists with the specified address, then throws InvalidParameterException.
    */
  def getBlock(): Request[GetBlockResponse, AWSError] = js.native
  def getBlock(callback: js.Function2[/* err */ AWSError, /* data */ GetBlockResponse, Unit]): Request[GetBlockResponse, AWSError] = js.native
  /**
    * Returns a block object at a specified address in a journal. Also returns a proof of the specified block for verification if DigestTipAddress is provided. For information about the data contents in a block, see Journal contents in the Amazon QLDB Developer Guide. If the specified ledger doesn't exist or is in DELETING status, then throws ResourceNotFoundException. If the specified ledger is in CREATING status, then throws ResourcePreconditionNotMetException. If no block exists with the specified address, then throws InvalidParameterException.
    */
  def getBlock(params: GetBlockRequest): Request[GetBlockResponse, AWSError] = js.native
  def getBlock(
    params: GetBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBlockResponse, Unit]
  ): Request[GetBlockResponse, AWSError] = js.native
  
  /**
    * Returns the digest of a ledger at the latest committed block in the journal. The response includes a 256-bit hash value and a block address.
    */
  def getDigest(): Request[GetDigestResponse, AWSError] = js.native
  def getDigest(callback: js.Function2[/* err */ AWSError, /* data */ GetDigestResponse, Unit]): Request[GetDigestResponse, AWSError] = js.native
  /**
    * Returns the digest of a ledger at the latest committed block in the journal. The response includes a 256-bit hash value and a block address.
    */
  def getDigest(params: GetDigestRequest): Request[GetDigestResponse, AWSError] = js.native
  def getDigest(
    params: GetDigestRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDigestResponse, Unit]
  ): Request[GetDigestResponse, AWSError] = js.native
  
  /**
    * Returns a revision data object for a specified document ID and block address. Also returns a proof of the specified revision for verification if DigestTipAddress is provided.
    */
  def getRevision(): Request[GetRevisionResponse, AWSError] = js.native
  def getRevision(callback: js.Function2[/* err */ AWSError, /* data */ GetRevisionResponse, Unit]): Request[GetRevisionResponse, AWSError] = js.native
  /**
    * Returns a revision data object for a specified document ID and block address. Also returns a proof of the specified revision for verification if DigestTipAddress is provided.
    */
  def getRevision(params: GetRevisionRequest): Request[GetRevisionResponse, AWSError] = js.native
  def getRevision(
    params: GetRevisionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRevisionResponse, Unit]
  ): Request[GetRevisionResponse, AWSError] = js.native
  
  /**
    * Returns an array of all Amazon QLDB journal stream descriptors for a given ledger. The output of each stream descriptor includes the same details that are returned by DescribeJournalKinesisStream. This action does not return any expired journal streams. For more information, see Expiration for terminal streams in the Amazon QLDB Developer Guide. This action returns a maximum of MaxResults items. It is paginated so that you can retrieve all the items by calling ListJournalKinesisStreamsForLedger multiple times.
    */
  def listJournalKinesisStreamsForLedger(): Request[ListJournalKinesisStreamsForLedgerResponse, AWSError] = js.native
  def listJournalKinesisStreamsForLedger(
    callback: js.Function2[/* err */ AWSError, /* data */ ListJournalKinesisStreamsForLedgerResponse, Unit]
  ): Request[ListJournalKinesisStreamsForLedgerResponse, AWSError] = js.native
  /**
    * Returns an array of all Amazon QLDB journal stream descriptors for a given ledger. The output of each stream descriptor includes the same details that are returned by DescribeJournalKinesisStream. This action does not return any expired journal streams. For more information, see Expiration for terminal streams in the Amazon QLDB Developer Guide. This action returns a maximum of MaxResults items. It is paginated so that you can retrieve all the items by calling ListJournalKinesisStreamsForLedger multiple times.
    */
  def listJournalKinesisStreamsForLedger(params: ListJournalKinesisStreamsForLedgerRequest): Request[ListJournalKinesisStreamsForLedgerResponse, AWSError] = js.native
  def listJournalKinesisStreamsForLedger(
    params: ListJournalKinesisStreamsForLedgerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJournalKinesisStreamsForLedgerResponse, Unit]
  ): Request[ListJournalKinesisStreamsForLedgerResponse, AWSError] = js.native
  
  /**
    * Returns an array of journal export job descriptions for all ledgers that are associated with the current Amazon Web Services account and Region. This action returns a maximum of MaxResults items, and is paginated so that you can retrieve all the items by calling ListJournalS3Exports multiple times. This action does not return any expired export jobs. For more information, see Export job expiration in the Amazon QLDB Developer Guide.
    */
  def listJournalS3Exports(): Request[ListJournalS3ExportsResponse, AWSError] = js.native
  def listJournalS3Exports(callback: js.Function2[/* err */ AWSError, /* data */ ListJournalS3ExportsResponse, Unit]): Request[ListJournalS3ExportsResponse, AWSError] = js.native
  /**
    * Returns an array of journal export job descriptions for all ledgers that are associated with the current Amazon Web Services account and Region. This action returns a maximum of MaxResults items, and is paginated so that you can retrieve all the items by calling ListJournalS3Exports multiple times. This action does not return any expired export jobs. For more information, see Export job expiration in the Amazon QLDB Developer Guide.
    */
  def listJournalS3Exports(params: ListJournalS3ExportsRequest): Request[ListJournalS3ExportsResponse, AWSError] = js.native
  def listJournalS3Exports(
    params: ListJournalS3ExportsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJournalS3ExportsResponse, Unit]
  ): Request[ListJournalS3ExportsResponse, AWSError] = js.native
  
  /**
    * Returns an array of journal export job descriptions for a specified ledger. This action returns a maximum of MaxResults items, and is paginated so that you can retrieve all the items by calling ListJournalS3ExportsForLedger multiple times. This action does not return any expired export jobs. For more information, see Export job expiration in the Amazon QLDB Developer Guide.
    */
  def listJournalS3ExportsForLedger(): Request[ListJournalS3ExportsForLedgerResponse, AWSError] = js.native
  def listJournalS3ExportsForLedger(callback: js.Function2[/* err */ AWSError, /* data */ ListJournalS3ExportsForLedgerResponse, Unit]): Request[ListJournalS3ExportsForLedgerResponse, AWSError] = js.native
  /**
    * Returns an array of journal export job descriptions for a specified ledger. This action returns a maximum of MaxResults items, and is paginated so that you can retrieve all the items by calling ListJournalS3ExportsForLedger multiple times. This action does not return any expired export jobs. For more information, see Export job expiration in the Amazon QLDB Developer Guide.
    */
  def listJournalS3ExportsForLedger(params: ListJournalS3ExportsForLedgerRequest): Request[ListJournalS3ExportsForLedgerResponse, AWSError] = js.native
  def listJournalS3ExportsForLedger(
    params: ListJournalS3ExportsForLedgerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJournalS3ExportsForLedgerResponse, Unit]
  ): Request[ListJournalS3ExportsForLedgerResponse, AWSError] = js.native
  
  /**
    * Returns an array of ledger summaries that are associated with the current Amazon Web Services account and Region. This action returns a maximum of 100 items and is paginated so that you can retrieve all the items by calling ListLedgers multiple times.
    */
  def listLedgers(): Request[ListLedgersResponse, AWSError] = js.native
  def listLedgers(callback: js.Function2[/* err */ AWSError, /* data */ ListLedgersResponse, Unit]): Request[ListLedgersResponse, AWSError] = js.native
  /**
    * Returns an array of ledger summaries that are associated with the current Amazon Web Services account and Region. This action returns a maximum of 100 items and is paginated so that you can retrieve all the items by calling ListLedgers multiple times.
    */
  def listLedgers(params: ListLedgersRequest): Request[ListLedgersResponse, AWSError] = js.native
  def listLedgers(
    params: ListLedgersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLedgersResponse, Unit]
  ): Request[ListLedgersResponse, AWSError] = js.native
  
  /**
    * Returns all tags for a specified Amazon QLDB resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns all tags for a specified Amazon QLDB resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Creates a journal stream for a given Amazon QLDB ledger. The stream captures every document revision that is committed to the ledger's journal and delivers the data to a specified Amazon Kinesis Data Streams resource.
    */
  def streamJournalToKinesis(): Request[StreamJournalToKinesisResponse, AWSError] = js.native
  def streamJournalToKinesis(callback: js.Function2[/* err */ AWSError, /* data */ StreamJournalToKinesisResponse, Unit]): Request[StreamJournalToKinesisResponse, AWSError] = js.native
  /**
    * Creates a journal stream for a given Amazon QLDB ledger. The stream captures every document revision that is committed to the ledger's journal and delivers the data to a specified Amazon Kinesis Data Streams resource.
    */
  def streamJournalToKinesis(params: StreamJournalToKinesisRequest): Request[StreamJournalToKinesisResponse, AWSError] = js.native
  def streamJournalToKinesis(
    params: StreamJournalToKinesisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StreamJournalToKinesisResponse, Unit]
  ): Request[StreamJournalToKinesisResponse, AWSError] = js.native
  
  /**
    * Adds one or more tags to a specified Amazon QLDB resource. A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, your request fails and returns an error.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds one or more tags to a specified Amazon QLDB resource. A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, your request fails and returns an error.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from a specified Amazon QLDB resource. You can specify up to 50 tag keys to remove.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from a specified Amazon QLDB resource. You can specify up to 50 tag keys to remove.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates properties on a ledger.
    */
  def updateLedger(): Request[UpdateLedgerResponse, AWSError] = js.native
  def updateLedger(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLedgerResponse, Unit]): Request[UpdateLedgerResponse, AWSError] = js.native
  /**
    * Updates properties on a ledger.
    */
  def updateLedger(params: UpdateLedgerRequest): Request[UpdateLedgerResponse, AWSError] = js.native
  def updateLedger(
    params: UpdateLedgerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLedgerResponse, Unit]
  ): Request[UpdateLedgerResponse, AWSError] = js.native
  
  /**
    * Updates the permissions mode of a ledger.  Before you switch to the STANDARD permissions mode, you must first create all required IAM policies and table tags to avoid disruption to your users. To learn more, see Migrating to the standard permissions mode in the Amazon QLDB Developer Guide. 
    */
  def updateLedgerPermissionsMode(): Request[UpdateLedgerPermissionsModeResponse, AWSError] = js.native
  def updateLedgerPermissionsMode(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLedgerPermissionsModeResponse, Unit]): Request[UpdateLedgerPermissionsModeResponse, AWSError] = js.native
  /**
    * Updates the permissions mode of a ledger.  Before you switch to the STANDARD permissions mode, you must first create all required IAM policies and table tags to avoid disruption to your users. To learn more, see Migrating to the standard permissions mode in the Amazon QLDB Developer Guide. 
    */
  def updateLedgerPermissionsMode(params: UpdateLedgerPermissionsModeRequest): Request[UpdateLedgerPermissionsModeResponse, AWSError] = js.native
  def updateLedgerPermissionsMode(
    params: UpdateLedgerPermissionsModeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLedgerPermissionsModeResponse, Unit]
  ): Request[UpdateLedgerPermissionsModeResponse, AWSError] = js.native
}
