package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the collection of members of a data pilot source level.
  * @see com.sun.star.sheet.DataPilotSourceLevel
  * @see com.sun.star.sheet.DataPilotSource
  */
trait XMembersSupplier extends XInterface {
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
    acquire: () => Unit,
    getMembers: () => XMembersAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMembersSupplier = {
    val __obj = js.Dynamic.literal(Members = Members, acquire = js.Any.fromFunction0(acquire), getMembers = js.Any.fromFunction0(getMembers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMembersSupplier]
  }
}

