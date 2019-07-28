package typings.astDashTypes.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectType[T]
  extends BaseType[T]
     with Type[T] {
  val fields: js.Array[Field[_]] = js.native
  val kind: typings.astDashTypes.astDashTypesStrings.ObjectType = js.native
}

