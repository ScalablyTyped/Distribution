package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.Uik
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XComponentRegistry extends XInterface {
  /** @deprecated Deprecated */
  def createObject(URL: String, Uik: Uik): XInterface
}

object XComponentRegistry {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createObject: (String, Uik) => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XComponentRegistry = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createObject = js.Any.fromFunction2(createObject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XComponentRegistry]
  }
}

