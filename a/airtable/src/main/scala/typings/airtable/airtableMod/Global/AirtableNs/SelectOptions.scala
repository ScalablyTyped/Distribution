package typings.airtable.airtableMod.Global.AirtableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectOptions extends js.Object {
  var view: js.UndefOr[String] = js.undefined
}

object SelectOptions {
  @scala.inline
  def apply(view: String = null): SelectOptions = {
    val __obj = js.Dynamic.literal()
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[SelectOptions]
  }
}

