package typings
package astDashTypesLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayType[T]
  extends BaseType[T]
     with Type[T] {
  val elemType: Type[_] = js.native
  val kind: astDashTypesLib.astDashTypesLibStrings.ArrayType = js.native
}

