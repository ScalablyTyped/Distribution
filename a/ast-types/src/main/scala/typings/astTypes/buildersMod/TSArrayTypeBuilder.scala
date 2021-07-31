package typings.astTypes.buildersMod

import typings.astTypes.anon.CommentsElementType
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TSArrayType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSArrayTypeBuilder extends StObject {
  
  def apply(elementType: TSTypeKind): TSArrayType = js.native
  
  def from(params: CommentsElementType): TSArrayType = js.native
}
