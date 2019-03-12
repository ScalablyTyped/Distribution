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
  def apply(isSourceFile: java.lang.String => scala.Boolean): NgAnalyzeModulesHost = {
    val __obj = js.Dynamic.literal(isSourceFile = js.Any.fromFunction1(isSourceFile))
  
    __obj.asInstanceOf[NgAnalyzeModulesHost]
  }
}

