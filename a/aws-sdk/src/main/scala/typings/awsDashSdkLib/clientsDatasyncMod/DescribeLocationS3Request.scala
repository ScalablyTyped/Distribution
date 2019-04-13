package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLocationS3Request extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon S3 bucket location to describe.
    */
  var LocationArn: awsDashSdkLib.clientsDatasyncMod.LocationArn
}

object DescribeLocationS3Request {
  @scala.inline
  def apply(LocationArn: LocationArn): DescribeLocationS3Request = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn)
  
    __obj.asInstanceOf[DescribeLocationS3Request]
  }
}

