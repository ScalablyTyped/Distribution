package typings.antvComponent

import typings.antvComponent.libTypesMod.ArcAnnotationCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnnotationArcMod {
  
  @JSImport("@antv/component/lib/annotation/arc", JSImport.Default)
  @js.native
  open class default () extends ArcAnnotation
  
  @js.native
  trait ArcAnnotation
    extends typings.antvComponent.libAbstractGroupComponentMod.default[ArcAnnotationCfg] {
    
    /* private */ var getArcPath: Any = js.native
    
    /* private */ var renderArc: Any = js.native
  }
}
