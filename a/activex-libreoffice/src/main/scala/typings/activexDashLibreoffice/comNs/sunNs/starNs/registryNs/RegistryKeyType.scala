package typings.activexDashLibreoffice.comNs.sunNs.starNs.registryNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents all possible types of a key.
  *
  * A key can be a normal key with a value and subkeys, or it can be a link which references another key.
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait RegistryKeyType extends js.Object

object RegistryKeyType {
  @scala.inline
  def KEY: `0` = this.cast(0)
  @scala.inline
  def LINK: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

