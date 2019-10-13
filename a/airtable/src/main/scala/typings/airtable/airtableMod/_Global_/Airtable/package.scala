package typings.airtable.airtableMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Airtable {
  import org.scalablytyped.runtime.StringDictionary

  type Base = js.Function1[/* tableName */ String, Table[js.Object]]
  type FieldSet = StringDictionary[
    js.UndefOr[
      String | Double | Boolean | Collaborator | (js.Array[Attachment | Collaborator | String])
    ]
  ]
  type Response[TFields] = js.Array[Row[TFields]]
}
