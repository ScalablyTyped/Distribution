package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines priority for the element mark's notification.
  *
  * The PRI_MINIMUM priority is a value less than any practical priority value, it is used when compare between different priority values.
  *
  * The PRI_AFTERMODIFY priority represents the notification will be sent after any internal modification has finished.
  *
  * The PRI_BEFOREMODIFY proirity represents the notification will be sent before any internal modification happens.
  *
  * So an element mark with PRI_BEFOREMODIFY will be handled first, and one with PRI_AFTERMODIFY will be handled at last.
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait ElementMarkPriority extends StObject
object ElementMarkPriority {
  
  inline def AFTERMODIFY: `2` = 2.asInstanceOf[`2`]
  
  inline def BEFOREMODIFY: `3` = 3.asInstanceOf[`3`]
  
  inline def MINIMUM: `1` = 1.asInstanceOf[`1`]
}
