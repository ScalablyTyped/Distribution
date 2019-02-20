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

