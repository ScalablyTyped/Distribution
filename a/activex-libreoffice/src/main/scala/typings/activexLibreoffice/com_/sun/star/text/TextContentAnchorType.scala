package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import typings.activexLibreoffice.activexLibreofficeInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specify how the text content is attached to its surrounding text. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`4`
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
*/
trait TextContentAnchorType extends StObject
object TextContentAnchorType {
  
  /**
    * The object is anchored instead of a character.
    *
    * <p>The size of the object influences the height of the text line.</p>
    */
  inline def AS_CHARACTER: `1` = 1.asInstanceOf[`1`]
  
  /**
    * The object is anchored to a character.
    *
    * <p>The position of the object changes if the position of this
    *
    * character is changed.
    *
    * </p>
    */
  inline def AT_CHARACTER: `4` = 4.asInstanceOf[`4`]
  
  /** The object is anchored to a text frame. */
  inline def AT_FRAME: `3` = 3.asInstanceOf[`3`]
  
  /**
    * The object is anchored to the page.
    *
    * <p>The position does not change if the content of the document is changed.</p>
    */
  inline def AT_PAGE: `2` = 2.asInstanceOf[`2`]
  
  /** The anchor of the object is set at the top left position of the paragraph. */
  inline def AT_PARAGRAPH: `0` = 0.asInstanceOf[`0`]
}
