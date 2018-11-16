package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _svgTransformType extends js.Object

@JSGlobal("MSHTML._svgTransformType")
@js.native
object _svgTransformType extends js.Object {
  @js.native
  sealed trait SVG_TRANSFORM_MATRIX
    extends activexDashMshtmlLib.MSHTMLNs._svgTransformType
  
  @js.native
  sealed trait SVG_TRANSFORM_ROTATE
    extends activexDashMshtmlLib.MSHTMLNs._svgTransformType
  
  @js.native
  sealed trait SVG_TRANSFORM_SCALE
    extends activexDashMshtmlLib.MSHTMLNs._svgTransformType
  
  @js.native
  sealed trait SVG_TRANSFORM_SKEWX
    extends activexDashMshtmlLib.MSHTMLNs._svgTransformType
  
  @js.native
  sealed trait SVG_TRANSFORM_SKEWY
    extends activexDashMshtmlLib.MSHTMLNs._svgTransformType
  
  @js.native
  sealed trait SVG_TRANSFORM_TRANSLATE
    extends activexDashMshtmlLib.MSHTMLNs._svgTransformType
  
  @js.native
  sealed trait SVG_TRANSFORM_UNKNOWN
    extends activexDashMshtmlLib.MSHTMLNs._svgTransformType
  
  @js.native
  sealed trait svgTransformType_Max
    extends activexDashMshtmlLib.MSHTMLNs._svgTransformType
  
  /* 1 */ val SVG_TRANSFORM_MATRIX: SVG_TRANSFORM_MATRIX with scala.Double = js.native
  /* 4 */ val SVG_TRANSFORM_ROTATE: SVG_TRANSFORM_ROTATE with scala.Double = js.native
  /* 3 */ val SVG_TRANSFORM_SCALE: SVG_TRANSFORM_SCALE with scala.Double = js.native
  /* 5 */ val SVG_TRANSFORM_SKEWX: SVG_TRANSFORM_SKEWX with scala.Double = js.native
  /* 6 */ val SVG_TRANSFORM_SKEWY: SVG_TRANSFORM_SKEWY with scala.Double = js.native
  /* 2 */ val SVG_TRANSFORM_TRANSLATE: SVG_TRANSFORM_TRANSLATE with scala.Double = js.native
  /* 0 */ val SVG_TRANSFORM_UNKNOWN: SVG_TRANSFORM_UNKNOWN with scala.Double = js.native
  /* 2147483647 */ val svgTransformType_Max: svgTransformType_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._svgTransformType with scala.Double] = js.native
}

