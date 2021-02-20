package typings.angularCore.anon

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameString extends StObject {
  
  var name: String = js.native
  
  var target: (Window with (/* globalThis */ js.Any)) | Null = js.native
}
object NameString {
  
  @scala.inline
  def apply(name: String): NameString = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameString]
  }
  
  @scala.inline
  implicit class NameStringMutableBuilder[Self <: NameString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Window with (/* globalThis */ js.Any)): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = StObject.set(x, "target", null)
  }
}
