package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a description of how subtotals are created.
  *
  * The descriptor contains properties and a collection of subtotal fields which control the behavior of operation.
  */
@js.native
trait SubTotalDescriptor
  extends XEnumerationAccess
     with XSubTotalDescriptor
     with XIndexAccess
     with XPropertySet {
  
  /** specifies if cell formats are moved with the contents they belong to. */
  var BindFormatsToContent: Boolean = js.native
  
  /** specifies if the contents of the fields will be sorted to groups while performing a subtotal operation. */
  var EnableSort: Boolean = js.native
  
  /** specifies if a user defined sorting list is used. */
  var EnableUserSortList: Boolean = js.native
  
  /** specifies if page breaks are inserted after each group change. */
  var InsertPageBreaks: Boolean = js.native
  
  /** specifies if the case of letters is important when comparing entries. */
  var IsCaseSensitive: Boolean = js.native
  
  /**
    * returns the maximum number of subtotal fields the descriptor can hold.
    *
    * This read-only property indicates the maximum count of fields the current implementation supports.
    */
  var MaxFieldCount: Double = js.native
  
  /** specifies the sorting order if {@link SubTotalDescriptor.EnableSort} is set to `TRUE` . */
  var SortAscending: Boolean = js.native
  
  /**
    * specifies which user defined sorting list is used.
    *
    * This property is only used if {@link SubTotalDescriptor.EnableUserSortList} is `TRUE` .
    */
  var UserSortListIndex: Double = js.native
}
object SubTotalDescriptor {
  
  @scala.inline
  def apply(
    BindFormatsToContent: Boolean,
    Count: Double,
    ElementType: `type`,
    EnableSort: Boolean,
    EnableUserSortList: Boolean,
    InsertPageBreaks: Boolean,
    IsCaseSensitive: Boolean,
    MaxFieldCount: Double,
    PropertySetInfo: XPropertySetInfo,
    SortAscending: Boolean,
    UserSortListIndex: Double,
    acquire: () => Unit,
    addNew: (SeqEquiv[SubTotalColumn], Double) => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    clear: () => Unit,
    createEnumeration: () => XEnumeration,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): SubTotalDescriptor = {
    val __obj = js.Dynamic.literal(BindFormatsToContent = BindFormatsToContent.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], EnableSort = EnableSort.asInstanceOf[js.Any], EnableUserSortList = EnableUserSortList.asInstanceOf[js.Any], InsertPageBreaks = InsertPageBreaks.asInstanceOf[js.Any], IsCaseSensitive = IsCaseSensitive.asInstanceOf[js.Any], MaxFieldCount = MaxFieldCount.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any], UserSortListIndex = UserSortListIndex.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addNew = js.Any.fromFunction2(addNew), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), clear = js.Any.fromFunction0(clear), createEnumeration = js.Any.fromFunction0(createEnumeration), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[SubTotalDescriptor]
  }
  
  @scala.inline
  implicit class SubTotalDescriptorOps[Self <: SubTotalDescriptor] (val x: Self) extends AnyVal {
    
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
    def setBindFormatsToContent(value: Boolean): Self = this.set("BindFormatsToContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSort(value: Boolean): Self = this.set("EnableSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUserSortList(value: Boolean): Self = this.set("EnableUserSortList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertPageBreaks(value: Boolean): Self = this.set("InsertPageBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCaseSensitive(value: Boolean): Self = this.set("IsCaseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFieldCount(value: Double): Self = this.set("MaxFieldCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortAscending(value: Boolean): Self = this.set("SortAscending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSortListIndex(value: Double): Self = this.set("UserSortListIndex", value.asInstanceOf[js.Any])
  }
}
