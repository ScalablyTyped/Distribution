package typings.antvGLite

import typings.antvGLite.aabbInterfacesMod.GeometryAABBUpdater
import typings.antvGLite.anon.Depth
import typings.antvGLite.anon.OffsetX
import typings.antvGLite.anon.OffsetY
import typings.antvGLite.displayObjectMod.DisplayObject
import typings.antvGLite.textMod.ParsedTextStyleProps
import typings.antvGLite.textServiceMod.TextService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textUpdaterMod {
  
  @JSImport("@antv/g-lite/dist/services/aabb/TextUpdater", "TextUpdater")
  @js.native
  open class TextUpdater protected ()
    extends StObject
       with GeometryAABBUpdater[ParsedTextStyleProps] {
    def this(textService: TextService) = this()
    
    /* private */ var isReadyToMeasure: Any = js.native
    
    /* private */ var textService: Any = js.native
    
    /* CompleteClass */
    override def update(parsedStyle: ParsedTextStyleProps, `object`: DisplayObject[Any, Any]): Depth = js.native
    def update(
      parsedStyle: ParsedTextStyleProps,
      `object`: typings.antvGLite.displayObjectsMod.DisplayObject[Any, Any]
    ): OffsetX | OffsetY = js.native
  }
}
