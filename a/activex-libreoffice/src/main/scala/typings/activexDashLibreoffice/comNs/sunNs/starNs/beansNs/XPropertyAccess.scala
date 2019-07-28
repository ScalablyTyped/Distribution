package typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
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
trait XPropertyAccess extends XInterface {
  /** @returns a sequence of all property values within the object in a single call. */
  var PropertyValues: SafeArray[PropertyValue]
  /** @returns a sequence of all property values within the object in a single call. */
  def getPropertyValues(): SafeArray[PropertyValue]
  /**
    * sets the values of given properties.
    *
    * All properties which are not contained in the sequence **aProps** will be left unchanged.
    */
  def setPropertyValues(aProps: SeqEquiv[PropertyValue]): Unit
}

object XPropertyAccess {
  @scala.inline
  def apply(
    PropertyValues: SafeArray[PropertyValue],
    acquire: () => Unit,
    getPropertyValues: () => SafeArray[PropertyValue],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPropertyValues: SeqEquiv[PropertyValue] => Unit
  ): XPropertyAccess = {
    val __obj = js.Dynamic.literal(PropertyValues = PropertyValues, acquire = js.Any.fromFunction0(acquire), getPropertyValues = js.Any.fromFunction0(getPropertyValues), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPropertyValues = js.Any.fromFunction1(setPropertyValues))
  
    __obj.asInstanceOf[XPropertyAccess]
  }
}

