package typings.angularCore.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ɵPlayerHandler extends StObject {
  
  /**
    * Designed to kick off the player at the end of change detection
    */
  def flushPlayers(): Unit = js.native
  
  /**
    * @param player The player that has been scheduled to run within the application.
    * @param context The context as to where the player was bound to
    */
  def queuePlayer(player: ɵPlayer, context: ComponentInstance | DirectiveInstance): Unit = js.native
  def queuePlayer(player: ɵPlayer, context: HTMLElement): Unit = js.native
}
