package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportUserField extends js.Object {
  var export_as: js.UndefOr[String] = js.undefined
  var name: String
}

object ExportUserField {
  @scala.inline
  def apply(name: String, export_as: String = null): ExportUserField = {
    val __obj = js.Dynamic.literal(name = name)
    if (export_as != null) __obj.updateDynamic("export_as")(export_as)
    __obj.asInstanceOf[ExportUserField]
  }
}

