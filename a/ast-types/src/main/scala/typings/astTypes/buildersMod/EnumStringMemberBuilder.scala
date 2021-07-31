package typings.astTypes.buildersMod

import typings.astTypes.anon.IdIdentifierKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.namedTypesMod.namedTypes.EnumStringMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumStringMemberBuilder extends StObject {
  
  def apply(id: IdentifierKind, init: LiteralKind): EnumStringMember = js.native
  
  def from(params: IdIdentifierKind): EnumStringMember = js.native
}
