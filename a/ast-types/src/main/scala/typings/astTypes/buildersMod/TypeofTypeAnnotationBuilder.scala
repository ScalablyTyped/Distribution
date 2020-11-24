package typings.astTypes.buildersMod

import typings.astTypes.anon.ArgumentFlowTypeKind
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTypeAnnotationBuilder extends js.Object {
  
  def apply(argument: FlowTypeKind): TypeofTypeAnnotation = js.native
  
  def from(params: ArgumentFlowTypeKind): TypeofTypeAnnotation = js.native
}
