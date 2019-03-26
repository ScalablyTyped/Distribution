package typings
package airtableLib.airtableMod.Global.AirtableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table[TFields /* <: FieldSet */] extends js.Object {
  def select(): Query[TFields] = js.native
  def select(opt: SelectOptions): Query[TFields] = js.native
}

