package typings.antvGLite

import typings.antvGLite.distDisplayObjectsMod.DisplayObject
import typings.antvGLite.distDisplayObjectsMod.HTML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDisplayObjectsDisplayObjectPoolMod {
  
  @JSImport("@antv/g-lite/dist/display-objects/DisplayObjectPool", "DisplayObjectPool")
  @js.native
  open class DisplayObjectPool () extends StObject {
    
    def add(entity: Double, groupOrShape: DisplayObject[Any, Any]): Unit = js.native
    
    def getAll(): js.Array[Any] = js.native
    
    def getByEntity(entity: Double): DisplayObject[Any, Any] = js.native
    
    def getHTMLs(): js.Array[HTML] = js.native
    
    def remove(entity: Double): Unit = js.native
  }
}
