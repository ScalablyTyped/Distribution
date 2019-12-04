package typings.atAngularCompiler.srcOutputMapUnderscoreUtilMod

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapEntry extends js.Object {
  var key: String
  var quoted: Boolean
  var value: Expression
}

object MapEntry {
  @scala.inline
  def apply(key: String, quoted: Boolean, value: Expression): MapEntry = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MapEntry]
  }
}

@JSImport("@angular/compiler/src/output/map_util", "mapEntry")
@js.native
object mapEntry extends js.Object {
  def apply(key: String, value: Expression): MapEntry = js.native
}

