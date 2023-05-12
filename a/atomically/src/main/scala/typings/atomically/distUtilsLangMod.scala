package typings.atomically

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsLangMod {
  
  @JSImport("atomically/dist/utils/lang", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isException(value: Any): /* is node.NodeJS.ErrnoException */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isException")(value.asInstanceOf[js.Any]).asInstanceOf[/* is node.NodeJS.ErrnoException */ Boolean]
  
  inline def isFunction(value: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isString(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isUndefined(value: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
}
