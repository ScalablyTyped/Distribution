package typings.astTypes.buildersMod

import typings.astTypes.anon.IdInit
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.namedTypesMod.namedTypes.EnumBooleanMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumBooleanMemberBuilder extends StObject {
  
  def apply(id: IdentifierKind, init: Boolean): EnumBooleanMember = js.native
  def apply(id: IdentifierKind, init: LiteralKind): EnumBooleanMember = js.native
  
  def from(params: IdInit): EnumBooleanMember = js.native
}
