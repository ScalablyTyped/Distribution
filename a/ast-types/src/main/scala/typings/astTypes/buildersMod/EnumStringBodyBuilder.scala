package typings.astTypes.buildersMod

import typings.astTypes.anon.ExplicitTypeMembers
import typings.astTypes.kindsMod.EnumDefaultedMemberKind
import typings.astTypes.kindsMod.EnumStringMemberKind
import typings.astTypes.namedTypesMod.namedTypes.EnumStringBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumStringBodyBuilder extends StObject {
  
  def apply(members: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind], explicitType: Boolean): EnumStringBody = js.native
  
  def from(params: ExplicitTypeMembers): EnumStringBody = js.native
}
