package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.Anon_Bucket
import typings.awsDashLambda.Anon_PrincipalId
import typings.awsDashLambda.Anon_SourceIPAddress
import typings.awsDashLambda.Anon_Xamzid2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3EventRecord extends js.Object {
  var awsRegion: String
  var eventName: String
  var eventSource: String
  var eventTime: String
  var eventVersion: String
  var glacierEventData: js.UndefOr[S3EventRecordGlacierEventData] = js.undefined
  var requestParameters: Anon_SourceIPAddress
  var responseElements: Anon_Xamzid2
  var s3: Anon_Bucket
  var userIdentity: Anon_PrincipalId
}

object S3EventRecord {
  @scala.inline
  def apply(
    awsRegion: String,
    eventName: String,
    eventSource: String,
    eventTime: String,
    eventVersion: String,
    requestParameters: Anon_SourceIPAddress,
    responseElements: Anon_Xamzid2,
    s3: Anon_Bucket,
    userIdentity: Anon_PrincipalId,
    glacierEventData: S3EventRecordGlacierEventData = null
  ): S3EventRecord = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion, eventName = eventName, eventSource = eventSource, eventTime = eventTime, eventVersion = eventVersion, requestParameters = requestParameters, responseElements = responseElements, s3 = s3, userIdentity = userIdentity)
    if (glacierEventData != null) __obj.updateDynamic("glacierEventData")(glacierEventData)
    __obj.asInstanceOf[S3EventRecord]
  }
}

