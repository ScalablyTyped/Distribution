package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface enables the object to handle numbering rules.
  * @see com.sun.star.text.NumberingRules
  */
@js.native
trait XNumberingRulesSupplier extends XInterface {
  /** @returns the collection of "NumberingRules" currently contained in the object. */
  val NumberingRules: XIndexAccess = js.native
  /** @returns the collection of "NumberingRules" currently contained in the object. */
  def getNumberingRules(): XIndexAccess = js.native
}

object XNumberingRulesSupplier {
  @scala.inline
  def apply(
    NumberingRules: XIndexAccess,
    acquire: () => Unit,
    getNumberingRules: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNumberingRulesSupplier = {
    val __obj = js.Dynamic.literal(NumberingRules = NumberingRules.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getNumberingRules = js.Any.fromFunction0(getNumberingRules), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNumberingRulesSupplier]
  }
  @scala.inline
  implicit class XNumberingRulesSupplierOps[Self <: XNumberingRulesSupplier] (val x: Self) extends AnyVal {
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
    def setNumberingRules(value: XIndexAccess): Self = this.set("NumberingRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetNumberingRules(value: () => XIndexAccess): Self = this.set("getNumberingRules", js.Any.fromFunction0(value))
  }
  
}

