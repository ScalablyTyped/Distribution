package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchyLevelUpdate extends StObject {
  
  /**
    * The name of the user hierarchy level. Must not be more than 50 characters.
    */
  var Name: HierarchyLevelName
}
object HierarchyLevelUpdate {
  
  inline def apply(Name: HierarchyLevelName): HierarchyLevelUpdate = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyLevelUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HierarchyLevelUpdate] (val x: Self) extends AnyVal {
    
    inline def setName(value: HierarchyLevelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
