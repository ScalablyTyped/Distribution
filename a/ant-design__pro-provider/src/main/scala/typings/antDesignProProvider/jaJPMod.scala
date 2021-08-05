package typings.antDesignProProvider

import typings.antDesignProProvider.anon.Collapsed
import typings.antDesignProProvider.anon.ColumnSetting
import typings.antDesignProProvider.anon.Item
import typings.antDesignProProvider.anon.Total
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jaJPMod {
  
  object default {
    
    @JSImport("@ant-design/pro-provider/lib/locale/ja_JP", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/pro-provider/lib/locale/ja_JP", "default.alert")
    @js.native
    def alert: Item = js.native
    inline def alert_=(x: Item): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alert")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider/lib/locale/ja_JP", "default.moneySymbol")
    @js.native
    def moneySymbol: String = js.native
    inline def moneySymbol_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moneySymbol")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider/lib/locale/ja_JP", "default.pagination")
    @js.native
    def pagination: Total = js.native
    inline def pagination_=(x: Total): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pagination")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider/lib/locale/ja_JP", "default.tableForm")
    @js.native
    def tableForm: Collapsed = js.native
    inline def tableForm_=(x: Collapsed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tableForm")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-provider/lib/locale/ja_JP", "default.tableToolBar")
    @js.native
    def tableToolBar: ColumnSetting = js.native
    inline def tableToolBar_=(x: ColumnSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tableToolBar")(x.asInstanceOf[js.Any])
  }
}
