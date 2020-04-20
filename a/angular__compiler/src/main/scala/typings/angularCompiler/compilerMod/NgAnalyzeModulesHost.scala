package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgAnalyzeModulesHost extends js.Object {
  def isSourceFile(filePath: String): Boolean
}

object NgAnalyzeModulesHost {
  @scala.inline
  def apply(isSourceFile: String => Boolean): NgAnalyzeModulesHost = {
    val __obj = js.Dynamic.literal(isSourceFile = js.Any.fromFunction1(isSourceFile))
    __obj.asInstanceOf[NgAnalyzeModulesHost]
  }
}

