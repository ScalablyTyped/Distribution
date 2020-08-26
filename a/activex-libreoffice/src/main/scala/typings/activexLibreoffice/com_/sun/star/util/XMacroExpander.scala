package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Expands macro in expressions, i.e. substitudes macro names.
  * @since OOo 1.1.2
  */
@js.native
trait XMacroExpander extends XInterface {
  /**
    * Expands macrofied expressions.
    * @param exp macrofied expression
    * @returns demacrofied expression
    * @throws IllegalArgumentException if a macro name is unknown, thus cannot be expanded
    */
  def expandMacros(exp: String): String = js.native
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
  @scala.inline
  implicit class XMacroExpanderOps[Self <: XMacroExpander] (val x: Self) extends AnyVal {
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
    def setExpandMacros(value: String => String): Self = this.set("expandMacros", js.Any.fromFunction1(value))
  }
  
}

