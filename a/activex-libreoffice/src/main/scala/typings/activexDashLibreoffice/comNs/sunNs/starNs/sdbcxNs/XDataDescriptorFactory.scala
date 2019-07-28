package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the creation of a descriptor for a definition object. */
trait XDataDescriptorFactory extends XInterface {
  /**
    * returns a descriptor of a definition object.
    * @returns the descriptor for that kind of objects
    */
  def createDataDescriptor(): XPropertySet
}

object XDataDescriptorFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createDataDescriptor: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataDescriptorFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDataDescriptorFactory]
  }
}

