package typings.antvComponent

import typings.antvComponent.groupComponentMod.GroupComponent
import typings.antvComponent.typesMod.ArcAnnotationCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/annotation/arc", JSImport.Namespace)
@js.native
object arcMod extends js.Object {
  
  @js.native
  trait ArcAnnotation extends GroupComponent[ArcAnnotationCfg] {
    
    var getArcPath: js.Any = js.native
    
    var renderArc: js.Any = js.native
  }
  
  @js.native
  class default () extends ArcAnnotation
}
