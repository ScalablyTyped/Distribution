package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixedValue extends StObject {
  
  /**
    * @title 节点的值
    * @description 不传则节点大小有来源求和决定
    */
  val fixedValue: js.UndefOr[Double] = js.undefined
  
  /**
    * @title id
    * @description 唯一即可，一般可以直接等于 name
    */
  val id: String
  
  /**
    * @title 节点的名称
    * @description 用于 UI 上的现实
    */
  val name: String
}
object FixedValue {
  
  inline def apply(id: String, name: String): FixedValue = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedValue]
  }
  
  extension [Self <: FixedValue](x: Self) {
    
    inline def setFixedValue(value: Double): Self = StObject.set(x, "fixedValue", value.asInstanceOf[js.Any])
    
    inline def setFixedValueUndefined: Self = StObject.set(x, "fixedValue", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
