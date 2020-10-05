package typings.angularCompiler.aotCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NgAnalyzeModulesHost extends js.Object {
  def isSourceFile(filePath: String): Boolean = js.native
}

object NgAnalyzeModulesHost {
  @scala.inline
  def apply(isSourceFile: String => Boolean): NgAnalyzeModulesHost = {
    val __obj = js.Dynamic.literal(isSourceFile = js.Any.fromFunction1(isSourceFile))
    __obj.asInstanceOf[NgAnalyzeModulesHost]
  }
  @scala.inline
  implicit class NgAnalyzeModulesHostOps[Self <: NgAnalyzeModulesHost] (val x: Self) extends AnyVal {
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
    def setIsSourceFile(value: String => Boolean): Self = this.set("isSourceFile", js.Any.fromFunction1(value))
  }
  
}

