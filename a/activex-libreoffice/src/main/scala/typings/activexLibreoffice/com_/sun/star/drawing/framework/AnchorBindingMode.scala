package typings.activexLibreoffice.com_.sun.star.drawing.framework

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This enum specifies how a resource is bound to an anchor. This can be direct or indirect.
  *
  * Example: Let r:a1:a2 denote a resource r which is bound to anchor a1:a2 which itself is a resource a1 bound to anchor a2. Then r:a1:a2 is bound
  * directly to a1:a2 and indirectly to a2.
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait AnchorBindingMode extends js.Object

object AnchorBindingMode {
  @scala.inline
  def DIRECT: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def INDIRECT: `1` = 1.asInstanceOf[`1`]
}

