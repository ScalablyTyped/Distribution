package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofdefaultProps extends StObject {
  
  var disabled: Boolean = js.native
}
object TypeofdefaultProps {
  
  @scala.inline
  def apply(disabled: Boolean): TypeofdefaultProps = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofdefaultProps]
  }
  
  @scala.inline
  implicit class TypeofdefaultPropsMutableBuilder[Self <: TypeofdefaultProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
  }
}
