package typings.aureliaLoader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoaderPlugin extends js.Object {
  /**
    * Fetches the resource.
    * @param address The address of the resource.
    * @return A Promise for the requested resouce.
    */
  def fetch(address: String): js.Promise[_] = js.native
}

object LoaderPlugin {
  @scala.inline
  def apply(fetch: String => js.Promise[_]): LoaderPlugin = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
    __obj.asInstanceOf[LoaderPlugin]
  }
  @scala.inline
  implicit class LoaderPluginOps[Self <: LoaderPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFetch(value: String => js.Promise[_]): Self = this.set("fetch", js.Any.fromFunction1(value))
  }
  
}

