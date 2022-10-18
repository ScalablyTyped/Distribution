package typings.antdMobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsValidateMod {
  
  @JSImport("antd-mobile/es/utils/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAndroid(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroid")().asInstanceOf[Boolean]
  
  inline def isDate(`val`: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def isDef[T](`val`: T): /* is std.NonNullable<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDef")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.NonNullable<T> */ Boolean]
  
  inline def isIOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIOS")().asInstanceOf[Boolean]
  
  inline def isMobile(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobile")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumeric(`val`: String): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  inline def isNumeric(`val`: Double): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isObject(`val`: Any): /* is std.Record<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Record<any, any> */ Boolean]
  
  inline def isPromise(obj: Any): /* is std.Promise<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<unknown> */ Boolean]
}
