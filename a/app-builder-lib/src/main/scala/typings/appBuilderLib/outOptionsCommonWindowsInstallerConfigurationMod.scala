package typings.appBuilderLib

import typings.appBuilderLib.appBuilderLibStrings.always
import typings.appBuilderLib.outWinPackagerMod.WinPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outOptionsCommonWindowsInstallerConfigurationMod {
  
  @JSImport("app-builder-lib/out/options/CommonWindowsInstallerConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait DesktopShortcutCreationPolicy extends StObject
  @JSImport("app-builder-lib/out/options/CommonWindowsInstallerConfiguration", "DesktopShortcutCreationPolicy")
  @js.native
  object DesktopShortcutCreationPolicy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DesktopShortcutCreationPolicy & Double] = js.native
    
    @js.native
    sealed trait ALWAYS
      extends StObject
         with DesktopShortcutCreationPolicy
    /* 1 */ val ALWAYS: typings.appBuilderLib.outOptionsCommonWindowsInstallerConfigurationMod.DesktopShortcutCreationPolicy.ALWAYS & Double = js.native
    
    @js.native
    sealed trait FRESH_INSTALL
      extends StObject
         with DesktopShortcutCreationPolicy
    /* 0 */ val FRESH_INSTALL: typings.appBuilderLib.outOptionsCommonWindowsInstallerConfigurationMod.DesktopShortcutCreationPolicy.FRESH_INSTALL & Double = js.native
    
    @js.native
    sealed trait NEVER
      extends StObject
         with DesktopShortcutCreationPolicy
    /* 2 */ val NEVER: typings.appBuilderLib.outOptionsCommonWindowsInstallerConfigurationMod.DesktopShortcutCreationPolicy.NEVER & Double = js.native
  }
  
  inline def getEffectiveOptions(options: CommonWindowsInstallerConfiguration, packager: WinPackager): FinalCommonWindowsInstallerOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("getEffectiveOptions")(options.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[FinalCommonWindowsInstallerOptions]
  
  trait CommonWindowsInstallerConfiguration extends StObject {
    
    /**
      * Whether to create desktop shortcut. Set to `always` if to recreate also on reinstall (even if removed by user).
      * @default true
      */
    val createDesktopShortcut: js.UndefOr[Boolean | always] = js.undefined
    
    /**
      * Whether to create start menu shortcut.
      * @default true
      */
    val createStartMenuShortcut: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to create submenu for start menu shortcut and program files directory. If `true`, company name will be used. Or string value.
      * @default false
      */
    val menuCategory: js.UndefOr[Boolean | String] = js.undefined
    
    val oneClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to install per all users (per-machine).
      * @default false
      */
    val perMachine: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to run the installed application after finish. For assisted installer corresponding checkbox will be removed.
      * @default true
      */
    val runAfterFinish: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name that will be used for all shortcuts. Defaults to the application name.
      */
    val shortcutName: js.UndefOr[String | Null] = js.undefined
  }
  object CommonWindowsInstallerConfiguration {
    
    inline def apply(): CommonWindowsInstallerConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonWindowsInstallerConfiguration]
    }
    
    extension [Self <: CommonWindowsInstallerConfiguration](x: Self) {
      
      inline def setCreateDesktopShortcut(value: Boolean | always): Self = StObject.set(x, "createDesktopShortcut", value.asInstanceOf[js.Any])
      
      inline def setCreateDesktopShortcutUndefined: Self = StObject.set(x, "createDesktopShortcut", js.undefined)
      
      inline def setCreateStartMenuShortcut(value: Boolean): Self = StObject.set(x, "createStartMenuShortcut", value.asInstanceOf[js.Any])
      
      inline def setCreateStartMenuShortcutUndefined: Self = StObject.set(x, "createStartMenuShortcut", js.undefined)
      
      inline def setMenuCategory(value: Boolean | String): Self = StObject.set(x, "menuCategory", value.asInstanceOf[js.Any])
      
      inline def setMenuCategoryUndefined: Self = StObject.set(x, "menuCategory", js.undefined)
      
      inline def setOneClick(value: Boolean): Self = StObject.set(x, "oneClick", value.asInstanceOf[js.Any])
      
      inline def setOneClickUndefined: Self = StObject.set(x, "oneClick", js.undefined)
      
      inline def setPerMachine(value: Boolean): Self = StObject.set(x, "perMachine", value.asInstanceOf[js.Any])
      
      inline def setPerMachineUndefined: Self = StObject.set(x, "perMachine", js.undefined)
      
      inline def setRunAfterFinish(value: Boolean): Self = StObject.set(x, "runAfterFinish", value.asInstanceOf[js.Any])
      
      inline def setRunAfterFinishUndefined: Self = StObject.set(x, "runAfterFinish", js.undefined)
      
      inline def setShortcutName(value: String): Self = StObject.set(x, "shortcutName", value.asInstanceOf[js.Any])
      
      inline def setShortcutNameNull: Self = StObject.set(x, "shortcutName", null)
      
      inline def setShortcutNameUndefined: Self = StObject.set(x, "shortcutName", js.undefined)
    }
  }
  
  trait FinalCommonWindowsInstallerOptions extends StObject {
    
    var isAssisted: Boolean
    
    var isCreateDesktopShortcut: DesktopShortcutCreationPolicy
    
    var isCreateStartMenuShortcut: Boolean
    
    var isPerMachine: Boolean
    
    var menuCategory: String | Null
    
    var shortcutName: String
  }
  object FinalCommonWindowsInstallerOptions {
    
    inline def apply(
      isAssisted: Boolean,
      isCreateDesktopShortcut: DesktopShortcutCreationPolicy,
      isCreateStartMenuShortcut: Boolean,
      isPerMachine: Boolean,
      shortcutName: String
    ): FinalCommonWindowsInstallerOptions = {
      val __obj = js.Dynamic.literal(isAssisted = isAssisted.asInstanceOf[js.Any], isCreateDesktopShortcut = isCreateDesktopShortcut.asInstanceOf[js.Any], isCreateStartMenuShortcut = isCreateStartMenuShortcut.asInstanceOf[js.Any], isPerMachine = isPerMachine.asInstanceOf[js.Any], shortcutName = shortcutName.asInstanceOf[js.Any], menuCategory = null)
      __obj.asInstanceOf[FinalCommonWindowsInstallerOptions]
    }
    
    extension [Self <: FinalCommonWindowsInstallerOptions](x: Self) {
      
      inline def setIsAssisted(value: Boolean): Self = StObject.set(x, "isAssisted", value.asInstanceOf[js.Any])
      
      inline def setIsCreateDesktopShortcut(value: DesktopShortcutCreationPolicy): Self = StObject.set(x, "isCreateDesktopShortcut", value.asInstanceOf[js.Any])
      
      inline def setIsCreateStartMenuShortcut(value: Boolean): Self = StObject.set(x, "isCreateStartMenuShortcut", value.asInstanceOf[js.Any])
      
      inline def setIsPerMachine(value: Boolean): Self = StObject.set(x, "isPerMachine", value.asInstanceOf[js.Any])
      
      inline def setMenuCategory(value: String): Self = StObject.set(x, "menuCategory", value.asInstanceOf[js.Any])
      
      inline def setMenuCategoryNull: Self = StObject.set(x, "menuCategory", null)
      
      inline def setShortcutName(value: String): Self = StObject.set(x, "shortcutName", value.asInstanceOf[js.Any])
    }
  }
}
