package typings.antdMobile

import typings.antdMobile.anon.Label
import typings.antdMobile.anon.ListPrefixCls
import typings.antdMobile.anon.TypeofIndexedList
import typings.antdMobile.listViewPropsTypeMod.ListViewPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listViewMod {
  
  @JSImport("antd-mobile/lib/list-view", JSImport.Default)
  @js.native
  class default () extends ListView
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/list-view", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/list-view", "default.DataSource")
    @js.native
    def DataSource: js.Any = js.native
    @scala.inline
    def DataSource_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataSource")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/list-view", "default.IndexedList")
    @js.native
    def IndexedList: TypeofIndexedList = js.native
    @scala.inline
    def IndexedList_=(x: TypeofIndexedList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IndexedList")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/list-view", "default.defaultProps")
    @js.native
    def defaultProps: ListPrefixCls = js.native
    @scala.inline
    def defaultProps_=(x: ListPrefixCls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ListView
    extends Component[ListViewProps, js.Any, js.Any] {
    
    def getInnerViewNode(): js.Any = js.native
    
    var listviewRef: js.Any = js.native
    
    def scrollTo(args: js.Any*): js.Any = js.native
  }
  
  @js.native
  trait ListViewProps extends ListViewPropsType {
    
    var delayActivityIndicator: js.UndefOr[js.Any] = js.native
    
    var delayTime: js.UndefOr[Double] = js.native
    
    var onQuickSearch: js.UndefOr[js.Function2[/* sectionID */ js.Any, /* topId */ js.UndefOr[js.Any], Unit]] = js.native
    
    var quickSearchBarStyle: js.UndefOr[CSSProperties] = js.native
    
    var quickSearchBarTop: js.UndefOr[Label] = js.native
  }
}
