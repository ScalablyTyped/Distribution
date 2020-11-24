package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides methods to remove an element of its container and to drop it from the related database. */
@js.native
trait XDrop extends XInterface {
  
  /**
    * drops an object of the related container identified by its position.
    * @param index the position of the element to be dropped
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def dropByIndex(index: Double): Unit = js.native
  
  /**
    * drops an object of the related container identified by its name.
    * @param elementName the name of the element to be dropped
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def dropByName(elementName: String): Unit = js.native
}
object XDrop {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    dropByIndex: Double => Unit,
    dropByName: String => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDrop = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dropByIndex = js.Any.fromFunction1(dropByIndex), dropByName = js.Any.fromFunction1(dropByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDrop]
  }
  
  @scala.inline
  implicit class XDropOps[Self <: XDrop] (val x: Self) extends AnyVal {
    
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
    def setDropByIndex(value: Double => Unit): Self = this.set("dropByIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropByName(value: String => Unit): Self = this.set("dropByName", js.Any.fromFunction1(value))
  }
}
