package typings.astTypes.buildersMod

import typings.astTypes.anon.Const
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TSEnumMemberKind
import typings.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSEnumDeclarationBuilder extends StObject {
  
  def apply(id: IdentifierKind, members: js.Array[TSEnumMemberKind]): TSEnumDeclaration = js.native
  
  def from(params: Const): TSEnumDeclaration = js.native
}
