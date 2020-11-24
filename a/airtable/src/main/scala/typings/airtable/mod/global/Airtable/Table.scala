package typings.airtable.mod.global.Airtable

import typings.airtable.anon.Typecast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table[TFields /* <: FieldSet */] extends js.Object {
  
  def create(record: TFields): js.Promise[Record[TFields]] = js.native
  def create(record: TFields, opts: Typecast): js.Promise[Record[TFields]] = js.native
  def create(records: js.Array[TFields]): js.Promise[Records[TFields]] = js.native
  def create(records: js.Array[TFields], opts: Typecast): js.Promise[Records[TFields]] = js.native
  
  def destroy(args: js.Any*): js.Promise[_] = js.native
  
  def find(id: String): js.Promise[Record[TFields]] = js.native
  
  def replace(args: js.Any*): js.Promise[_] = js.native
  
  def select(): Query[TFields] = js.native
  def select(opt: SelectOptions): Query[TFields] = js.native
  
  def update(args: js.Any*): js.Promise[_] = js.native
}
