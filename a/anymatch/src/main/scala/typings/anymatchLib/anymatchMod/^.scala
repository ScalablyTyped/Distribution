package typings
package anymatchLib.anymatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("anymatch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(matcher: anymatchLib.anymatchMod.anymatchNs.Matcher): anymatchLib.anymatchMod.CurrriedMatcher = js.native
  def apply(
    matcher: anymatchLib.anymatchMod.anymatchNs.Matcher,
    testString: java.lang.String | js.Array[java.lang.String]
  ): scala.Boolean = js.native
  def apply(
    matcher: anymatchLib.anymatchMod.anymatchNs.Matcher,
    testString: java.lang.String | js.Array[java.lang.String],
    returnIndex: anymatchLib.anymatchLibNumbers.`true`
  ): scala.Double = js.native
  def apply(
    matcher: anymatchLib.anymatchMod.anymatchNs.Matcher,
    testString: java.lang.String | js.Array[java.lang.String],
    returnIndex: anymatchLib.anymatchLibNumbers.`true`,
    startIndex: scala.Double
  ): scala.Double = js.native
  def apply(
    matcher: anymatchLib.anymatchMod.anymatchNs.Matcher,
    testString: java.lang.String | js.Array[java.lang.String],
    returnIndex: anymatchLib.anymatchLibNumbers.`true`,
    startIndex: scala.Double,
    endIndex: scala.Double
  ): scala.Double = js.native
  def apply(
    matcher: anymatchLib.anymatchMod.anymatchNs.Matcher,
    testString: java.lang.String | js.Array[java.lang.String],
    returnIndex: scala.Boolean
  ): scala.Boolean = js.native
  def apply(
    matcher: anymatchLib.anymatchMod.anymatchNs.Matcher,
    testString: java.lang.String | js.Array[java.lang.String],
    returnIndex: scala.Boolean,
    startIndex: scala.Double
  ): scala.Boolean = js.native
  def apply(
    matcher: anymatchLib.anymatchMod.anymatchNs.Matcher,
    testString: java.lang.String | js.Array[java.lang.String],
    returnIndex: scala.Boolean,
    startIndex: scala.Double,
    endIndex: scala.Double
  ): scala.Boolean = js.native
}

