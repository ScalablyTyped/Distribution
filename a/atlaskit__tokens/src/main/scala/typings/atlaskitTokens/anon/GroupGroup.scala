package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.Groups
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupGroup[Group /* <: Groups */] extends StObject {
  
  var group: Group
}
object GroupGroup {
  
  inline def apply[Group /* <: Groups */](group: Group): GroupGroup[Group] = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupGroup[Group]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupGroup[?], Group /* <: Groups */] (val x: Self & GroupGroup[Group]) extends AnyVal {
    
    inline def setGroup(value: Group): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
