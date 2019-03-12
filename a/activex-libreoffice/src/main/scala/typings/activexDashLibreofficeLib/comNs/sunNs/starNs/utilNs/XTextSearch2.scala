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
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    searchBackward: (java.lang.String, scala.Double, scala.Double) => SearchResult,
    searchForward: (java.lang.String, scala.Double, scala.Double) => SearchResult,
    setOptions: SearchOptions => scala.Unit,
    setOptions2: SearchOptions2 => scala.Unit
  ): XTextSearch2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), searchBackward = js.Any.fromFunction3(searchBackward), searchForward = js.Any.fromFunction3(searchForward), setOptions = js.Any.fromFunction1(setOptions), setOptions2 = js.Any.fromFunction1(setOptions2))
  
    __obj.asInstanceOf[XTextSearch2]
  }
}

