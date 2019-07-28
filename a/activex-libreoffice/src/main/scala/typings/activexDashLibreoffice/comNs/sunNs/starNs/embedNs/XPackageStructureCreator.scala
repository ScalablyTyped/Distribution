package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XOutputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to convert file system folder tree in to a package. */
trait XPackageStructureCreator extends XInterface {
  /**
    * converts file system folder tree in to a package.
    * @param sFolderURL the URL of folder that must be converted, the URL must be in format accepted by UCB
    * @param xTargetStream the result package will be written into this stream
    * @throws com::sun::star::io::IOException in case any problem on reading/writing appears
    */
  def convertToPackage(sFolderURL: String, xTargetStream: XOutputStream): Unit
}

object XPackageStructureCreator {
  @scala.inline
  def apply(
    acquire: () => Unit,
    convertToPackage: (String, XOutputStream) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPackageStructureCreator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convertToPackage = js.Any.fromFunction2(convertToPackage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XPackageStructureCreator]
  }
}

