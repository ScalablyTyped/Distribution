package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expression extends js.Object {
  /**
    * Return results that match both Dimension objects.
    */
  var And: js.UndefOr[Expressions] = js.undefined
  /**
    * The specific Dimension to use for Expression.
    */
  var Dimensions: js.UndefOr[DimensionValues] = js.undefined
  /**
    * Return results that don't match a Dimension object.
    */
  var Not: js.UndefOr[Expression] = js.undefined
  /**
    * Return results that match either Dimension object.
    */
  var Or: js.UndefOr[Expressions] = js.undefined
  /**
    * The specific Tag to use for Expression.
    */
  var Tags: js.UndefOr[TagValues] = js.undefined
}

object Expression {
  @scala.inline
  def apply(
    And: Expressions = null,
    Dimensions: DimensionValues = null,
    Not: Expression = null,
    Or: Expressions = null,
    Tags: TagValues = null
  ): Expression = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And)
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (Not != null) __obj.updateDynamic("Not")(Not)
    if (Or != null) __obj.updateDynamic("Or")(Or)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[Expression]
  }
}

