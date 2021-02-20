package typings.adeiraJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@adeira/js", "invariant")
  @js.native
  def invariant(condition: Boolean, format: String, args: js.Any*): Unit = js.native
  
  @JSImport("@adeira/js", "isBrowser")
  @js.native
  def isBrowser(): Boolean = js.native
  
  @JSImport("@adeira/js", "isNumeric")
  @js.native
  def isNumeric(value: js.Any): Boolean = js.native
  
  @JSImport("@adeira/js", "isObject")
  @js.native
  def isObject(value: js.Any): Boolean = js.native
  
  @JSImport("@adeira/js", "isObjectEmpty")
  @js.native
  def isObjectEmpty(value: js.Any): Boolean = js.native
  
  @JSImport("@adeira/js", "nullthrows")
  @js.native
  def nullthrows[T](x: Maybe[T]): T = js.native
  @JSImport("@adeira/js", "nullthrows")
  @js.native
  def nullthrows[T](x: Maybe[T], message: String): T = js.native
  
  @JSImport("@adeira/js", "sprintf")
  @js.native
  def sprintf(format: String, args: js.Any*): String = js.native
  
  @JSImport("@adeira/js", "warning")
  @js.native
  def warning(condition: Boolean, format: String, args: js.Any*): Unit = js.native
  
  type Maybe[T] = js.UndefOr[Null | T]
}
