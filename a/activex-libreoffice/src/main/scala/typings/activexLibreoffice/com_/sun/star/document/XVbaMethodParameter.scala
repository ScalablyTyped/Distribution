package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XVbaMethodParameter extends XInterface {
  /** returns the value of the parameter with the specified name. */
  def getVbaMethodParameter(PropertyName: String): js.Any = js.native
  /** sets the value of the parameter with the specified name. */
  def setVbaMethodParameter(PropertyName: String, Value: js.Any): Unit = js.native
}

object XVbaMethodParameter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getVbaMethodParameter: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setVbaMethodParameter: (String, js.Any) => Unit
  ): XVbaMethodParameter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getVbaMethodParameter = js.Any.fromFunction1(getVbaMethodParameter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setVbaMethodParameter = js.Any.fromFunction2(setVbaMethodParameter))
    __obj.asInstanceOf[XVbaMethodParameter]
  }
  @scala.inline
  implicit class XVbaMethodParameterOps[Self <: XVbaMethodParameter] (val x: Self) extends AnyVal {
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
    def setGetVbaMethodParameter(value: String => js.Any): Self = this.set("getVbaMethodParameter", js.Any.fromFunction1(value))
    @scala.inline
    def setSetVbaMethodParameter(value: (String, js.Any) => Unit): Self = this.set("setVbaMethodParameter", js.Any.fromFunction2(value))
  }
  
}

