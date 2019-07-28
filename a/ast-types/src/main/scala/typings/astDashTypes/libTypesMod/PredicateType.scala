package typings.astDashTypes.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredicateType[T]
  extends BaseType[T]
     with Type[T] {
  val kind: typings.astDashTypes.astDashTypesStrings.PredicateType = js.native
  val name: String = js.native
  def predicate(value: js.Any): Boolean = js.native
  def predicate(value: js.Any, deep: Deep): Boolean = js.native
}

