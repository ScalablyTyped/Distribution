package typings
package acceptDashLanguageDashParserLib.acceptDashLanguageDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("accept-language-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(acceptLanguage: java.lang.String): js.Array[Language] = js.native
  def pick[T /* <: java.lang.String */](supportedLanguages: js.Array[T], acceptLanguage: java.lang.String): T | scala.Null = js.native
  def pick[T /* <: java.lang.String */](supportedLanguages: js.Array[T], acceptLanguage: java.lang.String, options: PickOptions): T | scala.Null = js.native
  def pick[T /* <: java.lang.String */](supportedLanguages: js.Array[T], acceptLanguage: js.Array[Language]): T | scala.Null = js.native
  def pick[T /* <: java.lang.String */](supportedLanguages: js.Array[T], acceptLanguage: js.Array[Language], options: PickOptions): T | scala.Null = js.native
}

