package typings.androiduix.java_.util

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayList[T] extends List[T] {
  
  def addAll(index: Double, list: ArrayList[T]): js.Any = js.native
  def addAll(list: ArrayList[T]): js.Any = js.native
  
  var array: js.Array[T] = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[js.Function0[IterableIterator[T]]] = js.native
  
  def removeAll(list: ArrayList[T]): Boolean = js.native
  
  def toArray(): js.Array[T] = js.native
}
