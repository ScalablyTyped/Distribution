package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a level in a data pilot source hierarchy.
  * @see com.sun.star.sheet.DataPilotSourceHierarchy
  * @see com.sun.star.sheet.DataPilotSource
  */
trait DataPilotSourceLevel
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed
     with XMembersSupplier
     with XDataPilotMemberResults
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** specifies whether empty members are shown. */
  var ShowEmpty: scala.Boolean
  /**
    * specifies the subtotals that are inserted for the level.
    *
    * The subtotals are calculated with the members of this level.
    */
  var SubTotals: activexDashInteropLib.SafeArray[GeneralFunction]
  /**
    * specifies the subtotals that are inserted for the level.
    *
    * The subtotals are calculated with the members of this level.
    * @since LibreOffice 5.3
    */
  var SubTotals2: activexDashInteropLib.SafeArray[scala.Double]
}

object DataPilotSourceLevel {
  @scala.inline
  def apply(
    Members: XMembersAccess,
    Name: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Results: activexDashInteropLib.SafeArray[MemberResult],
    ShowEmpty: scala.Boolean,
    SubTotals: activexDashInteropLib.SafeArray[GeneralFunction],
    SubTotals2: activexDashInteropLib.SafeArray[scala.Double],
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    getMembers: js.Function0[XMembersAccess],
    getName: js.Function0[java.lang.String],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getResults: js.Function0[activexDashInteropLib.SafeArray[MemberResult]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setName: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): DataPilotSourceLevel = {
    val __obj = js.Dynamic.literal(Members = Members, Name = Name, PropertySetInfo = PropertySetInfo, Results = Results, ShowEmpty = ShowEmpty, SubTotals = SubTotals, SubTotals2 = SubTotals2, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getMembers = getMembers, getName = getName, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getResults = getResults, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setName = setName, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[DataPilotSourceLevel]
  }
}

