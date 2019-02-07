package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefFrom extends js.Object {
  def `def`(typeName: java.lang.String): astDashTypesLib.libTypesMod.Def[_] = js.native
  def from[T](value: js.Any): astDashTypesLib.libTypesMod.Type[T] = js.native
  def from[T](value: js.Any, name: java.lang.String): astDashTypesLib.libTypesMod.Type[T] = js.native
  def hasDef(typeName: java.lang.String): scala.Boolean = js.native
  def or(types: js.Any*): astDashTypesLib.libTypesMod.Type[_] = js.native
}

