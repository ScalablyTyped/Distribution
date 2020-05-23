package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated interface. Do not use anymore.
  * @deprecated Deprecated
  */
trait XIdlClassProvider extends XInterface {
  val IdlClasses: SafeArray[XIdlClass[_]]
  def getIdlClasses(): SafeArray[XIdlClass[_]]
}

object XIdlClassProvider {
  @scala.inline
  def apply(
    IdlClasses: SafeArray[XIdlClass[_]],
    acquire: () => Unit,
    getIdlClasses: () => SafeArray[XIdlClass[_]],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XIdlClassProvider = {
    val __obj = js.Dynamic.literal(IdlClasses = IdlClasses.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getIdlClasses = js.Any.fromFunction0(getIdlClasses), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIdlClassProvider]
  }
}

