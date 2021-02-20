package typings.autolinker

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("autolinker/dist/commonjs/utils", "defaults")
  @js.native
  def defaults(dest: js.Any, src: js.Any): js.Any = js.native
  
  @JSImport("autolinker/dist/commonjs/utils", "ellipsis")
  @js.native
  def ellipsis(str: String, truncateLen: Double): String = js.native
  @JSImport("autolinker/dist/commonjs/utils", "ellipsis")
  @js.native
  def ellipsis(str: String, truncateLen: Double, ellipsisChars: String): String = js.native
  
  @JSImport("autolinker/dist/commonjs/utils", "indexOf")
  @js.native
  def indexOf[T](arr: js.Array[T], element: T): Double = js.native
  
  @JSImport("autolinker/dist/commonjs/utils", "remove")
  @js.native
  def remove[T](arr: js.Array[T], fn: js.Function1[/* item */ T, Boolean]): Unit = js.native
  
  @JSImport("autolinker/dist/commonjs/utils", "splitAndCapture")
  @js.native
  def splitAndCapture(str: String, splitRegex: RegExp): js.Array[String] = js.native
  
  @JSImport("autolinker/dist/commonjs/utils", "throwUnhandledCaseError")
  @js.native
  def throwUnhandledCaseError(theValue: scala.Nothing): Unit = js.native
}
