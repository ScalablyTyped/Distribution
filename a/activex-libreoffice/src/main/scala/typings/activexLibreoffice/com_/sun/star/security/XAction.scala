package typings.activexLibreoffice.com_.sun.star.security

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for running an action.
  * @since OOo 1.1.2
  */
trait XAction extends XInterface {
  /**
    * Action to be done.
    * @returns result
    * @throws com::sun::star::uno::Exception any UNO exception may be thrown
    */
  def run(): js.Any
}

object XAction {
  @scala.inline
  def apply(acquire: () => Unit, queryInterface: `type` => js.Any, release: () => Unit, run: () => js.Any): XAction = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[XAction]
  }
}

