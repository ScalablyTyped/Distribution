package typings.antDesignReactNative.multiPickerMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.antDesignReactNative.anon.ComponentDidCatch
import typings.antDesignReactNative.anon.OnValueChange
import typings.antDesignReactNative.anon.Readonlydefault
import typings.antDesignReactNative.multiPickerPropsMod.MultiPickerProps
import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native/lib/picker/MultiPicker", JSImport.Default)
@js.native
class default protected () extends ComponentDidCatch {
  def this(props: Readonlydefault) = this()
  def this(props: MultiPickerProps) = this()
  def this(props: MultiPickerProps, context: js.Any) = this()
}
@JSImport("@ant-design/react-native/lib/picker/MultiPicker", JSImport.Default)
@js.native
object default
  extends Instantiable1[(/* props */ MultiPickerProps) | (/* props */ Readonlydefault), ComponentDidCatch]
     with Instantiable2[/* props */ MultiPickerProps, /* context */ js.Any, ComponentDidCatch] {
  
  var contextType: js.UndefOr[Context[_]] = js.native
  
  var defaultProps: OnValueChange = js.native
}
