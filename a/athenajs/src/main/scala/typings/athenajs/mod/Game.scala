package typings.athenajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Game")
@js.native
class Game protected () extends js.Object {
  def this(options: GameOptions) = this()
  var scene: Scene = js.native
  var sound: Boolean = js.native
  def bindEvents(eventList: String): Unit = js.native
  def setScene(scene: Scene): Unit = js.native
  def toggleFullscreen(): Unit = js.native
  def togglePause(): Unit = js.native
  def toggleSound(bool: Boolean): Unit = js.native
  def toggleTileInspector(bool: Boolean): Unit = js.native
}

