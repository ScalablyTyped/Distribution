package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a container of {@link DrawPages} and makes it possible for you to manipulate them.
  * @see XDrawPagesSupplier
  * @see DrawingDocument
  */
@js.native
trait DrawPages
  extends XDrawPages
     with XDrawPageSummarizer
     with XDrawPageExpander
object DrawPages {
  
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    expand: XDrawPage => XDrawPages,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    insertNewByIndex: Double => XDrawPage,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: XDrawPage => Unit,
    summarize: XDrawPages => XDrawPage
  ): DrawPages = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), expand = js.Any.fromFunction1(expand), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), insertNewByIndex = js.Any.fromFunction1(insertNewByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), summarize = js.Any.fromFunction1(summarize))
    __obj.asInstanceOf[DrawPages]
  }
}
