package typings.antvComponent

import typings.antvComponent.groupComponentMod.GroupComponent
import typings.antvComponent.typesMod.ImageAnnotationCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/annotation/image", JSImport.Namespace)
@js.native
object imageMod extends js.Object {
  
  @js.native
  trait ImageAnnotation extends GroupComponent[ImageAnnotationCfg] {
    
    var getImageAttrs: js.Any = js.native
    
    var renderImage: js.Any = js.native
  }
  
  @js.native
  class default () extends ImageAnnotation
}
