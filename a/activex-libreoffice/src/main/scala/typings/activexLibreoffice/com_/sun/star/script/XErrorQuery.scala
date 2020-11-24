package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XErrorQuery extends XInterface {
  
  /**
    * Returns whether this object has an error
    * @returns `boolean` indicating an error or not
    */
  def hasError(): Boolean = js.native
}
object XErrorQuery {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    hasError: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XErrorQuery = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), hasError = js.Any.fromFunction0(hasError), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XErrorQuery]
  }
  
  @scala.inline
  implicit class XErrorQueryOps[Self <: XErrorQuery] (val x: Self) extends AnyVal {
    
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
    def setHasError(value: () => Boolean): Self = this.set("hasError", js.Any.fromFunction0(value))
  }
}
