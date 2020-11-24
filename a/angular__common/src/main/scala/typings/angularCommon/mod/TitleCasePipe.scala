package typings.angularCommon.mod

import typings.angularCore.mod.PipeTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "TitleCasePipe")
@js.native
class TitleCasePipe () extends PipeTransform {
  
  def transform(): Null = js.native
  /**
    * @param value The string to transform to title case.
    */
  def transform(value: String): String = js.native
  @JSName("transform")
  def transform_Union(): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: String): String | Null = js.native
}
