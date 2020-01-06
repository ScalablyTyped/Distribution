package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsCloudFrontDistributionOriginItem extends js.Object {
  /**
    * Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you want CloudFront to get objects for this origin.
    */
  var DomainName: js.UndefOr[NonEmptyString] = js.native
  /**
    * A unique identifier for the origin or origin group.
    */
  var Id: js.UndefOr[NonEmptyString] = js.native
  /**
    * An optional element that causes CloudFront to request your content from a directory in your Amazon S3 bucket or your custom origin.
    */
  var OriginPath: js.UndefOr[NonEmptyString] = js.native
}

object AwsCloudFrontDistributionOriginItem {
  @scala.inline
  def apply(DomainName: NonEmptyString = null, Id: NonEmptyString = null, OriginPath: NonEmptyString = null): AwsCloudFrontDistributionOriginItem = {
    val __obj = js.Dynamic.literal()
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (OriginPath != null) __obj.updateDynamic("OriginPath")(OriginPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsCloudFrontDistributionOriginItem]
  }
}

