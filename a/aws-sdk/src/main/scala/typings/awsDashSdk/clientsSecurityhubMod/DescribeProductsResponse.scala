package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeProductsResponse extends js.Object {
  /**
    * The token that is required for pagination.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSecurityhubMod.NextToken] = js.undefined
  /**
    * A list of products, including details for each product.
    */
  var Products: ProductsList
}

object DescribeProductsResponse {
  @scala.inline
  def apply(Products: ProductsList, NextToken: NextToken = null): DescribeProductsResponse = {
    val __obj = js.Dynamic.literal(Products = Products)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeProductsResponse]
  }
}

