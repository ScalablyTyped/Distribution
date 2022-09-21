package typings.antvComponent

import typings.antvComponent.typesMod.RegionAnnotationCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regionMod {
  
  @JSImport("@antv/component/lib/annotation/region", JSImport.Default)
  @js.native
  open class default () extends RegionAnnotation
  
  @js.native
  trait RegionAnnotation
    extends typings.antvComponent.groupComponentMod.default[RegionAnnotationCfg] {
    
    /* private */ var renderRegion: Any = js.native
  }
}
