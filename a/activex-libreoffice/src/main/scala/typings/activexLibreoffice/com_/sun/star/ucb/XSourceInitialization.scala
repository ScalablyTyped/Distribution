package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the initialization of a component with any source object. */
@js.native
trait XSourceInitialization extends XInterface {
  
  /**
    * provides the initialization of a component with any source object.
    *
    * The service description has to specify which type of interface must be set as parameter.
    *
    * Hopefully you will only use this, when **Source** is an {@link com.sun.star.lang.XComponent} and this is an {@link com.sun.star.lang.XEventListener} .
    * Than you should call {@link com.sun.star.lang.XComponent.addEventListener()} from inside the implementation of this method.
    * @param Source the source.
    * @throws AlreadyInitializedException if this method is called more than once during the lifetime of the object implementing this interface.
    */
  def setSource(Source: XInterface): Unit = js.native
}
object XSourceInitialization {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setSource: XInterface => Unit
  ): XSourceInitialization = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[XSourceInitialization]
  }
  
  @scala.inline
  implicit class XSourceInitializationOps[Self <: XSourceInitialization] (val x: Self) extends AnyVal {
    
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
    def setSetSource(value: XInterface => Unit): Self = this.set("setSource", js.Any.fromFunction1(value))
  }
}
