package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Menu")
@js.native
class Menu protected () extends Drawable {
  def this(id: java.lang.String, options: MenuOptions) = this()
  def getSelectedItemIndex(): scala.Double = js.native
  def nextItem(): scala.Unit = js.native
}

