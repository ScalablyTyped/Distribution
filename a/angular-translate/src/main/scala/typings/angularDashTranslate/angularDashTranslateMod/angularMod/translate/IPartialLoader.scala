package typings.angularDashTranslate.angularDashTranslateMod.angularMod.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPartialLoader[T] extends js.Object {
  def addPart(name: String): T = js.native
  def addPart(name: String, priority: Double): T = js.native
  def deletePart(name: String): T = js.native
  def isPartAvailable(name: String): Boolean = js.native
}

