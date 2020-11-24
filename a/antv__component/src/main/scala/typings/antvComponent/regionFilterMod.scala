package typings.antvComponent

import typings.antvComponent.groupComponentMod.GroupComponent
import typings.antvComponent.typesMod.RegionFilterAnnotationCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/annotation/region-filter", JSImport.Namespace)
@js.native
object regionFilterMod extends js.Object {
  
  @js.native
  trait RegionFilterAnnotation extends GroupComponent[RegionFilterAnnotationCfg] {
    
    var adjustShapeAttrs: js.Any = js.native
  }
  
  @js.native
  class default () extends RegionFilterAnnotation
}
