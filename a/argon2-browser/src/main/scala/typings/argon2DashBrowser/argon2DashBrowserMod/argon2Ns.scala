package typings.argon2DashBrowser.argon2DashBrowserMod

import typings.argon2DashBrowser.argon2DashBrowserMod.argon2Ns.Argon2BrowserHashOptions
import typings.argon2DashBrowser.argon2DashBrowserMod.argon2Ns.Argon2BrowserHashResult
import typings.argon2DashBrowser.argon2DashBrowserMod.argon2Ns.ArgonType
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("argon2-browser", "argon2")
@js.native
object argon2Ns extends js.Object {
  trait Argon2BrowserHashOptions extends js.Object {
    var distPath: js.UndefOr[String] = js.undefined
    var hashLen: js.UndefOr[Double] = js.undefined
    var mem: js.UndefOr[Double] = js.undefined
    var parallelism: js.UndefOr[Double] = js.undefined
    var pass: String
    var salt: String
    var time: js.UndefOr[Double] = js.undefined
    var `type`: js.UndefOr[ArgonType] = js.undefined
  }
  
  trait Argon2BrowserHashResult extends js.Object {
    var encoded: String
    var hash: Uint8Array
    var hashHex: String
  }
  
  @js.native
  sealed trait ArgonType extends js.Object
  
  def hash(options: Argon2BrowserHashOptions): js.Promise[Argon2BrowserHashResult] = js.native
  @js.native
  object ArgonType extends js.Object {
    @js.native
    sealed trait Argon2d extends ArgonType
    
    @js.native
    sealed trait Argon2i extends ArgonType
    
    /* 0 */ val Argon2d: typings.argon2DashBrowser.argon2DashBrowserMod.argon2Ns.ArgonType.Argon2d with Double = js.native
    /* 1 */ val Argon2i: typings.argon2DashBrowser.argon2DashBrowserMod.argon2Ns.ArgonType.Argon2i with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ArgonType with Double] = js.native
  }
  
}

