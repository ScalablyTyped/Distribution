package typings.antvComponent

import typings.antvComponent.groupComponentMod.GroupComponent
import typings.antvComponent.typesMod.ShapeAnnotationCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/annotation/shape", JSImport.Namespace)
@js.native
object shapeMod extends js.Object {
  
  @js.native
  trait ShapeAnnotation extends GroupComponent[ShapeAnnotationCfg]
  
  @js.native
  class default () extends ShapeAnnotation
}
