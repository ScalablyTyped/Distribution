package typings.antDesignProUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColSize extends StObject {
  
  var colSize: Double
  
  var onChange: Any
}
object ColSize {
  
  inline def apply(colSize: Double, onChange: Any): ColSize = {
    val __obj = js.Dynamic.literal(colSize = colSize.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColSize]
  }
  
  extension [Self <: ColSize](x: Self) {
    
    inline def setColSize(value: Double): Self = StObject.set(x, "colSize", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Any): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
