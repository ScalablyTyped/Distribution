package typings.airtable.airtableMod._Global_.Airtable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Record[TFields] extends js.Object {
  var fields: TFields
  var id: String
}

object Record {
  @scala.inline
  def apply[TFields](fields: TFields, id: String): Record[TFields] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Record[TFields]]
  }
}

