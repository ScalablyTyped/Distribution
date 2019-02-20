package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows creating instances of the {@link DataAccessDescriptor} service.
  *
  * Data access descriptors are finally only bags of properties with a defined semantics. Depending on the context in which you use them, certain of their
  * properties are needed or unneeded. ;  The descriptor factory allows you to create instances which offer all properties potentially needed at a
  * descriptor.
  */
trait XDataAccessDescriptorFactory extends js.Object {
  /** creates a {@link DataAccessDescriptor} which supports all properties defined for this service, even if they're normally optional only. */
  def createDataAccessDescriptor(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

