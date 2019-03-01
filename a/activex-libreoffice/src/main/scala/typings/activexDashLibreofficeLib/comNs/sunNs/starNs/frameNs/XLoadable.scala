package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * offers a simple way to initialize a component or load it from an URL.
  *
  * In case an object supports the interface the object must be initialized with either {@link initNew()} or {@link load()} call before any usage. In case
  * the object is already initialized the mentioned methods should throw {@link DoubleInitializationException} .
  * @since OOo 1.1.2
  */
trait XLoadable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** creates a component from scratch */
  def initNew(): scala.Unit
  /**
    * loads a component from an URL
    * @param lArguments parameters for saving (see {@link com.sun.star.document.MediaDescriptor} for further details) the FileName parameter must be specified
    */
  def load(
    lArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
}

object XLoadable {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    initNew: js.Function0[scala.Unit],
    load: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XLoadable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("initNew")(initNew)
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XLoadable]
  }
}

