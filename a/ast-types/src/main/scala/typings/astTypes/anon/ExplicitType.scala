package typings.astTypes.anon

import typings.astTypes.kindsMod.EnumBooleanMemberKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExplicitType extends StObject {
  
  var explicitType: Boolean = js.native
  
  var members: js.Array[EnumBooleanMemberKind] = js.native
}
object ExplicitType {
  
  @scala.inline
  def apply(explicitType: Boolean, members: js.Array[EnumBooleanMemberKind]): ExplicitType = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplicitType]
  }
  
  @scala.inline
  implicit class ExplicitTypeMutableBuilder[Self <: ExplicitType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplicitType(value: Boolean): Self = StObject.set(x, "explicitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Array[EnumBooleanMemberKind]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: EnumBooleanMemberKind*): Self = StObject.set(x, "members", js.Array(value :_*))
  }
}
