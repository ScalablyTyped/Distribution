package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An improved version of a {@link com.sun.star.ucb.XCommandProcessor} that helps avoid ever-increasing resource consumption. */
@js.native
trait XCommandProcessor2 extends XCommandProcessor {
  /**
    * releases a command identifier obtained through {@link XCommandProcessor.createCommandIdentifier()} when it is no longer used.
    *
    * After this call the command identifier cannot be used any longer in calls to {@link XCommandProcessor.execute()} and {@link XCommandProcessor.abort()}
    * . (But it can happen that a call to {@link XCommandProcessor.createCommandIdentifier()} reuses this identifier.)
    * @param CommandId A command identifier obtained through {@link XCommandProcessor.createCommandIdentifier()} . If the identifier is zero, the request is s
    */
  def releaseCommandIdentifier(CommandId: Double): Unit = js.native
}

object XCommandProcessor2 {
  @scala.inline
  def apply(
    abort: Double => Unit,
    acquire: () => Unit,
    createCommandIdentifier: () => Double,
    execute: (Command, Double, XCommandEnvironment) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    releaseCommandIdentifier: Double => Unit
  ): XCommandProcessor2 = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction1(abort), acquire = js.Any.fromFunction0(acquire), createCommandIdentifier = js.Any.fromFunction0(createCommandIdentifier), execute = js.Any.fromFunction3(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), releaseCommandIdentifier = js.Any.fromFunction1(releaseCommandIdentifier))
    __obj.asInstanceOf[XCommandProcessor2]
  }
  @scala.inline
  implicit class XCommandProcessor2Ops[Self <: XCommandProcessor2] (val x: Self) extends AnyVal {
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
    def setReleaseCommandIdentifier(value: Double => Unit): Self = this.set("releaseCommandIdentifier", js.Any.fromFunction1(value))
  }
  
}

