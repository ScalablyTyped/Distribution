package typings
package acceptDashLanguageDashParserLib.acceptDashLanguageDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("accept-language-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(acceptLanguage: java.lang.String): js.Array[acceptDashLanguageDashParserLib.acceptDashLanguageDashParserMod.Language] = js.native
  def pick(supportedLanguages: js.Array[java.lang.String], acceptLanguage: java.lang.String): java.lang.String | scala.Null = js.native
  def pick(
    supportedLanguages: js.Array[java.lang.String],
    acceptLanguage: java.lang.String,
    options: acceptDashLanguageDashParserLib.acceptDashLanguageDashParserMod.PickOptions
  ): java.lang.String | scala.Null = js.native
  def pick(
    supportedLanguages: js.Array[java.lang.String],
    acceptLanguage: js.Array[acceptDashLanguageDashParserLib.acceptDashLanguageDashParserMod.Language]
  ): java.lang.String | scala.Null = js.native
  def pick(
    supportedLanguages: js.Array[java.lang.String],
    acceptLanguage: js.Array[acceptDashLanguageDashParserLib.acceptDashLanguageDashParserMod.Language],
    options: acceptDashLanguageDashParserLib.acceptDashLanguageDashParserMod.PickOptions
  ): java.lang.String | scala.Null = js.native
}

