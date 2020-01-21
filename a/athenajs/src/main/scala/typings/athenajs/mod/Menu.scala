package typings.athenajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Menu")
@js.native
class Menu protected () extends Drawable {
  def this(id: String, options: MenuOptions) = this()
  def getSelectedItemIndex(): Double = js.native
  def nextItem(): Unit = js.native
}

