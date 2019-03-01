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
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    replaceByUniqueID: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): XImplicitIDReplace = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("replaceByUniqueID")(replaceByUniqueID)
    __obj.asInstanceOf[XImplicitIDReplace]
  }
}

