package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Expands macro in expressions, i.e. substitudes macro names.
  * @since OOo 1.1.2
  */
trait XMacroExpander
  extends StObject
     with XInterface {
  
  /**
    * Expands macrofied expressions.
    * @param exp macrofied expression
    * @returns demacrofied expression
    * @throws IllegalArgumentException if a macro name is unknown, thus cannot be expanded
    */
  def expandMacros(exp: String): String
}
object XMacroExpander {
  
  inline def apply(
    acquire: () => Unit,
    expandMacros: String => String,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XMacroExpander = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), expandMacros = js.Any.fromFunction1(expandMacros), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMacroExpander]
  }
  
  extension [Self <: XMacroExpander](x: Self) {
    
    inline def setExpandMacros(value: String => String): Self = StObject.set(x, "expandMacros", js.Any.fromFunction1(value))
  }
}
