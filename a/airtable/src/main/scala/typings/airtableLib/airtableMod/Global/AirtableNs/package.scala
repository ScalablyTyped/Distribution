package typings
package airtableLib.airtableMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AirtableNs {
  type Base = js.Function1[/* tableName */ java.lang.String, Table[js.Object]]
  type Response[TFields] = js.Array[Row[TFields]]
}
