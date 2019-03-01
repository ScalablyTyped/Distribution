package typings
package atAngularCompilerLib.srcAotCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgAnalyzeModulesHost extends js.Object {
  def isSourceFile(filePath: java.lang.String): scala.Boolean
}

object NgAnalyzeModulesHost {
  @scala.inline
  def apply(isSourceFile: js.Function1[java.lang.String, scala.Boolean]): NgAnalyzeModulesHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isSourceFile")(isSourceFile)
    __obj.asInstanceOf[NgAnalyzeModulesHost]
  }
}

