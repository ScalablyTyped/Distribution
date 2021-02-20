package typings.appBuilderLib

import typings.appBuilderLib.appBuilderLibStrings.always
import typings.appBuilderLib.winPackagerMod.WinPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonWindowsInstallerConfigurationMod {
  
  @js.native
  sealed trait DesktopShortcutCreationPolicy extends StObject
  @JSImport("app-builder-lib/out/options/CommonWindowsInstallerConfiguration", "DesktopShortcutCreationPolicy")
  @js.native
  object DesktopShortcutCreationPolicy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DesktopShortcutCreationPolicy with Double] = js.native
    
    @js.native
    sealed trait ALWAYS extends DesktopShortcutCreationPolicy
    /* 1 */ val ALWAYS: typings.appBuilderLib.commonWindowsInstallerConfigurationMod.DesktopShortcutCreationPolicy.ALWAYS with Double = js.native
    
    @js.native
    sealed trait FRESH_INSTALL extends DesktopShortcutCreationPolicy
    /* 0 */ val FRESH_INSTALL: typings.appBuilderLib.commonWindowsInstallerConfigurationMod.DesktopShortcutCreationPolicy.FRESH_INSTALL with Double = js.native
    
    @js.native
    sealed trait NEVER extends DesktopShortcutCreationPolicy
    /* 2 */ val NEVER: typings.appBuilderLib.commonWindowsInstallerConfigurationMod.DesktopShortcutCreationPolicy.NEVER with Double = js.native
  }
  
  @JSImport("app-builder-lib/out/options/CommonWindowsInstallerConfiguration", "getEffectiveOptions")
  @js.native
  def getEffectiveOptions(options: CommonWindowsInstallerConfiguration, packager: WinPackager): FinalCommonWindowsInstallerOptions = js.native
  
  @js.native
  trait CommonWindowsInstallerConfiguration extends StObject {
    
    /**
      * Whether to create desktop shortcut. Set to `always` if to recreate also on reinstall (even if removed by user).
      * @default true
      */
    val createDesktopShortcut: js.UndefOr[Boolean | always] = js.native
    
    /**
      * Whether to create start menu shortcut.
      * @default true
      */
    val createStartMenuShortcut: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to create submenu for start menu shortcut and program files directory. If `true`, company name will be used. Or string value.
      * @default false
      */
    val menuCategory: js.UndefOr[Boolean | String] = js.native
    
    val oneClick: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to install per all users (per-machine).
      * @default false
      */
    val perMachine: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to run the installed application after finish. For assisted installer corresponding checkbox will be removed.
      * @default true
      */
    val runAfterFinish: js.UndefOr[Boolean] = js.native
    
    /**
      * The name that will be used for all shortcuts. Defaults to the application name.
      */
    val shortcutName: js.UndefOr[String | Null] = js.native
  }
  object CommonWindowsInstallerConfiguration {
    
    @scala.inline
    def apply(): CommonWindowsInstallerConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonWindowsInstallerConfiguration]
    }
    
    @scala.inline
    implicit class CommonWindowsInstallerConfigurationMutableBuilder[Self <: CommonWindowsInstallerConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateDesktopShortcut(value: Boolean | always): Self = StObject.set(x, "createDesktopShortcut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateDesktopShortcutUndefined: Self = StObject.set(x, "createDesktopShortcut", js.undefined)
      
      @scala.inline
      def setCreateStartMenuShortcut(value: Boolean): Self = StObject.set(x, "createStartMenuShortcut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateStartMenuShortcutUndefined: Self = StObject.set(x, "createStartMenuShortcut", js.undefined)
      
      @scala.inline
      def setMenuCategory(value: Boolean | String): Self = StObject.set(x, "menuCategory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuCategoryUndefined: Self = StObject.set(x, "menuCategory", js.undefined)
      
      @scala.inline
      def setOneClick(value: Boolean): Self = StObject.set(x, "oneClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneClickUndefined: Self = StObject.set(x, "oneClick", js.undefined)
      
      @scala.inline
      def setPerMachine(value: Boolean): Self = StObject.set(x, "perMachine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerMachineUndefined: Self = StObject.set(x, "perMachine", js.undefined)
      
      @scala.inline
      def setRunAfterFinish(value: Boolean): Self = StObject.set(x, "runAfterFinish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunAfterFinishUndefined: Self = StObject.set(x, "runAfterFinish", js.undefined)
      
      @scala.inline
      def setShortcutName(value: String): Self = StObject.set(x, "shortcutName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortcutNameNull: Self = StObject.set(x, "shortcutName", null)
      
      @scala.inline
      def setShortcutNameUndefined: Self = StObject.set(x, "shortcutName", js.undefined)
    }
  }
  
  @js.native
  trait FinalCommonWindowsInstallerOptions extends StObject {
    
    var isAssisted: Boolean = js.native
    
    var isCreateDesktopShortcut: DesktopShortcutCreationPolicy = js.native
    
    var isCreateStartMenuShortcut: Boolean = js.native
    
    var isPerMachine: Boolean = js.native
    
    var menuCategory: String | Null = js.native
    
    var shortcutName: String = js.native
  }
  object FinalCommonWindowsInstallerOptions {
    
    @scala.inline
    def apply(
      isAssisted: Boolean,
      isCreateDesktopShortcut: DesktopShortcutCreationPolicy,
      isCreateStartMenuShortcut: Boolean,
      isPerMachine: Boolean,
      shortcutName: String
    ): FinalCommonWindowsInstallerOptions = {
      val __obj = js.Dynamic.literal(isAssisted = isAssisted.asInstanceOf[js.Any], isCreateDesktopShortcut = isCreateDesktopShortcut.asInstanceOf[js.Any], isCreateStartMenuShortcut = isCreateStartMenuShortcut.asInstanceOf[js.Any], isPerMachine = isPerMachine.asInstanceOf[js.Any], shortcutName = shortcutName.asInstanceOf[js.Any])
      __obj.asInstanceOf[FinalCommonWindowsInstallerOptions]
    }
    
    @scala.inline
    implicit class FinalCommonWindowsInstallerOptionsMutableBuilder[Self <: FinalCommonWindowsInstallerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsAssisted(value: Boolean): Self = StObject.set(x, "isAssisted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCreateDesktopShortcut(value: DesktopShortcutCreationPolicy): Self = StObject.set(x, "isCreateDesktopShortcut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCreateStartMenuShortcut(value: Boolean): Self = StObject.set(x, "isCreateStartMenuShortcut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPerMachine(value: Boolean): Self = StObject.set(x, "isPerMachine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuCategory(value: String): Self = StObject.set(x, "menuCategory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuCategoryNull: Self = StObject.set(x, "menuCategory", null)
      
      @scala.inline
      def setShortcutName(value: String): Self = StObject.set(x, "shortcutName", value.asInstanceOf[js.Any])
    }
  }
}
