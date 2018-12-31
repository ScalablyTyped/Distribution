package typings
package asanaLib.asanaMod.asanaNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceList[T /* <: Resource */] extends js.Object {
  var _dispatcher: asanaLib.Anon_RetryOnRateLimit
  var _response: asanaLib.Anon_Data[T]
  var data: js.Array[T]
}

