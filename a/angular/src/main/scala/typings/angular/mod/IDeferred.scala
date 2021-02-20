package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeferred[T] extends StObject {
  
  def notify(state: js.Any): Unit = js.native
  
  var promise: IPromise[T] = js.native
  
  def reject(): Unit = js.native
  def reject(reason: js.Any): Unit = js.native
  
  def resolve(): Unit = js.native
  def resolve(value: T): Unit = js.native
  def resolve(value: IPromise[T]): Unit = js.native
}
