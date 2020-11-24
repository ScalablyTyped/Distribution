package typings.activexLibreoffice.com_.sun.star.report.meta

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** identifies a {@link XFunctionManager} which allows to retrieve the meta data of all supported functions. */
@js.native
trait XFunctionManager
  extends XIndexAccess
     with XComponent {
  
  /**
    * same as getByIndex.
    * @param position The position.
    * @see com.sun.star.container.XIndexAccess
    */
  def getCategory(position: Double): XFunctionCategory = js.native
  
  /**
    * get the function description by name
    * @param name the name of the function
    */
  def getFunctionByName(name: String): XFunctionDescription = js.native
}
object XFunctionManager {
  
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    getByIndex: Double => js.Any,
    getCategory: Double => XFunctionCategory,
    getCount: () => Double,
    getElementType: () => `type`,
    getFunctionByName: String => XFunctionDescription,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XFunctionManager = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getByIndex = js.Any.fromFunction1(getByIndex), getCategory = js.Any.fromFunction1(getCategory), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getFunctionByName = js.Any.fromFunction1(getFunctionByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XFunctionManager]
  }
  
  @scala.inline
  implicit class XFunctionManagerOps[Self <: XFunctionManager] (val x: Self) extends AnyVal {
    
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
    def setGetCategory(value: Double => XFunctionCategory): Self = this.set("getCategory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFunctionByName(value: String => XFunctionDescription): Self = this.set("getFunctionByName", js.Any.fromFunction1(value))
  }
}
