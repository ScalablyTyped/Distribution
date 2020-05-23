package typings.angularOdataResources.OData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var illegalChars: js.Any
  var `type`: js.Any
  var value: js.Any
  /* private */ def escapeIllegalChars(haystack: js.Any): js.Any
  def execute(): String
  def executeWithType(): js.Any
  def executeWithUndefinedType(): js.Any
  /* private */ def generateDate(date: js.Any): js.Any
}

object Value {
  @scala.inline
  def apply(
    escapeIllegalChars: js.Any => js.Any,
    execute: () => String,
    executeWithType: () => js.Any,
    executeWithUndefinedType: () => js.Any,
    generateDate: js.Any => js.Any,
    illegalChars: js.Any,
    `type`: js.Any,
    value: js.Any
  ): Value = {
    val __obj = js.Dynamic.literal(escapeIllegalChars = js.Any.fromFunction1(escapeIllegalChars), execute = js.Any.fromFunction0(execute), executeWithType = js.Any.fromFunction0(executeWithType), executeWithUndefinedType = js.Any.fromFunction0(executeWithUndefinedType), generateDate = js.Any.fromFunction1(generateDate), illegalChars = illegalChars.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

