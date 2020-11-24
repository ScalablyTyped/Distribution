package typings.antvComponent

import typings.antvComponent.groupComponentMod.GroupComponent
import typings.antvComponent.typesMod.LineAnnotationCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/annotation/line", JSImport.Namespace)
@js.native
object lineMod extends js.Object {
  
  @js.native
  trait LineAnnotation extends GroupComponent[LineAnnotationCfg] {
    
    var getLabelPoint: js.Any = js.native
    
    var renderLabel: js.Any = js.native
    
    var renderLine: js.Any = js.native
  }
  
  @js.native
  class default () extends LineAnnotation
}
