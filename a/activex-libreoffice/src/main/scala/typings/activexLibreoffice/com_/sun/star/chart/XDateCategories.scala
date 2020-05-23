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
trait XDateCategories extends js.Object {
  /**
    * retrieves the date values if the category x-axis id a date axis
    * @returns a sequence of doubles representing dates.
    */
  var DateCategories: SafeArray[Double]
  /**
    * retrieves the date values if the category x-axis id a date axis
    * @returns a sequence of doubles representing dates.
    */
  def getDateCategories(): SafeArray[Double]
  /**
    * sets dates as categories
    * @param rDates a sequence of sequences of doubles representing dates.
    */
  def setDateCategories(rDates: SeqEquiv[Double]): Unit
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
}

