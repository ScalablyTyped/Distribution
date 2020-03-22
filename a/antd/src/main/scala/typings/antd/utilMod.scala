package typings.antd

import typings.rcPicker.interfaceMod.PickerMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/date-picker/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def getPlaceholder(picker: js.UndefOr[scala.Nothing], locale: js.Any): String = js.native
  def getPlaceholder(picker: PickerMode, locale: js.Any): String = js.native
  def getRangePlaceholder(picker: js.UndefOr[scala.Nothing], locale: js.Any): js.Tuple2[String, String] = js.native
  def getRangePlaceholder(picker: PickerMode, locale: js.Any): js.Tuple2[String, String] = js.native
}

