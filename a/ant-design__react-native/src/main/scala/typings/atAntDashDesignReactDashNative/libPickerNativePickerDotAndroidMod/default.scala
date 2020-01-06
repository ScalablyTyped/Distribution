package typings.atAntDashDesignReactDashNative.libPickerNativePickerDotAndroidMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.atAntDashDesignReactDashNative.Anon_CallBackCallback
import typings.atAntDashDesignReactDashNative.Anon_ValueAny
import typings.atAntDashDesignReactDashNative.ReadonlyPickerProps
import typings.atAntDashDesignReactDashNative.libPickerPickerTypesMod.PickerProps
import typings.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/picker/NativePicker.android", JSImport.Default)
@js.native
class default protected () extends Anon_CallBackCallback {
  def this(props: ReadonlyPickerProps) = this()
  def this(props: PickerProps) = this()
  def this(props: PickerProps, context: js.Any) = this()
}

@JSImport("@ant-design/react-native/lib/picker/NativePicker.android", JSImport.Default)
@js.native
object default
  extends Instantiable1[
      (/* props */ PickerProps) | (/* props */ ReadonlyPickerProps), 
      Anon_CallBackCallback
    ]
     with Instantiable2[/* props */ PickerProps, /* context */ js.Any, Anon_CallBackCallback] {
  var contextType: js.UndefOr[Context[_]] = js.native
  def Item(_props: Anon_ValueAny): Null = js.native
}

