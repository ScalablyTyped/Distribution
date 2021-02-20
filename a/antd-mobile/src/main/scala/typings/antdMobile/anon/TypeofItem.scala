package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofItem extends StObject {
  
  /* static member */
  var defaultProps: PartialListItemProps = js.native
}
object TypeofItem {
  
  @scala.inline
  def apply(defaultProps: PartialListItemProps): TypeofItem = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofItem]
  }
  
  @scala.inline
  implicit class TypeofItemMutableBuilder[Self <: TypeofItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialListItemProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
  }
}
