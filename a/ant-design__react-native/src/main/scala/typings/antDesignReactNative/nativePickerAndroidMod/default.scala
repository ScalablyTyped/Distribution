package typings.antDesignReactNative.nativePickerAndroidMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.antDesignReactNative.AnonCallBackCallback
import typings.antDesignReactNative.AnonValueAny
import typings.antDesignReactNative.ReadonlyPickerProps
import typings.antDesignReactNative.pickerTypesMod.PickerProps
import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/picker/NativePicker.android", JSImport.Default)
@js.native
class default protected () extends AnonCallBackCallback {
  def this(props: ReadonlyPickerProps) = this()
  def this(props: PickerProps) = this()
  def this(props: PickerProps, context: js.Any) = this()
}

@JSImport("@ant-design/react-native/lib/picker/NativePicker.android", JSImport.Default)
@js.native
object default
  extends Instantiable1[
      (/* props */ PickerProps) | (/* props */ ReadonlyPickerProps), 
      AnonCallBackCallback
    ]
     with Instantiable2[/* props */ PickerProps, /* context */ js.Any, AnonCallBackCallback] {
  var contextType: js.UndefOr[Context[_]] = js.native
  def Item(_props: AnonValueAny): Null = js.native
}

