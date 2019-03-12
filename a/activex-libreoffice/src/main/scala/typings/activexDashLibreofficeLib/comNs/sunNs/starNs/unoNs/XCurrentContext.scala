package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs

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
  def getValueByName(Name: java.lang.String): js.Any
}

object XCurrentContext {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getValueByName: java.lang.String => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XCurrentContext = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getValueByName = js.Any.fromFunction1(getValueByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCurrentContext]
  }
}

