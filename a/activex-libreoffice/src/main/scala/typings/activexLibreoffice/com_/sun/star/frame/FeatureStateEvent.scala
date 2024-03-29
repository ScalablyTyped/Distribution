package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is broadcast by a {@link Controller} whenever the state of the feature changes
  * @see XController
  * @see XStatusListener
  */
trait FeatureStateEvent
  extends StObject
     with EventObject {
  
  /** contains a descriptor of the feature for the user interface. */
  var FeatureDescriptor: String
  
  /** contains the URL of the feature. */
  var FeatureURL: URL
  
  /** specifies whether the feature is currently enabled or disabled. */
  var IsEnabled: Boolean
  
  /**
    * specifies whether the {@link XDispatch} has to be requeried.
    *
    * Interest code should listen for {@link FrameActionEvent} too, to update own feature states and dispatch listener on FrameAction::CONTEXT_CHANGED.
    */
  var Requery: Boolean
  
  /**
    * contains the state of the feature in this dispatch.
    *
    * This can be, for example, simply `TRUE` for a boolean feature like underline on/off. Some simple types like `string` or `boolean` are useful here for
    * generic UI elements, like a checkmark in a menu.
    */
  var State: Any
}
object FeatureStateEvent {
  
  inline def apply(
    FeatureDescriptor: String,
    FeatureURL: URL,
    IsEnabled: Boolean,
    Requery: Boolean,
    Source: XInterface,
    State: Any
  ): FeatureStateEvent = {
    val __obj = js.Dynamic.literal(FeatureDescriptor = FeatureDescriptor.asInstanceOf[js.Any], FeatureURL = FeatureURL.asInstanceOf[js.Any], IsEnabled = IsEnabled.asInstanceOf[js.Any], Requery = Requery.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureStateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureStateEvent] (val x: Self) extends AnyVal {
    
    inline def setFeatureDescriptor(value: String): Self = StObject.set(x, "FeatureDescriptor", value.asInstanceOf[js.Any])
    
    inline def setFeatureURL(value: URL): Self = StObject.set(x, "FeatureURL", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "IsEnabled", value.asInstanceOf[js.Any])
    
    inline def setRequery(value: Boolean): Self = StObject.set(x, "Requery", value.asInstanceOf[js.Any])
    
    inline def setState(value: Any): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
