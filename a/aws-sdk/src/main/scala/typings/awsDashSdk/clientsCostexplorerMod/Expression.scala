package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expression extends js.Object {
  /**
    * Return results that match both Dimension objects.
    */
  var And: js.UndefOr[Expressions] = js.native
  /**
    *   Cost Category is in preview release for AWS Billing and Cost Management and is subject to change. Your use of Cost Categories is subject to the Beta Service Participation terms of the AWS Service Terms (Section 1.10).   The specific CostCategory used for Expression.
    */
  var CostCategories: js.UndefOr[CostCategoryValues] = js.native
  /**
    * The specific Dimension to use for Expression.
    */
  var Dimensions: js.UndefOr[DimensionValues] = js.native
  /**
    * Return results that don't match a Dimension object.
    */
  var Not: js.UndefOr[Expression] = js.native
  /**
    * Return results that match either Dimension object.
    */
  var Or: js.UndefOr[Expressions] = js.native
  /**
    * The specific Tag to use for Expression.
    */
  var Tags: js.UndefOr[TagValues] = js.native
}

object Expression {
  @scala.inline
  def apply(
    And: Expressions = null,
    CostCategories: CostCategoryValues = null,
    Dimensions: DimensionValues = null,
    Not: Expression = null,
    Or: Expressions = null,
    Tags: TagValues = null
  ): Expression = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And.asInstanceOf[js.Any])
    if (CostCategories != null) __obj.updateDynamic("CostCategories")(CostCategories.asInstanceOf[js.Any])
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    if (Not != null) __obj.updateDynamic("Not")(Not.asInstanceOf[js.Any])
    if (Or != null) __obj.updateDynamic("Or")(Or.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
}

