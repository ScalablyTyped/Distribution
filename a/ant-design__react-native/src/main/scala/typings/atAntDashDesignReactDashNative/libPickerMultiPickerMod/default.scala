package typings.atAntDashDesignReactDashNative.libPickerMultiPickerMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.atAntDashDesignReactDashNative.Anon_CallBack
import typings.atAntDashDesignReactDashNative.Anon_OnValueChange
import typings.atAntDashDesignReactDashNative.Readonlydefault
import typings.atAntDashDesignReactDashNative.libPickerMultiPickerPropsMod.MultiPickerProps
import typings.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/picker/MultiPicker", JSImport.Default)
@js.native
class default protected () extends Anon_CallBack {
  def this(props: Readonlydefault) = this()
  def this(props: MultiPickerProps) = this()
  def this(props: MultiPickerProps, context: js.Any) = this()
}

@JSImport("@ant-design/react-native/lib/picker/MultiPicker", JSImport.Default)
@js.native
object default
  extends Instantiable2[/* props */ MultiPickerProps, /* context */ js.Any, Anon_CallBack]
     with Instantiable1[(/* props */ MultiPickerProps) | (/* props */ Readonlydefault), Anon_CallBack] {
  var contextType: js.UndefOr[Context[_]] = js.native
  var defaultProps: Anon_OnValueChange = js.native
}

