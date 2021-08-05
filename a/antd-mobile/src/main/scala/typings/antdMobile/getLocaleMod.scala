package typings.antdMobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLocaleMod {
  
  @JSImport("antd-mobile/lib/_util/getLocale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getComponentLocale(props: js.Any, context: js.Any, componentName: String, getDefaultLocale: js.Function0[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getComponentLocale")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any], getDefaultLocale.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getLocaleCode(context: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleCode")(context.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
