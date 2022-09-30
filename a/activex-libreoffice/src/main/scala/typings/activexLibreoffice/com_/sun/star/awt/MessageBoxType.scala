package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import typings.activexLibreoffice.activexLibreofficeInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the type of a {@link XMessageBox} .
  * @since LibreOffice 4.2
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`4`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
*/
trait MessageBoxType extends StObject
object MessageBoxType {
  
  /** A message box to provide an error message to the user. */
  inline def ERRORBOX: `3` = 3.asInstanceOf[`3`]
  
  /** A message box to inform the user about a certain event */
  inline def INFOBOX: `1` = 1.asInstanceOf[`1`]
  
  /** A normal message box. */
  inline def MESSAGEBOX: `0` = 0.asInstanceOf[`0`]
  
  /** A message box to query information from the user. */
  inline def QUERYBOX: `4` = 4.asInstanceOf[`4`]
  
  /** A message to warn the user about a certain problem. */
  inline def WARNINGBOX: `2` = 2.asInstanceOf[`2`]
}
