package typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs

import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Task (thread) local execution context for UNO. Arbitrary values can be retrieved from the context.
  *
  * You have to use UNO runtime functions to obtain the current context in your target language.
  */
trait XCurrentContext extends XInterface {
  /**
    * Gets a value from the context.
    * @param Name name of value
    * @returns value
    */
  def getValueByName(Name: String): js.Any
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
}

