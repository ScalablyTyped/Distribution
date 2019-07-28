package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: Double
  var stderr: String
  var stdout: String
}

object Anon_Code {
  @scala.inline
  def apply(code: Double, stderr: String, stdout: String): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code, stderr = stderr, stdout = stdout)
  
    __obj.asInstanceOf[Anon_Code]
  }
}

