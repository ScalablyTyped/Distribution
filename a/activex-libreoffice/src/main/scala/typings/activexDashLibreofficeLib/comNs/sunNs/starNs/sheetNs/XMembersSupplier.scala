package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the collection of members of a data pilot source level.
  * @see com.sun.star.sheet.DataPilotSourceLevel
  * @see com.sun.star.sheet.DataPilotSource
  */
trait XMembersSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the collection of members.
    * @see com.sun.star.sheet.DataPilotSourceMembers
    */
  val Members: XMembersAccess
  /**
    * returns the collection of members.
    * @see com.sun.star.sheet.DataPilotSourceMembers
    */
  def getMembers(): XMembersAccess
}

object XMembersSupplier {
  @scala.inline
  def apply(
    Members: XMembersAccess,
    acquire: js.Function0[scala.Unit],
    getMembers: js.Function0[XMembersAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMembersSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Members")(Members)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getMembers")(getMembers)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XMembersSupplier]
  }
}

