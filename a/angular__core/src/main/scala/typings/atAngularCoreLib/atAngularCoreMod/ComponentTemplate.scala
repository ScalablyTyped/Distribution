package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of what a template rendering function should look like for a component.
  */
@js.native
trait ComponentTemplate[T] extends js.Object {
  def apply[U /* <: T */](rf: ɵRenderFlags, ctx: T | U): scala.Unit = js.native
}

