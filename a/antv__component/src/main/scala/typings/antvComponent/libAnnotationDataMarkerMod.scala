package typings.antvComponent

import typings.antvComponent.libTypesMod.DataMarkerAnnotationCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnnotationDataMarkerMod {
  
  @JSImport("@antv/component/lib/annotation/data-marker", JSImport.Default)
  @js.native
  open class default () extends DataMarkerAnnotation
  
  @js.native
  trait DataMarkerAnnotation
    extends typings.antvComponent.libAbstractGroupComponentMod.default[DataMarkerAnnotationCfg] {
    
    /* private */ var autoAdjust: Any = js.native
    
    /* private */ var getShapeAttrs: Any = js.native
    
    /* private */ var renderLine: Any = js.native
    
    /* private */ var renderPoint: Any = js.native
    
    /* private */ var renderText: Any = js.native
  }
}
