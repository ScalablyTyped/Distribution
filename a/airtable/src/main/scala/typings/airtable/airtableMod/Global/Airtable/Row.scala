package typings.airtable.airtableMod.Global.Airtable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Row[TFields] extends js.Object {
  var fields: TFields
  var id: String
}

object Row {
  @scala.inline
  def apply[TFields](fields: TFields, id: String): Row[TFields] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], id = id)
  
    __obj.asInstanceOf[Row[TFields]]
  }
}

