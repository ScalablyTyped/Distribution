package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.com_.sun.star.table.TableSortDescriptor2
import typings.activexLibreoffice.com_.sun.star.table.TableSortField
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes sort criteria for sorting paragraphs or table contents in a text document.
  * @since OOo 1.1.2
  */
@js.native
trait TextSortDescriptor2 extends TableSortDescriptor2 {
  
  /** contains the character that marks the column separator when a selection of paragraphs is to be sorted. */
  var Delimiter: String = js.native
  
  /** determines if the content of a table or a selection of paragraphs is to be sorted. */
  var IsSortInTable: Boolean = js.native
}
object TextSortDescriptor2 {
  
  @scala.inline
  def apply(
    Delimiter: String,
    IsSortColumns: Boolean,
    IsSortInTable: Boolean,
    MaxSortFieldsCount: Double,
    SortFields: SafeArray[TableSortField]
  ): TextSortDescriptor2 = {
    val __obj = js.Dynamic.literal(Delimiter = Delimiter.asInstanceOf[js.Any], IsSortColumns = IsSortColumns.asInstanceOf[js.Any], IsSortInTable = IsSortInTable.asInstanceOf[js.Any], MaxSortFieldsCount = MaxSortFieldsCount.asInstanceOf[js.Any], SortFields = SortFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSortDescriptor2]
  }
  
  @scala.inline
  implicit class TextSortDescriptor2Ops[Self <: TextSortDescriptor2] (val x: Self) extends AnyVal {
    
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
    def setDelimiter(value: String): Self = this.set("Delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSortInTable(value: Boolean): Self = this.set("IsSortInTable", value.asInstanceOf[js.Any])
  }
}
