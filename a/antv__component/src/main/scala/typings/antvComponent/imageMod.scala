package typings.antvComponent

import typings.antvComponent.typesMod.ImageAnnotationCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod {
  
  @JSImport("@antv/component/lib/annotation/image", JSImport.Default)
  @js.native
  class default () extends ImageAnnotation
  
  @js.native
  trait ImageAnnotation
    extends typings.antvComponent.groupComponentMod.default[ImageAnnotationCfg] {
    
    var getImageAttrs: js.Any = js.native
    
    var renderImage: js.Any = js.native
  }
}
