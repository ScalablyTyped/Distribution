package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Values specify the arrangement of the axes descriptions. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
*/
trait ChartAxisArrangeOrderType extends StObject
object ChartAxisArrangeOrderType {
  
  /**
    * The descriptions are arranged automatically. <p>If there is enough space to put them side by side, this
    *
    * arrangement is preferred. If the descriptions would overlap
    *
    * when arranged side by side, they are staggered.</p>
    */
  inline def AUTO: `0` = 0.asInstanceOf[`0`]
  
  /** The descriptions are arranged side by side. */
  inline def SIDE_BY_SIDE: `1` = 1.asInstanceOf[`1`]
  
  /** The descriptions are alternately put on two lines with the even values out of the normal line. */
  inline def STAGGER_EVEN: `2` = 2.asInstanceOf[`2`]
  
  /** The descriptions are alternately put on two lines with the odd values out of the normal line. */
  inline def STAGGER_ODD: `3` = 3.asInstanceOf[`3`]
}
