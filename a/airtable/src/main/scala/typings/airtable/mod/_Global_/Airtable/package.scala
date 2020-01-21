package typings.airtable.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Airtable {
  type Base = js.Function1[
    /* tableName */ java.lang.String, 
    typings.airtable.mod._Global_.Airtable.Table[js.Object]
  ]
  type FieldSet = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[
      java.lang.String | scala.Double | scala.Boolean | typings.airtable.mod._Global_.Airtable.Collaborator | (js.Array[
        typings.airtable.mod._Global_.Airtable.Attachment | typings.airtable.mod._Global_.Airtable.Collaborator | java.lang.String
      ])
    ]
  ]
  type Records[TFields] = js.Array[typings.airtable.mod._Global_.Airtable.Record[TFields]]
}
