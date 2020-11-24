package typings.appBuilderLib.windowsCodeSignMod

import typings.appBuilderLib.winOptionsMod.WindowsConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomWindowsSignTaskConfiguration extends WindowsSignTaskConfiguration {
  
  def computeSignToolArgs(isWin: Boolean): js.Array[String] = js.native
}
object CustomWindowsSignTaskConfiguration {
  
  @scala.inline
  def apply(
    computeSignToolArgs: Boolean => js.Array[String],
    hash: String,
    isNest: Boolean,
    options: WindowsConfiguration,
    path: String
  ): CustomWindowsSignTaskConfiguration = {
    val __obj = js.Dynamic.literal(computeSignToolArgs = js.Any.fromFunction1(computeSignToolArgs), hash = hash.asInstanceOf[js.Any], isNest = isNest.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomWindowsSignTaskConfiguration]
  }
  
  @scala.inline
  implicit class CustomWindowsSignTaskConfigurationOps[Self <: CustomWindowsSignTaskConfiguration] (val x: Self) extends AnyVal {
    
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
    def setComputeSignToolArgs(value: Boolean => js.Array[String]): Self = this.set("computeSignToolArgs", js.Any.fromFunction1(value))
  }
}
