package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.metaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** identifies a {@link XFunctionCategory} which allows to retrieve the meta data of all supported functions. */
trait XFunctionCategory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** returns the localized category's name. */
  var Name: java.lang.String
  /** specifies the category number. */
  var Number: scala.Double
  /**
    * same as getByIndex.
    * @see com.sun.star.container.XIndexAccess
    */
  def getFunction(position: scala.Double): XFunctionDescription
}

