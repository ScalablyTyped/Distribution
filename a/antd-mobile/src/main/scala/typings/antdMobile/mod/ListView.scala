package typings.antdMobile.mod

import typings.antdMobile.anon.ListPrefixCls
import typings.antdMobile.anon.TypeofIndexedList
import typings.antdMobile.listViewMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile", "ListView")
@js.native
class ListView () extends default
/* static members */
object ListView {
  
  @JSImport("antd-mobile", "ListView")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile", "ListView.DataSource")
  @js.native
  def DataSource: js.Any = js.native
  inline def DataSource_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataSource")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile", "ListView.IndexedList")
  @js.native
  def IndexedList: TypeofIndexedList = js.native
  inline def IndexedList_=(x: TypeofIndexedList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IndexedList")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile", "ListView.defaultProps")
  @js.native
  def defaultProps: ListPrefixCls = js.native
  inline def defaultProps_=(x: ListPrefixCls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
