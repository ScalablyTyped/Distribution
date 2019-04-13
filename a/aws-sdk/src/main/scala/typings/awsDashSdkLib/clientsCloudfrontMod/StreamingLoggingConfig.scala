package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamingLoggingConfig extends js.Object {
  /**
    * The Amazon S3 bucket to store the access logs in, for example, myawslogbucket.s3.amazonaws.com.
    */
  var Bucket: java.lang.String
  /**
    * Specifies whether you want CloudFront to save access logs to an Amazon S3 bucket. If you don't want to enable logging when you create a streaming distribution or if you want to disable logging for an existing streaming distribution, specify false for Enabled, and specify empty Bucket and Prefix elements. If you specify false for Enabled but you specify values for Bucket and Prefix, the values are automatically deleted. 
    */
  var Enabled: scala.Boolean
  /**
    * An optional string that you want CloudFront to prefix to the access log filenames for this streaming distribution, for example, myprefix/. If you want to enable logging, but you don't want to specify a prefix, you still must include an empty Prefix element in the Logging element.
    */
  var Prefix: java.lang.String
}

object StreamingLoggingConfig {
  @scala.inline
  def apply(Bucket: java.lang.String, Enabled: scala.Boolean, Prefix: java.lang.String): StreamingLoggingConfig = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Enabled = Enabled, Prefix = Prefix)
  
    __obj.asInstanceOf[StreamingLoggingConfig]
  }
}

