package typings.androiduix.android.support.v4.view.ViewPager

import typings.androiduix.android.view.View
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

