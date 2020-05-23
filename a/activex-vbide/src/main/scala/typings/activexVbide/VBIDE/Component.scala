package typings.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component extends js.Object {
  val Application: typings.activexVbide.VBIDE.Application = js.native
  var IsDirty: Boolean = js.native
  var Name: String = js.native
  @JSName("Parent")
  val Parent_Original: Components = js.native
  @JSName("VBIDE.Component_typekey")
  var VBIDEDotComponent_typekey: Component = js.native
  def Parent(index: js.Any): Component = js.native
}

