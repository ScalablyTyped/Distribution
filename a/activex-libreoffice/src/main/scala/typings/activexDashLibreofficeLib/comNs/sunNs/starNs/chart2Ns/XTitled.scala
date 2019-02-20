package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface to be implemented by objects that support having a title of type {@link XTitle} . */
trait XTitled
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** get the object holding the title's content and formatting */
  var TitleObject: XTitle
  /** get the object holding the title's content and formatting */
  def getTitleObject(): XTitle
  /** set a new title object replacing the former one */
  def setTitleObject(Title: XTitle): scala.Unit
}

