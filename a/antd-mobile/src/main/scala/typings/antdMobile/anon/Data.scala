package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var MenuSelectContanerPrefixCls: String
  
  var data: js.Array[scala.Nothing]
  
  var level: Double
  
  var multiSelect: Boolean
  
  var multiSelectMenuBtnsCls: String
  
  def onCancel(): Unit
  
  def onChange(): Unit
  
  def onOk(): Unit
  
  var prefixCls: String
  
  var radioPrefixCls: String
  
  var subMenuPrefixCls: String
}
object Data {
  
  inline def apply(
    MenuSelectContanerPrefixCls: String,
    data: js.Array[scala.Nothing],
    level: Double,
    multiSelect: Boolean,
    multiSelectMenuBtnsCls: String,
    onCancel: () => Unit,
    onChange: () => Unit,
    onOk: () => Unit,
    prefixCls: String,
    radioPrefixCls: String,
    subMenuPrefixCls: String
  ): Data = {
    val __obj = js.Dynamic.literal(MenuSelectContanerPrefixCls = MenuSelectContanerPrefixCls.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], multiSelect = multiSelect.asInstanceOf[js.Any], multiSelectMenuBtnsCls = multiSelectMenuBtnsCls.asInstanceOf[js.Any], onCancel = js.Any.fromFunction0(onCancel), onChange = js.Any.fromFunction0(onChange), onOk = js.Any.fromFunction0(onOk), prefixCls = prefixCls.asInstanceOf[js.Any], radioPrefixCls = radioPrefixCls.asInstanceOf[js.Any], subMenuPrefixCls = subMenuPrefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: js.Array[scala.Nothing]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: scala.Nothing*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setMenuSelectContanerPrefixCls(value: String): Self = StObject.set(x, "MenuSelectContanerPrefixCls", value.asInstanceOf[js.Any])
    
    inline def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
    
    inline def setMultiSelectMenuBtnsCls(value: String): Self = StObject.set(x, "multiSelectMenuBtnsCls", value.asInstanceOf[js.Any])
    
    inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setOnOk(value: () => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction0(value))
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setRadioPrefixCls(value: String): Self = StObject.set(x, "radioPrefixCls", value.asInstanceOf[js.Any])
    
    inline def setSubMenuPrefixCls(value: String): Self = StObject.set(x, "subMenuPrefixCls", value.asInstanceOf[js.Any])
  }
}
