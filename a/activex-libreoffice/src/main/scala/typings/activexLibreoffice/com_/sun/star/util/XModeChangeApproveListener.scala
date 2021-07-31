package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to veto changes in an object's internal mode.
  * @see XModeChangeBroadcaster
  * @since OOo 1.1.2
  */
trait XModeChangeApproveListener
  extends StObject
     with XEventListener {
  
  /**
    * indicates that the mode of the broadcasting component is about to change.
    *
    * The {@link ModeChangeEvent.NewMode} indicates the new mode which is to be set on the component
    * @throws VetoException when the mode change is vetoed
    */
  def approveModeChange(rSource: ModeChangeEvent): Unit
}
object XModeChangeApproveListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveModeChange: ModeChangeEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XModeChangeApproveListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveModeChange = js.Any.fromFunction1(approveModeChange), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XModeChangeApproveListener]
  }
  
  @scala.inline
  implicit class XModeChangeApproveListenerMutableBuilder[Self <: XModeChangeApproveListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproveModeChange(value: ModeChangeEvent => Unit): Self = StObject.set(x, "approveModeChange", js.Any.fromFunction1(value))
  }
}
