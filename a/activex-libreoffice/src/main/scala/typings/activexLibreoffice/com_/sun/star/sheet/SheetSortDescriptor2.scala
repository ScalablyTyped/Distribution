package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.activexLibreoffice.com_.sun.star.table.TableSortDescriptor2
import typings.activexLibreoffice.com_.sun.star.table.TableSortField
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a description of how a cell range is to be sorted.
  *
  * This service extends the {@link com.sun.star.table.TableSortDescriptor2} service with spreadsheet specific properties.
  * @since OOo 1.1.2
  */
trait SheetSortDescriptor2
  extends StObject
     with TableSortDescriptor2 {
  
  /** specifies if cell formats are moved with the contents they belong to. */
  var BindFormatsToContent: Boolean
  
  /**
    * specifies whether the first row or column (depending on {@link com.sun.star.table.TableSortDescriptor.Orientation} ) is a header which should not be
    * sorted.
    */
  var ContainsHeader: Boolean
  
  /** specifies if the sorted data should be copied to another position in the document. */
  var CopyOutputData: Boolean
  
  /** specifies if a user defined sorting list is used. */
  var IsUserListEnabled: Boolean
  
  /**
    * specifies the position where sorted data are to be copied.
    *
    * This property is only used, if {@link SheetSortDescriptor.CopyOutputData} is `TRUE` .
    */
  var OutputPosition: CellAddress
  
  /**
    * specifies which user defined sorting list is used.
    *
    * This property is only used, if {@link SheetSortDescriptor.IsUserListEnabled} is `TRUE` .
    */
  var UserListIndex: Double
}
object SheetSortDescriptor2 {
  
  inline def apply(
    BindFormatsToContent: Boolean,
    ContainsHeader: Boolean,
    CopyOutputData: Boolean,
    IsSortColumns: Boolean,
    IsUserListEnabled: Boolean,
    MaxSortFieldsCount: Double,
    OutputPosition: CellAddress,
    SortFields: SafeArray[TableSortField],
    UserListIndex: Double
  ): SheetSortDescriptor2 = {
    val __obj = js.Dynamic.literal(BindFormatsToContent = BindFormatsToContent.asInstanceOf[js.Any], ContainsHeader = ContainsHeader.asInstanceOf[js.Any], CopyOutputData = CopyOutputData.asInstanceOf[js.Any], IsSortColumns = IsSortColumns.asInstanceOf[js.Any], IsUserListEnabled = IsUserListEnabled.asInstanceOf[js.Any], MaxSortFieldsCount = MaxSortFieldsCount.asInstanceOf[js.Any], OutputPosition = OutputPosition.asInstanceOf[js.Any], SortFields = SortFields.asInstanceOf[js.Any], UserListIndex = UserListIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetSortDescriptor2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SheetSortDescriptor2] (val x: Self) extends AnyVal {
    
    inline def setBindFormatsToContent(value: Boolean): Self = StObject.set(x, "BindFormatsToContent", value.asInstanceOf[js.Any])
    
    inline def setContainsHeader(value: Boolean): Self = StObject.set(x, "ContainsHeader", value.asInstanceOf[js.Any])
    
    inline def setCopyOutputData(value: Boolean): Self = StObject.set(x, "CopyOutputData", value.asInstanceOf[js.Any])
    
    inline def setIsUserListEnabled(value: Boolean): Self = StObject.set(x, "IsUserListEnabled", value.asInstanceOf[js.Any])
    
    inline def setOutputPosition(value: CellAddress): Self = StObject.set(x, "OutputPosition", value.asInstanceOf[js.Any])
    
    inline def setUserListIndex(value: Double): Self = StObject.set(x, "UserListIndex", value.asInstanceOf[js.Any])
  }
}
