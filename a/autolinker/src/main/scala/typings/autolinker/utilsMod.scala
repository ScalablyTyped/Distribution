package typings.autolinker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("autolinker/dist/commonjs/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertNever(theValue: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNever")(theValue.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def defaults(dest: Any, src: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def ellipsis(str: String, truncateLen: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(str.asInstanceOf[js.Any], truncateLen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def ellipsis(str: String, truncateLen: Double, ellipsisChars: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(str.asInstanceOf[js.Any], truncateLen.asInstanceOf[js.Any], ellipsisChars.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isBoolean(value: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def isUndefined(value: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
  inline def remove[T](arr: js.Array[T], item: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeWithPredicate[T](arr: js.Array[T], fn: js.Function1[/* item */ T, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeWithPredicate")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
