package typings.athenajs.mod

import typings.athenajs.anon.AIR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("athenajs", "Tile")
@js.native
class Tile protected () extends StObject {
  def this(options: JSObject) = this()
  
  var downCollide: Boolean = js.native
  
  var height: Double = js.native
  
  var inertia: Double = js.native
  
  var offsetX: Double = js.native
  
  var offsetY: Double = js.native
  
  var upCollide: Boolean = js.native
  
  var width: Double = js.native
}
/* static members */
object Tile {
  
  @JSImport("athenajs", "Tile")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("athenajs", "Tile.TYPE")
  @js.native
  def TYPE: AIR = js.native
  @scala.inline
  def TYPE_=(x: AIR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE")(x.asInstanceOf[js.Any])
}
