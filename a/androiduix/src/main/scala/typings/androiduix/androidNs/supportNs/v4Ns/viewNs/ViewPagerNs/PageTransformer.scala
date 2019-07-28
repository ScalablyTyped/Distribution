package typings.androiduix.androidNs.supportNs.v4Ns.viewNs.ViewPagerNs

import typings.androiduix.androidNs.viewNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageTransformer extends js.Object {
  def transformPage(page: View, position: Double): Unit
}

object PageTransformer {
  @scala.inline
  def apply(transformPage: (View, Double) => Unit): PageTransformer = {
    val __obj = js.Dynamic.literal(transformPage = js.Any.fromFunction2(transformPage))
  
    __obj.asInstanceOf[PageTransformer]
  }
}

