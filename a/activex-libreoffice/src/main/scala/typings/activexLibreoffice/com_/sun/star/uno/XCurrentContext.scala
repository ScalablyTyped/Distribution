package typings.activexLibreoffice.com_.sun.star.uno

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Task (thread) local execution context for UNO. Arbitrary values can be retrieved from the context.
  *
  * You have to use UNO runtime functions to obtain the current context in your target language.
  */
@js.native
trait XCurrentContext extends XInterface {
  
  /**
    * Gets a value from the context.
    * @param Name name of value
    * @returns value
    */
  def getValueByName(Name: String): js.Any = js.native
}
object XCurrentContext {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getValueByName: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCurrentContext = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getValueByName = js.Any.fromFunction1(getValueByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCurrentContext]
  }
  
  @scala.inline
  implicit class XCurrentContextOps[Self <: XCurrentContext] (val x: Self) extends AnyVal {
    
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
    def setGetValueByName(value: String => js.Any): Self = this.set("getValueByName", js.Any.fromFunction1(value))
  }
}
