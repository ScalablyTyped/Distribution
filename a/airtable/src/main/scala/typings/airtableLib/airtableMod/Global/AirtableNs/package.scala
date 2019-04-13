package typings
package airtableLib.airtableMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AirtableNs {
  type Base = js.Function1[/* tableName */ java.lang.String, Table[js.Object]]
  type FieldSet = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | js.Array[Attachment]]]
  type Response[TFields] = js.Array[Row[TFields]]
}
