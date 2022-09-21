package typings.antvComponent

import typings.antvComponent.typesMod.ArcAnnotationCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcMod {
  
  @JSImport("@antv/component/lib/annotation/arc", JSImport.Default)
  @js.native
  open class default () extends ArcAnnotation
  
  @js.native
  trait ArcAnnotation
    extends typings.antvComponent.groupComponentMod.default[ArcAnnotationCfg] {
    
    /* private */ var getArcPath: Any = js.native
    
    /* private */ var renderArc: Any = js.native
  }
}
