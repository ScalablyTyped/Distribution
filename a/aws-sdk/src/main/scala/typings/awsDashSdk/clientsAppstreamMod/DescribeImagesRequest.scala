package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeImagesRequest extends js.Object {
  /**
    * The ARNs of the public, private, and shared images to describe.
    */
  var Arns: js.UndefOr[ArnList] = js.undefined
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[DescribeImagesMaxResults] = js.undefined
  /**
    * The names of the public or private images to describe.
    */
  var Names: js.UndefOr[StringList] = js.undefined
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The type of image (public, private, or shared) to describe. 
    */
  var Type: js.UndefOr[VisibilityType] = js.undefined
}

object DescribeImagesRequest {
  @scala.inline
  def apply(
    Arns: ArnList = null,
    MaxResults: Int | Double = null,
    Names: StringList = null,
    NextToken: String = null,
    Type: VisibilityType = null
  ): DescribeImagesRequest = {
    val __obj = js.Dynamic.literal()
    if (Arns != null) __obj.updateDynamic("Arns")(Arns)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (Names != null) __obj.updateDynamic("Names")(Names)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImagesRequest]
  }
}

