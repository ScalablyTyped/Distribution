package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdjustOption extends StObject {
  
  /**
    * @title 分组字段
    * @description 该属性只对 'dodge' 类型生效，声明以哪个数据字段为分组依据。
    */
  val dodgeBy: js.UndefOr[String] = js.undefined
  
  /**
    * @title 间距
    * @description 该属性只对 'dodge' 类型生效，取 0 到 1 范围的值（相对于每个柱子宽度），用于控制一个分组中柱子之间的间距。
    * @see ![image](https://gw.alipayobjects.com/mdn/rms_2274c3/afts/img/A*ps3pToOg2nwAAAAAAAAAAABkARQnAQ)
    */
  val marginRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 是否反序
    * @description 该属性只对 'stack' 类型生效，用于控制是否对数据进行反序操作。
    */
  val reverseOrder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 数据调整类型。
    */
  val `type`: AdjustType
}
object AdjustOption {
  
  inline def apply(`type`: AdjustType): AdjustOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustOption]
  }
  
  extension [Self <: AdjustOption](x: Self) {
    
    inline def setDodgeBy(value: String): Self = StObject.set(x, "dodgeBy", value.asInstanceOf[js.Any])
    
    inline def setDodgeByUndefined: Self = StObject.set(x, "dodgeBy", js.undefined)
    
    inline def setMarginRatio(value: Double): Self = StObject.set(x, "marginRatio", value.asInstanceOf[js.Any])
    
    inline def setMarginRatioUndefined: Self = StObject.set(x, "marginRatio", js.undefined)
    
    inline def setReverseOrder(value: Boolean): Self = StObject.set(x, "reverseOrder", value.asInstanceOf[js.Any])
    
    inline def setReverseOrderUndefined: Self = StObject.set(x, "reverseOrder", js.undefined)
    
    inline def setType(value: AdjustType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
