package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies which part of the presentation is to show. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
*/
trait PresentationRange extends StObject
object PresentationRange {
  
  /** use all slides. */
  inline def PRESENTATIONRANGE_ALL: `0` = 0.asInstanceOf[`0`]
  
  /** use only the active slide. */
  inline def PRESENTATIONRANGE_FROM_PAGE: `1` = 1.asInstanceOf[`1`]
  
  /** use an individual choice of slides. */
  inline def PRESENTATIONRANGE_INDIVIDUAL: `2` = 2.asInstanceOf[`2`]
}
