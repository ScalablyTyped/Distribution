package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMLTransformsResponse extends js.Object {
  /**
    * A pagination token, if more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * A list of machine learning transforms.
    */
  var Transforms: TransformList
}

object GetMLTransformsResponse {
  @scala.inline
  def apply(Transforms: TransformList, NextToken: PaginationToken = null): GetMLTransformsResponse = {
    val __obj = js.Dynamic.literal(Transforms = Transforms)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetMLTransformsResponse]
  }
}

