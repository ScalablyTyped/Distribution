package typings
package atAngularCompilerLib.srcRender3ViewI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/i18n", JSImport.Namespace)
@js.native
object srcRender3ViewI18nModMembers extends js.Object {
  val I18N_ATTR: /* i18n */ java.lang.String = js.native
  val I18N_ATTR_PREFIX: /* i18n- */ java.lang.String = js.native
  val I18N_PLACEHOLDER_SYMBOL: /* \\uFFFD */ java.lang.String = js.native
  def assembleI18nBoundString(strings: js.Array[java.lang.String]): java.lang.String = js.native
  def assembleI18nBoundString(strings: js.Array[java.lang.String], bindingStartIndex: scala.Double): java.lang.String = js.native
  def assembleI18nBoundString(strings: js.Array[java.lang.String], bindingStartIndex: scala.Double, contextId: scala.Double): java.lang.String = js.native
  def isI18NAttribute(name: java.lang.String): scala.Boolean = js.native
  def parseI18nMeta(): I18nMeta = js.native
  def parseI18nMeta(meta: java.lang.String): I18nMeta = js.native
  def wrapI18nPlaceholder(content: java.lang.String): java.lang.String = js.native
  def wrapI18nPlaceholder(content: java.lang.String, contextId: scala.Double): java.lang.String = js.native
  def wrapI18nPlaceholder(content: scala.Double): java.lang.String = js.native
  def wrapI18nPlaceholder(content: scala.Double, contextId: scala.Double): java.lang.String = js.native
}

