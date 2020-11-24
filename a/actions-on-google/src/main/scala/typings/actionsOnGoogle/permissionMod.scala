package typings.actionsOnGoogle

import typings.actionsOnGoogle.permissionPermissionMod.PermissionOptions
import typings.actionsOnGoogle.updateMod.UpdatePermissionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/permission", JSImport.Namespace)
@js.native
object permissionMod extends js.Object {
  
  @js.native
  class Permission protected ()
    extends typings.actionsOnGoogle.permissionPermissionMod.Permission {
    /**
      * @param options Permission options
      * @public
      */
    def this(options: PermissionOptions) = this()
  }
  
  @js.native
  class UpdatePermission protected ()
    extends typings.actionsOnGoogle.updateMod.UpdatePermission {
    /**
      * @param options UpdatePermission options
      * @public
      */
    def this(options: UpdatePermissionOptions) = this()
  }
}
