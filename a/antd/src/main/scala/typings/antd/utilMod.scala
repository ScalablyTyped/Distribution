package typings.antd

import typings.antd.generatePickerMod.PickerLocale
import typings.rcPicker.interfaceMod.PickerMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/date-picker/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def getPlaceholder(picker: js.UndefOr[scala.Nothing], locale: PickerLocale): String = js.native
  def getPlaceholder(picker: js.UndefOr[scala.Nothing], locale: PickerLocale, customizePlaceholder: String): String = js.native
  def getPlaceholder(picker: PickerMode, locale: PickerLocale): String = js.native
  def getPlaceholder(picker: PickerMode, locale: PickerLocale, customizePlaceholder: String): String = js.native
  def getRangePlaceholder(picker: js.UndefOr[scala.Nothing], locale: PickerLocale): js.UndefOr[js.Tuple2[String, String]] = js.native
  def getRangePlaceholder(
    picker: js.UndefOr[scala.Nothing],
    locale: PickerLocale,
    customizePlaceholder: js.Tuple2[String, String]
  ): js.UndefOr[js.Tuple2[String, String]] = js.native
  def getRangePlaceholder(picker: PickerMode, locale: PickerLocale): js.UndefOr[js.Tuple2[String, String]] = js.native
  def getRangePlaceholder(picker: PickerMode, locale: PickerLocale, customizePlaceholder: js.Tuple2[String, String]): js.UndefOr[js.Tuple2[String, String]] = js.native
}

