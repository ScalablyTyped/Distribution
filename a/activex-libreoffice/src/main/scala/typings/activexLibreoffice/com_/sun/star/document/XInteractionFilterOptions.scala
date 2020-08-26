package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.task.XInteractionContinuation
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A continuation to return filter options from interaction helper.
  * @since OOo 1.1.2
  */
@js.native
trait XInteractionFilterOptions extends XInteractionContinuation {
  /**
    * Get results from the continuation.
    * @returns the stored list of properties containing filter options.
    */
  var FilterOptions: SafeArray[PropertyValue] = js.native
  /**
    * Get results from the continuation.
    * @returns the stored list of properties containing filter options.
    */
  def getFilterOptions(): SafeArray[PropertyValue] = js.native
  /**
    * Store results to the continuation.
    * @param rProperties the list of properties containing filter options.
    */
  def setFilterOptions(rProperties: SeqEquiv[PropertyValue]): Unit = js.native
}

object XInteractionFilterOptions {
  @scala.inline
  def apply(
    FilterOptions: SafeArray[PropertyValue],
    acquire: () => Unit,
    getFilterOptions: () => SafeArray[PropertyValue],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    select: () => Unit,
    setFilterOptions: SeqEquiv[PropertyValue] => Unit
  ): XInteractionFilterOptions = {
    val __obj = js.Dynamic.literal(FilterOptions = FilterOptions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFilterOptions = js.Any.fromFunction0(getFilterOptions), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setFilterOptions = js.Any.fromFunction1(setFilterOptions))
    __obj.asInstanceOf[XInteractionFilterOptions]
  }
  @scala.inline
  implicit class XInteractionFilterOptionsOps[Self <: XInteractionFilterOptions] (val x: Self) extends AnyVal {
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
    def setFilterOptions(value: SafeArray[PropertyValue]): Self = this.set("FilterOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetFilterOptions(value: () => SafeArray[PropertyValue]): Self = this.set("getFilterOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setSetFilterOptions(value: SeqEquiv[PropertyValue] => Unit): Self = this.set("setFilterOptions", js.Any.fromFunction1(value))
  }
  
}

