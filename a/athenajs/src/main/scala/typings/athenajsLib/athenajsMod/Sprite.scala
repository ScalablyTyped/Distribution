package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Sprite")
@js.native
class Sprite protected () extends Drawable {
  def this(`type`: java.lang.String, spriteOptions: SpriteOptions) = this()
  def addAnimation(name: java.lang.String, imgPath: java.lang.String, options: AnimOptions): scala.Unit = js.native
  def clearMove(): scala.Unit = js.native
  def setAnimation(name: java.lang.String): scala.Unit = js.native
  def setAnimation(name: java.lang.String, fn: Callback): scala.Unit = js.native
  def setAnimation(name: java.lang.String, fn: Callback, frameNum: scala.Double): scala.Unit = js.native
  def setAnimation(name: java.lang.String, fn: Callback, frameNum: scala.Double, revert: scala.Boolean): scala.Unit = js.native
}

