package typings.antvComponent

import typings.antvComponent.groupComponentMod.GroupComponent
import typings.antvComponent.typesMod.RegionAnnotationCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/annotation/region", JSImport.Namespace)
@js.native
object regionMod extends js.Object {
  
  @js.native
  trait RegionAnnotation extends GroupComponent[RegionAnnotationCfg] {
    
    var renderRegion: js.Any = js.native
  }
  
  @js.native
  class default () extends RegionAnnotation
}
