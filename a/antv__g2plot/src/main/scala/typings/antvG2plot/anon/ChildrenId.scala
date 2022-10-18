package typings.antvG2plot.anon

import typings.antvG2plot.libTypesCommonMod.Datum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenId extends StObject {
  
  var children: typings.antvG2plot.libTypesCommonMod.Data
  
  var id: String
  
  var name: String
}
object ChildrenId {
  
  inline def apply(children: typings.antvG2plot.libTypesCommonMod.Data, id: String, name: String): ChildrenId = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenId]
  }
  
  extension [Self <: ChildrenId](x: Self) {
    
    inline def setChildren(value: typings.antvG2plot.libTypesCommonMod.Data): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: Datum*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
