package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to a container of {@link DrawPages} or {@link MasterPages} .
  *
  * The pages are stored in an index container. The order is determined by the index.
  *
  * You usually get this interface if you use the {@link XDrawPagesSupplier} or the {@link XMasterPagesSupplier} at a model that contains {@link
  * DrawPages} or {@link MasterPages}
  */
@js.native
trait XDrawPages extends XIndexAccess {
  
  /**
    * creates and inserts a new {@link DrawPage} or {@link MasterPage} into this container
    * @param nIndex the index at which the newly created {@link DrawPage} or {@link MasterPage} will be inserted.
    * @returns the newly created and already inserted {@link DrawPage} or {@link MasterPage} .
    */
  def insertNewByIndex(nIndex: Double): XDrawPage = js.native
  
  /**
    * removes a {@link DrawPage} or {@link MasterPage} from this container.
    * @param xPage this {@link DrawPage} or {@link MasterPage} must be contained and will be removed from this container. It will also be disposed and shouldn
    */
  def remove(xPage: XDrawPage): Unit = js.native
}
object XDrawPages {
  
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    insertNewByIndex: Double => XDrawPage,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: XDrawPage => Unit
  ): XDrawPages = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), insertNewByIndex = js.Any.fromFunction1(insertNewByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[XDrawPages]
  }
  
  @scala.inline
  implicit class XDrawPagesOps[Self <: XDrawPages] (val x: Self) extends AnyVal {
    
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
    def setInsertNewByIndex(value: Double => XDrawPage): Self = this.set("insertNewByIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: XDrawPage => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
}
