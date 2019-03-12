package typings
package aqbLib.aqbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThenRet extends js.Object {
  var else_ : TernaryOperation
  def `else`(y: js.Any): TernaryOperation
  def otherwise(y: js.Any): TernaryOperation
}

object ThenRet {
  @scala.inline
  def apply(
    `else`: js.Any => TernaryOperation,
    else_ : TernaryOperation,
    otherwise: js.Any => TernaryOperation
  ): ThenRet = {
    val __obj = js.Dynamic.literal(else_ = else_, otherwise = js.Any.fromFunction1(otherwise))
    __obj.updateDynamic("else")(js.Any.fromFunction1(`else`))
    __obj.asInstanceOf[ThenRet]
  }
}

