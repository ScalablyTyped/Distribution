package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalViewRef extends ViewRef {
  def attachToAppRef(appRef: ApplicationRef): Unit = js.native
  def detachFromAppRef(): Unit = js.native
}

