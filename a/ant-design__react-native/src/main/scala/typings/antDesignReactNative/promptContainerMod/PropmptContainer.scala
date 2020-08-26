package typings.antDesignReactNative.promptContainerMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropmptContainer
  extends Component[PropmptContainerProps, js.Any, js.Any] {
  def onBackAndroid(): Boolean = js.native
  def onChangeText(`type`: String, value: String): Unit = js.native
  def onClose(): Unit = js.native
}

