package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipItem extends StObject {
  
  /**
    * @title tooltip item 中颜色
    */
  val color: String
  
  /**
    * @title 原始数据
    */
  val data: Datum
  
  /**
    * @title 映射之后的数据
    */
  val mappingData: Datum
  
  /**
    * @title tooltip item 中图标类型
    */
  val marker: String
  
  /**
    * @title tooltip item 中名称
    */
  val name: String
  
  /**
    * @title tooltip item 中值
    */
  val value: String | Double
}
object TooltipItem {
  
  inline def apply(
    color: String,
    data: Datum,
    mappingData: Datum,
    marker: String,
    name: String,
    value: String | Double
  ): TooltipItem = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], mappingData = mappingData.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipItem]
  }
  
  extension [Self <: TooltipItem](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setData(value: Datum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMappingData(value: Datum): Self = StObject.set(x, "mappingData", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
