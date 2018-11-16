package typings
package atAngularCoreLib.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/public_api", "NgZone")
@js.native
class NgZone protected ()
  extends atAngularCoreLib.srcCoreMod.NgZone {
  def this(hasEnableLongStackTrace: atAngularCoreLib.Anon_EnableLongStackTrace) = this()
}

@JSImport("@angular/core/public_api", "NgZone")
@js.native
object NgZone extends js.Object {
  def assertInAngularZone(): scala.Unit = js.native
  def assertNotInAngularZone(): scala.Unit = js.native
  def isInAngularZone(): scala.Boolean = js.native
}

