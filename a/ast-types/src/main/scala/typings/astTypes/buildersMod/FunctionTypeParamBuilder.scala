package typings.astTypes.buildersMod

import typings.astTypes.anon.NameOptional
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.FunctionTypeParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionTypeParamBuilder extends StObject {
  
  def apply(name: Null, typeAnnotation: FlowTypeKind, optional: Boolean): FunctionTypeParam = js.native
  def apply(name: IdentifierKind, typeAnnotation: FlowTypeKind, optional: Boolean): FunctionTypeParam = js.native
  
  def from(params: NameOptional): FunctionTypeParam = js.native
}
