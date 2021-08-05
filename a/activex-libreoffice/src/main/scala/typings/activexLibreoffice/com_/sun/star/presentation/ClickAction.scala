package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`10`
import typings.activexLibreoffice.activexLibreofficeNumbers.`11`
import typings.activexLibreoffice.activexLibreofficeNumbers.`12`
import typings.activexLibreoffice.activexLibreofficeNumbers.`13`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import typings.activexLibreoffice.activexLibreofficeNumbers.`6`
import typings.activexLibreoffice.activexLibreofficeNumbers.`7`
import typings.activexLibreoffice.activexLibreofficeNumbers.`8`
import typings.activexLibreoffice.activexLibreofficeNumbers.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This enumeration specifies the actions which can be processed when a user clicks on an object. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`6`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`7`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`12`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`11`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`8`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`13`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`10`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`9`
*/
trait ClickAction extends StObject
object ClickAction {
  
  /** The presentation jumps to a bookmark. */
  inline def BOOKMARK: `5` = 5.asInstanceOf[`5`]
  
  /** The presentation jumps to another document. */
  inline def DOCUMENT: `6` = 6.asInstanceOf[`6`]
  
  /** The presentation continues with the first page. */
  inline def FIRSTPAGE: `3` = 3.asInstanceOf[`3`]
  
  /** The object renders itself invisible after a click. */
  inline def INVISIBLE: `7` = 7.asInstanceOf[`7`]
  
  /** The presentation continues with the last page. */
  inline def LASTPAGE: `4` = 4.asInstanceOf[`4`]
  
  /** A star basic macro is executed after the click. */
  inline def MACRO: `12` = 12.asInstanceOf[`12`]
  
  /** The presentation jumps to the next page. */
  inline def NEXTPAGE: `2` = 2.asInstanceOf[`2`]
  
  /**
    * use no animation effects.
    *
    * No action is performed on click.
    *
    * use no fade effects.
    */
  inline def NONE: `0` = 0.asInstanceOf[`0`]
  
  /** The presentation jumps to the previous page. */
  inline def PREVPAGE: `1` = 1.asInstanceOf[`1`]
  
  /** Another program is executed after a click. */
  inline def PROGRAM: `11` = 11.asInstanceOf[`11`]
  
  /** A sound is played after a click. */
  inline def SOUND: `8` = 8.asInstanceOf[`8`]
  
  /** The presentation is stopped after the click. */
  inline def STOPPRESENTATION: `13` = 13.asInstanceOf[`13`]
  
  /** The object vanishes with its effect. */
  inline def VANISH: `10` = 10.asInstanceOf[`10`]
  
  /** An OLE verb is performed on this object. */
  inline def VERB: `9` = 9.asInstanceOf[`9`]
}
