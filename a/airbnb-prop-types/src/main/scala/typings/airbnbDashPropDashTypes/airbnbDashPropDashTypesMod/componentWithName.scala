package typings.airbnbDashPropDashTypes.airbnbDashPropDashTypesMod

import typings.airbnbDashPropDashTypes.Anon_StripHOCs
import typings.propDashTypes.propDashTypesMod.Requireable
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", "componentWithName")
@js.native
object componentWithName extends js.Object {
  def apply[T](name: String): Requireable[T] = js.native
  def apply[T](name: String, options: Anon_StripHOCs): Requireable[T] = js.native
  def apply[T](name: RegExp): Requireable[T] = js.native
  def apply[T](name: RegExp, options: Anon_StripHOCs): Requireable[T] = js.native
}

