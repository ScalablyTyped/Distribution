package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "NgZone")
@js.native
class NgZone protected ()
  extends atAngularCoreLib.publicUnderscoreApiMod.NgZone {
  def this(hasEnableLongStackTrace: atAngularCoreLib.Anon_EnableLongStackTrace) = this()
}

@JSImport("@angular/core", "NgZone")
@js.native
object NgZone extends js.Object {
  def assertInAngularZone(): scala.Unit = js.native
  def assertNotInAngularZone(): scala.Unit = js.native
  def isInAngularZone(): scala.Boolean = js.native
}

