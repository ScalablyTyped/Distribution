package typings.athenajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("athenajs", "Behavior")
@js.native
open class Behavior protected () extends StObject {
  def this(sprite: Drawable) = this()
  def this(sprite: Drawable, options: JSObject) = this()
  
  /**
    * Returns current mapEvent
    *
    */
  def getMapEvent(): MapEvent = js.native
  
  var gravity: Double = js.native
  
  def onUpdate(timestamp: Double): Unit = js.native
  
  var onVXChange: js.UndefOr[js.Function1[/* vx */ Double, Unit]] = js.native
  
  var onVYChange: js.UndefOr[js.Function1[/* vy */ Double, Unit]] = js.native
  
  def reset(): Unit = js.native
  
  var sprite: Drawable = js.native
  
  var vx: Double = js.native
  
  var vy: Double = js.native
}
