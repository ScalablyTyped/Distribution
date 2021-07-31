package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCountdown extends StObject {
  
  /* static member */
  var defaultProps: PartialCountdownProps
}
object TypeofCountdown {
  
  @scala.inline
  def apply(defaultProps: PartialCountdownProps): TypeofCountdown = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCountdown]
  }
  
  @scala.inline
  implicit class TypeofCountdownMutableBuilder[Self <: TypeofCountdown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialCountdownProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
  }
}
