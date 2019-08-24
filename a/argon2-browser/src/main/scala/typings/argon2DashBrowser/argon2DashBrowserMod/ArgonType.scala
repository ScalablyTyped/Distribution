package typings.argon2DashBrowser.argon2DashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArgonType extends js.Object

@JSImport("argon2-browser", "ArgonType")
@js.native
object ArgonType extends js.Object {
  @js.native
  sealed trait Argon2d extends ArgonType
  
  @js.native
  sealed trait Argon2i extends ArgonType
  
  @js.native
  sealed trait Argon2id extends ArgonType
  
  /* 0 */ val Argon2d: typings.argon2DashBrowser.argon2DashBrowserMod.ArgonType.Argon2d with Double = js.native
  /* 1 */ val Argon2i: typings.argon2DashBrowser.argon2DashBrowserMod.ArgonType.Argon2i with Double = js.native
  /* 2 */ val Argon2id: typings.argon2DashBrowser.argon2DashBrowserMod.ArgonType.Argon2id with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ArgonType with Double] = js.native
}

