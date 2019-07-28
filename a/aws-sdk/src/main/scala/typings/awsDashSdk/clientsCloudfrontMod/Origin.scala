package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Origin extends js.Object {
  /**
    * A complex type that contains names and values for the custom headers that you want.
    */
  var CustomHeaders: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.CustomHeaders] = js.undefined
  /**
    * A complex type that contains information about a custom origin. If the origin is an Amazon S3 bucket, use the S3OriginConfig element instead.
    */
  var CustomOriginConfig: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.CustomOriginConfig] = js.undefined
  /**
    *  Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you want CloudFront to get objects for this origin, for example, myawsbucket.s3.amazonaws.com. If you set up your bucket to be configured as a website endpoint, enter the Amazon S3 static website hosting endpoint for the bucket. For more information about specifying this value for different types of origins, see Origin Domain Name in the Amazon CloudFront Developer Guide. Constraints for Amazon S3 origins:    If you configured Amazon S3 Transfer Acceleration for your bucket, don't specify the s3-accelerate endpoint for DomainName.   The bucket name must be between 3 and 63 characters long (inclusive).   The bucket name must contain only lowercase characters, numbers, periods, underscores, and dashes.   The bucket name must not contain adjacent periods.    Custom Origins: The DNS domain name for the HTTP server from which you want CloudFront to get objects for this origin, for example, www.example.com.  Constraints for custom origins:    DomainName must be a valid DNS name that contains only a-z, A-Z, 0-9, dot (.), hyphen (-), or underscore (_) characters.   The name cannot exceed 128 characters.  
    */
  var DomainName: String
  /**
    * A unique identifier for the origin or origin group. The value of Id must be unique within the distribution. When you specify the value of TargetOriginId for the default cache behavior or for another cache behavior, you indicate the origin to which you want the cache behavior to route requests by specifying the value of the Id element for that origin. When a request matches the path pattern for that cache behavior, CloudFront routes the request to the specified origin. For more information, see Cache Behavior Settings in the Amazon CloudFront Developer Guide.
    */
  var Id: String
  /**
    * An optional element that causes CloudFront to request your content from a directory in your Amazon S3 bucket or your custom origin. When you include the OriginPath element, specify the directory name, beginning with a /. CloudFront appends the directory name to the value of DomainName, for example, example.com/production. Do not include a / at the end of the directory name. For example, suppose you've specified the following values for your distribution:    DomainName: An Amazon S3 bucket named myawsbucket.    OriginPath: /production     CNAME: example.com    When a user enters example.com/index.html in a browser, CloudFront sends a request to Amazon S3 for myawsbucket/production/index.html. When a user enters example.com/acme/index.html in a browser, CloudFront sends a request to Amazon S3 for myawsbucket/production/acme/index.html.
    */
  var OriginPath: js.UndefOr[String] = js.undefined
  /**
    * A complex type that contains information about the Amazon S3 origin. If the origin is a custom origin, use the CustomOriginConfig element instead.
    */
  var S3OriginConfig: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.S3OriginConfig] = js.undefined
}

object Origin {
  @scala.inline
  def apply(
    DomainName: String,
    Id: String,
    CustomHeaders: CustomHeaders = null,
    CustomOriginConfig: CustomOriginConfig = null,
    OriginPath: String = null,
    S3OriginConfig: S3OriginConfig = null
  ): Origin = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, Id = Id)
    if (CustomHeaders != null) __obj.updateDynamic("CustomHeaders")(CustomHeaders)
    if (CustomOriginConfig != null) __obj.updateDynamic("CustomOriginConfig")(CustomOriginConfig)
    if (OriginPath != null) __obj.updateDynamic("OriginPath")(OriginPath)
    if (S3OriginConfig != null) __obj.updateDynamic("S3OriginConfig")(S3OriginConfig)
    __obj.asInstanceOf[Origin]
  }
}

