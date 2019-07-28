package typings.antdDashMobile.esTagMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag
  extends Component[TagProps, js.Any, js.Any] {
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTag(nextProps: TagProps): Unit = js.native
  def onClick(): Unit = js.native
  def onTagClose(): Unit = js.native
}

