package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofItem extends StObject {
  
  /* static member */
  var defaultProps: PartialListItemProps
}
object TypeofItem {
  
  inline def apply(defaultProps: PartialListItemProps): TypeofItem = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofItem]
  }
  
  extension [Self <: TypeofItem](x: Self) {
    
    inline def setDefaultProps(value: PartialListItemProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
  }
}
