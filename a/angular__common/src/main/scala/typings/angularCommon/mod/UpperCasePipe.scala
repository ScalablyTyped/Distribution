package typings.angularCommon.mod

import typings.angularCore.mod.PipeTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "UpperCasePipe")
@js.native
class UpperCasePipe () extends PipeTransform {
  /**
    * @param value The string to transform to upper case.
    */
  def transform(value: String): String = js.native
}

