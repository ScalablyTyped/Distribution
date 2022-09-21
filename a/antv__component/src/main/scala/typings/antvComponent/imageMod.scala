package typings.antvComponent

import typings.antvComponent.typesMod.ImageAnnotationCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod {
  
  @JSImport("@antv/component/lib/annotation/image", JSImport.Default)
  @js.native
  open class default () extends ImageAnnotation
  
  @js.native
  trait ImageAnnotation
    extends typings.antvComponent.groupComponentMod.default[ImageAnnotationCfg] {
    
    /* private */ var getImageAttrs: Any = js.native
    
    /* private */ var renderImage: Any = js.native
  }
}
