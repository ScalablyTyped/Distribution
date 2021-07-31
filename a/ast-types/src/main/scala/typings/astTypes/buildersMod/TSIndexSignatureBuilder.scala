package typings.astTypes.buildersMod

import typings.astTypes.anon.LocParameters
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.namedTypesMod.namedTypes.TSIndexSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSIndexSignatureBuilder extends StObject {
  
  def apply(parameters: js.Array[IdentifierKind]): TSIndexSignature = js.native
  def apply(parameters: js.Array[IdentifierKind], typeAnnotation: TSTypeAnnotationKind): TSIndexSignature = js.native
  
  def from(params: LocParameters): TSIndexSignature = js.native
}
