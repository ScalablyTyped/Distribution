package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows to set date values as categories.
  *
  * Can be obtained from interface {@link XChartDocument} via method getData().
  * @since OOo 3.4
  */
@js.native
trait XDateCategories extends js.Object {
  /**
    * retrieves the date values if the category x-axis id a date axis
    * @returns a sequence of doubles representing dates.
    */
  var DateCategories: SafeArray[Double] = js.native
  /**
    * retrieves the date values if the category x-axis id a date axis
    * @returns a sequence of doubles representing dates.
    */
  def getDateCategories(): SafeArray[Double] = js.native
  /**
    * sets dates as categories
    * @param rDates a sequence of sequences of doubles representing dates.
    */
  def setDateCategories(rDates: SeqEquiv[Double]): Unit = js.native
}

object XDateCategories {
  @scala.inline
  def apply(
    DateCategories: SafeArray[Double],
    getDateCategories: () => SafeArray[Double],
    setDateCategories: SeqEquiv[Double] => Unit
  ): XDateCategories = {
    val __obj = js.Dynamic.literal(DateCategories = DateCategories.asInstanceOf[js.Any], getDateCategories = js.Any.fromFunction0(getDateCategories), setDateCategories = js.Any.fromFunction1(setDateCategories))
    __obj.asInstanceOf[XDateCategories]
  }
  @scala.inline
  implicit class XDateCategoriesOps[Self <: XDateCategories] (val x: Self) extends AnyVal {
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
    def setDateCategories(value: SafeArray[Double]): Self = this.set("DateCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDateCategories(value: () => SafeArray[Double]): Self = this.set("getDateCategories", js.Any.fromFunction0(value))
    @scala.inline
    def setSetDateCategories(value: SeqEquiv[Double] => Unit): Self = this.set("setDateCategories", js.Any.fromFunction1(value))
  }
  
}

