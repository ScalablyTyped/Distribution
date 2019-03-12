package typings
package androiduixLib.androidNs.supportNs.v4Ns.viewNs.ViewPagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageTransformer extends js.Object {
  def transformPage(page: androiduixLib.androidNs.viewNs.View, position: scala.Double): scala.Unit
}

object PageTransformer {
  @scala.inline
  def apply(transformPage: (androiduixLib.androidNs.viewNs.View, scala.Double) => scala.Unit): PageTransformer = {
    val __obj = js.Dynamic.literal(transformPage = js.Any.fromFunction2(transformPage))
  
    __obj.asInstanceOf[PageTransformer]
  }
}

