package typings.angularCommon.mod

import typings.angularCore.mod.PipeTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "JsonPipe")
@js.native
class JsonPipe () extends PipeTransform {
  
  /**
    * @param value A value of any type to convert into a JSON-format string.
    */
  def transform(value: js.Any): String = js.native
}
