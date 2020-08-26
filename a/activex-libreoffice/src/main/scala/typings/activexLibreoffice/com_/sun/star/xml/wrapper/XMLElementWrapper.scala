package typings.activexLibreoffice.com_.sun.star.xml.wrapper

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.activexLibreoffice.com_.sun.star.lang.XUnoTunnel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Service of {@link XMLElementWrapper} */
@js.native
trait XMLElementWrapper
  extends XUnoTunnel
     with XInitialization

object XMLElementWrapper {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getSomething: SeqEquiv[Double] => Double,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMLElementWrapper = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getSomething = js.Any.fromFunction1(getSomething), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMLElementWrapper]
  }
}

