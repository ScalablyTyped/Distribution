package typings
package argon2DashBrowserLib.argon2DashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("argon2-browser", "argon2")
@js.native
object argon2Ns extends js.Object {
  trait Argon2BrowserHashOptions extends js.Object {
    var distPath: js.UndefOr[java.lang.String] = js.undefined
    var hashLen: js.UndefOr[scala.Double] = js.undefined
    var mem: js.UndefOr[scala.Double] = js.undefined
    var parallelism: js.UndefOr[scala.Double] = js.undefined
    var pass: java.lang.String
    var salt: java.lang.String
    var time: js.UndefOr[scala.Double] = js.undefined
    var `type`: js.UndefOr[ArgonType] = js.undefined
  }
  
  trait Argon2BrowserHashResult extends js.Object {
    var encoded: java.lang.String
    var hash: stdLib.Uint8Array
    var hashHex: java.lang.String
  }
  
  @js.native
  sealed trait ArgonType extends js.Object
  
  def hash(options: Argon2BrowserHashOptions): js.Promise[Argon2BrowserHashResult] = js.native
  @js.native
  object ArgonType extends js.Object {
    @js.native
    sealed trait Argon2d
      extends argon2DashBrowserLib.argon2DashBrowserMod.argon2Ns.ArgonType
    
    @js.native
    sealed trait Argon2i
      extends argon2DashBrowserLib.argon2DashBrowserMod.argon2Ns.ArgonType
    
    /* 0 */ val Argon2d: Argon2d with scala.Double = js.native
    /* 1 */ val Argon2i: Argon2i with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[argon2DashBrowserLib.argon2DashBrowserMod.argon2Ns.ArgonType with scala.Double] = js.native
  }
  
}

