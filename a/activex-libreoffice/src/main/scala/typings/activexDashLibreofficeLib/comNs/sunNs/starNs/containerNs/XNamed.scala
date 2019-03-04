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
    acquire: js.Function0[scala.Unit],
    getName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit]
  ): XNamed = {
    val __obj = js.Dynamic.literal(Name = Name, acquire = acquire, getName = getName, queryInterface = queryInterface, release = release, setName = setName)
  
    __obj.asInstanceOf[XNamed]
  }
}

