package typings.activexLibreoffice.com_.sun.star.form.binding

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a source of string list entries
  *
  * The interface supports foreign components which actively retrieve list entries, as well as components which want to passively being notified of
  * changes in the list.
  * @see XListEntrySink
  */
@js.native
trait XListEntrySource extends XInterface {
  
  /** provides access to the entirety of all list entries */
  val AllListEntries: SafeArray[String] = js.native
  
  /** retrieves the number of entries in the list */
  val ListEntryCount: Double = js.native
  
  /**
    * adds a listener which will be notified about changes in the list reflected by the component.
    * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
    */
  def addListEntryListener(Listener: XListEntryListener): Unit = js.native
  
  /** provides access to the entirety of all list entries */
  def getAllListEntries(): SafeArray[String] = js.native
  
  /**
    * provides access to a single list entry
    * @see getListEntryCount
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given position does not denote a valid index in the list
    */
  def getListEntry(Position: Double): String = js.native
  
  /** retrieves the number of entries in the list */
  def getListEntryCount(): Double = js.native
  
  /**
    * revokes the given listener from the list of components which will be notified about changes in the entry list.
    * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
    */
  def removeListEntryListener(Listener: XListEntryListener): Unit = js.native
}
object XListEntrySource {
  
  @scala.inline
  def apply(
    AllListEntries: SafeArray[String],
    ListEntryCount: Double,
    acquire: () => Unit,
    addListEntryListener: XListEntryListener => Unit,
    getAllListEntries: () => SafeArray[String],
    getListEntry: Double => String,
    getListEntryCount: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeListEntryListener: XListEntryListener => Unit
  ): XListEntrySource = {
    val __obj = js.Dynamic.literal(AllListEntries = AllListEntries.asInstanceOf[js.Any], ListEntryCount = ListEntryCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addListEntryListener = js.Any.fromFunction1(addListEntryListener), getAllListEntries = js.Any.fromFunction0(getAllListEntries), getListEntry = js.Any.fromFunction1(getListEntry), getListEntryCount = js.Any.fromFunction0(getListEntryCount), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListEntryListener = js.Any.fromFunction1(removeListEntryListener))
    __obj.asInstanceOf[XListEntrySource]
  }
  
  @scala.inline
  implicit class XListEntrySourceOps[Self <: XListEntrySource] (val x: Self) extends AnyVal {
    
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
    def setAllListEntries(value: SafeArray[String]): Self = this.set("AllListEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListEntryCount(value: Double): Self = this.set("ListEntryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddListEntryListener(value: XListEntryListener => Unit): Self = this.set("addListEntryListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAllListEntries(value: () => SafeArray[String]): Self = this.set("getAllListEntries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetListEntry(value: Double => String): Self = this.set("getListEntry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetListEntryCount(value: () => Double): Self = this.set("getListEntryCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveListEntryListener(value: XListEntryListener => Unit): Self = this.set("removeListEntryListener", js.Any.fromFunction1(value))
  }
}
