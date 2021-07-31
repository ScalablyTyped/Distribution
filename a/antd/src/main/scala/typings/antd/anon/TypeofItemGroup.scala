package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofItemGroup extends StObject {
  
  /* static member */
  val defaultProps: TypeofdefaultProps
  
  /* static member */
  var isMenuItemGroup: Boolean
}
object TypeofItemGroup {
  
  @scala.inline
  def apply(defaultProps: TypeofdefaultProps, isMenuItemGroup: Boolean): TypeofItemGroup = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any], isMenuItemGroup = isMenuItemGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofItemGroup]
  }
  
  @scala.inline
  implicit class TypeofItemGroupMutableBuilder[Self <: TypeofItemGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: TypeofdefaultProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMenuItemGroup(value: Boolean): Self = StObject.set(x, "isMenuItemGroup", value.asInstanceOf[js.Any])
  }
}
