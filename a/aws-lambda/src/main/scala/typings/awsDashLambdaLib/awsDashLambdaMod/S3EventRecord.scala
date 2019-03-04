package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3EventRecord extends js.Object {
  var awsRegion: java.lang.String
  var eventName: java.lang.String
  var eventSource: java.lang.String
  var eventTime: java.lang.String
  var eventVersion: java.lang.String
  var requestParameters: awsDashLambdaLib.Anon_SourceIPAddress
  var responseElements: awsDashLambdaLib.Anon_Xamzid2
  var s3: awsDashLambdaLib.Anon_Bucket
  var userIdentity: awsDashLambdaLib.Anon_PrincipalId
}

object S3EventRecord {
  @scala.inline
  def apply(
    awsRegion: java.lang.String,
    eventName: java.lang.String,
    eventSource: java.lang.String,
    eventTime: java.lang.String,
    eventVersion: java.lang.String,
    requestParameters: awsDashLambdaLib.Anon_SourceIPAddress,
    responseElements: awsDashLambdaLib.Anon_Xamzid2,
    s3: awsDashLambdaLib.Anon_Bucket,
    userIdentity: awsDashLambdaLib.Anon_PrincipalId
  ): S3EventRecord = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion, eventName = eventName, eventSource = eventSource, eventTime = eventTime, eventVersion = eventVersion, requestParameters = requestParameters, responseElements = responseElements, s3 = s3, userIdentity = userIdentity)
  
    __obj.asInstanceOf[S3EventRecord]
  }
}

