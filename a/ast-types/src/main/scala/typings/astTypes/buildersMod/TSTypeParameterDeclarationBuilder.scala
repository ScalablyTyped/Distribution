package typings.astTypes.buildersMod

import typings.astTypes.anon.LocParams
import typings.astTypes.kindsMod.TSTypeParameterKind
import typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeParameterDeclarationBuilder extends StObject {
  
  def apply(params: js.Array[TSTypeParameterKind]): TSTypeParameterDeclaration = js.native
  
  def from(params: LocParams): TSTypeParameterDeclaration = js.native
}
