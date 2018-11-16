package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Object describing the request to be made and how it should be processed.
     * see http://docs.angularjs.org/api/ng/service/$http#usage
     */

trait IRequestConfig extends IRequestShortcutConfig {
  /**
           * Event listeners to be bound to the XMLHttpRequest object.
           * To bind events to the XMLHttpRequest upload object, use uploadEventHandlers. The handler will be called in the context of a $apply block.
           */
  var eventHandlers: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[stdLib.EventListenerOrEventListenerObject]
  ] = js.undefined
  /**
           * HTTP method (e.g. 'GET', 'POST', etc)
           */
  var method: java.lang.String
  /**
           * Event listeners to be bound to the XMLHttpRequest upload object.
           * To bind events to the XMLHttpRequest object, use eventHandlers. The handler will be called in the context of a $apply block.
           */
  var uploadEventHandlers: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[stdLib.EventListenerOrEventListenerObject]
  ] = js.undefined
  /**
           * Absolute or relative URL of the resource that is being requested.
           */
  var url: java.lang.String
}

