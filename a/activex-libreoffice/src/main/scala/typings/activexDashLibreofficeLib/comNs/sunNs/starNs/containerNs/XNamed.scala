package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the name of the object.
  *
  * The name is generally unique in the container of the object.
  */
trait XNamed
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the programmatic name of the object. */
  var Name: java.lang.String
  /** @returns the programmatic name of the object. */
  def getName(): java.lang.String
  /** sets the programmatic name of the object. */
  def setName(aName: java.lang.String): scala.Unit
}

object XNamed {
  @scala.inline
  def apply(
    Name: java.lang.String,
    acquire: () => scala.Unit,
    getName: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setName: java.lang.String => scala.Unit
  ): XNamed = {
    val __obj = js.Dynamic.literal(Name = Name, acquire = js.Any.fromFunction0(acquire), getName = js.Any.fromFunction0(getName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName))
  
    __obj.asInstanceOf[XNamed]
  }
}

