package typings.activexLibreoffice.com_.sun.star.form.binding

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies support for indirect manipulation of a string list */
@js.native
trait XListEntrySink extends XInterface {
  
  /** retrieves the current source for the list entries of the component. */
  var ListEntrySource: XListEntrySource = js.native
  
  /** retrieves the current source for the list entries of the component. */
  def getListEntrySource(): XListEntrySource = js.native
  
  /**
    * sets the new source for the list entries of the component
    *
    * The list represented by this component will be cleared, and initially filled with the entries from the new list source.
    * @param Source the new source for the list entries. May be `NULL` , in this case, the current source is revoked.
    */
  def setListEntrySource(Source: XListEntrySource): Unit = js.native
}
object XListEntrySink {
  
  @scala.inline
  def apply(
    ListEntrySource: XListEntrySource,
    acquire: () => Unit,
    getListEntrySource: () => XListEntrySource,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setListEntrySource: XListEntrySource => Unit
  ): XListEntrySink = {
    val __obj = js.Dynamic.literal(ListEntrySource = ListEntrySource.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getListEntrySource = js.Any.fromFunction0(getListEntrySource), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setListEntrySource = js.Any.fromFunction1(setListEntrySource))
    __obj.asInstanceOf[XListEntrySink]
  }
  
  @scala.inline
  implicit class XListEntrySinkOps[Self <: XListEntrySink] (val x: Self) extends AnyVal {
    
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
    def setListEntrySource(value: XListEntrySource): Self = this.set("ListEntrySource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetListEntrySource(value: () => XListEntrySource): Self = this.set("getListEntrySource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetListEntrySource(value: XListEntrySource => Unit): Self = this.set("setListEntrySource", js.Any.fromFunction1(value))
  }
}
