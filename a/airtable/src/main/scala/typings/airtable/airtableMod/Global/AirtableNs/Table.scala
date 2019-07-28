package typings.airtable.airtableMod.Global.AirtableNs

import typings.airtable.Anon_Typecast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table[TFields /* <: FieldSet */] extends js.Object {
  def create(record: TFields): js.Promise[Response[TFields]] = js.native
  def create(record: TFields, opts: Anon_Typecast): js.Promise[Response[TFields]] = js.native
  def create(records: js.Array[TFields]): js.Promise[js.Array[Response[TFields]]] = js.native
  def create(records: js.Array[TFields], opts: Anon_Typecast): js.Promise[js.Array[Response[TFields]]] = js.native
  def destroy(args: js.Any*): js.Promise[_] = js.native
  def find(id: String): js.Promise[Response[TFields]] = js.native
  def replace(args: js.Any*): js.Promise[_] = js.native
  def select(): Query[TFields] = js.native
  def select(opt: SelectOptions): Query[TFields] = js.native
  def update(args: js.Any*): js.Promise[_] = js.native
}

