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

/* static members */
@JSImport("antd", "Input")
@js.native
object Input extends js.Object {
  @JSName("Group")
  var Group_Original: reactLib.reactMod.ReactNs.StatelessComponent[antdLib.libInputGroupMod.GroupProps] = js.native
  var Password: antdLib.Anon_DefaultPropsAnonAction = js.native
  var Search: antdLib.Anon_DefaultPropsAnonEnterButton = js.native
  var TextArea: org.scalablytyped.runtime.Instantiable0[antdLib.libInputTextAreaMod.default] = js.native
  var defaultProps: antdLib.Anon_DisabledType = js.native
  var propTypes: antdLib.Anon_AddonAfter = js.native
  def Group(props: reactLib.reactMod.ReactNs.PropsWithChildren[antdLib.libInputGroupMod.GroupProps]): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def Group(
    props: reactLib.reactMod.ReactNs.PropsWithChildren[antdLib.libInputGroupMod.GroupProps],
    context: js.Any
  ): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def getDerivedStateFromProps(nextProps: antdLib.libInputInputMod.InputProps): antdLib.Anon_ValueArray | scala.Null = js.native
}

