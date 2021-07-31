package typings.antdMobile

import typings.antdMobile.anon.Label
import typings.antdMobile.anon.ListViewPrefixCls
import typings.antdMobile.listViewPropsTypeMod.ListViewPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexedMod {
  
  @JSImport("antd-mobile/lib/list-view/Indexed", JSImport.Default)
  @js.native
  class default () extends MIndexedList
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/list-view/Indexed", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/list-view/Indexed", "default.defaultProps")
    @js.native
    def defaultProps: ListViewPrefixCls = js.native
    @scala.inline
    def defaultProps_=(x: ListViewPrefixCls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait MIndexedList
    extends Component[MIndexedListProps, js.Any, js.Any] {
    
    var indexedListRef: js.Any = js.native
  }
  
  @js.native
  trait MIndexedListProps
    extends StObject
       with ListViewPropsType {
    
    var delayActivityIndicator: js.UndefOr[ReactNode] = js.native
    
    var delayTime: js.UndefOr[Double] = js.native
    
    var onQuickSearch: js.UndefOr[js.Function2[/* sectionID */ js.Any, /* topId */ js.UndefOr[js.Any], Unit]] = js.native
    
    var quickSearchBarStyle: js.UndefOr[CSSProperties] = js.native
    
    var quickSearchBarTop: js.UndefOr[Label] = js.native
  }
}
