package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
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
  implicit class XPresentationMutableBuilder[Self <: XPresentation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRehearseTimings(value: () => Unit): Self = StObject.set(x, "rehearseTimings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
  }
}
