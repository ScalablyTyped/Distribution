package typings.airtable.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Airtable {
  
  type Base = js.Function1[
    /* tableName */ java.lang.String, 
    typings.airtable.mod.global.Airtable.Table[js.Object]
  ]
  
  type FieldSet = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[
      java.lang.String | scala.Double | scala.Boolean | typings.airtable.mod.global.Airtable.Collaborator | (js.Array[
        typings.airtable.mod.global.Airtable.Attachment | typings.airtable.mod.global.Airtable.Collaborator | java.lang.String
      ])
    ]
  ]
  
  type Records[TFields] = js.Array[typings.airtable.mod.global.Airtable.Record[TFields]]
}
