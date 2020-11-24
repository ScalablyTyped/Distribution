package typings.astTypes.buildersMod

import typings.astTypes.anon.TypeAnnotationTSTypeKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TSParenthesizedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSParenthesizedTypeBuilder extends js.Object {
  
  def apply(typeAnnotation: TSTypeKind): TSParenthesizedType = js.native
  
  def from(params: TypeAnnotationTSTypeKind): TSParenthesizedType = js.native
}
