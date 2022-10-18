package typings.antvComponent

import typings.antvComponent.libTypesMod.RegionAnnotationCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnnotationRegionMod {
  
  @JSImport("@antv/component/lib/annotation/region", JSImport.Default)
  @js.native
  open class default () extends RegionAnnotation
  
  @js.native
  trait RegionAnnotation
    extends typings.antvComponent.libAbstractGroupComponentMod.default[RegionAnnotationCfg] {
    
    /* private */ var renderRegion: Any = js.native
  }
}
