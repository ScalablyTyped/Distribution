package typings.astTypes.buildersMod

import typings.astTypes.anon.LocParams
import typings.astTypes.kindsMod.TSTypeParameterKind
import typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeParameterDeclarationBuilder extends js.Object {
  
  def apply(params: js.Array[TSTypeParameterKind]): TSTypeParameterDeclaration = js.native
  
  def from(params: LocParams): TSTypeParameterDeclaration = js.native
}
