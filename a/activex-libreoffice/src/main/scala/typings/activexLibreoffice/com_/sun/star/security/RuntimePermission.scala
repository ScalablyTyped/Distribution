package typings.activexLibreoffice.com_.sun.star.security

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This permission grants runtime access to some named functionality. A {@link RuntimePermission} contains a name (also referred to as a "target name")
  * but no actions list; you either have the named permission or you don't.
  * @since OOo 1.1.2
  */
@js.native
trait RuntimePermission extends js.Object {
  
  /** name of permission */
  var Name: String = js.native
}
object RuntimePermission {
  
  @scala.inline
  def apply(Name: String): RuntimePermission = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimePermission]
  }
  
  @scala.inline
  implicit class RuntimePermissionOps[Self <: RuntimePermission] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
}
