package typings.awsLambda.s3Mod

import typings.awsLambda.anon.Bucket
import typings.awsLambda.anon.PrincipalId
import typings.awsLambda.anon.SourceIPAddress
import typings.awsLambda.anon.Xamzid2
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
  var requestParameters: SourceIPAddress
  var responseElements: Xamzid2
  var s3: Bucket
  var userIdentity: PrincipalId
}

object S3EventRecord {
  @scala.inline
  def apply(
    awsRegion: String,
    eventName: String,
    eventSource: String,
    eventTime: String,
    eventVersion: String,
    requestParameters: SourceIPAddress,
    responseElements: Xamzid2,
    s3: Bucket,
    userIdentity: PrincipalId,
    glacierEventData: S3EventRecordGlacierEventData = null
  ): S3EventRecord = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], requestParameters = requestParameters.asInstanceOf[js.Any], responseElements = responseElements.asInstanceOf[js.Any], s3 = s3.asInstanceOf[js.Any], userIdentity = userIdentity.asInstanceOf[js.Any])
    if (glacierEventData != null) __obj.updateDynamic("glacierEventData")(glacierEventData.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3EventRecord]
  }
}

