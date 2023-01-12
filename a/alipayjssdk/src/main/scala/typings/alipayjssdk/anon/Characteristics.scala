package typings.alipayjssdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Characteristics extends StObject {
  
  /** 设备特征值列表 */
  var characteristics: js.Array[Properties]
}
object Characteristics {
  
  inline def apply(characteristics: js.Array[Properties]): Characteristics = {
    val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Characteristics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Characteristics] (val x: Self) extends AnyVal {
    
    inline def setCharacteristics(value: js.Array[Properties]): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicsVarargs(value: Properties*): Self = StObject.set(x, "characteristics", js.Array(value*))
  }
}
