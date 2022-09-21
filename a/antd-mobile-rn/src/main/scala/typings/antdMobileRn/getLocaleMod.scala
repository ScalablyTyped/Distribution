package typings.antdMobileRn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLocaleMod {
  
  @JSImport("antd-mobile-rn/lib/_util/getLocale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getComponentLocale(props: Any, context: Any, componentName: String, getDefaultLocale: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getComponentLocale")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any], getDefaultLocale.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getLocaleCode(context: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleCode")(context.asInstanceOf[js.Any]).asInstanceOf[Any]
}
