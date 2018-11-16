package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @class
     *
     * <p>AV.Events is a fork of Backbone's Events module, provided for your
     * convenience.</p>
     *
     * <p>A module that can be mixed in to any object in order to provide
     * it with custom events. You may bind callback functions to an event
     * with `on`, or remove these functions with `off`.
     * Triggering an event fires all callbacks in the order that `on` was
     * called.
     *
     * <pre>
     *     var object = {};
     *     _.extend(object, AV.Events);
     *     object.on('expand', function(){ alert('expanded'); });
     *     object.trigger('expand');</pre></p>
     *
     * <p>For more information, see the
     * <a href="http://documentcloud.github.com/backbone/#Events">Backbone
     * documentation</a>.</p>
     */
@js.native
trait Events extends js.Object {
  def bind(eventName: java.lang.String, callback: js.Function): Events = js.native
  def bind(eventName: java.lang.String, callback: js.Function, context: js.Any): Events = js.native
  def off(): Events = js.native
  def off(eventName: java.lang.String): Events = js.native
  def off(eventName: java.lang.String, callback: js.Function): Events = js.native
  def off(eventName: java.lang.String, callback: js.Function, context: js.Any): Events = js.native
  def on(eventName: java.lang.String): Events = js.native
  def on(eventName: java.lang.String, callback: js.Function): Events = js.native
  def on(eventName: java.lang.String, callback: js.Function, context: js.Any): Events = js.native
  def trigger(eventName: java.lang.String, args: js.Any*): Events = js.native
  def unbind(): Events = js.native
  def unbind(eventName: java.lang.String): Events = js.native
  def unbind(eventName: java.lang.String, callback: js.Function): Events = js.native
  def unbind(eventName: java.lang.String, callback: js.Function, context: js.Any): Events = js.native
}

