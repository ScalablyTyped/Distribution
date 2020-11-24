package typings.astTypes.buildersMod

import typings.astTypes.anon.ExplicitType
import typings.astTypes.kindsMod.EnumBooleanMemberKind
import typings.astTypes.namedTypesMod.namedTypes.EnumBooleanBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumBooleanBodyBuilder extends js.Object {
  
  def apply(members: js.Array[EnumBooleanMemberKind], explicitType: Boolean): EnumBooleanBody = js.native
  
  def from(params: ExplicitType): EnumBooleanBody = js.native
}
