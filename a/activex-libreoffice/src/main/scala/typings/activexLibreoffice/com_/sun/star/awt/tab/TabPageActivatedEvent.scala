package typings.activexLibreoffice.com_.sun.star.awt.tab

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event used by a {@link XTabPageContainer} to notify changes in tab page activation.
  * @since OOo 3.4
  */
@js.native
trait TabPageActivatedEvent extends EventObject {
  
  /** Contains the ID of the tab page */
  var TabPageID: Double = js.native
}
object TabPageActivatedEvent {
  
  @scala.inline
  def apply(Source: XInterface, TabPageID: Double): TabPageActivatedEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], TabPageID = TabPageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabPageActivatedEvent]
  }
  
  @scala.inline
  implicit class TabPageActivatedEventOps[Self <: TabPageActivatedEvent] (val x: Self) extends AnyVal {
    
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
    def setTabPageID(value: Double): Self = this.set("TabPageID", value.asInstanceOf[js.Any])
  }
}
