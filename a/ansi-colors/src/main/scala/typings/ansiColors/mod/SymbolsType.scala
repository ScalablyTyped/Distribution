package typings.ansiColors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolsType extends js.Object {
  var check: String
  var cross: String
  var info: String
  var line: String
  var pointer: String
  var pointerSmall: String
  var question: String
  var warning: String
}

object SymbolsType {
  @scala.inline
  def apply(
    check: String,
    cross: String,
    info: String,
    line: String,
    pointer: String,
    pointerSmall: String,
    question: String,
    warning: String
  ): SymbolsType = {
    val __obj = js.Dynamic.literal(check = check.asInstanceOf[js.Any], cross = cross.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], pointerSmall = pointerSmall.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolsType]
  }
}

