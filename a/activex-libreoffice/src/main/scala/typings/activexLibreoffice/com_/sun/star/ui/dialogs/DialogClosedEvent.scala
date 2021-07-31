package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information of a closed dialog.
  *
  * The broadcaster who sends such event, must send the dialog as the source.
  * @see com.sun.star.lang.EventObject
  */
trait DialogClosedEvent
  extends StObject
     with EventObject {
  
  /**
    * @param DialogResult Identifies the result of a dialog.
    * @see ExecutableDialogResults
    */
  var DialogResult: Double
}
object DialogClosedEvent {
  
  @scala.inline
  def apply(DialogResult: Double, Source: XInterface): DialogClosedEvent = {
    val __obj = js.Dynamic.literal(DialogResult = DialogResult.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogClosedEvent]
  }
  
  @scala.inline
  implicit class DialogClosedEventMutableBuilder[Self <: DialogClosedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialogResult(value: Double): Self = StObject.set(x, "DialogResult", value.asInstanceOf[js.Any])
  }
}
