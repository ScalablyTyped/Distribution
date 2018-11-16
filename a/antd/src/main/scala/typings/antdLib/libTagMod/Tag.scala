package typings
package antdLib.libTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag
  extends reactLib.reactMod.Component[TagProps, TagState, js.Any] {
  @JSName("state")
  var state_Tag: antdLib.Anon_Mounted = js.native
  def animationEnd(`_`: java.lang.String, existed: scala.Boolean): scala.Unit = js.native
  def close(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTag(_prevProps: TagProps, prevState: TagState): scala.Unit = js.native
  def handleIconClick(e: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement]): scala.Unit = js.native
  def isPresetColor(): scala.Boolean = js.native
  def isPresetColor(color: java.lang.String): scala.Boolean = js.native
  def show(): scala.Unit = js.native
}

