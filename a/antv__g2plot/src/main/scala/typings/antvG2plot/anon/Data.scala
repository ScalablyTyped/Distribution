package typings.antvG2plot.anon

import typings.antvG2plot.libTypesCommonMod.Region
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  /**
    * @title 数据
    * @description 设置画布具体的数据. 默认基础顶层 data
    */
  val data: js.UndefOr[js.Array[Record[String, Any]]] = js.undefined
  
  /**
    * @title plot view 的布局范围
    * @default "占满全部"
    */
  val region: js.UndefOr[Region] = js.undefined
  
  /**
    * @title 是否为顶层
    * @description 设置为 true 时，几何图形挂在顶层 chart 对象上，而不是子 view 下。此时 region 设置无效，data 继承顶层 data 配置。
    * @default false
    */
  val top: js.UndefOr[Boolean] = js.undefined
}
object Data {
  
  inline def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: js.Array[Record[String, Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
