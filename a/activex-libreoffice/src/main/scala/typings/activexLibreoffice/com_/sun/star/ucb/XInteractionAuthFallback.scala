package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.task.XInteractionContinuation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interaction continuation specifying authentication success.
  * @since LibreOffice 4.4
  */
@js.native
trait XInteractionAuthFallback extends XInteractionContinuation {
  def setCode(code: String): Unit = js.native
}

object XInteractionAuthFallback {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    select: () => Unit,
    setCode: String => Unit
  ): XInteractionAuthFallback = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setCode = js.Any.fromFunction1(setCode))
    __obj.asInstanceOf[XInteractionAuthFallback]
  }
  @scala.inline
  implicit class XInteractionAuthFallbackOps[Self <: XInteractionAuthFallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSetCode(value: String => Unit): Self = this.set("setCode", js.Any.fromFunction1(value))
  }
  
}

