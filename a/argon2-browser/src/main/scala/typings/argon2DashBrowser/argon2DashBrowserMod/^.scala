package typings.argon2DashBrowser.argon2DashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("argon2-browser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hash(options: Argon2BrowserHashOptions): js.Promise[Argon2BrowserHashResult] = js.native
  def verify(options: Argon2VerifyOptions): js.Promise[js.UndefOr[scala.Nothing]] = js.native
}

