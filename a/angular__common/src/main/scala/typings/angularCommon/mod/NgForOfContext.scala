package typings.angularCommon.mod

import typings.angularCore.mod.NgIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "NgForOfContext")
@js.native
open class NgForOfContext[T, U /* <: NgIterable[T] */] protected () extends StObject {
  def this($implicit: T, ngForOf: U, index: Double, count: Double) = this()
  
  @JSName("$implicit")
  var $implicit: T = js.native
  
  var count: Double = js.native
  
  def even: Boolean = js.native
  
  def first: Boolean = js.native
  
  var index: Double = js.native
  
  def last: Boolean = js.native
  
  var ngForOf: U = js.native
  
  def odd: Boolean = js.native
}
