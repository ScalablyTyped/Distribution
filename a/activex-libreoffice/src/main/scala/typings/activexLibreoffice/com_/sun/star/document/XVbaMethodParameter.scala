package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XVbaMethodParameter extends XInterface {
  /** returns the value of the parameter with the specified name. */
  def getVbaMethodParameter(PropertyName: String): js.Any
  /** sets the value of the parameter with the specified name. */
  def setVbaMethodParameter(PropertyName: String, Value: js.Any): Unit
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
}

