package typings
package astDashTypesLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredicateType[T] extends BaseType[T] {
  val kind: astDashTypesLib.astDashTypesLibStrings.PredicateType = js.native
  val name: java.lang.String = js.native
  def predicate(value: js.Any): scala.Boolean = js.native
  def predicate(value: js.Any, deep: Deep): scala.Boolean = js.native
}

