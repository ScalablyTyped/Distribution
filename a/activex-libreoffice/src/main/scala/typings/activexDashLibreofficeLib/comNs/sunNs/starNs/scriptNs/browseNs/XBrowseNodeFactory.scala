package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.browseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface provides a factory for obtaining objects implementing the {@link XBrowseNode} interface. */
trait XBrowseNodeFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * a factory method for the creation of XBrowseNodes ( view ) {@link com.sun.star.script.browse.BrowseNodeFactoryViewTypes} specifies the type of view to
    * be returned
    * @returns an object implementing {@link com.sun.star.script.browse.XBrowseNode}
    */
  def createView(viewType: scala.Double): XBrowseNode
}

object XBrowseNodeFactory {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createView: js.Function1[scala.Double, XBrowseNode],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XBrowseNodeFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createView")(createView)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XBrowseNodeFactory]
  }
}

