package typings.antDesignReactNative.nativePickerAndroidMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.antDesignReactNative.anon.ComponentDidMount
import typings.antDesignReactNative.anon.ReadonlyPickerProps
import typings.antDesignReactNative.anon.ValueAny
import typings.antDesignReactNative.pickerTypesMod.PickerProps
import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native/lib/picker/NativePicker.android", JSImport.Default)
@js.native
class default protected () extends ComponentDidMount {
  def this(props: ReadonlyPickerProps) = this()
  def this(props: PickerProps) = this()
  def this(props: PickerProps, context: js.Any) = this()
}
@JSImport("@ant-design/react-native/lib/picker/NativePicker.android", JSImport.Default)
@js.native
object default
  extends Instantiable1[(/* props */ PickerProps) | (/* props */ ReadonlyPickerProps), ComponentDidMount]
     with Instantiable2[/* props */ PickerProps, /* context */ js.Any, ComponentDidMount] {
  
  def Item(_props: ValueAny): Null = js.native
  
  var contextType: js.UndefOr[Context[_]] = js.native
}
