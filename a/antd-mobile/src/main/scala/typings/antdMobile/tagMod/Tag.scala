package typings.antdMobile.tagMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tag
  extends Component[TagProps, js.Any, js.Any] {
  
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTag(nextProps: TagProps): Unit = js.native
  
  def onClick(): Unit = js.native
  
  def onTagClose(): Unit = js.native
}
