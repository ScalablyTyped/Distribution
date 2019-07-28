package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Expands macro in expressions, i.e. substitudes macro names.
  * @since OOo 1.1.2
  */
trait XMacroExpander extends XInterface {
  /**
    * Expands macrofied expressions.
    * @param exp macrofied expression
    * @returns demacrofied expression
    * @throws IllegalArgumentException if a macro name is unknown, thus cannot be expanded
    */
  def expandMacros(exp: String): String
}

object XMacroExpander {
  @scala.inline
  def apply(
    acquire: () => Unit,
    expandMacros: String => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMacroExpander = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), expandMacros = js.Any.fromFunction1(expandMacros), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMacroExpander]
  }
}

