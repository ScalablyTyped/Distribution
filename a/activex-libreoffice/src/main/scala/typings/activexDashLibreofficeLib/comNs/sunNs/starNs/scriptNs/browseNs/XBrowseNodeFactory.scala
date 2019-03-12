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
    acquire: () => scala.Unit,
    createView: scala.Double => XBrowseNode,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XBrowseNodeFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createView = js.Any.fromFunction1(createView), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XBrowseNodeFactory]
  }
}

