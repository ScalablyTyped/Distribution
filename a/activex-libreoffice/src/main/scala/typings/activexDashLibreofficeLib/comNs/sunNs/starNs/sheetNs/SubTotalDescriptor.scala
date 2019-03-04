package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a description of how subtotals are created.
  *
  * The descriptor contains properties and a collection of subtotal fields which control the behavior of operation.
  */
trait SubTotalDescriptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with XSubTotalDescriptor
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** specifies if cell formats are moved with the contents they belong to. */
  var BindFormatsToContent: scala.Boolean
  /** specifies if the contents of the fields will be sorted to groups while performing a subtotal operation. */
  var EnableSort: scala.Boolean
  /** specifies if a user defined sorting list is used. */
  var EnableUserSortList: scala.Boolean
  /** specifies if page breaks are inserted after each group change. */
  var InsertPageBreaks: scala.Boolean
  /** specifies if the case of letters is important when comparing entries. */
  var IsCaseSensitive: scala.Boolean
  /**
    * returns the maximum number of subtotal fields the descriptor can hold.
    *
    * This read-only property indicates the maximum count of fields the current implementation supports.
    */
  var MaxFieldCount: scala.Double
  /** specifies the sorting order if {@link SubTotalDescriptor.EnableSort} is set to `TRUE` . */
  var SortAscending: scala.Boolean
  /**
    * specifies which user defined sorting list is used.
    *
    * This property is only used if {@link SubTotalDescriptor.EnableUserSortList} is `TRUE` .
    */
  var UserSortListIndex: scala.Double
}

object SubTotalDescriptor {
  @scala.inline
  def apply(
    BindFormatsToContent: scala.Boolean,
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    EnableSort: scala.Boolean,
    EnableUserSortList: scala.Boolean,
    InsertPageBreaks: scala.Boolean,
    IsCaseSensitive: scala.Boolean,
    MaxFieldCount: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SortAscending: scala.Boolean,
    UserSortListIndex: scala.Double,
    acquire: js.Function0[scala.Unit],
    addNew: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[SubTotalColumn], 
      scala.Double, 
      scala.Unit
    ],
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
    clear: js.Function0[scala.Unit],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    hasElements: js.Function0[scala.Boolean],
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
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): SubTotalDescriptor = {
    val __obj = js.Dynamic.literal(BindFormatsToContent = BindFormatsToContent, Count = Count, ElementType = ElementType, EnableSort = EnableSort, EnableUserSortList = EnableUserSortList, InsertPageBreaks = InsertPageBreaks, IsCaseSensitive = IsCaseSensitive, MaxFieldCount = MaxFieldCount, PropertySetInfo = PropertySetInfo, SortAscending = SortAscending, UserSortListIndex = UserSortListIndex, acquire = acquire, addNew = addNew, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, clear = clear, createEnumeration = createEnumeration, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, hasElements = hasElements, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[SubTotalDescriptor]
  }
}

