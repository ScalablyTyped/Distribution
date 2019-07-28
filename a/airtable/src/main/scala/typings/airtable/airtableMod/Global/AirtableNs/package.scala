package typings.airtable.airtableMod.Global

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AirtableNs {
  type Base = js.Function1[/* tableName */ String, Table[js.Object]]
  type FieldSet = StringDictionary[js.UndefOr[String | (js.Array[Attachment | String])]]
  type Response[TFields] = js.Array[Row[TFields]]
}
