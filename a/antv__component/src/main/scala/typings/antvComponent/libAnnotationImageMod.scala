package typings.antvComponent

import typings.antvComponent.libTypesMod.ImageAnnotationCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnnotationImageMod {
  
  @JSImport("@antv/component/lib/annotation/image", JSImport.Default)
  @js.native
  open class default () extends ImageAnnotation
  
  @js.native
  trait ImageAnnotation
    extends typings.antvComponent.libAbstractGroupComponentMod.default[ImageAnnotationCfg] {
    
    /* private */ var getImageAttrs: Any = js.native
    
    /* private */ var renderImage: Any = js.native
  }
}
