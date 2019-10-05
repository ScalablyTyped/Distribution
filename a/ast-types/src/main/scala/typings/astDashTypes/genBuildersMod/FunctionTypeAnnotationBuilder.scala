package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsLocParamsRest
import typings.astDashTypes.genKindsMod.FlowTypeKind
import typings.astDashTypes.genKindsMod.FunctionTypeParamKind
import typings.astDashTypes.genKindsMod.TypeParameterDeclarationKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionTypeAnnotationBuilder extends js.Object {
  def apply(params: js.Array[FunctionTypeParamKind], returnType: FlowTypeKind): FunctionTypeAnnotation = js.native
  def apply(
    params: js.Array[FunctionTypeParamKind],
    returnType: FlowTypeKind,
    rest: Null,
    typeParameters: TypeParameterDeclarationKind
  ): FunctionTypeAnnotation = js.native
  def apply(params: js.Array[FunctionTypeParamKind], returnType: FlowTypeKind, rest: FunctionTypeParamKind): FunctionTypeAnnotation = js.native
  def apply(
    params: js.Array[FunctionTypeParamKind],
    returnType: FlowTypeKind,
    rest: FunctionTypeParamKind,
    typeParameters: TypeParameterDeclarationKind
  ): FunctionTypeAnnotation = js.native
  def from(params: Anon_CommentsLocParamsRest): FunctionTypeAnnotation = js.native
}

