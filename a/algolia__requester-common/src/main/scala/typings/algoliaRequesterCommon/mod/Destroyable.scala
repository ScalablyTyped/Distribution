package typings.algoliaRequesterCommon.mod

import typings.algoliaRequesterCommon.anon.ReadonlyPromisevoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Destroyable extends js.Object {
  /**
    * Destroy any sockets that are currently in use by the agent.
    *
    * It is usually not necessary to do this. However, if using an agent with keepAlive enabled, then
    * it is best to explicitly shut down the agent when it will no longer be used. Otherwise, sockets
    * may hang open for quite a long time before the server terminates them.
    */
  def destroy(): ReadonlyPromisevoid = js.native
}

object Destroyable {
  @scala.inline
  def apply(destroy: () => ReadonlyPromisevoid): Destroyable = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[Destroyable]
  }
  @scala.inline
  implicit class DestroyableOps[Self <: Destroyable] (val x: Self) extends AnyVal {
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
    def setDestroy(value: () => ReadonlyPromisevoid): Self = this.set("destroy", js.Any.fromFunction0(value))
  }
  
}

