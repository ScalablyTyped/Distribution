package typings.atAngularAnimations.browserBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/animations/browser/browser", "ɵAnimationStyleNormalizer")
@js.native
abstract class ɵAnimationStyleNormalizer () extends js.Object {
  def normalizePropertyName(propertyName: String, errors: js.Array[String]): String = js.native
  def normalizeStyleValue(userProvidedProperty: String, normalizedProperty: String, value: String, errors: js.Array[String]): String = js.native
  def normalizeStyleValue(userProvidedProperty: String, normalizedProperty: String, value: Double, errors: js.Array[String]): String = js.native
}

