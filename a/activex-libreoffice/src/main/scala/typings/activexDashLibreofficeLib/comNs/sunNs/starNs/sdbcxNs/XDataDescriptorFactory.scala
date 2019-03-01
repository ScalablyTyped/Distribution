package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the creation of a descriptor for a definition object. */
trait XDataDescriptorFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns a descriptor of a definition object.
    * @returns the descriptor for that kind of objects
    */
  def createDataDescriptor(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

object XDataDescriptorFactory {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createDataDescriptor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDataDescriptorFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createDataDescriptor")(createDataDescriptor)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XDataDescriptorFactory]
  }
}

