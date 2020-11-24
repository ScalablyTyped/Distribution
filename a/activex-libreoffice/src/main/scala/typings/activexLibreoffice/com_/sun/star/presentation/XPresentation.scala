package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** With this interface you can control any object that implements a {@link Presentation} . */
@js.native
trait XPresentation extends XInterface {
  
  /** The presentation is stopped and the full-screen mode will end. */
  def end(): Unit = js.native
  
  /** Starts the presentation from the beginning and shows the actual running time to the user. */
  def rehearseTimings(): Unit = js.native
  
  /** The presentation is shown in full-screen and started from the beginning. */
  def start(): Unit = js.native
}
object XPresentation {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    end: () => Unit,
    queryInterface: `type` => js.Any,
    rehearseTimings: () => Unit,
    release: () => Unit,
    start: () => Unit
  ): XPresentation = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), end = js.Any.fromFunction0(end), queryInterface = js.Any.fromFunction1(queryInterface), rehearseTimings = js.Any.fromFunction0(rehearseTimings), release = js.Any.fromFunction0(release), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[XPresentation]
  }
  
  @scala.inline
  implicit class XPresentationOps[Self <: XPresentation] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRehearseTimings(value: () => Unit): Self = this.set("rehearseTimings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
  }
}
