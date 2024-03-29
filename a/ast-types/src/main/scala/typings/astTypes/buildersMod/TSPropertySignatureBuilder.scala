package typings.astTypes.buildersMod

import typings.astTypes.anon.Initializer
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.namedTypesMod.namedTypes.TSPropertySignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSPropertySignatureBuilder extends StObject {
  
  def apply(key: ExpressionKind): TSPropertySignature = js.native
  def apply(key: ExpressionKind, typeAnnotation: Null, optional: Boolean): TSPropertySignature = js.native
  def apply(key: ExpressionKind, typeAnnotation: Unit, optional: Boolean): TSPropertySignature = js.native
  def apply(key: ExpressionKind, typeAnnotation: TSTypeAnnotationKind): TSPropertySignature = js.native
  def apply(key: ExpressionKind, typeAnnotation: TSTypeAnnotationKind, optional: Boolean): TSPropertySignature = js.native
  
  def from(params: Initializer): TSPropertySignature = js.native
}
