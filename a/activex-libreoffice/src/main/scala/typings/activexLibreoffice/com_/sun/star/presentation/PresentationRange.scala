package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies which part of the presentation is to show. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
*/
trait PresentationRange extends StObject
object PresentationRange {
  
  /** use all slides. */
  @scala.inline
  def PRESENTATIONRANGE_ALL: `0` = 0.asInstanceOf[`0`]
  
  /** use only the active slide. */
  @scala.inline
  def PRESENTATIONRANGE_FROM_PAGE: `1` = 1.asInstanceOf[`1`]
  
  /** use an individual choice of slides. */
  @scala.inline
  def PRESENTATIONRANGE_INDIVIDUAL: `2` = 2.asInstanceOf[`2`]
}
