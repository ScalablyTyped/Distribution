package typings.algoliaRequesterCommon.mod

import typings.algoliaRequesterCommon.ReadonlyPromisevoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destroyable extends js.Object {
  /**
    * Destroy any sockets that are currently in use by the agent.
    *
    * It is usually not necessary to do this. However, if using an agent with keepAlive enabled, then
    * it is best to explicitly shut down the agent when it will no longer be used. Otherwise, sockets
    * may hang open for quite a long time before the server terminates them.
    */
  def destroy(): ReadonlyPromisevoid
}

object Destroyable {
  @scala.inline
  def apply(destroy: () => ReadonlyPromisevoid): Destroyable = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
  
    __obj.asInstanceOf[Destroyable]
  }
}

