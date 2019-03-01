package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Expands macro in expressions, i.e. substitudes macro names.
  * @since OOo 1.1.2
  */
trait XMacroExpander
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Expands macrofied expressions.
    * @param exp macrofied expression
    * @returns demacrofied expression
    * @throws IllegalArgumentException if a macro name is unknown, thus cannot be expanded
    */
  def expandMacros(exp: java.lang.String): java.lang.String
}

object XMacroExpander {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    expandMacros: js.Function1[java.lang.String, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMacroExpander = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("expandMacros")(expandMacros)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XMacroExpander]
  }
}

