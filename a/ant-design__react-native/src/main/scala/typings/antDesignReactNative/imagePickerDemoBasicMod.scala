package typings.antDesignReactNative

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagePickerDemoBasicMod {
  
  @JSImport("@ant-design/react-native/lib/image-picker/demo/basic", JSImport.Default)
  @js.native
  class default protected () extends ImagePickerExample {
    def this(props: js.Any) = this()
  }
  
  @js.native
  trait ImagePickerExample
    extends Component[js.Any, js.Any, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MImagePickerExample(): js.Promise[Unit] = js.native
    
    def handleFile2Change(files2: js.Any): Unit = js.native
    
    def handleFileChange(files: js.Any): Unit = js.native
    
    def requestCameraPermission(): js.Promise[Unit] = js.native
  }
}
