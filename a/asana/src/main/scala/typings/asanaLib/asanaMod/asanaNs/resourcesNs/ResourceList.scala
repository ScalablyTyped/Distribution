package typings
package asanaLib.asanaMod.asanaNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceList[T /* <: Resource */] extends js.Object {
  var _dispatcher: asanaLib.Anon_AsanaBaseUrl
  var _response: asanaLib.Anon_Data[T]
  var data: js.Array[T]
}

object ResourceList {
  @scala.inline
  def apply[T /* <: Resource */](_dispatcher: asanaLib.Anon_AsanaBaseUrl, _response: asanaLib.Anon_Data[T], data: js.Array[T]): ResourceList[T] = {
    val __obj = js.Dynamic.literal(_dispatcher = _dispatcher, _response = _response, data = data)
  
    __obj.asInstanceOf[ResourceList[T]]
  }
}

