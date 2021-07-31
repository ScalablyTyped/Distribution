package typings.autolinker

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("autolinker/dist/commonjs/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def defaults(dest: js.Any, src: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ellipsis(str: String, truncateLen: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(str.asInstanceOf[js.Any], truncateLen.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def ellipsis(str: String, truncateLen: Double, ellipsisChars: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(str.asInstanceOf[js.Any], truncateLen.asInstanceOf[js.Any], ellipsisChars.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def indexOf[T](arr: js.Array[T], element: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(arr.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def remove[T](arr: js.Array[T], fn: js.Function1[/* item */ T, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def splitAndCapture(str: String, splitRegex: RegExp): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitAndCapture")(str.asInstanceOf[js.Any], splitRegex.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def throwUnhandledCaseError(theValue: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throwUnhandledCaseError")(theValue.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
