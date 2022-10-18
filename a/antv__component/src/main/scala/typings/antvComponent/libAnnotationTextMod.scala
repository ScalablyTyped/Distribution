package typings.antvComponent

import typings.antvComponent.libTypesMod.PointLocationCfg
import typings.antvComponent.libTypesMod.TextAnnotationCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnnotationTextMod {
  
  @JSImport("@antv/component/lib/annotation/text", JSImport.Default)
  @js.native
  open class default () extends TextAnnotation
  
  @js.native
  trait TextAnnotation
    extends typings.antvComponent.libAbstractGroupComponentMod.default[TextAnnotationCfg] {
    
    /* private */ var resetLocation: Any = js.native
    
    def setLocation(location: PointLocationCfg): Unit = js.native
  }
}
