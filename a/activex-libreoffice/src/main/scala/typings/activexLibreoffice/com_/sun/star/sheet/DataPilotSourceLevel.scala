package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a level in a data pilot source hierarchy.
  * @see com.sun.star.sheet.DataPilotSourceHierarchy
  * @see com.sun.star.sheet.DataPilotSource
  */
@js.native
trait DataPilotSourceLevel
  extends XNamed
     with XMembersSupplier
     with XDataPilotMemberResults
     with XPropertySet {
  /** specifies whether empty members are shown. */
  var ShowEmpty: Boolean = js.native
  /**
    * specifies the subtotals that are inserted for the level.
    *
    * The subtotals are calculated with the members of this level.
    */
  var SubTotals: SafeArray[GeneralFunction] = js.native
  /**
    * specifies the subtotals that are inserted for the level.
    *
    * The subtotals are calculated with the members of this level.
    * @since LibreOffice 5.3
    */
  var SubTotals2: SafeArray[Double] = js.native
}

object DataPilotSourceLevel {
  @scala.inline
  def apply(
    Members: XMembersAccess,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    Results: SafeArray[MemberResult],
    ShowEmpty: Boolean,
    SubTotals: SafeArray[GeneralFunction],
    SubTotals2: SafeArray[Double],
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getMembers: () => XMembersAccess,
    getName: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getResults: () => SafeArray[MemberResult],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setName: String => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DataPilotSourceLevel = {
    val __obj = js.Dynamic.literal(Members = Members.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Results = Results.asInstanceOf[js.Any], ShowEmpty = ShowEmpty.asInstanceOf[js.Any], SubTotals = SubTotals.asInstanceOf[js.Any], SubTotals2 = SubTotals2.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getMembers = js.Any.fromFunction0(getMembers), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getResults = js.Any.fromFunction0(getResults), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DataPilotSourceLevel]
  }
  @scala.inline
  implicit class DataPilotSourceLevelOps[Self <: DataPilotSourceLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setShowEmpty(value: Boolean): Self = this.set("ShowEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubTotals(value: SafeArray[GeneralFunction]): Self = this.set("SubTotals", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubTotals2(value: SafeArray[Double]): Self = this.set("SubTotals2", value.asInstanceOf[js.Any])
  }
  
}

