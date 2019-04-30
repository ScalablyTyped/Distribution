package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportUserField extends js.Object {
  var export_as: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
}

object ExportUserField {
  @scala.inline
  def apply(name: java.lang.String, export_as: java.lang.String = null): ExportUserField = {
    val __obj = js.Dynamic.literal(name = name)
    if (export_as != null) __obj.updateDynamic("export_as")(export_as)
    __obj.asInstanceOf[ExportUserField]
  }
}

