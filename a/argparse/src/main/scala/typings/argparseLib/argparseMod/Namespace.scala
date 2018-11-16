package typings
package argparseLib.argparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("argparse", "Namespace")
@js.native
class Namespace protected () extends js.Object {
  def this(options: js.Object) = this()
  def get[K /* <: java.lang.String */, D /* <: js.Any */](key: K): (/* import warning: Failed type conversion: TsTypeLookup(TsTypeThis(),Left(TsIdentSimple(K))) */js.Any) | D = js.native
  def get[K /* <: java.lang.String */, D /* <: js.Any */](key: K, defaultValue: D): (/* import warning: Failed type conversion: TsTypeLookup(TsTypeThis(),Left(TsIdentSimple(K))) */js.Any) | D = js.native
  def isset(key: java.lang.String): scala.Boolean = js.native
  def set[K /* <: java.lang.String */](
    key: K,
    value: /* import warning: Failed type conversion: TsTypeLookup(TsTypeThis(),Left(TsIdentSimple(K))) */js.Any
  ): this.type = js.native
  def set[K /* <: js.Object */](obj: K): this.type with K = js.native
  def set[K /* <: java.lang.String */, V /* <: js.Any */](key: K, value: V): this.type with (stdLib.Record[K, V]) = js.native
  def unset[K /* <: java.lang.String */, D /* <: js.Any */](key: K): (/* import warning: Failed type conversion: TsTypeLookup(TsTypeThis(),Left(TsIdentSimple(K))) */js.Any) | D = js.native
  def unset[K /* <: java.lang.String */, D /* <: js.Any */](key: K, defaultValue: D): (/* import warning: Failed type conversion: TsTypeLookup(TsTypeThis(),Left(TsIdentSimple(K))) */js.Any) | D = js.native
}

