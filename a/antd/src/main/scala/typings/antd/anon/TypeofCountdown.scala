package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCountdown extends StObject {
  
  /* static member */
  var defaultProps: PartialCountdownProps
}
object TypeofCountdown {
  
  inline def apply(defaultProps: PartialCountdownProps): TypeofCountdown = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCountdown]
  }
  
  extension [Self <: TypeofCountdown](x: Self) {
    
    inline def setDefaultProps(value: PartialCountdownProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
  }
}
