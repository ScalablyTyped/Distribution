package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends StObject {
  
  var MenuSelectContanerPrefixCls: String = js.native
  
  var data: js.Array[scala.Nothing] = js.native
  
  var level: Double = js.native
  
  var multiSelect: Boolean = js.native
  
  var multiSelectMenuBtnsCls: String = js.native
  
  def onCancel(): Unit = js.native
  
  def onChange(): Unit = js.native
  
  def onOk(): Unit = js.native
  
  var prefixCls: String = js.native
  
  var radioPrefixCls: String = js.native
  
  var subMenuPrefixCls: String = js.native
}
object Data {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[scala.Nothing]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: scala.Nothing*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuSelectContanerPrefixCls(value: String): Self = StObject.set(x, "MenuSelectContanerPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiSelectMenuBtnsCls(value: String): Self = StObject.set(x, "multiSelectMenuBtnsCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnOk(value: () => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadioPrefixCls(value: String): Self = StObject.set(x, "radioPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubMenuPrefixCls(value: String): Self = StObject.set(x, "subMenuPrefixCls", value.asInstanceOf[js.Any])
  }
}
