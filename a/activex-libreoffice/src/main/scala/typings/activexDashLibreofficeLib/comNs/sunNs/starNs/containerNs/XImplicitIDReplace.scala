package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to replace contents in a collection by an implicit (unique) ID: */
trait XImplicitIDReplace
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** replaces the content which is specified by its implicit (unique) ID with a new content. */
  def replaceByUniqueID(ID: java.lang.String, aNewElement: js.Any): scala.Unit
}

object XImplicitIDReplace {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    replaceByUniqueID: (java.lang.String, js.Any) => scala.Unit
  ): XImplicitIDReplace = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceByUniqueID = js.Any.fromFunction2(replaceByUniqueID))
  
    __obj.asInstanceOf[XImplicitIDReplace]
  }
}

