package typings.athenajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("athenajs", "Sprite")
@js.native
class Sprite protected () extends Drawable {
  def this(`type`: String, spriteOptions: SpriteOptions) = this()
  
  def addAnimation(name: String, imgPath: String, options: AnimOptions): Unit = js.native
  
  def clearMove(): Unit = js.native
  
  def setAnimation(name: String): Unit = js.native
  def setAnimation(name: String, fn: Unit, frameNum: Double): Unit = js.native
  def setAnimation(name: String, fn: Unit, frameNum: Double, revert: Boolean): Unit = js.native
  def setAnimation(name: String, fn: Unit, frameNum: Unit, revert: Boolean): Unit = js.native
  def setAnimation(name: String, fn: Callback): Unit = js.native
  def setAnimation(name: String, fn: Callback, frameNum: Double): Unit = js.native
  def setAnimation(name: String, fn: Callback, frameNum: Double, revert: Boolean): Unit = js.native
  def setAnimation(name: String, fn: Callback, frameNum: Unit, revert: Boolean): Unit = js.native
}
