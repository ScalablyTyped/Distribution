package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows an {@link XContent} to delete itself into the trash can.
  *
  * This is an additional interface the {@link XContent} representing the trash can (URL: "vnd.sun.staroffice.trashcan:///") should support.
  */
trait XRecycler
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Notify the trash can that an {@link XContent} is deleting itself into it.
    * @param Properties The trash can uses this interface to access the properties of the content being deleted, to copy them for later display etc. The trash
    * @param Identifier When the deleted content is later restored or ultimately deleted, the trash can will use this identifier to query an {@link XContent}
    */
  def trashContent(Properties: XCommandProcessor, Identifier: XContentIdentifier): scala.Unit
}

object XRecycler {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    trashContent: js.Function2[XCommandProcessor, XContentIdentifier, scala.Unit]
  ): XRecycler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("trashContent")(trashContent)
    __obj.asInstanceOf[XRecycler]
  }
}

