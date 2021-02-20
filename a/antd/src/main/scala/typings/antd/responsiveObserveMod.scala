package typings.antd

import typings.antd.sizeContextMod._AvatarSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsiveObserveMod {
  
  object default {
    
    @JSImport("antd/lib/_util/responsiveObserve", "default.dispatch")
    @js.native
    def dispatch(pointMap: ScreenMap): Boolean = js.native
    
    @JSImport("antd/lib/_util/responsiveObserve", "default.register")
    @js.native
    def register(): Unit = js.native
    
    @JSImport("antd/lib/_util/responsiveObserve", "default.subscribe")
    @js.native
    def subscribe(func: SubscribeFunc): Double = js.native
    
    @JSImport("antd/lib/_util/responsiveObserve", "default.unregister")
    @js.native
    def unregister(): Unit = js.native
    
    @JSImport("antd/lib/_util/responsiveObserve", "default.unsubscribe")
    @js.native
    def unsubscribe(token: Double): Unit = js.native
  }
  
  @JSImport("antd/lib/_util/responsiveObserve", "responsiveArray")
  @js.native
  val responsiveArray: js.Array[Breakpoint] = js.native
  
  @JSImport("antd/lib/_util/responsiveObserve", "responsiveMap")
  @js.native
  val responsiveMap: BreakpointMap = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.xxl
    - typings.antd.antdStrings.xl
    - typings.antd.antdStrings.lg
    - typings.antd.antdStrings.md
    - typings.antd.antdStrings.sm
    - typings.antd.antdStrings.xs
  */
  trait Breakpoint extends StObject
  object Breakpoint {
    
    @scala.inline
    def lg: typings.antd.antdStrings.lg = "lg".asInstanceOf[typings.antd.antdStrings.lg]
    
    @scala.inline
    def md: typings.antd.antdStrings.md = "md".asInstanceOf[typings.antd.antdStrings.md]
    
    @scala.inline
    def sm: typings.antd.antdStrings.sm = "sm".asInstanceOf[typings.antd.antdStrings.sm]
    
    @scala.inline
    def xl: typings.antd.antdStrings.xl = "xl".asInstanceOf[typings.antd.antdStrings.xl]
    
    @scala.inline
    def xs: typings.antd.antdStrings.xs = "xs".asInstanceOf[typings.antd.antdStrings.xs]
    
    @scala.inline
    def xxl: typings.antd.antdStrings.xxl = "xxl".asInstanceOf[typings.antd.antdStrings.xxl]
  }
  
  /* Inlined std.Record<antd.antd/lib/_util/responsiveObserve.Breakpoint, string> */
  @js.native
  trait BreakpointMap extends StObject {
    
    var lg: String = js.native
    
    var md: String = js.native
    
    var sm: String = js.native
    
    var xl: String = js.native
    
    var xs: String = js.native
    
    var xxl: String = js.native
  }
  object BreakpointMap {
    
    @scala.inline
    def apply(lg: String, md: String, sm: String, xl: String, xs: String, xxl: String): BreakpointMap = {
      val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any], xxl = xxl.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreakpointMap]
    }
    
    @scala.inline
    implicit class BreakpointMapMutableBuilder[Self <: BreakpointMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLg(value: String): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMd(value: String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSm(value: String): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXl(value: String): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXs(value: String): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXxl(value: String): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Record<antd.antd/lib/_util/responsiveObserve.Breakpoint, boolean>> */
  @js.native
  trait ScreenMap extends StObject {
    
    var lg: js.UndefOr[Boolean] = js.native
    
    var md: js.UndefOr[Boolean] = js.native
    
    var sm: js.UndefOr[Boolean] = js.native
    
    var xl: js.UndefOr[Boolean] = js.native
    
    var xs: js.UndefOr[Boolean] = js.native
    
    var xxl: js.UndefOr[Boolean] = js.native
  }
  object ScreenMap {
    
    @scala.inline
    def apply(): ScreenMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScreenMap]
    }
    
    @scala.inline
    implicit class ScreenMapMutableBuilder[Self <: ScreenMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLg(value: Boolean): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      @scala.inline
      def setMd(value: Boolean): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      @scala.inline
      def setSm(value: Boolean): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      @scala.inline
      def setXl(value: Boolean): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      @scala.inline
      def setXs(value: Boolean): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      @scala.inline
      def setXxl(value: Boolean): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Record<antd.antd/lib/_util/responsiveObserve.Breakpoint, number>> */
  @js.native
  trait ScreenSizeMap extends _AvatarSize {
    
    var lg: js.UndefOr[Double] = js.native
    
    var md: js.UndefOr[Double] = js.native
    
    var sm: js.UndefOr[Double] = js.native
    
    var xl: js.UndefOr[Double] = js.native
    
    var xs: js.UndefOr[Double] = js.native
    
    var xxl: js.UndefOr[Double] = js.native
  }
  object ScreenSizeMap {
    
    @scala.inline
    def apply(): ScreenSizeMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScreenSizeMap]
    }
    
    @scala.inline
    implicit class ScreenSizeMapMutableBuilder[Self <: ScreenSizeMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLg(value: Double): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      @scala.inline
      def setMd(value: Double): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      @scala.inline
      def setSm(value: Double): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      @scala.inline
      def setXl(value: Double): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      @scala.inline
      def setXs(value: Double): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      @scala.inline
      def setXxl(value: Double): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  type SubscribeFunc = js.Function1[/* screens */ ScreenMap, Unit]
}
