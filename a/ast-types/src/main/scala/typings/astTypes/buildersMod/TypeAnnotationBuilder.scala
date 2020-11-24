package typings.astTypes.buildersMod

import typings.astTypes.anon.LocTypeAnnotation
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeAnnotationBuilder extends js.Object {
  
  def apply(typeAnnotation: FlowTypeKind): TypeAnnotation = js.native
  
  def from(params: LocTypeAnnotation): TypeAnnotation = js.native
}
