package typings.appBuilderLib.fileMatcherMod

import typings.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFileMatchersOptions extends js.Object {
  
  val customBuildOptions: PlatformSpecificBuildOptions = js.native
  
  val defaultSrc: String = js.native
  
  val globalOutDir: String = js.native
  
  def macroExpander(pattern: String): String = js.native
}
object GetFileMatchersOptions {
  
  @scala.inline
  def apply(
    customBuildOptions: PlatformSpecificBuildOptions,
    defaultSrc: String,
    globalOutDir: String,
    macroExpander: String => String
  ): GetFileMatchersOptions = {
    val __obj = js.Dynamic.literal(customBuildOptions = customBuildOptions.asInstanceOf[js.Any], defaultSrc = defaultSrc.asInstanceOf[js.Any], globalOutDir = globalOutDir.asInstanceOf[js.Any], macroExpander = js.Any.fromFunction1(macroExpander))
    __obj.asInstanceOf[GetFileMatchersOptions]
  }
  
  @scala.inline
  implicit class GetFileMatchersOptionsOps[Self <: GetFileMatchersOptions] (val x: Self) extends AnyVal {
    
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
    def setCustomBuildOptions(value: PlatformSpecificBuildOptions): Self = this.set("customBuildOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSrc(value: String): Self = this.set("defaultSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalOutDir(value: String): Self = this.set("globalOutDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacroExpander(value: String => String): Self = this.set("macroExpander", js.Any.fromFunction1(value))
  }
}
