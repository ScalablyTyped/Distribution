package typings
package androiduixLib.androiduiNs.nativeNs.NativeApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawHTMLBoundApi extends js.Object {
  def hideDrawHTMLBound(viewHash: scala.Double): scala.Unit
  def showDrawHTMLBound(
    viewHash: scala.Double,
    left: scala.Double,
    top: scala.Double,
    right: scala.Double,
    bottom: scala.Double
  ): scala.Unit
}

object DrawHTMLBoundApi {
  @scala.inline
  def apply(
    hideDrawHTMLBound: js.Function1[scala.Double, scala.Unit],
    showDrawHTMLBound: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit]
  ): DrawHTMLBoundApi = {
    val __obj = js.Dynamic.literal(hideDrawHTMLBound = hideDrawHTMLBound, showDrawHTMLBound = showDrawHTMLBound)
  
    __obj.asInstanceOf[DrawHTMLBoundApi]
  }
}

