package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides for access to a container of keys, typically used for a table definition object. */
@js.native
trait XKeysSupplier extends XInterface {
  
  /**
    * returns the container of keys.
    * @returns the keys
    */
  val Keys: XIndexAccess = js.native
  
  /**
    * returns the container of keys.
    * @returns the keys
    */
  def getKeys(): XIndexAccess = js.native
}
object XKeysSupplier {
  
  @scala.inline
  def apply(
    Keys: XIndexAccess,
    acquire: () => Unit,
    getKeys: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XKeysSupplier = {
    val __obj = js.Dynamic.literal(Keys = Keys.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getKeys = js.Any.fromFunction0(getKeys), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XKeysSupplier]
  }
  
  @scala.inline
  implicit class XKeysSupplierOps[Self <: XKeysSupplier] (val x: Self) extends AnyVal {
    
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
    def setKeys(value: XIndexAccess): Self = this.set("Keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetKeys(value: () => XIndexAccess): Self = this.set("getKeys", js.Any.fromFunction0(value))
  }
}
