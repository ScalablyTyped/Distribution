package typings.astTypes.buildersMod

import typings.astTypes.anon.Members
import typings.astTypes.kindsMod.EnumNumberMemberKind
import typings.astTypes.namedTypesMod.namedTypes.EnumNumberBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumNumberBodyBuilder extends js.Object {
  
  def apply(members: js.Array[EnumNumberMemberKind], explicitType: Boolean): EnumNumberBody = js.native
  
  def from(params: Members): EnumNumberBody = js.native
}
