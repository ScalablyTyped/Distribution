package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * supplies functions to change or get information about the storage of a user interface configuration manager.
  * @since OOo 2.0
  */
@js.native
trait XUIConfigurationStorage extends XInterface {
  
  /**
    * checks if an instance has already a storage to load/store its data.
    * @returns `TRUE` if the instance has a storage otherwise `FALSE` .
    */
  def hasStorage(): Boolean = js.native
  
  /**
    * connects a storage to the user interface configuration manager which is used on subsequent calls of load() and store().
    * @param Storage all configuration data is loaded/stored from/into this storage. If the storage is in read/write mode load() and store() can be used other
    */
  def setStorage(Storage: XStorage): Unit = js.native
}
object XUIConfigurationStorage {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    hasStorage: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setStorage: XStorage => Unit
  ): XUIConfigurationStorage = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), hasStorage = js.Any.fromFunction0(hasStorage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setStorage = js.Any.fromFunction1(setStorage))
    __obj.asInstanceOf[XUIConfigurationStorage]
  }
  
  @scala.inline
  implicit class XUIConfigurationStorageOps[Self <: XUIConfigurationStorage] (val x: Self) extends AnyVal {
    
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
    def setHasStorage(value: () => Boolean): Self = this.set("hasStorage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetStorage(value: XStorage => Unit): Self = this.set("setStorage", js.Any.fromFunction1(value))
  }
}
