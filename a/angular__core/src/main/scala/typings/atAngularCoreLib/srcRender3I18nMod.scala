package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/i18n", JSImport.Namespace)
@js.native
object srcRender3I18nMod extends js.Object {
  def getTranslationForTemplate(message: java.lang.String): java.lang.String = js.native
  def getTranslationForTemplate(message: java.lang.String, subTemplateIndex: scala.Double): java.lang.String = js.native
  def i18n(index: scala.Double, message: java.lang.String): scala.Unit = js.native
  def i18n(index: scala.Double, message: java.lang.String, subTemplateIndex: scala.Double): scala.Unit = js.native
  def i18nApply(index: scala.Double): scala.Unit = js.native
  def i18nAttributes(index: scala.Double, values: js.Array[java.lang.String]): scala.Unit = js.native
  def i18nEnd(): scala.Unit = js.native
  def i18nExp[T](expression: T): scala.Unit = js.native
  def i18nExp[T](expression: atAngularCoreLib.srcRender3TokensMod.NO_CHANGE): scala.Unit = js.native
  def i18nPostprocess(
    message: java.lang.String,
    replacements: ScalablyTyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  ): java.lang.String = js.native
  def i18nStart(index: scala.Double, message: java.lang.String): scala.Unit = js.native
  def i18nStart(index: scala.Double, message: java.lang.String, subTemplateIndex: scala.Double): scala.Unit = js.native
}

