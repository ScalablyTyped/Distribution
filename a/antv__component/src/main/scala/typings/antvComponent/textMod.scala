package typings.antvComponent

import typings.antvComponent.typesMod.PointLocationCfg
import typings.antvComponent.typesMod.TextAnnotationCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("@antv/component/lib/annotation/text", JSImport.Default)
  @js.native
  open class default () extends TextAnnotation
  
  @js.native
  trait TextAnnotation
    extends typings.antvComponent.groupComponentMod.default[TextAnnotationCfg] {
    
    /* private */ var resetLocation: Any = js.native
    
    def setLocation(location: PointLocationCfg): Unit = js.native
  }
}
