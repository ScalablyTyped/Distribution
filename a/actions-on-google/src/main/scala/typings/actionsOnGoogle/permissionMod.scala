package typings.actionsOnGoogle

import typings.actionsOnGoogle.permissionPermissionMod.PermissionOptions
import typings.actionsOnGoogle.updateMod.UpdatePermissionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permissionMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/permission", "Permission")
  @js.native
  open class Permission protected ()
    extends typings.actionsOnGoogle.permissionPermissionMod.Permission {
    /**
      * @param options Permission options
      * @public
      */
    def this(options: PermissionOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/permission", "UpdatePermission")
  @js.native
  open class UpdatePermission protected ()
    extends typings.actionsOnGoogle.updateMod.UpdatePermission {
    /**
      * @param options UpdatePermission options
      * @public
      */
    def this(options: UpdatePermissionOptions) = this()
  }
}
