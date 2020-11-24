package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is broadcast by a {@link Controller} whenever the state of the feature changes
  * @see XController
  * @see XStatusListener
  */
@js.native
trait FeatureStateEvent extends EventObject {
  
  /** contains a descriptor of the feature for the user interface. */
  var FeatureDescriptor: String = js.native
  
  /** contains the URL of the feature. */
  var FeatureURL: URL = js.native
  
  /** specifies whether the feature is currently enabled or disabled. */
  var IsEnabled: Boolean = js.native
  
  /**
    * specifies whether the {@link XDispatch} has to be requeried.
    *
    * Interest code should listen for {@link FrameActionEvent} too, to update own feature states and dispatch listener on FrameAction::CONTEXT_CHANGED.
    */
  var Requery: Boolean = js.native
  
  /**
    * contains the state of the feature in this dispatch.
    *
    * This can be, for example, simply `TRUE` for a boolean feature like underline on/off. Some simple types like `string` or `boolean` are useful here for
    * generic UI elements, like a checkmark in a menu.
    */
  var State: js.Any = js.native
}
object FeatureStateEvent {
  
  @scala.inline
  def apply(
    FeatureDescriptor: String,
    FeatureURL: URL,
    IsEnabled: Boolean,
    Requery: Boolean,
    Source: XInterface,
    State: js.Any
  ): FeatureStateEvent = {
    val __obj = js.Dynamic.literal(FeatureDescriptor = FeatureDescriptor.asInstanceOf[js.Any], FeatureURL = FeatureURL.asInstanceOf[js.Any], IsEnabled = IsEnabled.asInstanceOf[js.Any], Requery = Requery.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureStateEvent]
  }
  
  @scala.inline
  implicit class FeatureStateEventOps[Self <: FeatureStateEvent] (val x: Self) extends AnyVal {
    
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
    def setFeatureDescriptor(value: String): Self = this.set("FeatureDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureURL(value: URL): Self = this.set("FeatureURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("IsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequery(value: Boolean): Self = this.set("Requery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: js.Any): Self = this.set("State", value.asInstanceOf[js.Any])
  }
}
