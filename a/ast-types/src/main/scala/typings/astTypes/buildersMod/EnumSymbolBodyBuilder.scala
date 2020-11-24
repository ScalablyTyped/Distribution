package typings.astTypes.buildersMod

import typings.astTypes.anon.MembersArray
import typings.astTypes.kindsMod.EnumDefaultedMemberKind
import typings.astTypes.namedTypesMod.namedTypes.EnumSymbolBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumSymbolBodyBuilder extends js.Object {
  
  def apply(members: js.Array[EnumDefaultedMemberKind]): EnumSymbolBody = js.native
  
  def from(params: MembersArray): EnumSymbolBody = js.native
}
