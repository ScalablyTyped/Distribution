package typings.athenajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("athenajs", "Menu")
@js.native
class Menu protected () extends Drawable {
  def this(id: String, options: MenuOptions) = this()
  
  def getSelectedItemIndex(): Double = js.native
  
  def nextItem(): Unit = js.native
}
