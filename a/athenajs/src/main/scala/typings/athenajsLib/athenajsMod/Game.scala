package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Game")
@js.native
class Game protected () extends js.Object {
  def this(options: GameOptions) = this()
  var scene: Scene = js.native
  var sound: scala.Boolean = js.native
  def bindEvents(eventList: java.lang.String): scala.Unit = js.native
  def setScene(scene: Scene): scala.Unit = js.native
  def toggleFullscreen(): scala.Unit = js.native
  def togglePause(): scala.Unit = js.native
  def toggleSound(bool: scala.Boolean): scala.Unit = js.native
  def toggleTileInspector(bool: scala.Boolean): scala.Unit = js.native
}

