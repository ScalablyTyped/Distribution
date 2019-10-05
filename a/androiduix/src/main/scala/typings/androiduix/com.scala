package typings.androiduix

import typings.androiduix.android.support.v4.view.PagerAdapter
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("com")
@js.native
object com extends js.Object {
  @js.native
  object jakewharton extends js.Object {
    @js.native
    object salvage extends js.Object {
      @js.native
      abstract class RecyclingPagerAdapter () extends PagerAdapter {
        var recycleBin: js.Any = js.native
        def getItemViewType(position: Double): Double = js.native
        def getView(position: Double, convertView: View, parent: ViewGroup): View = js.native
        def getViewTypeCount(): Double = js.native
      }
      
      /* static members */
      @js.native
      object RecyclingPagerAdapter extends js.Object {
        var IGNORE_ITEM_VIEW_TYPE: Double = js.native
      }
      
    }
    
  }
  
}

