package typings.appBuilderLib

import typings.appBuilderLib.appBuilderLibBooleans.`false`
import typings.appBuilderLib.appBuilderLibStrings.`7z`
import typings.appBuilderLib.appBuilderLibStrings.admin
import typings.appBuilderLib.appBuilderLibStrings.auto
import typings.appBuilderLib.appBuilderLibStrings.highest
import typings.appBuilderLib.appBuilderLibStrings.user
import typings.appBuilderLib.appBuilderLibStrings.zip
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outTargetsNsisDefinesMod {
  
  trait Defines extends StObject {
    
    var APP_32: js.UndefOr[String] = js.undefined
    
    var APP_32_HASH: js.UndefOr[String] = js.undefined
    
    var APP_32_NAME: js.UndefOr[String] = js.undefined
    
    var APP_64: js.UndefOr[String] = js.undefined
    
    var APP_64_HASH: js.UndefOr[String] = js.undefined
    
    var APP_64_NAME: js.UndefOr[String] = js.undefined
    
    var APP_ARM64: js.UndefOr[String] = js.undefined
    
    var APP_ARM64_HASH: js.UndefOr[String] = js.undefined
    
    var APP_ARM64_NAME: js.UndefOr[String] = js.undefined
    
    var APP_BUILD_DIR: js.UndefOr[String] = js.undefined
    
    var APP_DESCRIPTION: String
    
    var APP_DIR_32: js.UndefOr[String] = js.undefined
    
    var APP_DIR_64: js.UndefOr[String] = js.undefined
    
    var APP_DIR_ARM64: js.UndefOr[String] = js.undefined
    
    var APP_FILENAME: String
    
    var APP_GUID: Any
    
    var APP_ID: String
    
    var APP_INSTALLER_STORE_FILE: js.UndefOr[String] = js.undefined
    
    var APP_PACKAGE_NAME: String
    
    var APP_PACKAGE_STORE_FILE: js.UndefOr[String] = js.undefined
    
    var APP_PRODUCT_FILENAME: js.UndefOr[String] = js.undefined
    
    var BUILD_RESOURCES_DIR: String
    
    var BUILD_UNINSTALLER: js.UndefOr[Null] = js.undefined
    
    var COMPANY_NAME: js.UndefOr[String] = js.undefined
    
    var COMPRESS: js.UndefOr[auto] = js.undefined
    
    var COMPRESSION_METHOD: js.UndefOr[zip | `7z`] = js.undefined
    
    var DELETE_APP_DATA_ON_UNINSTALL: js.UndefOr[Null] = js.undefined
    
    var DISPLAY_LANG_SELECTOR: js.UndefOr[Null] = js.undefined
    
    var DO_NOT_CREATE_DESKTOP_SHORTCUT: js.UndefOr[Null] = js.undefined
    
    var DO_NOT_CREATE_START_MENU_SHORTCUT: js.UndefOr[Null] = js.undefined
    
    var ENABLE_LOGGING_ELECTRON_BUILDER: js.UndefOr[Null] = js.undefined
    
    var ESTIMATED_SIZE: js.UndefOr[Double] = js.undefined
    
    var HEADER_ICO: js.UndefOr[String] = js.undefined
    
    var HIDE_RUN_AFTER_FINISH: js.UndefOr[Null] = js.undefined
    
    var INSTALL_MODE_PER_ALL_USERS: js.UndefOr[Null] = js.undefined
    
    var INSTALL_MODE_PER_ALL_USERS_REQUIRED: js.UndefOr[Null] = js.undefined
    
    var MENU_FILENAME: js.UndefOr[String] = js.undefined
    
    var MUI_HEADERIMAGE: js.UndefOr[Null] = js.undefined
    
    var MUI_HEADERIMAGE_BITMAP: js.UndefOr[String] = js.undefined
    
    var MUI_HEADERIMAGE_RIGHT: js.UndefOr[Null] = js.undefined
    
    var MUI_ICON: js.UndefOr[Any] = js.undefined
    
    var MUI_UNICON: js.UndefOr[Any] = js.undefined
    
    var MUI_UNWELCOMEFINISHPAGE_BITMAP: js.UndefOr[String] = js.undefined
    
    var MUI_WELCOMEFINISHPAGE_BITMAP: js.UndefOr[String] = js.undefined
    
    var MULTIUSER_INSTALLMODE_ALLOW_ELEVATION: js.UndefOr[Null] = js.undefined
    
    var ONE_CLICK: js.UndefOr[Null] = js.undefined
    
    var PRODUCT_FILENAME: String
    
    var PRODUCT_NAME: String
    
    var PROJECT_DIR: String
    
    var RECREATE_DESKTOP_SHORTCUT: js.UndefOr[Null] = js.undefined
    
    var REQUEST_EXECUTION_LEVEL: js.UndefOr[user | highest | admin] = js.undefined
    
    var RUN_AFTER_FINISH: js.UndefOr[Null] = js.undefined
    
    var SHORTCUT_NAME: js.UndefOr[String] = js.undefined
    
    var SPLASH_IMAGE: js.UndefOr[Any] = js.undefined
    
    var UNINSTALLER_ICON: js.UndefOr[String] = js.undefined
    
    var UNINSTALLER_OUT_FILE: js.UndefOr[PathLike] = js.undefined
    
    var UNINSTALL_APP_KEY: Any
    
    var UNINSTALL_DISPLAY_NAME: js.UndefOr[String] = js.undefined
    
    var UNINSTALL_REGISTRY_KEY_2: js.UndefOr[String] = js.undefined
    
    var UNPACK_DIR_NAME: js.UndefOr[String | `false`] = js.undefined
    
    var VERSION: String
    
    var ZIP_COMPRESSION: js.UndefOr[Null] = js.undefined
    
    var allowToChangeInstallationDirectory: js.UndefOr[Null] = js.undefined
    
    var removeDefaultUninstallWelcomePage: js.UndefOr[Null] = js.undefined
  }
  object Defines {
    
    inline def apply(
      APP_DESCRIPTION: String,
      APP_FILENAME: String,
      APP_GUID: Any,
      APP_ID: String,
      APP_PACKAGE_NAME: String,
      BUILD_RESOURCES_DIR: String,
      PRODUCT_FILENAME: String,
      PRODUCT_NAME: String,
      PROJECT_DIR: String,
      UNINSTALL_APP_KEY: Any,
      VERSION: String
    ): Defines = {
      val __obj = js.Dynamic.literal(APP_DESCRIPTION = APP_DESCRIPTION.asInstanceOf[js.Any], APP_FILENAME = APP_FILENAME.asInstanceOf[js.Any], APP_GUID = APP_GUID.asInstanceOf[js.Any], APP_ID = APP_ID.asInstanceOf[js.Any], APP_PACKAGE_NAME = APP_PACKAGE_NAME.asInstanceOf[js.Any], BUILD_RESOURCES_DIR = BUILD_RESOURCES_DIR.asInstanceOf[js.Any], PRODUCT_FILENAME = PRODUCT_FILENAME.asInstanceOf[js.Any], PRODUCT_NAME = PRODUCT_NAME.asInstanceOf[js.Any], PROJECT_DIR = PROJECT_DIR.asInstanceOf[js.Any], UNINSTALL_APP_KEY = UNINSTALL_APP_KEY.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
      __obj.asInstanceOf[Defines]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Defines] (val x: Self) extends AnyVal {
      
      inline def setAPP_32(value: String): Self = StObject.set(x, "APP_32", value.asInstanceOf[js.Any])
      
      inline def setAPP_32Undefined: Self = StObject.set(x, "APP_32", js.undefined)
      
      inline def setAPP_32_HASH(value: String): Self = StObject.set(x, "APP_32_HASH", value.asInstanceOf[js.Any])
      
      inline def setAPP_32_HASHUndefined: Self = StObject.set(x, "APP_32_HASH", js.undefined)
      
      inline def setAPP_32_NAME(value: String): Self = StObject.set(x, "APP_32_NAME", value.asInstanceOf[js.Any])
      
      inline def setAPP_32_NAMEUndefined: Self = StObject.set(x, "APP_32_NAME", js.undefined)
      
      inline def setAPP_64(value: String): Self = StObject.set(x, "APP_64", value.asInstanceOf[js.Any])
      
      inline def setAPP_64Undefined: Self = StObject.set(x, "APP_64", js.undefined)
      
      inline def setAPP_64_HASH(value: String): Self = StObject.set(x, "APP_64_HASH", value.asInstanceOf[js.Any])
      
      inline def setAPP_64_HASHUndefined: Self = StObject.set(x, "APP_64_HASH", js.undefined)
      
      inline def setAPP_64_NAME(value: String): Self = StObject.set(x, "APP_64_NAME", value.asInstanceOf[js.Any])
      
      inline def setAPP_64_NAMEUndefined: Self = StObject.set(x, "APP_64_NAME", js.undefined)
      
      inline def setAPP_ARM64(value: String): Self = StObject.set(x, "APP_ARM64", value.asInstanceOf[js.Any])
      
      inline def setAPP_ARM64Undefined: Self = StObject.set(x, "APP_ARM64", js.undefined)
      
      inline def setAPP_ARM64_HASH(value: String): Self = StObject.set(x, "APP_ARM64_HASH", value.asInstanceOf[js.Any])
      
      inline def setAPP_ARM64_HASHUndefined: Self = StObject.set(x, "APP_ARM64_HASH", js.undefined)
      
      inline def setAPP_ARM64_NAME(value: String): Self = StObject.set(x, "APP_ARM64_NAME", value.asInstanceOf[js.Any])
      
      inline def setAPP_ARM64_NAMEUndefined: Self = StObject.set(x, "APP_ARM64_NAME", js.undefined)
      
      inline def setAPP_BUILD_DIR(value: String): Self = StObject.set(x, "APP_BUILD_DIR", value.asInstanceOf[js.Any])
      
      inline def setAPP_BUILD_DIRUndefined: Self = StObject.set(x, "APP_BUILD_DIR", js.undefined)
      
      inline def setAPP_DESCRIPTION(value: String): Self = StObject.set(x, "APP_DESCRIPTION", value.asInstanceOf[js.Any])
      
      inline def setAPP_DIR_32(value: String): Self = StObject.set(x, "APP_DIR_32", value.asInstanceOf[js.Any])
      
      inline def setAPP_DIR_32Undefined: Self = StObject.set(x, "APP_DIR_32", js.undefined)
      
      inline def setAPP_DIR_64(value: String): Self = StObject.set(x, "APP_DIR_64", value.asInstanceOf[js.Any])
      
      inline def setAPP_DIR_64Undefined: Self = StObject.set(x, "APP_DIR_64", js.undefined)
      
      inline def setAPP_DIR_ARM64(value: String): Self = StObject.set(x, "APP_DIR_ARM64", value.asInstanceOf[js.Any])
      
      inline def setAPP_DIR_ARM64Undefined: Self = StObject.set(x, "APP_DIR_ARM64", js.undefined)
      
      inline def setAPP_FILENAME(value: String): Self = StObject.set(x, "APP_FILENAME", value.asInstanceOf[js.Any])
      
      inline def setAPP_GUID(value: Any): Self = StObject.set(x, "APP_GUID", value.asInstanceOf[js.Any])
      
      inline def setAPP_ID(value: String): Self = StObject.set(x, "APP_ID", value.asInstanceOf[js.Any])
      
      inline def setAPP_INSTALLER_STORE_FILE(value: String): Self = StObject.set(x, "APP_INSTALLER_STORE_FILE", value.asInstanceOf[js.Any])
      
      inline def setAPP_INSTALLER_STORE_FILEUndefined: Self = StObject.set(x, "APP_INSTALLER_STORE_FILE", js.undefined)
      
      inline def setAPP_PACKAGE_NAME(value: String): Self = StObject.set(x, "APP_PACKAGE_NAME", value.asInstanceOf[js.Any])
      
      inline def setAPP_PACKAGE_STORE_FILE(value: String): Self = StObject.set(x, "APP_PACKAGE_STORE_FILE", value.asInstanceOf[js.Any])
      
      inline def setAPP_PACKAGE_STORE_FILEUndefined: Self = StObject.set(x, "APP_PACKAGE_STORE_FILE", js.undefined)
      
      inline def setAPP_PRODUCT_FILENAME(value: String): Self = StObject.set(x, "APP_PRODUCT_FILENAME", value.asInstanceOf[js.Any])
      
      inline def setAPP_PRODUCT_FILENAMEUndefined: Self = StObject.set(x, "APP_PRODUCT_FILENAME", js.undefined)
      
      inline def setBUILD_RESOURCES_DIR(value: String): Self = StObject.set(x, "BUILD_RESOURCES_DIR", value.asInstanceOf[js.Any])
      
      inline def setCOMPANY_NAME(value: String): Self = StObject.set(x, "COMPANY_NAME", value.asInstanceOf[js.Any])
      
      inline def setCOMPANY_NAMEUndefined: Self = StObject.set(x, "COMPANY_NAME", js.undefined)
      
      inline def setCOMPRESS(value: auto): Self = StObject.set(x, "COMPRESS", value.asInstanceOf[js.Any])
      
      inline def setCOMPRESSION_METHOD(value: zip | `7z`): Self = StObject.set(x, "COMPRESSION_METHOD", value.asInstanceOf[js.Any])
      
      inline def setCOMPRESSION_METHODUndefined: Self = StObject.set(x, "COMPRESSION_METHOD", js.undefined)
      
      inline def setCOMPRESSUndefined: Self = StObject.set(x, "COMPRESS", js.undefined)
      
      inline def setESTIMATED_SIZE(value: Double): Self = StObject.set(x, "ESTIMATED_SIZE", value.asInstanceOf[js.Any])
      
      inline def setESTIMATED_SIZEUndefined: Self = StObject.set(x, "ESTIMATED_SIZE", js.undefined)
      
      inline def setHEADER_ICO(value: String): Self = StObject.set(x, "HEADER_ICO", value.asInstanceOf[js.Any])
      
      inline def setHEADER_ICOUndefined: Self = StObject.set(x, "HEADER_ICO", js.undefined)
      
      inline def setMENU_FILENAME(value: String): Self = StObject.set(x, "MENU_FILENAME", value.asInstanceOf[js.Any])
      
      inline def setMENU_FILENAMEUndefined: Self = StObject.set(x, "MENU_FILENAME", js.undefined)
      
      inline def setMUI_HEADERIMAGE_BITMAP(value: String): Self = StObject.set(x, "MUI_HEADERIMAGE_BITMAP", value.asInstanceOf[js.Any])
      
      inline def setMUI_HEADERIMAGE_BITMAPUndefined: Self = StObject.set(x, "MUI_HEADERIMAGE_BITMAP", js.undefined)
      
      inline def setMUI_ICON(value: Any): Self = StObject.set(x, "MUI_ICON", value.asInstanceOf[js.Any])
      
      inline def setMUI_ICONUndefined: Self = StObject.set(x, "MUI_ICON", js.undefined)
      
      inline def setMUI_UNICON(value: Any): Self = StObject.set(x, "MUI_UNICON", value.asInstanceOf[js.Any])
      
      inline def setMUI_UNICONUndefined: Self = StObject.set(x, "MUI_UNICON", js.undefined)
      
      inline def setMUI_UNWELCOMEFINISHPAGE_BITMAP(value: String): Self = StObject.set(x, "MUI_UNWELCOMEFINISHPAGE_BITMAP", value.asInstanceOf[js.Any])
      
      inline def setMUI_UNWELCOMEFINISHPAGE_BITMAPUndefined: Self = StObject.set(x, "MUI_UNWELCOMEFINISHPAGE_BITMAP", js.undefined)
      
      inline def setMUI_WELCOMEFINISHPAGE_BITMAP(value: String): Self = StObject.set(x, "MUI_WELCOMEFINISHPAGE_BITMAP", value.asInstanceOf[js.Any])
      
      inline def setMUI_WELCOMEFINISHPAGE_BITMAPUndefined: Self = StObject.set(x, "MUI_WELCOMEFINISHPAGE_BITMAP", js.undefined)
      
      inline def setPRODUCT_FILENAME(value: String): Self = StObject.set(x, "PRODUCT_FILENAME", value.asInstanceOf[js.Any])
      
      inline def setPRODUCT_NAME(value: String): Self = StObject.set(x, "PRODUCT_NAME", value.asInstanceOf[js.Any])
      
      inline def setPROJECT_DIR(value: String): Self = StObject.set(x, "PROJECT_DIR", value.asInstanceOf[js.Any])
      
      inline def setREQUEST_EXECUTION_LEVEL(value: user | highest | admin): Self = StObject.set(x, "REQUEST_EXECUTION_LEVEL", value.asInstanceOf[js.Any])
      
      inline def setREQUEST_EXECUTION_LEVELUndefined: Self = StObject.set(x, "REQUEST_EXECUTION_LEVEL", js.undefined)
      
      inline def setSHORTCUT_NAME(value: String): Self = StObject.set(x, "SHORTCUT_NAME", value.asInstanceOf[js.Any])
      
      inline def setSHORTCUT_NAMEUndefined: Self = StObject.set(x, "SHORTCUT_NAME", js.undefined)
      
      inline def setSPLASH_IMAGE(value: Any): Self = StObject.set(x, "SPLASH_IMAGE", value.asInstanceOf[js.Any])
      
      inline def setSPLASH_IMAGEUndefined: Self = StObject.set(x, "SPLASH_IMAGE", js.undefined)
      
      inline def setUNINSTALLER_ICON(value: String): Self = StObject.set(x, "UNINSTALLER_ICON", value.asInstanceOf[js.Any])
      
      inline def setUNINSTALLER_ICONUndefined: Self = StObject.set(x, "UNINSTALLER_ICON", js.undefined)
      
      inline def setUNINSTALLER_OUT_FILE(value: PathLike): Self = StObject.set(x, "UNINSTALLER_OUT_FILE", value.asInstanceOf[js.Any])
      
      inline def setUNINSTALLER_OUT_FILEUndefined: Self = StObject.set(x, "UNINSTALLER_OUT_FILE", js.undefined)
      
      inline def setUNINSTALL_APP_KEY(value: Any): Self = StObject.set(x, "UNINSTALL_APP_KEY", value.asInstanceOf[js.Any])
      
      inline def setUNINSTALL_DISPLAY_NAME(value: String): Self = StObject.set(x, "UNINSTALL_DISPLAY_NAME", value.asInstanceOf[js.Any])
      
      inline def setUNINSTALL_DISPLAY_NAMEUndefined: Self = StObject.set(x, "UNINSTALL_DISPLAY_NAME", js.undefined)
      
      inline def setUNINSTALL_REGISTRY_KEY_2(value: String): Self = StObject.set(x, "UNINSTALL_REGISTRY_KEY_2", value.asInstanceOf[js.Any])
      
      inline def setUNINSTALL_REGISTRY_KEY_2Undefined: Self = StObject.set(x, "UNINSTALL_REGISTRY_KEY_2", js.undefined)
      
      inline def setUNPACK_DIR_NAME(value: String | `false`): Self = StObject.set(x, "UNPACK_DIR_NAME", value.asInstanceOf[js.Any])
      
      inline def setUNPACK_DIR_NAMEUndefined: Self = StObject.set(x, "UNPACK_DIR_NAME", js.undefined)
      
      inline def setVERSION(value: String): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
    }
  }
}
