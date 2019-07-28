package typings.astDashTypes.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityType[T]
  extends BaseType[T]
     with Type[T] {
  val kind: typings.astDashTypes.astDashTypesStrings.IdentityType = js.native
  val value: T = js.native
}

