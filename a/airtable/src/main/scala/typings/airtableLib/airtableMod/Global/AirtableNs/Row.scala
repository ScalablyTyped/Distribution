package typings
package airtableLib.airtableMod.Global.AirtableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Row[TFields] extends js.Object {
  var fields: TFields
  var id: java.lang.String
}

object Row {
  @scala.inline
  def apply[TFields](fields: TFields, id: java.lang.String): Row[TFields] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], id = id)
  
    __obj.asInstanceOf[Row[TFields]]
  }
}

