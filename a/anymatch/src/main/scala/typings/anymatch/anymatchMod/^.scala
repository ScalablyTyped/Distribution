package typings.anymatch.anymatchMod

import typings.anymatch.anymatchNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("anymatch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(matcher: Matcher): CurrriedMatcher = js.native
  def apply(matcher: Matcher, testString: String | js.Array[String]): Boolean = js.native
  def apply(matcher: Matcher, testString: String | js.Array[String], returnIndex: Boolean): Boolean = js.native
  def apply(matcher: Matcher, testString: String | js.Array[String], returnIndex: Boolean, startIndex: Double): Boolean = js.native
  def apply(
    matcher: Matcher,
    testString: String | js.Array[String],
    returnIndex: Boolean,
    startIndex: Double,
    endIndex: Double
  ): Boolean = js.native
  def apply(matcher: Matcher, testString: String | js.Array[String], returnIndex: `true`): Double = js.native
  def apply(matcher: Matcher, testString: String | js.Array[String], returnIndex: `true`, startIndex: Double): Double = js.native
  def apply(
    matcher: Matcher,
    testString: String | js.Array[String],
    returnIndex: `true`,
    startIndex: Double,
    endIndex: Double
  ): Double = js.native
}

