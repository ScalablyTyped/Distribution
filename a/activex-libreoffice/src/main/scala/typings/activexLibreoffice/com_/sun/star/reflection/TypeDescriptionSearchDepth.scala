package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.activexLibreofficeNumbers.`-1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines depths for searching through type description collections.
  * @since OOo 1.1.2
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`-1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait TypeDescriptionSearchDepth extends StObject
object TypeDescriptionSearchDepth {
  
  /** Infinite search depth. Search through all children including direct children, grand children, grand children's children, ... */
  @scala.inline
  def INFINITE: `-1` = -1.asInstanceOf[`-1`]
  
  /** Search only through direct children. */
  @scala.inline
  def ONE: `1` = 1.asInstanceOf[`1`]
}
