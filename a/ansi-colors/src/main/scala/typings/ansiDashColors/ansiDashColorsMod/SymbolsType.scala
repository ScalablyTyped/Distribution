package typings.ansiDashColors.ansiDashColorsMod

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
    val __obj = js.Dynamic.literal(check = check, cross = cross, info = info, line = line, pointer = pointer, pointerSmall = pointerSmall, question = question, warning = warning)
  
    __obj.asInstanceOf[SymbolsType]
  }
}

