package typings
package aqbLib.aqbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThenRet extends js.Object {
  var `else_`: TernaryOperation
  def `else`(y: js.Any): TernaryOperation
  def otherwise(y: js.Any): TernaryOperation
}

object ThenRet {
  @scala.inline
  def apply(
    `else`: js.Function1[js.Any, TernaryOperation],
    `else_`: TernaryOperation,
    otherwise: js.Function1[js.Any, TernaryOperation]
  ): ThenRet = {
    val __obj = js.Dynamic.literal(`else` = `else`, `else_` = `else_`)
    __obj.updateDynamic("otherwise")(otherwise)
    __obj.asInstanceOf[ThenRet]
  }
}

