package typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to replace contents in a collection by an implicit (unique) ID: */
trait XImplicitIDReplace extends XInterface {
  /** replaces the content which is specified by its implicit (unique) ID with a new content. */
  def replaceByUniqueID(ID: String, aNewElement: js.Any): Unit
}

object XImplicitIDReplace {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    replaceByUniqueID: (String, js.Any) => Unit
  ): XImplicitIDReplace = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceByUniqueID = js.Any.fromFunction2(replaceByUniqueID))
  
    __obj.asInstanceOf[XImplicitIDReplace]
  }
}

