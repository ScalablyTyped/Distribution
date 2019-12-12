package typings.argon2DashBrowser.argon2DashBrowserMod

import org.scalablytyped.runtime.TopLevel
import typings.argon2DashBrowser.argon2DashBrowserMod.ArgonType.Argon2d
import typings.argon2DashBrowser.argon2DashBrowserMod.ArgonType.Argon2i
import typings.argon2DashBrowser.argon2DashBrowserMod.ArgonType.Argon2id
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ArgonType with Double] = js.native
  /* 0 */ @js.native
  object Argon2d extends TopLevel[Argon2d with Double]
  
  /* 1 */ @js.native
  object Argon2i extends TopLevel[Argon2i with Double]
  
  /* 2 */ @js.native
  object Argon2id extends TopLevel[Argon2id with Double]
  
}

