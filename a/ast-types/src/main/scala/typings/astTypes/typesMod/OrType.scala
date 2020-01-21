package typings.astTypes.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrType[T]
  extends BaseType[T]
     with Type[T] {
  val kind: typings.astTypes.astTypesStrings.OrType = js.native
  val types: js.Array[Type[_]] = js.native
}

