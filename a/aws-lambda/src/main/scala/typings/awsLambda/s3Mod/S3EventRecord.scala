package typings.awsLambda.s3Mod

import typings.awsLambda.AnonBucket
import typings.awsLambda.AnonPrincipalId
import typings.awsLambda.AnonSourceIPAddress
import typings.awsLambda.AnonXamzid2
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
  var requestParameters: AnonSourceIPAddress
  var responseElements: AnonXamzid2
  var s3: AnonBucket
  var userIdentity: AnonPrincipalId
}

object S3EventRecord {
  @scala.inline
  def apply(
    awsRegion: String,
    eventName: String,
    eventSource: String,
    eventTime: String,
    eventVersion: String,
    requestParameters: AnonSourceIPAddress,
    responseElements: AnonXamzid2,
    s3: AnonBucket,
    userIdentity: AnonPrincipalId,
    glacierEventData: S3EventRecordGlacierEventData = null
  ): S3EventRecord = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], requestParameters = requestParameters.asInstanceOf[js.Any], responseElements = responseElements.asInstanceOf[js.Any], s3 = s3.asInstanceOf[js.Any], userIdentity = userIdentity.asInstanceOf[js.Any])
    if (glacierEventData != null) __obj.updateDynamic("glacierEventData")(glacierEventData.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3EventRecord]
  }
}

