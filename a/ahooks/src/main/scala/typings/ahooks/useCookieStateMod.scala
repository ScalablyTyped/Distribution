package typings.ahooks

import typings.jsCookie.mod.CookieAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCookieStateMod {
  
  @JSImport("ahooks/lib/useCookieState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(cookieKey: String): js.Tuple2[
    js.UndefOr[String], 
    js.Function2[
      /* newValue */ js.UndefOr[String | (js.Function1[/* prevState */ State, State])], 
      /* newOptions */ js.UndefOr[CookieAttributes], 
      Unit
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(cookieKey.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    js.UndefOr[String], 
    js.Function2[
      /* newValue */ js.UndefOr[String | (js.Function1[/* prevState */ State, State])], 
      /* newOptions */ js.UndefOr[CookieAttributes], 
      Unit
    ]
  ]]
  inline def default(cookieKey: String, options: Options): js.Tuple2[
    js.UndefOr[String], 
    js.Function2[
      /* newValue */ js.UndefOr[String | (js.Function1[/* prevState */ State, State])], 
      /* newOptions */ js.UndefOr[CookieAttributes], 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cookieKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[String], 
    js.Function2[
      /* newValue */ js.UndefOr[String | (js.Function1[/* prevState */ State, State])], 
      /* newOptions */ js.UndefOr[CookieAttributes], 
      Unit
    ]
  ]]
  
  trait Options
    extends StObject
       with CookieAttributes {
    
    var defaultValue: js.UndefOr[State | js.Function0[State]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDefaultValue(value: State | js.Function0[State]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueFunction0(value: () => State): Self = StObject.set(x, "defaultValue", js.Any.fromFunction0(value))
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    }
  }
  
  type State = js.UndefOr[String]
}
