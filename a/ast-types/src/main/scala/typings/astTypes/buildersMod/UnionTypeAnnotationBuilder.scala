package typings.astTypes.buildersMod

import typings.astTypes.anon.Types
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnionTypeAnnotationBuilder extends StObject {
  
  def apply(types: js.Array[FlowTypeKind]): UnionTypeAnnotation = js.native
  
  def from(params: Types): UnionTypeAnnotation = js.native
}
