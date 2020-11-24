package typings.activexLibreoffice.com_.sun.star.sdb.application

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies an event happening while copying table data between databases.
  *
  * Whenever this event is fired to an {@link XCopyTableListener} , {@link com.sun.star.lang.EventObject.Source} contains the wizard instance which
  * actually does the copying.
  * @see CopyTableWizard
  */
@js.native
trait CopyTableRowEvent extends EventObject {
  
  /**
    * denotes the error which happened while copying the data.
    *
    * Usually, this contains an instance of {@link com.sun.star.sdbc.SQLException} .
    */
  var Error: js.Any = js.native
  
  /** contains the result set which is being copied by the wizard currently. */
  var SourceData: XResultSet = js.native
}
object CopyTableRowEvent {
  
  @scala.inline
  def apply(Error: js.Any, Source: XInterface, SourceData: XResultSet): CopyTableRowEvent = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], SourceData = SourceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyTableRowEvent]
  }
  
  @scala.inline
  implicit class CopyTableRowEventOps[Self <: CopyTableRowEvent] (val x: Self) extends AnyVal {
    
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
    def setError(value: js.Any): Self = this.set("Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceData(value: XResultSet): Self = this.set("SourceData", value.asInstanceOf[js.Any])
  }
}
