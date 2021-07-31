package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraPickerProps extends StObject {
  
  var cancelText: String
  
  var title: String
}
object CameraPickerProps {
  
  @scala.inline
  def apply(cancelText: String, title: String): CameraPickerProps = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraPickerProps]
  }
  
  @scala.inline
  implicit class CameraPickerPropsMutableBuilder[Self <: CameraPickerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
