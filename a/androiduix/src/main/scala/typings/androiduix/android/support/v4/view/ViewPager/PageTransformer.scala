package typings.androiduix.android.support.v4.view.ViewPager

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageTransformer extends js.Object {
  def transformPage(page: View, position: Double): Unit = js.native
}

object PageTransformer {
  @scala.inline
  def apply(transformPage: (View, Double) => Unit): PageTransformer = {
    val __obj = js.Dynamic.literal(transformPage = js.Any.fromFunction2(transformPage))
    __obj.asInstanceOf[PageTransformer]
  }
  @scala.inline
  implicit class PageTransformerOps[Self <: PageTransformer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTransformPage(value: (View, Double) => Unit): Self = this.set("transformPage", js.Any.fromFunction2(value))
  }
  
}

