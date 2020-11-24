package typings.antdMobileRn

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile-rn/lib/image-picker/demo/basic.native", JSImport.Namespace)
@js.native
object imagePickerDemoBasicNativeMod extends js.Object {
  
  @js.native
  trait ImagePickerExample
    extends Component[js.Any, js.Any, js.Any] {
    
    def handleFile2Change(files2: js.Any): Unit = js.native
    
    def handleFileChange(files: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends ImagePickerExample {
    def this(props: js.Any) = this()
  }
}
