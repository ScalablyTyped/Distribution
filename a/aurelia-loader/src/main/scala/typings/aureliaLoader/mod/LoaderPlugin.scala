package typings.aureliaLoader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderPlugin extends js.Object {
  /**
    * Fetches the resource.
    * @param address The address of the resource.
    * @return A Promise for the requested resouce.
    */
  def fetch(address: String): js.Promise[_]
}

object LoaderPlugin {
  @scala.inline
  def apply(fetch: String => js.Promise[_]): LoaderPlugin = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
  
    __obj.asInstanceOf[LoaderPlugin]
  }
}

