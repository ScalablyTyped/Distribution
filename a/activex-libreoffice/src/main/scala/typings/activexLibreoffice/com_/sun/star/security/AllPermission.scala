package typings.activexLibreoffice.com_.sun.star.security

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link AllPermission} is a permission that implies all other permissions.
  * @since OOo 1.1.2
  */
@js.native
trait AllPermission extends js.Object {
  
  var dummy: Double = js.native
}
object AllPermission {
  
  @scala.inline
  def apply(dummy: Double): AllPermission = {
    val __obj = js.Dynamic.literal(dummy = dummy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllPermission]
  }
  
  @scala.inline
  implicit class AllPermissionOps[Self <: AllPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDummy(value: Double): Self = this.set("dummy", value.asInstanceOf[js.Any])
  }
}
