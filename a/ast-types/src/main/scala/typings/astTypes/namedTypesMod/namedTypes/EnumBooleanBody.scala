package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.EnumBooleanMemberKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumBooleanBody extends ASTNode {
  
  var explicitType: Boolean = js.native
  
  var members: js.Array[EnumBooleanMemberKind] = js.native
  
  var `type`: typings.astTypes.astTypesStrings.EnumBooleanBody = js.native
}
object EnumBooleanBody {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.EnumBooleanBody")
  @js.native
  val ^ : Type[EnumBooleanBody] = js.native
  
  @scala.inline
  implicit class EnumBooleanBodyMutableBuilder[Self <: EnumBooleanBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplicitType(value: Boolean): Self = StObject.set(x, "explicitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Array[EnumBooleanMemberKind]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: EnumBooleanMemberKind*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.EnumBooleanBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
