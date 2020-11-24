package typings.angularResource.mod.angularAugmentingMod.resource

import typings.angular.mod.IPromise
import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Really just a regular Array object with $promise and $resolve attached to it
  */
@js.native
trait IResourceArray[T] extends Array[T with IResource[T]] {
  
  @JSName("$cancelRequest")
  def $cancelRequest(): Unit = js.native
  
  /** The promise of the original server interaction that created this collection. */
  @JSName("$promise")
  var $promise: IPromise[IResourceArray[T]] = js.native
  
  @JSName("$resolved")
  var $resolved: Boolean = js.native
}
