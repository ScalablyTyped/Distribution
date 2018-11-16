package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGTextPathElement")
@js.native
class SVGTextPathElement protected () extends js.Object {
  var `MSHTML.SVGTextPathElement_typekey`: SVGTextPathElement = js.native
  val className: SVGAnimatedString = js.native
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  val href: SVGAnimatedString = js.native
  var lengthAdjust: SVGAnimatedEnumeration = js.native
  var method: SVGAnimatedEnumeration = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  val requiredExtensions: SVGStringList = js.native
  val requiredFeatures: SVGStringList = js.native
  var spacing: SVGAnimatedEnumeration = js.native
  var startOffset: SVGAnimatedLength = js.native
  val systemLanguage: SVGStringList = js.native
  var textLength: SVGAnimatedLength = js.native
  var viewportElement: ISVGElement = js.native
  var xmlbase: java.lang.String = js.native
  var xmllang: java.lang.String = js.native
  var xmlspace: java.lang.String = js.native
  def getCharNumAtPosition(point: SVGPoint): scala.Double = js.native
  def getComputedTextLength(): scala.Double = js.native
  def getEndPositionOfChar(charnum: scala.Double): SVGPoint = js.native
  def getExtentOfChar(charnum: scala.Double): SVGRect = js.native
  def getNumberOfChars(): scala.Double = js.native
  def getRotationOfChar(charnum: scala.Double): scala.Double = js.native
  def getStartPositionOfChar(charnum: scala.Double): SVGPoint = js.native
  def getSubStringLength(charnum: scala.Double, nchars: scala.Double): scala.Double = js.native
  def hasExtension(extension: java.lang.String): scala.Boolean = js.native
  def selectSubString(charnum: scala.Double, nchars: scala.Double): scala.Unit = js.native
}

