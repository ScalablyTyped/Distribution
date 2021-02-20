package typings.androiduix.global.android

import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.util.DisplayMetrics
import typings.androiduix.androidui.AndroidUI
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object content {
  
  @JSGlobal("android.content.Context")
  @js.native
  abstract class Context protected ()
    extends typings.androiduix.android.content.Context {
    def this(androidUI: AndroidUI) = this()
  }
  
  object DialogInterface {
    
    @JSGlobal("android.content.DialogInterface")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("android.content.DialogInterface.BUTTON1")
    @js.native
    def BUTTON1: Double = js.native
    @scala.inline
    def BUTTON1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON1")(x.asInstanceOf[js.Any])
    
    @JSGlobal("android.content.DialogInterface.BUTTON2")
    @js.native
    def BUTTON2: Double = js.native
    @scala.inline
    def BUTTON2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON2")(x.asInstanceOf[js.Any])
    
    @JSGlobal("android.content.DialogInterface.BUTTON3")
    @js.native
    def BUTTON3: Double = js.native
    @scala.inline
    def BUTTON3_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON3")(x.asInstanceOf[js.Any])
    
    @JSGlobal("android.content.DialogInterface.BUTTON_NEGATIVE")
    @js.native
    def BUTTON_NEGATIVE: Double = js.native
    @scala.inline
    def BUTTON_NEGATIVE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_NEGATIVE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("android.content.DialogInterface.BUTTON_NEUTRAL")
    @js.native
    def BUTTON_NEUTRAL: Double = js.native
    @scala.inline
    def BUTTON_NEUTRAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_NEUTRAL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("android.content.DialogInterface.BUTTON_POSITIVE")
    @js.native
    def BUTTON_POSITIVE: Double = js.native
    @scala.inline
    def BUTTON_POSITIVE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_POSITIVE")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("android.content.Intent")
  @js.native
  class Intent ()
    extends typings.androiduix.android.content.Intent {
    def this(activityName: String) = this()
  }
  object Intent {
    
    @JSGlobal("android.content.Intent")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP")
    @js.native
    def FLAG_ACTIVITY_CLEAR_TOP: Double = js.native
    @scala.inline
    def FLAG_ACTIVITY_CLEAR_TOP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_ACTIVITY_CLEAR_TOP")(x.asInstanceOf[js.Any])
  }
  
  object res {
    
    @JSGlobal("android.content.res.ColorStateList")
    @js.native
    class ColorStateList protected ()
      extends typings.androiduix.android.content.res.ColorStateList {
      def this(states: js.Array[js.Array[Double]], colors: js.Array[Double]) = this()
    }
    object ColorStateList {
      
      @JSGlobal("android.content.res.ColorStateList")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("android.content.res.ColorStateList.EMPTY")
      @js.native
      def EMPTY: js.Any = js.native
      @scala.inline
      def EMPTY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("android.content.res.ColorStateList.createFromXml")
      @js.native
      def createFromXml(r: typings.androiduix.android.content.res.Resources, parser: HTMLElement): typings.androiduix.android.content.res.ColorStateList = js.native
      
      /* static member */
      @JSGlobal("android.content.res.ColorStateList.sCache")
      @js.native
      def sCache: js.Any = js.native
      @scala.inline
      def sCache_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sCache")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("android.content.res.ColorStateList.valueOf")
      @js.native
      def valueOf_(color: Double): typings.androiduix.android.content.res.ColorStateList = js.native
    }
    
    @JSGlobal("android.content.res.Resources")
    @js.native
    class Resources ()
      extends typings.androiduix.android.content.res.Resources {
      def this(context: typings.androiduix.android.content.Context) = this()
    }
    object Resources {
      
      @JSGlobal("android.content.res.Resources")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("android.content.res.Resources._AppBuildImageFileFinder")
      @js.native
      def AppBuildImageFileFinder: js.Function1[/* refString */ String, Drawable] = js.native
      
      @scala.inline
      def AppBuildImageFileFinder_=(x: js.Function1[/* refString */ String, Drawable]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AppBuildImageFileFinder")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("android.content.res.Resources._AppBuildValueFinder")
      @js.native
      def AppBuildValueFinder: js.Function1[/* refString */ String, HTMLElement] = js.native
      
      @scala.inline
      def AppBuildValueFinder_=(x: js.Function1[/* refString */ String, HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AppBuildValueFinder")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("android.content.res.Resources._AppBuildXmlFinder")
      @js.native
      def AppBuildXmlFinder: js.Function1[/* refString */ String, HTMLElement] = js.native
      
      @scala.inline
      def AppBuildXmlFinder_=(x: js.Function1[/* refString */ String, HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AppBuildXmlFinder")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("android.content.res.Resources.from")
      @js.native
      def from(context: js.Any): js.Any = js.native
      
      /* static member */
      @JSGlobal("android.content.res.Resources.getDisplayMetrics")
      @js.native
      def getDisplayMetrics(): DisplayMetrics = js.native
      
      /* static member */
      @JSGlobal("android.content.res.Resources.getSystem")
      @js.native
      def getSystem(): typings.androiduix.android.content.res.Resources = js.native
      
      /* static member */
      @JSGlobal("android.content.res.Resources.instance")
      @js.native
      def instance: js.Any = js.native
      @scala.inline
      def instance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("android.content.res.TypedArray")
    @js.native
    class TypedArray protected ()
      extends typings.androiduix.android.content.res.TypedArray {
      def this(res: typings.androiduix.android.content.res.Resources, attrMap: Map[String, String]) = this()
    }
    object TypedArray {
      
      /* static member */
      @JSGlobal("android.content.res.TypedArray.obtain")
      @js.native
      def obtain(res: typings.androiduix.android.content.res.Resources, xml: HTMLElement): typings.androiduix.android.content.res.TypedArray = js.native
      @JSGlobal("android.content.res.TypedArray.obtain")
      @js.native
      def obtain(
        res: typings.androiduix.android.content.res.Resources,
        xml: HTMLElement,
        defStyleAttr: Map[String, String]
      ): typings.androiduix.android.content.res.TypedArray = js.native
    }
  }
}
