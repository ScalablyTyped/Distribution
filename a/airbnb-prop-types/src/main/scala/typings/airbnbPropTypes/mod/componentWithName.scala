package typings.airbnbPropTypes.mod

import typings.airbnbPropTypes.anon.StripHOCs
import typings.propTypes.mod.Requireable
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("airbnb-prop-types", "componentWithName")
@js.native
object componentWithName extends js.Object {
  
  def apply[T](name: String): Requireable[T] = js.native
  def apply[T](name: String, options: StripHOCs): Requireable[T] = js.native
  def apply[T](name: RegExp): Requireable[T] = js.native
  def apply[T](name: RegExp, options: StripHOCs): Requireable[T] = js.native
}
