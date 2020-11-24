package typings.antvComponent

import typings.antvComponent.groupComponentMod.GroupComponent
import typings.antvComponent.typesMod.PointLocationCfg
import typings.antvComponent.typesMod.TextAnnotationCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/annotation/text", JSImport.Namespace)
@js.native
object textMod extends js.Object {
  
  @js.native
  trait TextAnnotation extends GroupComponent[TextAnnotationCfg] {
    
    var resetLocation: js.Any = js.native
    
    def setLocation(location: PointLocationCfg): Unit = js.native
  }
  
  @js.native
  class default () extends TextAnnotation
}
