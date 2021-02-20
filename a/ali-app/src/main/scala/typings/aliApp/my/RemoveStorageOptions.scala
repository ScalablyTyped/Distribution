package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveStorageOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var key: String = js.native
}
object RemoveStorageOptions {
  
  @scala.inline
  def apply(key: String): RemoveStorageOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveStorageOptions]
  }
  
  @scala.inline
  implicit class RemoveStorageOptionsMutableBuilder[Self <: RemoveStorageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
