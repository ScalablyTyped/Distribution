package typings.angularOdataResources.OData

import typings.angularOdataResources.anon.Add
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operators extends js.Object {
  var operators: Add
  var rtrim: js.Any
  def convert(from: String): js.Any
  /* private */ def trim(value: js.Any): js.Any
}

object Operators {
  @scala.inline
  def apply(convert: String => js.Any, operators: Add, rtrim: js.Any, trim: js.Any => js.Any): Operators = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert), operators = operators.asInstanceOf[js.Any], rtrim = rtrim.asInstanceOf[js.Any], trim = js.Any.fromFunction1(trim))
    __obj.asInstanceOf[Operators]
  }
}

