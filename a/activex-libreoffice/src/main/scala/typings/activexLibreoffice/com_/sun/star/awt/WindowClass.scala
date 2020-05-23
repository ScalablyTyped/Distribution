package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the class of a window. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait WindowClass extends js.Object

object WindowClass {
  /** is a container that may contain other components. It is not a top window. */
  @scala.inline
  def CONTAINER: `2` = 2.asInstanceOf[`2`]
  /** is a modal top level window on the desktop. It is also a container. */
  @scala.inline
  def MODALTOP: `1` = 1.asInstanceOf[`1`]
  /** is the simplest window. It can be a container. */
  @scala.inline
  def SIMPLE: `3` = 3.asInstanceOf[`3`]
  /** specifies a top level window on the desktop. It is also a container. */
  @scala.inline
  def TOP: `0` = 0.asInstanceOf[`0`]
}

