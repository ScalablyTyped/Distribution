package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** compares two `any` s. */
@js.native
trait XAnyCompare extends XInterface {
  /**
    * allows comparison of two `any` s.
    * @param Any1 is the first compare value
    * @param Any2 is the second compare value
    * @returns `-1` , if the first any is less than the second ( Any1 < Any2 )`0` , if the first any is equal to the second ( Any1 == Any2 )`+1` , if the first
    */
  def compare(Any1: js.Any, Any2: js.Any): Double = js.native
}

object XAnyCompare {
  @scala.inline
  def apply(
    acquire: () => Unit,
    compare: (js.Any, js.Any) => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAnyCompare = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), compare = js.Any.fromFunction2(compare), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAnyCompare]
  }
  @scala.inline
  implicit class XAnyCompareOps[Self <: XAnyCompare] (val x: Self) extends AnyVal {
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
    def setCompare(value: (js.Any, js.Any) => Double): Self = this.set("compare", js.Any.fromFunction2(value))
  }
  
}

