package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Checkbox
import typings.antDesignReactNative.libStyleMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioStyleMod {
  
  @JSImport("@ant-design/react-native/lib/radio/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: Theme): Checkbox = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[Checkbox]
}
