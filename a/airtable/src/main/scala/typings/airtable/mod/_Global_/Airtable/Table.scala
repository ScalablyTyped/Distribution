package typings.airtable.mod._Global_.Airtable

import typings.airtable.AnonTypecast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table[TFields /* <: FieldSet */] extends js.Object {
  def create(record: TFields): js.Promise[Record[TFields]] = js.native
  def create(record: TFields, opts: AnonTypecast): js.Promise[Record[TFields]] = js.native
  def create(records: js.Array[TFields]): js.Promise[Records[TFields]] = js.native
  def create(records: js.Array[TFields], opts: AnonTypecast): js.Promise[Records[TFields]] = js.native
  def destroy(args: js.Any*): js.Promise[_] = js.native
  def find(id: String): js.Promise[Record[TFields]] = js.native
  def replace(args: js.Any*): js.Promise[_] = js.native
  def select(): Query[TFields] = js.native
  def select(opt: SelectOptions): Query[TFields] = js.native
  def update(args: js.Any*): js.Promise[_] = js.native
}

