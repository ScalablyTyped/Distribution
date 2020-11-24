package typings.activexLibreoffice.com_.sun.star.awt.grid

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * used to notify changes in the data represented by an {@link XMutableGridDataModel} .
  *
  * Effectively, a `GridDataEvent` denotes a continuous two-dimensional cell range within a grid's data model, which is affected by a certain change.
  * @see XMutableGridDataModel
  * @see XGridDataListener
  * @since OOo 3.3
  */
@js.native
trait GridDataEvent extends EventObject {
  
  /**
    * denotes the first column affected by a change.
    *
    * If `FirstColumn` is -1, the listener should assume that all rows of a grid's data model are affected.
    */
  var FirstColumn: Double = js.native
  
  /**
    * denotes the first row affected by a change.
    *
    * If `FirstRow` is -1, the listener should assume that all rows of a grid's data model are affected.
    */
  var FirstRow: Double = js.native
  
  /** denotes the last column affected by a change */
  var LastColumn: Double = js.native
  
  /** denotes the last row affected by a change */
  var LastRow: Double = js.native
}
object GridDataEvent {
  
  @scala.inline
  def apply(FirstColumn: Double, FirstRow: Double, LastColumn: Double, LastRow: Double, Source: XInterface): GridDataEvent = {
    val __obj = js.Dynamic.literal(FirstColumn = FirstColumn.asInstanceOf[js.Any], FirstRow = FirstRow.asInstanceOf[js.Any], LastColumn = LastColumn.asInstanceOf[js.Any], LastRow = LastRow.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridDataEvent]
  }
  
  @scala.inline
  implicit class GridDataEventOps[Self <: GridDataEvent] (val x: Self) extends AnyVal {
    
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
    def setFirstColumn(value: Double): Self = this.set("FirstColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstRow(value: Double): Self = this.set("FirstRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastColumn(value: Double): Self = this.set("LastColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRow(value: Double): Self = this.set("LastRow", value.asInstanceOf[js.Any])
  }
}
