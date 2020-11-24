package typings.activexLibreoffice.com_.sun.star.bridge

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to export UNO objects to other processes.
  * @see XBridge
  */
@js.native
trait XInstanceProvider extends XInterface {
  
  /**
    * gets called, when an initial object is requested from a remote process. You may either create a new instance or return an existing object.
    * @param sInstanceName The name of the requested object.
    * @returns the object associated with the name. The return value may be null in case there is no object to offer for this string. In this case, {@link XBrid
    * @throws NoSuchElementException You may throw this exception to indicate, that there is no object for this name. Due to a specification bug, this exceptio
    */
  def getInstance(sInstanceName: String): XInterface = js.native
}
object XInstanceProvider {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getInstance: String => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInstanceProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getInstance = js.Any.fromFunction1(getInstance), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInstanceProvider]
  }
  
  @scala.inline
  implicit class XInstanceProviderOps[Self <: XInstanceProvider] (val x: Self) extends AnyVal {
    
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
    def setGetInstance(value: String => XInterface): Self = this.set("getInstance", js.Any.fromFunction1(value))
  }
}
