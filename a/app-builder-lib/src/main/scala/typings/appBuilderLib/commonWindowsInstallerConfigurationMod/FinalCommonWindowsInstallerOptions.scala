package typings.appBuilderLib.commonWindowsInstallerConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinalCommonWindowsInstallerOptions extends js.Object {
  
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
  implicit class FinalCommonWindowsInstallerOptionsOps[Self <: FinalCommonWindowsInstallerOptions] (val x: Self) extends AnyVal {
    
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
    def setIsAssisted(value: Boolean): Self = this.set("isAssisted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCreateDesktopShortcut(value: DesktopShortcutCreationPolicy): Self = this.set("isCreateDesktopShortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCreateStartMenuShortcut(value: Boolean): Self = this.set("isCreateStartMenuShortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPerMachine(value: Boolean): Self = this.set("isPerMachine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcutName(value: String): Self = this.set("shortcutName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuCategory(value: String): Self = this.set("menuCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuCategoryNull: Self = this.set("menuCategory", null)
  }
}
