package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Info extends StObject {
  
  var error: js.UndefOr[scala.Nothing] = js.native
  
  var info: ComponentStackString = js.native
}
object Info {
  
  @scala.inline
  def apply(info: ComponentStackString): Info = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  @scala.inline
  implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: ComponentStackString): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
