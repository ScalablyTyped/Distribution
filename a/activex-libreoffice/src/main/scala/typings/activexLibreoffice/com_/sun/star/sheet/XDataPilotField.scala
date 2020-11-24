package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to control a data pilot field which has already been created.
  * @see com.sun.star.sheet.DataPilotField
  */
@js.native
trait XDataPilotField extends XInterface {
  
  /**
    * returns the collection of the data pilot items.
    * @see com.sun.star.sheet.DataPilotItems
    */
  val Items: XIndexAccess = js.native
  
  /**
    * returns the collection of the data pilot items.
    * @see com.sun.star.sheet.DataPilotItems
    */
  def getItems(): XIndexAccess = js.native
}
object XDataPilotField {
  
  @scala.inline
  def apply(
    Items: XIndexAccess,
    acquire: () => Unit,
    getItems: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataPilotField = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getItems = js.Any.fromFunction0(getItems), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataPilotField]
  }
  
  @scala.inline
  implicit class XDataPilotFieldOps[Self <: XDataPilotField] (val x: Self) extends AnyVal {
    
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
    def setItems(value: XIndexAccess): Self = this.set("Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetItems(value: () => XIndexAccess): Self = this.set("getItems", js.Any.fromFunction0(value))
  }
}
