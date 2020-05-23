package typings.antDesignReactNative.multiPickerMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.antDesignReactNative.anon.Context
import typings.antDesignReactNative.anon.OnValueChange
import typings.antDesignReactNative.anon.Readonlydefault
import typings.antDesignReactNative.multiPickerPropsMod.MultiPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/picker/MultiPicker", JSImport.Default)
@js.native
class default protected () extends Context {
  def this(props: Readonlydefault) = this()
  def this(props: MultiPickerProps) = this()
  def this(props: MultiPickerProps, context: js.Any) = this()
}

@JSImport("@ant-design/react-native/lib/picker/MultiPicker", JSImport.Default)
@js.native
object default
  extends Instantiable1[(/* props */ MultiPickerProps) | (/* props */ Readonlydefault), Context]
     with Instantiable2[/* props */ MultiPickerProps, /* context */ js.Any, Context] {
  var contextType: js.UndefOr[typings.react.mod.Context[_]] = js.native
  var defaultProps: OnValueChange = js.native
}

