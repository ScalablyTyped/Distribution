package typings.astTypes.buildersMod

import typings.astTypes.anon.ExplicitTypeMembers
import typings.astTypes.kindsMod.EnumDefaultedMemberKind
import typings.astTypes.kindsMod.EnumStringMemberKind
import typings.astTypes.namedTypesMod.namedTypes.EnumStringBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumStringBodyBuilder extends js.Object {
  
  def apply(members: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind], explicitType: Boolean): EnumStringBody = js.native
  
  def from(params: ExplicitTypeMembers): EnumStringBody = js.native
}
