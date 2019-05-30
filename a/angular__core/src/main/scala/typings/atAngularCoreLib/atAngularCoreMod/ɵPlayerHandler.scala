package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ɵPlayerHandler extends js.Object {
  /**
    * Designed to kick off the player at the end of change detection
    */
  def flushPlayers(): scala.Unit = js.native
  /**
    * @param player The player that has been scheduled to run within the application.
    * @param context The context as to where the player was bound to
    */
  def queuePlayer(player: ɵPlayer, context: ComponentInstance | DirectiveInstance): scala.Unit = js.native
  def queuePlayer(player: ɵPlayer, context: stdLib.HTMLElement): scala.Unit = js.native
}

