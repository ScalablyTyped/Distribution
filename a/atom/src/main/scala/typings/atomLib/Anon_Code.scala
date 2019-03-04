package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: scala.Double
  var stderr: java.lang.String
  var stdout: java.lang.String
}

object Anon_Code {
  @scala.inline
  def apply(code: scala.Double, stderr: java.lang.String, stdout: java.lang.String): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code, stderr = stderr, stdout = stdout)
  
    __obj.asInstanceOf[Anon_Code]
  }
}

