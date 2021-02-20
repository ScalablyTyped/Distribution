package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionPage extends Page {
  
  var permissions: js.Array[Permission] = js.native
}
object PermissionPage {
  
  @scala.inline
  def apply(length: Double, limit: Double, permissions: js.Array[Permission], start: Double, total: Double): PermissionPage = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionPage]
  }
  
  @scala.inline
  implicit class PermissionPageMutableBuilder[Self <: PermissionPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissions(value: js.Array[Permission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
