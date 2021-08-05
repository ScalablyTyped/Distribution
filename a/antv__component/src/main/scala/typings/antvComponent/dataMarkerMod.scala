package typings.antvComponent

import typings.antvComponent.typesMod.DataMarkerAnnotationCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMarkerMod {
  
  @JSImport("@antv/component/lib/annotation/data-marker", JSImport.Default)
  @js.native
  class default () extends DataMarkerAnnotation
  
  @js.native
  trait DataMarkerAnnotation
    extends typings.antvComponent.groupComponentMod.default[DataMarkerAnnotationCfg] {
    
    /* private */ var autoAdjust: js.Any = js.native
    
    /* private */ var getShapeAttrs: js.Any = js.native
    
    /* private */ var renderLine: js.Any = js.native
    
    /* private */ var renderPoint: js.Any = js.native
    
    /* private */ var renderText: js.Any = js.native
  }
}
