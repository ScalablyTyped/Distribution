package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam
  - typings.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.TypeParameter
  - typings.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.InferredPredicate
  - typings.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
*/
trait FlowKind extends StObject
object FlowKind {
  
  @scala.inline
  def AnyTypeAnnotation(`type`: typings.astTypes.astTypesStrings.AnyTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation]
  }
  
  @scala.inline
  def ArrayTypeAnnotation(elementType: FlowTypeKind, `type`: typings.astTypes.astTypesStrings.ArrayTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation]
  }
  
  @scala.inline
  def BigIntLiteralTypeAnnotation(raw: String, `type`: typings.astTypes.astTypesStrings.BigIntLiteralTypeAnnotation, value: Null): typings.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation]
  }
  
  @scala.inline
  def BigIntTypeAnnotation(`type`: typings.astTypes.astTypesStrings.BigIntTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation]
  }
  
  @scala.inline
  def BooleanLiteralTypeAnnotation(raw: String, `type`: typings.astTypes.astTypesStrings.BooleanLiteralTypeAnnotation, value: Boolean): typings.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation]
  }
  
  @scala.inline
  def BooleanTypeAnnotation(`type`: typings.astTypes.astTypesStrings.BooleanTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation]
  }
  
  @scala.inline
  def DeclaredPredicate(`type`: typings.astTypes.astTypesStrings.DeclaredPredicate, value: ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.DeclaredPredicate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclaredPredicate]
  }
  
  @scala.inline
  def EmptyTypeAnnotation(`type`: typings.astTypes.astTypesStrings.EmptyTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation]
  }
  
  @scala.inline
  def ExistentialTypeParam(`type`: typings.astTypes.astTypesStrings.ExistentialTypeParam): typings.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam]
  }
  
  @scala.inline
  def ExistsTypeAnnotation(`type`: typings.astTypes.astTypesStrings.ExistsTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation]
  }
  
  @scala.inline
  def FunctionTypeAnnotation(
    params: js.Array[FunctionTypeParamKind],
    returnType: FlowTypeKind,
    `type`: typings.astTypes.astTypesStrings.FunctionTypeAnnotation
  ): typings.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation]
  }
  
  @scala.inline
  def GenericTypeAnnotation(
    id: IdentifierKind | QualifiedTypeIdentifierKind,
    `type`: typings.astTypes.astTypesStrings.GenericTypeAnnotation
  ): typings.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation]
  }
  
  @scala.inline
  def InferredPredicate(`type`: typings.astTypes.astTypesStrings.InferredPredicate): typings.astTypes.namedTypesMod.namedTypes.InferredPredicate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.InferredPredicate]
  }
  
  @scala.inline
  def InterfaceTypeAnnotation(body: ObjectTypeAnnotationKind, `type`: typings.astTypes.astTypesStrings.InterfaceTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation]
  }
  
  @scala.inline
  def IntersectionTypeAnnotation(`type`: typings.astTypes.astTypesStrings.IntersectionTypeAnnotation, types: js.Array[FlowTypeKind]): typings.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation]
  }
  
  @scala.inline
  def MemberTypeAnnotation(
    `object`: IdentifierKind,
    property: MemberTypeAnnotationKind | GenericTypeAnnotationKind,
    `type`: typings.astTypes.astTypesStrings.MemberTypeAnnotation
  ): typings.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation]
  }
  
  @scala.inline
  def MixedTypeAnnotation(`type`: typings.astTypes.astTypesStrings.MixedTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation]
  }
  
  @scala.inline
  def NullLiteralTypeAnnotation(`type`: typings.astTypes.astTypesStrings.NullLiteralTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation]
  }
  
  @scala.inline
  def NullTypeAnnotation(`type`: typings.astTypes.astTypesStrings.NullTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation]
  }
  
  @scala.inline
  def NullableTypeAnnotation(`type`: typings.astTypes.astTypesStrings.NullableTypeAnnotation, typeAnnotation: FlowTypeKind): typings.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation]
  }
  
  @scala.inline
  def NumberLiteralTypeAnnotation(raw: String, `type`: typings.astTypes.astTypesStrings.NumberLiteralTypeAnnotation, value: Double): typings.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation]
  }
  
  @scala.inline
  def NumberTypeAnnotation(`type`: typings.astTypes.astTypesStrings.NumberTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation]
  }
  
  @scala.inline
  def NumericLiteralTypeAnnotation(raw: String, `type`: typings.astTypes.astTypesStrings.NumericLiteralTypeAnnotation, value: Double): typings.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation]
  }
  
  @scala.inline
  def ObjectTypeAnnotation(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    `type`: typings.astTypes.astTypesStrings.ObjectTypeAnnotation
  ): typings.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation]
  }
  
  @scala.inline
  def StringLiteralTypeAnnotation(raw: String, `type`: typings.astTypes.astTypesStrings.StringLiteralTypeAnnotation, value: String): typings.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation]
  }
  
  @scala.inline
  def StringTypeAnnotation(`type`: typings.astTypes.astTypesStrings.StringTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation]
  }
  
  @scala.inline
  def SymbolTypeAnnotation(`type`: typings.astTypes.astTypesStrings.SymbolTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation]
  }
  
  @scala.inline
  def ThisTypeAnnotation(`type`: typings.astTypes.astTypesStrings.ThisTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation]
  }
  
  @scala.inline
  def TupleTypeAnnotation(`type`: typings.astTypes.astTypesStrings.TupleTypeAnnotation, types: js.Array[FlowTypeKind]): typings.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation]
  }
  
  @scala.inline
  def TypeParameter(name: String, `type`: typings.astTypes.astTypesStrings.TypeParameter): typings.astTypes.namedTypesMod.namedTypes.TypeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TypeParameter]
  }
  
  @scala.inline
  def TypeofTypeAnnotation(argument: FlowTypeKind, `type`: typings.astTypes.astTypesStrings.TypeofTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation]
  }
  
  @scala.inline
  def UnionTypeAnnotation(`type`: typings.astTypes.astTypesStrings.UnionTypeAnnotation, types: js.Array[FlowTypeKind]): typings.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation]
  }
  
  @scala.inline
  def VoidTypeAnnotation(`type`: typings.astTypes.astTypesStrings.VoidTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation]
  }
}
