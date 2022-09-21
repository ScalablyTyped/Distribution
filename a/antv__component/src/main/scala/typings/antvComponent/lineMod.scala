package typings.antvComponent

import typings.antvComponent.typesMod.LineAnnotationCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineMod {
  
  @JSImport("@antv/component/lib/annotation/line", JSImport.Default)
  @js.native
  open class default () extends LineAnnotation
  
  @js.native
  trait LineAnnotation
    extends typings.antvComponent.groupComponentMod.default[LineAnnotationCfg] {
    
    /* private */ var getLabelPoint: Any = js.native
    
    /* private */ var renderLabel: Any = js.native
    
    /* private */ var renderLine: Any = js.native
  }
}
