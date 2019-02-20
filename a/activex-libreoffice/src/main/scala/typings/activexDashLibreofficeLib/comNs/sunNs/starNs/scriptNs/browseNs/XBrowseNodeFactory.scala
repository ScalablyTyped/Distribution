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

