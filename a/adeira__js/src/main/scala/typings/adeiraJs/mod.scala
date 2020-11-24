package typings.adeiraJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@adeira/js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def invariant(condition: Boolean, format: String, args: js.Any*): Unit = js.native
  
  def isBrowser(): Boolean = js.native
  
  def isNumeric(value: js.Any): Boolean = js.native
  
  def isObject(value: js.Any): Boolean = js.native
  
  def isObjectEmpty(value: js.Any): Boolean = js.native
  
  def nullthrows[T](x: Maybe[T]): T = js.native
  def nullthrows[T](x: Maybe[T], message: String): T = js.native
  
  def sprintf(format: String, args: js.Any*): String = js.native
  
  def warning(condition: Boolean, format: String, args: js.Any*): Unit = js.native
  
  type Maybe[T] = js.UndefOr[Null | T]
}
