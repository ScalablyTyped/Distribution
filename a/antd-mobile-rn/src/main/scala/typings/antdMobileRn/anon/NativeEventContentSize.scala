package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeEventContentSize extends StObject {
  
  var nativeEvent: ContentSize = js.native
}
object NativeEventContentSize {
  
  @scala.inline
  def apply(nativeEvent: ContentSize): NativeEventContentSize = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeEventContentSize]
  }
  
  @scala.inline
  implicit class NativeEventContentSizeMutableBuilder[Self <: NativeEventContentSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNativeEvent(value: ContentSize): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
