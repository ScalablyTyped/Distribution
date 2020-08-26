package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows indentation of the object to be changed. */
@js.native
trait XIndent extends XInterface {
  /** shifts the indentation by one default step to the left. */
  def decrementIndent(): Unit = js.native
  /** shifts the indentation by one default step to the right. */
  def incrementIndent(): Unit = js.native
}

object XIndent {
  @scala.inline
  def apply(
    acquire: () => Unit,
    decrementIndent: () => Unit,
    incrementIndent: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XIndent = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), decrementIndent = js.Any.fromFunction0(decrementIndent), incrementIndent = js.Any.fromFunction0(incrementIndent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIndent]
  }
  @scala.inline
  implicit class XIndentOps[Self <: XIndent] (val x: Self) extends AnyVal {
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
    def setDecrementIndent(value: () => Unit): Self = this.set("decrementIndent", js.Any.fromFunction0(value))
    @scala.inline
    def setIncrementIndent(value: () => Unit): Self = this.set("incrementIndent", js.Any.fromFunction0(value))
  }
  
}

