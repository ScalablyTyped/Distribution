package typings.athenajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Sprite")
@js.native
class Sprite protected () extends Drawable {
  def this(`type`: String, spriteOptions: SpriteOptions) = this()
  def addAnimation(name: String, imgPath: String, options: AnimOptions): Unit = js.native
  def clearMove(): Unit = js.native
  def setAnimation(name: String): Unit = js.native
  def setAnimation(name: String, fn: js.UndefOr[scala.Nothing], frameNum: js.UndefOr[scala.Nothing], revert: Boolean): Unit = js.native
  def setAnimation(name: String, fn: js.UndefOr[scala.Nothing], frameNum: Double): Unit = js.native
  def setAnimation(name: String, fn: js.UndefOr[scala.Nothing], frameNum: Double, revert: Boolean): Unit = js.native
  def setAnimation(name: String, fn: Callback): Unit = js.native
  def setAnimation(name: String, fn: Callback, frameNum: js.UndefOr[scala.Nothing], revert: Boolean): Unit = js.native
  def setAnimation(name: String, fn: Callback, frameNum: Double): Unit = js.native
  def setAnimation(name: String, fn: Callback, frameNum: Double, revert: Boolean): Unit = js.native
}

