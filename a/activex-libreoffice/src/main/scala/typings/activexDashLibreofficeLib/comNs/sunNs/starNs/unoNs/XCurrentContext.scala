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
    acquire: js.Function0[scala.Unit],
    getValueByName: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCurrentContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getValueByName")(getValueByName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XCurrentContext]
  }
}

