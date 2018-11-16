package typings
package angularDashTranslateLib.angularDashTranslateMod.angularMod.translateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPartialLoader[T] extends js.Object {
  def addPart(name: java.lang.String): T = js.native
  def addPart(name: java.lang.String, priority: scala.Double): T = js.native
  def deletePart(name: java.lang.String): T = js.native
  def isPartAvailable(name: java.lang.String): scala.Boolean = js.native
}

