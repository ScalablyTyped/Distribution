package typings.atAngularCommon.atAngularCommonMod

import typings.atAngularCore.atAngularCoreMod.PipeTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "DeprecatedPercentPipe")
@js.native
class DeprecatedPercentPipe protected () extends PipeTransform {
  def this(_locale: String) = this()
  var _locale: js.Any = js.native
  def transform(value: js.Any): String | Null = js.native
  /* CompleteClass */
  override def transform(value: js.Any, args: js.Any*): js.Any = js.native
  def transform(value: js.Any, digits: String): String | Null = js.native
}

