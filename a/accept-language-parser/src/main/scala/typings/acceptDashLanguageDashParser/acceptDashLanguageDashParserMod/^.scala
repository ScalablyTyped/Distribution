package typings.acceptDashLanguageDashParser.acceptDashLanguageDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("accept-language-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(acceptLanguage: String): js.Array[Language] = js.native
  def pick[T /* <: String */](supportedLanguages: js.Array[T], acceptLanguage: String): T | Null = js.native
  def pick[T /* <: String */](supportedLanguages: js.Array[T], acceptLanguage: String, options: PickOptions): T | Null = js.native
  def pick[T /* <: String */](supportedLanguages: js.Array[T], acceptLanguage: js.Array[Language]): T | Null = js.native
  def pick[T /* <: String */](supportedLanguages: js.Array[T], acceptLanguage: js.Array[Language], options: PickOptions): T | Null = js.native
}

