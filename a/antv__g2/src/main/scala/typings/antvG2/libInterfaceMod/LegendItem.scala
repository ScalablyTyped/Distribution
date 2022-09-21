package typings.antvG2.libInterfaceMod

import typings.antvG2.anon.namestringvaluestringMark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendItem extends StObject {
  
  /**
    * 唯一值，用于动画或者查找
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * @title 图形标记
    */
  var marker: js.UndefOr[
    MarkerCfg | (js.Function3[/* name */ String, /* index */ Double, /* item */ namestringvaluestringMark, MarkerCfg])
  ] = js.undefined
  
  /**
    * @title 名称
    */
  var name: String
  
  /**
    * @title 初始是否处于未激活状态
    */
  var unchecked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 值
    */
  var value: Any
}
object LegendItem {
  
  inline def apply(name: String, value: Any): LegendItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendItem]
  }
  
  extension [Self <: LegendItem](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMarker(
      value: MarkerCfg | (js.Function3[/* name */ String, /* index */ Double, /* item */ namestringvaluestringMark, MarkerCfg])
    ): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerFunction3(value: (/* name */ String, /* index */ Double, /* item */ namestringvaluestringMark) => MarkerCfg): Self = StObject.set(x, "marker", js.Any.fromFunction3(value))
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUnchecked(value: Boolean): Self = StObject.set(x, "unchecked", value.asInstanceOf[js.Any])
    
    inline def setUncheckedUndefined: Self = StObject.set(x, "unchecked", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
