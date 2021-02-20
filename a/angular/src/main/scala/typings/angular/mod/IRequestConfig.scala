package typings.angular.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object describing the request to be made and how it should be processed.
  * see http://docs.angularjs.org/api/ng/service/$http#usage
  */
@js.native
trait IRequestConfig extends IRequestShortcutConfig {
  
  /**
    * Event listeners to be bound to the XMLHttpRequest object.
    * To bind events to the XMLHttpRequest upload object, use uploadEventHandlers. The handler will be called in the context of a $apply block.
    */
  var eventHandlers: js.UndefOr[StringDictionary[EventListenerOrEventListenerObject]] = js.native
  
  /**
    * HTTP method (e.g. 'GET', 'POST', etc)
    */
  var method: String = js.native
  
  /**
    * Event listeners to be bound to the XMLHttpRequest upload object.
    * To bind events to the XMLHttpRequest object, use eventHandlers. The handler will be called in the context of a $apply block.
    */
  var uploadEventHandlers: js.UndefOr[StringDictionary[EventListenerOrEventListenerObject]] = js.native
  
  /**
    * Absolute or relative URL of the resource that is being requested.
    */
  var url: String = js.native
}
object IRequestConfig {
  
  @scala.inline
  def apply(method: String, url: String): IRequestConfig = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestConfig]
  }
  
  @scala.inline
  implicit class IRequestConfigMutableBuilder[Self <: IRequestConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventHandlers(value: StringDictionary[EventListenerOrEventListenerObject]): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventHandlersUndefined: Self = StObject.set(x, "eventHandlers", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadEventHandlers(value: StringDictionary[EventListenerOrEventListenerObject]): Self = StObject.set(x, "uploadEventHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadEventHandlersUndefined: Self = StObject.set(x, "uploadEventHandlers", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
