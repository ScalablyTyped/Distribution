package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotPERMISSION
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2PermissionValueSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2PermissionValueSpecPermissions
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperHelperMod.SoloHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationHelperPermissionPermissionMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/permission/permission", "Permission")
  @js.native
  open class Permission protected () extends SoloHelper[actionsDotintentDotPERMISSION, GoogleActionsV2PermissionValueSpec] {
    /**
      * @param options Permission options
      * @public
      */
    def this(options: PermissionOptions) = this()
  }
  
  type PermissionArgument = Boolean
  
  trait PermissionOptions extends StObject {
    
    /**
      * Context why the permission is being asked.
      * It's the TTS prompt prefix (action phrase) we ask the user.
      * @public
      */
    var context: js.UndefOr[String] = js.undefined
    
    /**
      * Extra properties to be spread into the value.
      * For advanced usages like used in {@link UpdatePermission}
      * @public
      */
    var extra: js.UndefOr[GoogleActionsV2PermissionValueSpec] = js.undefined
    
    /**
      * Array or string of permissions App supports,
      * each of which comes from {@link GoogleActionsV2PermissionValueSpecPermissions}.
      * @public
      */
    var permissions: GoogleActionsV2PermissionValueSpecPermissions | js.Array[GoogleActionsV2PermissionValueSpecPermissions]
  }
  object PermissionOptions {
    
    inline def apply(
      permissions: GoogleActionsV2PermissionValueSpecPermissions | js.Array[GoogleActionsV2PermissionValueSpecPermissions]
    ): PermissionOptions = {
      val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PermissionOptions] (val x: Self) extends AnyVal {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setExtra(value: GoogleActionsV2PermissionValueSpec): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setPermissions(
        value: GoogleActionsV2PermissionValueSpecPermissions | js.Array[GoogleActionsV2PermissionValueSpecPermissions]
      ): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsVarargs(value: GoogleActionsV2PermissionValueSpecPermissions*): Self = StObject.set(x, "permissions", js.Array(value*))
    }
  }
}
