package typings
package acornLib.acornMod.acornNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokeTypeConfig extends js.Object {
  var beforeExpr: js.UndefOr[scala.Boolean] = js.undefined
  var binop: js.UndefOr[scala.Double] = js.undefined
  var isAssign: js.UndefOr[scala.Boolean] = js.undefined
  var isLoop: js.UndefOr[scala.Boolean] = js.undefined
  var keyword: java.lang.String
  var postfix: js.UndefOr[scala.Boolean] = js.undefined
  var prefix: js.UndefOr[scala.Boolean] = js.undefined
  var startsExpr: js.UndefOr[scala.Boolean] = js.undefined
}

object TokeTypeConfig {
  @scala.inline
  def apply(
    keyword: java.lang.String,
    beforeExpr: js.UndefOr[scala.Boolean] = js.undefined,
    binop: scala.Int | scala.Double = null,
    isAssign: js.UndefOr[scala.Boolean] = js.undefined,
    isLoop: js.UndefOr[scala.Boolean] = js.undefined,
    postfix: js.UndefOr[scala.Boolean] = js.undefined,
    prefix: js.UndefOr[scala.Boolean] = js.undefined,
    startsExpr: js.UndefOr[scala.Boolean] = js.undefined
  ): TokeTypeConfig = {
    val __obj = js.Dynamic.literal(keyword = keyword)
    if (!js.isUndefined(beforeExpr)) __obj.updateDynamic("beforeExpr")(beforeExpr)
    if (binop != null) __obj.updateDynamic("binop")(binop.asInstanceOf[js.Any])
    if (!js.isUndefined(isAssign)) __obj.updateDynamic("isAssign")(isAssign)
    if (!js.isUndefined(isLoop)) __obj.updateDynamic("isLoop")(isLoop)
    if (!js.isUndefined(postfix)) __obj.updateDynamic("postfix")(postfix)
    if (!js.isUndefined(prefix)) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(startsExpr)) __obj.updateDynamic("startsExpr")(startsExpr)
    __obj.asInstanceOf[TokeTypeConfig]
  }
}

