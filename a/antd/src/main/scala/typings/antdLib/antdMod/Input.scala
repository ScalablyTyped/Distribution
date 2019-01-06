package typings
package antdLib.antdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Input")
@js.native
class Input protected ()
  extends antdLib.libInputMod.default {
  def this(props: antdLib.libInputInputMod.InputProps) = this()
}

@JSImport("antd", "Input")
@js.native
object Input extends js.Object {
  @JSName("Group")
  var Group_Original: reactLib.reactMod.ReactNs.StatelessComponent[antdLib.libInputGroupMod.GroupProps] = js.native
  var Password: org.scalablytyped.runtime.Instantiable0[antdLib.libInputPasswordMod.default] = js.native
  var Search: org.scalablytyped.runtime.Instantiable0[antdLib.libInputSearchMod.default] = js.native
  var TextArea: org.scalablytyped.runtime.Instantiable0[antdLib.libInputTextAreaMod.default] = js.native
  var defaultProps: antdLib.Anon_TypeDisabled = js.native
  var propTypes: antdLib.Anon_OnBlur = js.native
  def Group(props: antdLib.libInputGroupMod.GroupProps with reactLib.Anon_Children): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def Group(props: antdLib.libInputGroupMod.GroupProps with reactLib.Anon_Children, context: js.Any): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def getDerivedStateFromProps(nextProps: antdLib.libInputInputMod.InputProps): antdLib.Anon_ValueString | scala.Null = js.native
}

