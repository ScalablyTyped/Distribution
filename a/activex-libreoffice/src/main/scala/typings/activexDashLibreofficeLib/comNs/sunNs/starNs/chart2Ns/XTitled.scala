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

object XTitled {
  @scala.inline
  def apply(
    TitleObject: XTitle,
    acquire: js.Function0[scala.Unit],
    getTitleObject: js.Function0[XTitle],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setTitleObject: js.Function1[XTitle, scala.Unit]
  ): XTitled = {
    val __obj = js.Dynamic.literal(TitleObject = TitleObject, acquire = acquire, getTitleObject = getTitleObject, queryInterface = queryInterface, release = release, setTitleObject = setTitleObject)
  
    __obj.asInstanceOf[XTitled]
  }
}

