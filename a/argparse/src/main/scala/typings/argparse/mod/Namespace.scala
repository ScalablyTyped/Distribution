package typings.argparse.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("argparse", "Namespace")
@js.native
class Namespace protected () extends js.Object {
  def this(options: js.Object) = this()
  def get[K /* <: /* keyof this */ String */, D /* <: js.Any */](key: K): (/* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any) | D = js.native
  def get[K /* <: /* keyof this */ String */, D /* <: js.Any */](key: K, defaultValue: D): (/* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any) | D = js.native
  def isset(key: /* keyof this */ String): Boolean = js.native
  def set[K /* <: /* keyof this */ String */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any
  ): this.type = js.native
  def set[K /* <: js.Object */](obj: K): this.type with K = js.native
  def set[K /* <: String */, V /* <: js.Any */](key: K, value: V): this.type with (Record[K, V]) = js.native
  def unset[K /* <: /* keyof this */ String */, D /* <: js.Any */](key: K): (/* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any) | D = js.native
  def unset[K /* <: /* keyof this */ String */, D /* <: js.Any */](key: K, defaultValue: D): (/* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any) | D = js.native
}

