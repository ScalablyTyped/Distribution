package typings.antd.libTableInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterDropdownProps extends StObject {
  
  var clearFilters: js.UndefOr[js.Function0[Unit]] = js.native
  
  def confirm(): Unit = js.native
  def confirm(param: FilterConfirmProps): Unit = js.native
  
  var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.native
  
  var prefixCls: String = js.native
  
  var selectedKeys: js.Array[typings.react.mod.Key] = js.native
  
  def setSelectedKeys(selectedKeys: js.Array[typings.react.mod.Key]): Unit = js.native
  
  var visible: Boolean = js.native
}
