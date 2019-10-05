package typings.acceptDashLanguageDashParser.acceptDashLanguageDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("accept-language-parser", "pick")
@js.native
object pick extends js.Object {
  def apply[T /* <: String */](supportedLanguages: js.Array[T], acceptLanguage: String): T | Null = js.native
  def apply[T /* <: String */](supportedLanguages: js.Array[T], acceptLanguage: String, options: PickOptions): T | Null = js.native
  def apply[T /* <: String */](supportedLanguages: js.Array[T], acceptLanguage: js.Array[Language]): T | Null = js.native
  def apply[T /* <: String */](supportedLanguages: js.Array[T], acceptLanguage: js.Array[Language], options: PickOptions): T | Null = js.native
}

