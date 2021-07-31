package typings.astTypes.buildersMod

import typings.astTypes.anon.Asserts
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TSThisTypeKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.namedTypesMod.namedTypes.TSTypePredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypePredicateBuilder extends StObject {
  
  def apply(parameterName: IdentifierKind): TSTypePredicate = js.native
  def apply(parameterName: IdentifierKind, typeAnnotation: Null, asserts: Boolean): TSTypePredicate = js.native
  def apply(parameterName: IdentifierKind, typeAnnotation: Unit, asserts: Boolean): TSTypePredicate = js.native
  def apply(parameterName: IdentifierKind, typeAnnotation: TSTypeAnnotationKind): TSTypePredicate = js.native
  def apply(parameterName: IdentifierKind, typeAnnotation: TSTypeAnnotationKind, asserts: Boolean): TSTypePredicate = js.native
  def apply(parameterName: TSThisTypeKind): TSTypePredicate = js.native
  def apply(parameterName: TSThisTypeKind, typeAnnotation: Null, asserts: Boolean): TSTypePredicate = js.native
  def apply(parameterName: TSThisTypeKind, typeAnnotation: Unit, asserts: Boolean): TSTypePredicate = js.native
  def apply(parameterName: TSThisTypeKind, typeAnnotation: TSTypeAnnotationKind): TSTypePredicate = js.native
  def apply(parameterName: TSThisTypeKind, typeAnnotation: TSTypeAnnotationKind, asserts: Boolean): TSTypePredicate = js.native
  
  def from(params: Asserts): TSTypePredicate = js.native
}
