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
  
  extension [Self <: GroupGroup[?], Group /* <: Groups */](x: Self & GroupGroup[Group]) {
    
    inline def setGroup(value: Group): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
