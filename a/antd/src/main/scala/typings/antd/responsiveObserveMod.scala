package typings.antd

import typings.antd.sizeContextMod._AvatarSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsiveObserveMod {
  
  object default {
    
    @JSImport("antd/lib/_util/responsiveObserve", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def dispatch(pointMap: ScreenMap): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(pointMap.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
    
    inline def subscribe(func: SubscribeFunc): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(func.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def unregister(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")().asInstanceOf[Unit]
    
    inline def unsubscribe(token: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unsubscribe")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
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
    
    inline def lg: typings.antd.antdStrings.lg = "lg".asInstanceOf[typings.antd.antdStrings.lg]
    
    inline def md: typings.antd.antdStrings.md = "md".asInstanceOf[typings.antd.antdStrings.md]
    
    inline def sm: typings.antd.antdStrings.sm = "sm".asInstanceOf[typings.antd.antdStrings.sm]
    
    inline def xl: typings.antd.antdStrings.xl = "xl".asInstanceOf[typings.antd.antdStrings.xl]
    
    inline def xs: typings.antd.antdStrings.xs = "xs".asInstanceOf[typings.antd.antdStrings.xs]
    
    inline def xxl: typings.antd.antdStrings.xxl = "xxl".asInstanceOf[typings.antd.antdStrings.xxl]
  }
  
  /* Inlined std.Record<antd.antd/lib/_util/responsiveObserve.Breakpoint, string> */
  trait BreakpointMap extends StObject {
    
    var lg: String
    
    var md: String
    
    var sm: String
    
    var xl: String
    
    var xs: String
    
    var xxl: String
  }
  object BreakpointMap {
    
    inline def apply(lg: String, md: String, sm: String, xl: String, xs: String, xxl: String): BreakpointMap = {
      val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any], xxl = xxl.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreakpointMap]
    }
    
    extension [Self <: BreakpointMap](x: Self) {
      
      inline def setLg(value: String): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setMd(value: String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setSm(value: String): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setXl(value: String): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXs(value: String): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXxl(value: String): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Record<antd.antd/lib/_util/responsiveObserve.Breakpoint, boolean>> */
  trait ScreenMap extends StObject {
    
    var lg: js.UndefOr[Boolean] = js.undefined
    
    var md: js.UndefOr[Boolean] = js.undefined
    
    var sm: js.UndefOr[Boolean] = js.undefined
    
    var xl: js.UndefOr[Boolean] = js.undefined
    
    var xs: js.UndefOr[Boolean] = js.undefined
    
    var xxl: js.UndefOr[Boolean] = js.undefined
  }
  object ScreenMap {
    
    inline def apply(): ScreenMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScreenMap]
    }
    
    extension [Self <: ScreenMap](x: Self) {
      
      inline def setLg(value: Boolean): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      inline def setMd(value: Boolean): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      inline def setSm(value: Boolean): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      inline def setXl(value: Boolean): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      inline def setXs(value: Boolean): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      inline def setXxl(value: Boolean): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      inline def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Record<antd.antd/lib/_util/responsiveObserve.Breakpoint, number>> */
  trait ScreenSizeMap
    extends StObject
       with _AvatarSize {
    
    var lg: js.UndefOr[Double] = js.undefined
    
    var md: js.UndefOr[Double] = js.undefined
    
    var sm: js.UndefOr[Double] = js.undefined
    
    var xl: js.UndefOr[Double] = js.undefined
    
    var xs: js.UndefOr[Double] = js.undefined
    
    var xxl: js.UndefOr[Double] = js.undefined
  }
  object ScreenSizeMap {
    
    inline def apply(): ScreenSizeMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScreenSizeMap]
    }
    
    extension [Self <: ScreenSizeMap](x: Self) {
      
      inline def setLg(value: Double): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      inline def setMd(value: Double): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      inline def setSm(value: Double): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      inline def setXl(value: Double): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      inline def setXs(value: Double): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      inline def setXxl(value: Double): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      inline def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  type SubscribeFunc = js.Function1[/* screens */ ScreenMap, Unit]
}
