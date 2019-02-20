package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.metaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** identifies a {@link XFunctionManager} which allows to retrieve the meta data of all supported functions. */
trait XFunctionManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /**
    * same as getByIndex.
    * @param position The position.
    * @see com.sun.star.container.XIndexAccess
    */
  def getCategory(position: scala.Double): XFunctionCategory
  /**
    * get the function description by name
    * @param name the name of the function
    */
  def getFunctionByName(name: java.lang.String): XFunctionDescription
}

