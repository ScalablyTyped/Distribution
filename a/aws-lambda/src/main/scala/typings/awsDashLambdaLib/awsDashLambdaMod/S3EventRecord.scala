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

