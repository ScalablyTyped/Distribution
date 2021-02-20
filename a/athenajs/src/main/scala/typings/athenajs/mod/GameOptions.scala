package typings.athenajs.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameOptions extends StObject {
  
  var debug: Boolean = js.native
  
  var height: Double = js.native
  
  var name: String = js.native
  
  var scene: js.UndefOr[Scene] = js.native
  
  var showFps: Boolean = js.native
  
  var sound: js.UndefOr[Boolean] = js.native
  
  var target: js.UndefOr[String | HTMLElement] = js.native
  
  var width: Double = js.native
}
object GameOptions {
  
  @scala.inline
  def apply(debug: Boolean, height: Double, name: String, showFps: Boolean, width: Double): GameOptions = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], showFps = showFps.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameOptions]
  }
  
  @scala.inline
  implicit class GameOptionsMutableBuilder[Self <: GameOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSceneUndefined: Self = StObject.set(x, "scene", js.undefined)
    
    @scala.inline
    def setShowFps(value: Boolean): Self = StObject.set(x, "showFps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSound(value: Boolean): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    
    @scala.inline
    def setTarget(value: String | HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
