package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to access named objects within a container.
  *
  * To implement inaccurate name access, support the {@link com.sun.star.beans.XExactName} interface.
  * @see com.sun.star.beans.XExactName
  */
@js.native
trait XNameAccess extends XElementAccess {
  
  /** @returns a sequence of all element names in this container.  The order of the names is not specified. */
  val ElementNames: SafeArray[String] = js.native
  
  /**
    * @param aName the name of the object.
    * @returns the object with the specified name.
    * @throws NoSuchElementException if an element under Name does not exist.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def getByName(aName: String): js.Any = js.native
  
  /** @returns a sequence of all element names in this container.  The order of the names is not specified. */
  def getElementNames(): SafeArray[String] = js.native
  
  /**
    * @param aName the name of the object.
    * @returns `TRUE` if an element with this name is in the container, `FALSE` otherwise.  In many cases the next call is {@link XNameAccess.getByName()} . You
    */
  def hasByName(aName: String): Boolean = js.native
}
object XNameAccess {
  
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNameAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNameAccess]
  }
  
  @scala.inline
  implicit class XNameAccessOps[Self <: XNameAccess] (val x: Self) extends AnyVal {
    
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
    def setElementNames(value: SafeArray[String]): Self = this.set("ElementNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetByName(value: String => js.Any): Self = this.set("getByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementNames(value: () => SafeArray[String]): Self = this.set("getElementNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasByName(value: String => Boolean): Self = this.set("hasByName", js.Any.fromFunction1(value))
  }
}
