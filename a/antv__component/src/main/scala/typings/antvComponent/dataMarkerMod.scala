package typings.antvComponent

import typings.antvComponent.groupComponentMod.GroupComponent
import typings.antvComponent.typesMod.DataMarkerAnnotationCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/annotation/data-marker", JSImport.Namespace)
@js.native
object dataMarkerMod extends js.Object {
  
  @js.native
  trait DataMarkerAnnotation extends GroupComponent[DataMarkerAnnotationCfg] {
    
    var autoAdjust: js.Any = js.native
    
    var getShapeAttrs: js.Any = js.native
    
    var renderLine: js.Any = js.native
    
    var renderPoint: js.Any = js.native
    
    var renderText: js.Any = js.native
  }
  
  @js.native
  class default () extends DataMarkerAnnotation
}
