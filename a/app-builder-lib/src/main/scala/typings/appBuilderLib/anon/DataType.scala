package typings.appBuilderLib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataType extends StObject {
  
  var data: Type
}
object DataType {
  
  inline def apply(data: Type): DataType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataType] (val x: Self) extends AnyVal {
    
    inline def setData(value: Type): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
