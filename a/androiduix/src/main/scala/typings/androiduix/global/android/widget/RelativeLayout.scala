package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup.MarginLayoutParams
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.RelativeLayout")
@js.native
class RelativeLayout protected ()
  extends typings.androiduix.android.widget.RelativeLayout {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}
/* static members */
@JSGlobal("android.widget.RelativeLayout")
@js.native
object RelativeLayout extends js.Object {
  
  var ABOVE: Double = js.native
  
  var ALIGN_BASELINE: Double = js.native
  
  var ALIGN_BOTTOM: Double = js.native
  
  var ALIGN_END: Double = js.native
  
  var ALIGN_LEFT: Double = js.native
  
  var ALIGN_PARENT_BOTTOM: Double = js.native
  
  var ALIGN_PARENT_END: Double = js.native
  
  var ALIGN_PARENT_LEFT: Double = js.native
  
  var ALIGN_PARENT_RIGHT: Double = js.native
  
  var ALIGN_PARENT_START: Double = js.native
  
  var ALIGN_PARENT_TOP: Double = js.native
  
  var ALIGN_RIGHT: Double = js.native
  
  var ALIGN_START: Double = js.native
  
  var ALIGN_TOP: Double = js.native
  
  var BELOW: Double = js.native
  
  var CENTER_HORIZONTAL: Double = js.native
  
  var CENTER_IN_PARENT: Double = js.native
  
  var CENTER_VERTICAL: Double = js.native
  
  var DEFAULT_WIDTH: js.Any = js.native
  
  var END_OF: Double = js.native
  
  var LEFT_OF: Double = js.native
  
  var RIGHT_OF: Double = js.native
  
  var RULES_HORIZONTAL: js.Any = js.native
  
  var RULES_VERTICAL: js.Any = js.native
  
  var START_OF: Double = js.native
  
  var TRUE: String = js.native
  
  var VERB_COUNT: Double = js.native
  
  /* private */ def centerHorizontal(child: js.Any, params: js.Any, myWidth: js.Any): js.Any = js.native
  
  /* private */ def centerVertical(child: js.Any, params: js.Any, myHeight: js.Any): js.Any = js.native
  
  @js.native
  class DependencyGraph ()
    extends typings.androiduix.android.widget.RelativeLayout.DependencyGraph
  @js.native
  object DependencyGraph extends js.Object {
    
    @js.native
    class Node ()
      extends typings.androiduix.android.widget.RelativeLayout.DependencyGraph.Node
    /* static members */
    @js.native
    object Node extends js.Object {
      
      var POOL_LIMIT: js.Any = js.native
      
      def acquire(view: View): typings.androiduix.android.widget.RelativeLayout.DependencyGraph.Node = js.native
      
      var sPool: js.Any = js.native
    }
  }
  
  @js.native
  class LayoutParams protected ()
    extends typings.androiduix.android.widget.RelativeLayout.LayoutParams {
    def this(source: typings.androiduix.android.view.ViewGroup.LayoutParams) = this()
    def this(source: MarginLayoutParams) = this()
    def this(source: typings.androiduix.android.widget.RelativeLayout.LayoutParams) = this()
    def this(context: Context, attrs: HTMLElement) = this()
    def this(w: Double, h: Double) = this()
  }
}
