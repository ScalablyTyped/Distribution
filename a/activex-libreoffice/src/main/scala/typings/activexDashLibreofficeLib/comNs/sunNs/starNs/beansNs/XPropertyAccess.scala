package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to access all property values and to set them at once.
  *
  * In most cases this interface will be in addition to {@link XPropertySet} . It is especially useful for remote communication because it lessens the
  * number of calls for getting property values; that is especially important because these calls are necessarily synchronous.
  *
  * Another advantage of this method is that conflicts are avoided if property value restrictions depend on the value of other properties.
  */
trait XPropertyAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns a sequence of all property values within the object in a single call. */
  var PropertyValues: stdLib.SafeArray[PropertyValue]
  /** @returns a sequence of all property values within the object in a single call. */
  def getPropertyValues(): stdLib.SafeArray[PropertyValue]
  /**
    * sets the values of given properties.
    *
    * All properties which are not contained in the sequence **aProps** will be left unchanged.
    */
  def setPropertyValues(aProps: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[PropertyValue]): scala.Unit
}

object XPropertyAccess {
  @scala.inline
  def apply(
    PropertyValues: stdLib.SafeArray[PropertyValue],
    acquire: () => scala.Unit,
    getPropertyValues: () => stdLib.SafeArray[PropertyValue],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setPropertyValues: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[PropertyValue] => scala.Unit
  ): XPropertyAccess = {
    val __obj = js.Dynamic.literal(PropertyValues = PropertyValues, acquire = js.Any.fromFunction0(acquire), getPropertyValues = js.Any.fromFunction0(getPropertyValues), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPropertyValues = js.Any.fromFunction1(setPropertyValues))
  
    __obj.asInstanceOf[XPropertyAccess]
  }
}

