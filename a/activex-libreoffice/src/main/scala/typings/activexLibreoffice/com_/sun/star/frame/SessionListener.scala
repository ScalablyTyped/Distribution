package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This was created from its sole place of use, so it might be incomplete.
  * @since LibreOffice 4.1
  */
trait SessionListener
  extends StObject
     with XSessionManagerListener2 {
  
  def createWithOnQuitFlag(AllowUserInteractionOnQuit: Boolean): Unit
}
object SessionListener {
  
  inline def apply(
    acquire: () => Unit,
    approveInteraction: Boolean => Unit,
    createWithOnQuitFlag: Boolean => Unit,
    disposing: EventObject => Unit,
    doQuit: () => Unit,
    doRestore: () => Boolean,
    doSave: (Boolean, Boolean) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    shutdownCanceled: () => Unit
  ): SessionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveInteraction = js.Any.fromFunction1(approveInteraction), createWithOnQuitFlag = js.Any.fromFunction1(createWithOnQuitFlag), disposing = js.Any.fromFunction1(disposing), doQuit = js.Any.fromFunction0(doQuit), doRestore = js.Any.fromFunction0(doRestore), doSave = js.Any.fromFunction2(doSave), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), shutdownCanceled = js.Any.fromFunction0(shutdownCanceled))
    __obj.asInstanceOf[SessionListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionListener] (val x: Self) extends AnyVal {
    
    inline def setCreateWithOnQuitFlag(value: Boolean => Unit): Self = StObject.set(x, "createWithOnQuitFlag", js.Any.fromFunction1(value))
  }
}
