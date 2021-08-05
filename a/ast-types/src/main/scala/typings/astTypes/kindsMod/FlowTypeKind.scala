package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
*/
trait FlowTypeKind extends StObject
object FlowTypeKind {
  
  inline def AnyTypeAnnotation(): typings.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AnyTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation]
  }
  
  inline def ArrayTypeAnnotation(elementType: FlowTypeKind): typings.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation]
  }
  
  inline def BigIntLiteralTypeAnnotation(raw: String, value: Null): typings.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation]
  }
  
  inline def BigIntTypeAnnotation(): typings.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BigIntTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation]
  }
  
  inline def BooleanLiteralTypeAnnotation(raw: String, value: Boolean): typings.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation]
  }
  
  inline def BooleanTypeAnnotation(): typings.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BooleanTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation]
  }
  
  inline def EmptyTypeAnnotation(): typings.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EmptyTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation]
  }
  
  inline def ExistentialTypeParam(): typings.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExistentialTypeParam")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam]
  }
  
  inline def ExistsTypeAnnotation(): typings.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExistsTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation]
  }
  
  inline def FunctionTypeAnnotation(params: js.Array[FunctionTypeParamKind], returnType: FlowTypeKind): typings.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], rest = null, typeParameters = null)
    __obj.updateDynamic("type")("FunctionTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation]
  }
  
  inline def GenericTypeAnnotation(id: IdentifierKind | QualifiedTypeIdentifierKind): typings.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeParameters = null)
    __obj.updateDynamic("type")("GenericTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation]
  }
  
  inline def InterfaceTypeAnnotation(body: ObjectTypeAnnotationKind): typings.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation]
  }
  
  inline def IntersectionTypeAnnotation(types: js.Array[FlowTypeKind]): typings.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IntersectionTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation]
  }
  
  inline def MemberTypeAnnotation(`object`: IdentifierKind, property: MemberTypeAnnotationKind | GenericTypeAnnotationKind): typings.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation]
  }
  
  inline def MixedTypeAnnotation(): typings.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("MixedTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation]
  }
  
  inline def NullLiteralTypeAnnotation(): typings.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation]
  }
  
  inline def NullTypeAnnotation(): typings.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation]
  }
  
  inline def NullableTypeAnnotation(typeAnnotation: FlowTypeKind): typings.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullableTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation]
  }
  
  inline def NumberLiteralTypeAnnotation(raw: String, value: Double): typings.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumberLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation]
  }
  
  inline def NumberTypeAnnotation(): typings.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NumberTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation]
  }
  
  inline def NumericLiteralTypeAnnotation(raw: String, value: Double): typings.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation]
  }
  
  inline def ObjectTypeAnnotation(properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]): typings.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation]
  }
  
  inline def StringLiteralTypeAnnotation(raw: String, value: String): typings.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation]
  }
  
  inline def StringTypeAnnotation(): typings.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("StringTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation]
  }
  
  inline def SymbolTypeAnnotation(): typings.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("SymbolTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation]
  }
  
  inline def ThisTypeAnnotation(): typings.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThisTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation]
  }
  
  inline def TupleTypeAnnotation(types: js.Array[FlowTypeKind]): typings.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TupleTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation]
  }
  
  inline def TypeParameter(name: String): typings.astTypes.namedTypesMod.namedTypes.TypeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeParameter")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TypeParameter]
  }
  
  inline def TypeofTypeAnnotation(argument: FlowTypeKind): typings.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeofTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation]
  }
  
  inline def UnionTypeAnnotation(types: js.Array[FlowTypeKind]): typings.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnionTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation]
  }
  
  inline def VoidTypeAnnotation(): typings.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("VoidTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation]
  }
}
