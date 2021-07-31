package typings.athenajs.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameOptions extends StObject {
  
  var debug: Boolean
  
  var height: Double
  
  var name: String
  
  var scene: js.UndefOr[Scene] = js.undefined
  
  var showFps: Boolean
  
  var sound: js.UndefOr[Boolean] = js.undefined
  
  var target: js.UndefOr[String | HTMLElement] = js.undefined
  
  var width: Double
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
