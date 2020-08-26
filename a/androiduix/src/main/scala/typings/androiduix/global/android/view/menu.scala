package typings.androiduix.global.android.view

import typings.androiduix.android.content.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.menu")
@js.native
object menu extends js.Object {
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
  
  /* static members */
  @js.native
  object MenuPopupHelper extends js.Object {
    @js.native
    class MenuAdapter protected ()
      extends typings.androiduix.android.view.menu.MenuPopupHelper.MenuAdapter {
      def this(
        menu: typings.androiduix.android.view.Menu_,
        arg: typings.androiduix.android.view.menu.MenuPopupHelper
      ) = this()
    }
    
    var ITEM_LAYOUT: String = js.native
    var TAG: js.Any = js.native
  }
  
}

