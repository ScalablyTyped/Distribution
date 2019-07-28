package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggingConfig extends js.Object {
  /**
    * The Amazon S3 bucket to store the access logs in, for example, myawslogbucket.s3.amazonaws.com.
    */
  var Bucket: String
  /**
    * Specifies whether you want CloudFront to save access logs to an Amazon S3 bucket. If you don't want to enable logging when you create a distribution or if you want to disable logging for an existing distribution, specify false for Enabled, and specify empty Bucket and Prefix elements. If you specify false for Enabled but you specify values for Bucket, prefix, and IncludeCookies, the values are automatically deleted.
    */
  var Enabled: Boolean
  /**
    * Specifies whether you want CloudFront to include cookies in access logs, specify true for IncludeCookies. If you choose to include cookies in logs, CloudFront logs all cookies regardless of how you configure the cache behaviors for this distribution. If you don't want to include cookies when you create a distribution or if you want to disable include cookies for an existing distribution, specify false for IncludeCookies.
    */
  var IncludeCookies: Boolean
  /**
    * An optional string that you want CloudFront to prefix to the access log filenames for this distribution, for example, myprefix/. If you want to enable logging, but you don't want to specify a prefix, you still must include an empty Prefix element in the Logging element.
    */
  var Prefix: String
}

object LoggingConfig {
  @scala.inline
  def apply(Bucket: String, Enabled: Boolean, IncludeCookies: Boolean, Prefix: String): LoggingConfig = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Enabled = Enabled, IncludeCookies = IncludeCookies, Prefix = Prefix)
  
    __obj.asInstanceOf[LoggingConfig]
  }
}

