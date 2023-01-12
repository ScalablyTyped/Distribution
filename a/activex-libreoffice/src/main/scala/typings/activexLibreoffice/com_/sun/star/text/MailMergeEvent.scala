package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.com_.sun.star.frame.XModel
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a mail merge event.
  *
  * This type of event is being send by the mail merge service right before the merging of the next document to be processed. This allows for example to
  * modify the document specifically before it gets merged.
  * @see com.sun.star.text.MailMerge
  * @since OOo 1.1.2
  */
trait MailMergeEvent
  extends StObject
     with EventObject {
  
  /** The model of the document to be processed next. */
  var Model: XModel
}
object MailMergeEvent {
  
  inline def apply(Model: XModel, Source: XInterface): MailMergeEvent = {
    val __obj = js.Dynamic.literal(Model = Model.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMergeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MailMergeEvent] (val x: Self) extends AnyVal {
    
    inline def setModel(value: XModel): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
  }
}
