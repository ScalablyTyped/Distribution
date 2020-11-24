package typings.antvComponent

import typings.antvComponent.groupComponentMod.GroupComponent
import typings.antvComponent.typesMod.DataRegionAnnotationCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/annotation/data-region", JSImport.Namespace)
@js.native
object dataRegionMod extends js.Object {
  
  @js.native
  trait DataRegionAnnotation extends GroupComponent[DataRegionAnnotationCfg]
  
  @js.native
  class default () extends DataRegionAnnotation
}
