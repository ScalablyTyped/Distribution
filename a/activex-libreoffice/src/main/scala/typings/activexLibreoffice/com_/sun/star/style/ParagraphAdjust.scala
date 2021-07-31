package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** These enumeration values describe the formatting of a text paragraph. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
*/
trait ParagraphAdjust extends StObject
object ParagraphAdjust {
  
  /** adjusted to both borders / stretched, except for last line */
  @scala.inline
  def BLOCK: `2` = 2.asInstanceOf[`2`]
  
  /**
    * set the horizontal alignment to the center between the margins from the container object
    *
    * adjusted to the center
    *
    * The text range is centered between the previous tabulator (or the left border, if none) and this tabulator.
    */
  @scala.inline
  def CENTER: `3` = 3.asInstanceOf[`3`]
  
  /**
    * set the horizontal alignment to the left margin from the container object
    *
    * The page style is only used for left pages.
    *
    * adjusted to the left border
    *
    * The text range is left-aligned between the previous tabulator (or the left border, if none) and this tabulator.
    */
  @scala.inline
  def LEFT: `0` = 0.asInstanceOf[`0`]
  
  /**
    * set the horizontal alignment to the right margin from the container object
    *
    * The page style is only used for right pages.
    *
    * adjusted to the right border
    *
    * The text range is right-aligned between the previous tabulator (or the left border, if none) and this tabulator.
    */
  @scala.inline
  def RIGHT: `1` = 1.asInstanceOf[`1`]
  
  /** adjusted to both borders / stretched, including last line */
  @scala.inline
  def STRETCH: `4` = 4.asInstanceOf[`4`]
}
