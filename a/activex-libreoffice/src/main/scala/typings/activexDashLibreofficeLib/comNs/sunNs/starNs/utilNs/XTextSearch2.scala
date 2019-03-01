package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enables an object to search in its content. */
trait XTextSearch2 extends XTextSearch {
  /** set the options for the forward or backward search. */
  def setOptions2(options: SearchOptions2): scala.Unit
}

object XTextSearch2 {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    searchBackward: js.Function3[java.lang.String, scala.Double, scala.Double, SearchResult],
    searchForward: js.Function3[java.lang.String, scala.Double, scala.Double, SearchResult],
    setOptions: js.Function1[SearchOptions, scala.Unit],
    setOptions2: js.Function1[SearchOptions2, scala.Unit]
  ): XTextSearch2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("searchBackward")(searchBackward)
    __obj.updateDynamic("searchForward")(searchForward)
    __obj.updateDynamic("setOptions")(setOptions)
    __obj.updateDynamic("setOptions2")(setOptions2)
    __obj.asInstanceOf[XTextSearch2]
  }
}

