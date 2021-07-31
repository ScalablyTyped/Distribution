package typings.astTypes.buildersMod

import typings.astTypes.anon.CommentsComputed
import typings.astTypes.kindsMod.ArrayPatternKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.ObjectPatternKind
import typings.astTypes.kindsMod.RestElementKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.namedTypesMod.namedTypes.TSMethodSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSMethodSignatureBuilder extends StObject {
  
  def apply(
    key: ExpressionKind,
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]
  ): TSMethodSignature = js.native
  def apply(
    key: ExpressionKind,
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    typeAnnotation: TSTypeAnnotationKind
  ): TSMethodSignature = js.native
  
  def from(params: CommentsComputed): TSMethodSignature = js.native
}
