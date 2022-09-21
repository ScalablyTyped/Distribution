package typings.antDesignProUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Row extends StObject {
  
  var children: Any
  
  var row: Any
}
object Row {
  
  inline def apply(children: Any, row: Any): Row = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row]
  }
  
  extension [Self <: Row](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
