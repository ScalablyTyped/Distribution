package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * this enum covers the different writing directions
  * @deprecated DeprecatedUse WritingMode2 instead
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
*/
trait WritingMode extends StObject
object WritingMode {
  
  /**
    * text within lines is written left-to-right. lines and blocks are placed top-to-bottom.
    *
    * Typically, this is the writing mode for normal "alphabetic" text.
    */
  inline def LR_TB: `0` = 0.asInstanceOf[`0`]
  
  /**
    * text within a line are written right-to-left. Lines and blocks are placed top-to-bottom.
    *
    * Typically, this writing mode is used in Arabic and Hebrew text.
    */
  inline def RL_TB: `1` = 1.asInstanceOf[`1`]
  
  /**
    * text within a line is written top-to-bottom. Lines and blocks are placed right-to-left.
    *
    * Typically, this writing mode is used in Chinese and Japanese text.
    */
  inline def TB_RL: `2` = 2.asInstanceOf[`2`]
}
