package typings.androiduix.global.android

import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.util.DisplayMetrics
import typings.androiduix.androidui.AndroidUI
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.content")
@js.native
object content extends js.Object {
  @js.native
  abstract class Context protected ()
    extends typings.androiduix.android.content.Context {
    def this(androidUI: AndroidUI) = this()
  }
  
  @js.native
  class Intent ()
    extends typings.androiduix.android.content.Intent {
    def this(activityName: String) = this()
  }
  
  @js.native
  object DialogInterface extends js.Object {
    var BUTTON1: Double = js.native
    var BUTTON2: Double = js.native
    var BUTTON3: Double = js.native
    var BUTTON_NEGATIVE: Double = js.native
    var BUTTON_NEUTRAL: Double = js.native
    var BUTTON_POSITIVE: Double = js.native
  }
  
  /* static members */
  @js.native
  object Intent extends js.Object {
    var FLAG_ACTIVITY_CLEAR_TOP: Double = js.native
  }
  
  @js.native
  object res extends js.Object {
    @js.native
    class ColorStateList protected ()
      extends typings.androiduix.android.content.res.ColorStateList {
      def this(states: js.Array[js.Array[Double]], colors: js.Array[Double]) = this()
    }
    
    @js.native
    class Resources ()
      extends typings.androiduix.android.content.res.Resources {
      def this(context: typings.androiduix.android.content.Context) = this()
    }
    
    @js.native
    class TypedArray protected ()
      extends typings.androiduix.android.content.res.TypedArray {
      def this(res: typings.androiduix.android.content.res.Resources, attrMap: Map[String, String]) = this()
    }
    
    /* static members */
    @js.native
    object ColorStateList extends js.Object {
      var EMPTY: js.Any = js.native
      var sCache: js.Any = js.native
      def createFromXml(r: typings.androiduix.android.content.res.Resources, parser: HTMLElement): typings.androiduix.android.content.res.ColorStateList = js.native
      def valueOf(color: Double): typings.androiduix.android.content.res.ColorStateList = js.native
    }
    
    /* static members */
    @js.native
    object Resources extends js.Object {
      var instance: js.Any = js.native
      def _AppBuildImageFileFinder(refString: String): Drawable = js.native
      def _AppBuildValueFinder(refString: String): HTMLElement = js.native
      def _AppBuildXmlFinder(refString: String): HTMLElement = js.native
      /* private */ def from(context: js.Any): js.Any = js.native
      def getDisplayMetrics(): DisplayMetrics = js.native
      def getSystem(): typings.androiduix.android.content.res.Resources = js.native
    }
    
    /* static members */
    @js.native
    object TypedArray extends js.Object {
      def obtain(res: typings.androiduix.android.content.res.Resources, xml: HTMLElement): typings.androiduix.android.content.res.TypedArray = js.native
      def obtain(
        res: typings.androiduix.android.content.res.Resources,
        xml: HTMLElement,
        defStyleAttr: Map[String, String]
      ): typings.androiduix.android.content.res.TypedArray = js.native
    }
    
  }
  
}

