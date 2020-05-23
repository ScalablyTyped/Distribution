package typings.angularCommon.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.PipeTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "I18nSelectPipe")
@js.native
class I18nSelectPipe () extends PipeTransform {
  /**
    * @param value a string to be internationalized.
    * @param mapping an object that indicates the text that should be displayed
    * for different values of the provided `value`.
    */
  def transform(value: js.UndefOr[Null | String], mapping: StringDictionary[String]): String = js.native
  /* CompleteClass */
  override def transform(value: js.Any, args: js.Any*): js.Any = js.native
}

