package typings.angularTranslate.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(translationId: String): String = js.native
  def apply(translationId: String, interpolateParams: js.Any): String = js.native
  def apply(translationId: String, interpolateParams: js.Any, interpolation: String): String = js.native
  def apply(translationId: String, interpolateParams: js.Any, interpolation: String, forceLanguage: String): String = js.native
  def apply(translationIds: js.Array[String]): StringDictionary[String] = js.native
  def apply(translationIds: js.Array[String], interpolateParams: js.Any): StringDictionary[String] = js.native
  def apply(translationIds: js.Array[String], interpolateParams: js.Any, interpolation: String): StringDictionary[String] = js.native
  def apply(
    translationIds: js.Array[String],
    interpolateParams: js.Any,
    interpolation: String,
    forceLanguage: String
  ): StringDictionary[String] = js.native
}

