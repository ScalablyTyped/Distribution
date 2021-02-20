package typings.androiduix.global.android.view

import typings.androiduix.android.content.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menu {
  
  @JSGlobal("android.view.menu.MenuPopupHelper")
  @js.native
  class MenuPopupHelper protected ()
    extends typings.androiduix.android.view.menu.MenuPopupHelper {
    def this(context: Context, menu: typings.androiduix.android.view.Menu_) = this()
    def this(
      context: Context,
      menu: typings.androiduix.android.view.Menu_,
      anchorView: typings.androiduix.android.view.View
    ) = this()
  }
  object MenuPopupHelper {
    
    @JSGlobal("android.view.menu.MenuPopupHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.view.menu.MenuPopupHelper.ITEM_LAYOUT")
    @js.native
    def ITEM_LAYOUT: String = js.native
    @scala.inline
    def ITEM_LAYOUT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ITEM_LAYOUT")(x.asInstanceOf[js.Any])
    
    @JSGlobal("android.view.menu.MenuPopupHelper.MenuAdapter")
    @js.native
    class MenuAdapter protected ()
      extends typings.androiduix.android.view.menu.MenuPopupHelper.MenuAdapter {
      def this(
        menu: typings.androiduix.android.view.Menu_,
        arg: typings.androiduix.android.view.menu.MenuPopupHelper
      ) = this()
    }
    
    /* static member */
    @JSGlobal("android.view.menu.MenuPopupHelper.TAG")
    @js.native
    def TAG: js.Any = js.native
    @scala.inline
    def TAG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAG")(x.asInstanceOf[js.Any])
  }
}
