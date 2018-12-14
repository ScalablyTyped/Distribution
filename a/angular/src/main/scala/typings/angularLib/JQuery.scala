package typings
package angularLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  // Undocumented
  var length: scala.Double = js.native
  /**
       * Adds the specified class(es) to each of the set of matched elements.
       *
       * @param className One or more space-separated classes to be added to the class attribute of each matched element.
       * @see {@link https://api.jquery.com/addClass/#addClass-className}
       */
  def addClass(className: java.lang.String): this.type = js.native
  /**
       * Insert content, specified by the parameter, after each element in the set of matched elements.
       *
       * @param content1 HTML string, DOM element, DocumentFragment, array of elements, or jQuery object to insert after each element in the set of matched elements.
       * @param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert after each element in the set of matched elements.
       * @see {@link https://api.jquery.com/after/#after-content-content}
       */
  def after(content1: JQuery, content2: js.Any*): this.type = js.native
  /**
       * Insert content, specified by the parameter, after each element in the set of matched elements.
       *
       * @param content1 HTML string, DOM element, DocumentFragment, array of elements, or jQuery object to insert after each element in the set of matched elements.
       * @param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert after each element in the set of matched elements.
       * @see {@link https://api.jquery.com/after/#after-content-content}
       */
  def after(content1: java.lang.String, content2: js.Any*): this.type = js.native
  /**
       * Insert content, specified by the parameter, after each element in the set of matched elements.
       *
       * @param content1 HTML string, DOM element, DocumentFragment, array of elements, or jQuery object to insert after each element in the set of matched elements.
       * @param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert after each element in the set of matched elements.
       * @see {@link https://api.jquery.com/after/#after-content-content}
       */
  def after(content1: js.Array[_], content2: js.Any*): this.type = js.native
  /**
       * Insert content, specified by the parameter, after each element in the set of matched elements.
       *
       * @param content1 HTML string, DOM element, DocumentFragment, array of elements, or jQuery object to insert after each element in the set of matched elements.
       * @param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert after each element in the set of matched elements.
       * @see {@link https://api.jquery.com/after/#after-content-content}
       */
  def after(content1: stdLib.DocumentFragment, content2: js.Any*): this.type = js.native
  /**
       * Insert content, specified by the parameter, after each element in the set of matched elements.
       *
       * @param content1 HTML string, DOM element, DocumentFragment, array of elements, or jQuery object to insert after each element in the set of matched elements.
       * @param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert after each element in the set of matched elements.
       * @see {@link https://api.jquery.com/after/#after-content-content}
       */
  def after(content1: stdLib.Element, content2: js.Any*): this.type = js.native
  /**
       * Insert content, specified by the parameter, after each element in the set of matched elements.
       *
       * @param content1 HTML string, DOM element, DocumentFragment, array of elements, or jQuery object to insert after each element in the set of matched elements.
       * @param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert after each element in the set of matched elements.
       * @see {@link https://api.jquery.com/after/#after-content-content}
       */
  def after(content1: stdLib.Text, content2: js.Any*): this.type = js.native
  /**
       * Insert content, specified by the parameter, after each element in the set of matched elements.
       *
       * @param func A function that returns an HTML string, DOM element(s), or jQuery object to insert after each element in the set of matched elements. Receives the index position of the element in the set as an argument. Within the function, this refers to the current element in the set.
       * @see {@link https://api.jquery.com/after/#after-function}
       */
  def after(
    func: js.Function2[
      /* index */ scala.Double, 
      /* html */ java.lang.String, 
      java.lang.String | stdLib.Element | this.type
    ]
  ): this.type = js.native
  /**
       * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
       *
       * @param content1 DOM element, DocumentFragment, array of elements, HTML string, or jQuery object to insert at the end of each element in the set of matched elements.
       * @param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the end of each element in the set of matched elements.
       * @see {@link https://api.jquery.com/append/#append-content-content}
       */
  def append(content1: JQuery, content2: js.Any*): this.type = js.native
  /**
       * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
       *
       * @param content1 DOM element, DocumentFragment, array of elements, HTML string, or jQuery object to insert at the end of each element in the set of matched elements.
       * @param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the end of each element in the set of matched elements.
       * @see {@link https://api.jquery.com/append/#append-content-content}
       */
  def append(content1: java.lang.String, content2: js.Any*): this.type = js.native
  /**
       * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
       *
       * @param content1 DOM element, DocumentFragment, array of elements, HTML string, or jQuery object to insert at the end of each element in the set of matched elements.
       * @param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the end of each element in the set of matched elements.
       * @see {@link https://api.jquery.com/append/#append-content-content}
       */
  def append(content1: js.Array[_], content2: js.Any*): this.type = js.native
  /**
       * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
       *
       * @param content1 DOM element, DocumentFragment, array of elements, HTML string, or jQuery object to insert at the end of each element in the set of matched elements.
       * @param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the end of each element in the set of matched elements.
       * @see {@link https://api.jquery.com/append/#append-content-content}
       */
  def append(content1: stdLib.DocumentFragment, content2: js.Any*): this.type = js.native
  /**
       * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
       *
       * @param content1 DOM element, DocumentFragment, array of elements, HTML string, or jQuery object to insert at the end of each element in the set of matched elements.
       * @param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the end of each element in the set of matched elements.
       * @see {@link https://api.jquery.com/append/#append-content-content}
       */
  def append(content1: stdLib.Element, content2: js.Any*): this.type = js.native
  /**
       * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
       *
       * @param content1 DOM element, DocumentFragment, array of elements, HTML string, or jQuery object to insert at the end of each element in the set of matched elements.
       * @param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the end of each element in the set of matched elements.
       * @see {@link https://api.jquery.com/append/#append-content-content}
       */
  def append(content1: stdLib.Text, content2: js.Any*): this.type = js.native
  /**
       * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
       *
       * @param func A function that returns an HTML string, DOM element(s), or jQuery object to insert at the end of each element in the set of matched elements. Receives the index position of the element in the set and the old HTML value of the element as arguments. Within the function, this refers to the current element in the set.
       * @see {@link https://api.jquery.com/append/#append-function}
       */
  def append(
    func: js.Function2[
      /* index */ scala.Double, 
      /* html */ java.lang.String, 
      java.lang.String | stdLib.Element | this.type
    ]
  ): this.type = js.native
  /**
       * Set one or more attributes for the set of matched elements.
       *
       * @param attributeName The name of the attribute to set.
       * @param value A value to set for the attribute. If this is `null`, the attribute will be deleted.
       * @see {@link https://api.jquery.com/attr/#attr-attributeName-value}
       */
  def attr(attributeName: java.lang.String): this.type = js.native
  /**
       * Set one or more attributes for the set of matched elements.
       *
       * @param attributeName The name of the attribute to set.
       * @param value A value to set for the attribute. If this is `null`, the attribute will be deleted.
       * @see {@link https://api.jquery.com/attr/#attr-attributeName-value}
       */
  def attr(attributeName: java.lang.String, value: java.lang.String): this.type = js.native
  /**
       * Set one or more attributes for the set of matched elements.
       *
       * @param attributeName The name of the attribute to set.
       * @param value A value to set for the attribute. If this is `null`, the attribute will be deleted.
       * @see {@link https://api.jquery.com/attr/#attr-attributeName-value}
       */
  def attr(attributeName: java.lang.String, value: scala.Double): this.type = js.native
  /**
       * Set one or more attributes for the set of matched elements.
       *
       * @param attributes An object of attribute-value pairs to set.
       * @see {@link https://api.jquery.com/attr/#attr-attributes}
       */
  def attr(attributes: js.Object): this.type = js.native
  /**
       * Get the value of an attribute for the first element in the set of matched elements.
       *
       * @param attributeName The name of the attribute to get.
       * @see {@link https://api.jquery.com/attr/#attr-attributeName}
       */
  @JSName("attr")
  def attr_String(attributeName: java.lang.String): java.lang.String = js.native
  /**
       * Attach a handler to an event for the elements.
       *
       * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
       * @param handler A function to execute each time the event is triggered.
       * @see {@link https://api.jquery.com/bind/#bind-eventType-eventData-handler}
       */
  def bind(eventType: java.lang.String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): this.type = js.native
  /**
       * Attach a handler to an event for the elements.
       *
       * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
       * @param preventBubble Setting the third argument to false will attach a function that prevents the default action from occurring and stops the event from bubbling. The default is true.
       * @see {@link https://api.jquery.com/bind/#bind-eventType-eventData-preventBubble}
       */
  def bind(eventType: java.lang.String, preventBubble: scala.Boolean): this.type = js.native
  /**
       * Attach a handler to an event for the elements.
       *
       * @param events An object containing one or more DOM event types and functions to execute for them.
       * @see {@link https://api.jquery.com/bind/#bind-events}
       */
  def bind(events: js.Any): this.type = js.native
  /**
       * Get the children of each element in the set of matched elements, optionally filtered by a selector.
       *
       * @see {@link https://api.jquery.com/children/}
       */
  def children(): this.type = js.native
  /**
       * Create a deep copy of the set of matched elements.
       *
       * @param withDataAndEvents A Boolean indicating whether event handlers and data should be copied along with the elements. The default value is false.
       * @param deepWithDataAndEvents A Boolean indicating whether event handlers and data for all children of the cloned element should be copied. By default its value matches the first argument's value (which defaults to false).
       * @see {@link https://api.jquery.com/clone/}
       */
  def clone(withDataAndEvents: scala.Boolean): this.type = js.native
  /**
       * Create a deep copy of the set of matched elements.
       *
       * @param withDataAndEvents A Boolean indicating whether event handlers and data should be copied along with the elements. The default value is false.
       * @param deepWithDataAndEvents A Boolean indicating whether event handlers and data for all children of the cloned element should be copied. By default its value matches the first argument's value (which defaults to false).
       * @see {@link https://api.jquery.com/clone/}
       */
  def clone(withDataAndEvents: scala.Boolean, deepWithDataAndEvents: scala.Boolean): this.type = js.native
  /**
       * Get the children of each element in the set of matched elements, including text and comment nodes.
       * @see {@link https://api.jquery.com/contents/}
       */
  def contents(): this.type = js.native
  // TODO: events, how to define?
  // $destroy
  def controller(): js.Any = js.native
  // TODO: events, how to define?
  // $destroy
  def controller(name: java.lang.String): js.Any = js.native
  /**
       * Set one or more CSS properties for the set of matched elements.
       *
       * @param properties An object of property-value pairs to set.
       * @see {@link https://api.jquery.com/css/#css-properties}
       */
  def css(properties: JQLiteCssProperties): this.type = js.native
  /**
       * Get the value of style properties for the first element in the set of matched elements.
       *
       * @param propertyName A CSS property.
       * @see {@link https://api.jquery.com/css/#css-propertyName}
       */
  def css(propertyName: java.lang.String): java.lang.String = js.native
  /**
       * Set one or more CSS properties for the set of matched elements.
       *
       * @param propertyName A CSS property name.
       * @param value A value to set for the property.
       * @see {@link https://api.jquery.com/css/#css-propertyName-value}
       */
  def css(propertyName: java.lang.String, value: java.lang.String): this.type = js.native
  /**
       * Set one or more CSS properties for the set of matched elements.
       *
       * @param propertyName A CSS property name.
       * @param value A function returning the value to set. this is the current element. Receives the index position of the element in the set and the old value as arguments.
       * @see {@link https://api.jquery.com/css/#css-propertyName-function}
       */
  def css(
    propertyName: java.lang.String,
    value: js.Function2[
      /* index */ scala.Double, 
      /* value */ java.lang.String, 
      java.lang.String | scala.Double
    ]
  ): this.type = js.native
  /**
       * Set one or more CSS properties for the set of matched elements.
       *
       * @param propertyName A CSS property name.
       * @param value A value to set for the property.
       * @see {@link https://api.jquery.com/css/#css-propertyName-value}
       */
  def css(propertyName: java.lang.String, value: scala.Double): this.type = js.native
  /**
       * Get the value of style properties for the first element in the set of matched elements.
       * Results in an object of property-value pairs.
       *
       * @param propertyNames An array of one or more CSS properties.
       * @see {@link https://api.jquery.com/css/#css-propertyNames}
       */
  def css(propertyNames: js.Array[java.lang.String]): js.Any = js.native
  /**
       * Return the value at the named data store for the first element in the jQuery collection, as set by data(name, value) or by an HTML5 data-* attribute.
       * @see {@link https://api.jquery.com/data/#data}
       */
  def data(): js.Any = js.native
  /**
       * Return the value at the named data store for the first element in the jQuery collection, as set by data(name, value) or by an HTML5 data-* attribute.
       *
       * @param key Name of the data stored.
       * @see {@link https://api.jquery.com/data/#data-key}
       */
  def data(key: java.lang.String): js.Any = js.native
  /**
       * Store arbitrary data associated with the matched elements.
       *
       * @param key A string naming the piece of data to set.
       * @param value The new data value; it can be any JavaScript type including Array or Object.
       * @see {@link https://api.jquery.com/data/#data-key-value}
       */
  def data(key: java.lang.String, value: js.Any): this.type = js.native
  /**
       * Store arbitrary data associated with the matched elements.
       *
       * @param obj An object of key-value pairs of data to update.
       * @see {@link https://api.jquery.com/data/#data-obj}
       */
  def data(obj: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
  /**
       * Remove the set of matched elements from the DOM.
       *
       * @param selector A selector expression that filters the set of matched elements to be removed.
       * @see {@link https://api.jquery.com/detach/}
       */
  def detach(): this.type = js.native
  /**
       * Remove the set of matched elements from the DOM.
       *
       * @param selector A selector expression that filters the set of matched elements to be removed.
       * @see {@link https://api.jquery.com/detach/}
       */
  def detach(selector: java.lang.String): this.type = js.native
  /**
       * Remove all child nodes of the set of matched elements from the DOM.
       * @see {@link https://api.jquery.com/empty/}
       */
  def empty(): this.type = js.native
  /**
       * Reduce the set of matched elements to the one at the specified index.
       *
       * @param index An integer indicating the 0-based position of the element. OR An integer indicating the position of the element, counting backwards from the last element in the set.
       * @see {@link https://api.jquery.com/eq/}
       */
  def eq(index: scala.Double): this.type = js.native
  def find(element: js.Any): this.type = js.native
  def find(obj: JQuery): this.type = js.native
  /**
       * Get the descendants of each element in the current set of matched elements, filtered by a selector, jQuery object, or element.
       *
       * @param selector A string containing a selector expression to match elements against.
       * @see {@link https://api.jquery.com/find/#find-selector}
       */
  def find(selector: java.lang.String): this.type = js.native
  /**
       * Determine whether any of the matched elements are assigned the given class.
       *
       * @param className The class name to search for.
       * @see {@link https://api.jquery.com/hasClass/}
       */
  def hasClass(className: java.lang.String): scala.Boolean = js.native
  /**
       * Get the HTML contents of the first element in the set of matched elements.
       * @see {@link https://api.jquery.com/html/#html}
       */
  def html(): java.lang.String = js.native
  /**
       * Set the HTML contents of each element in the set of matched elements.
       *
       * @param func A function returning the HTML content to set. Receives the index position of the element in the set and the old HTML value as arguments. jQuery empties the element before calling the function; use the oldhtml argument to reference the previous content. Within the function, this refers to the current element in the set.
       * @see {@link https://api.jquery.com/html/#html-function}
       */
  def html(func: js.Function2[/* index */ scala.Double, /* oldhtml */ java.lang.String, java.lang.String]): this.type = js.native
  /**
       * Set the HTML contents of each element in the set of matched elements.
       *
       * @param htmlString A string of HTML to set as the content of each matched element.
       * @see {@link https://api.jquery.com/html/#html-htmlString}
       */
  def html(htmlString: java.lang.String): this.type = js.native
  def inheritedData(): js.Any = js.native
  def inheritedData(key: java.lang.String): js.Any = js.native
  def inheritedData(key: java.lang.String, value: js.Any): this.type = js.native
  def inheritedData(obj: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
  def injector(): angularLib.angularMod.angularNs.autoNs.IInjectorService = js.native
  /**
       * Returns the `$scope` of the element.
       *
       * **IMPORTANT**: Requires `debugInfoEnabled` to be true.
       *
       * See https://docs.angularjs.org/guide/production#disabling-debug-data for more information.
       */
  def isolateScope[T /* <: angularLib.angularMod.angularNs.IScope */](): T = js.native
  /**
       * Get the immediately following sibling of each element in the set of matched elements. If a selector is provided, it retrieves the next sibling only if it matches that selector.
       *
       * @see {@link https://api.jquery.com/next/}
       */
  def next(): this.type = js.native
  /**
       * Remove an event handler.
       * @see {@link https://api.jquery.com/off/#off}
       */
  def off(): this.type = js.native
  /**
       * Remove an event handler.
       *
       * @param events One or more space-separated event types and optional namespaces, or just namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
       * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
       * @param handler A handler function previously attached for the event(s), or the special value false.
       * @see {@link https://api.jquery.com/off/#off-events-selector-handler}
       */
  def off(events: java.lang.String): this.type = js.native
  /**
       * Remove an event handler.
       *
       * @param events One or more space-separated event types and optional namespaces, or just namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
       * @param handler A handler function previously attached for the event(s), or the special value false.
       * @see {@link https://api.jquery.com/off/#off-events-selector-handler}
       */
  def off(events: java.lang.String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): this.type = js.native
  /**
       * Remove an event handler.
       *
       * @param events One or more space-separated event types and optional namespaces, or just namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
       * @param handler A handler function previously attached for the event(s), or the special value false. Takes handler with extra args that can be attached with on().
       * @see {@link https://api.jquery.com/off/#off-events-selector-handler}
       */
  def off(
    events: java.lang.String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */js.Any, _]
  ): this.type = js.native
  /**
       * Remove an event handler.
       *
       * @param events One or more space-separated event types and optional namespaces, or just namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
       * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
       * @param handler A handler function previously attached for the event(s), or the special value false.
       * @see {@link https://api.jquery.com/off/#off-events-selector-handler}
       */
  def off(events: java.lang.String, selector: java.lang.String): this.type = js.native
  /**
       * Remove an event handler.
       *
       * @param events One or more space-separated event types and optional namespaces, or just namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
       * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
       * @param handler A handler function previously attached for the event(s), or the special value false.
       * @see {@link https://api.jquery.com/off/#off-events-selector-handler}
       */
  def off(
    events: java.lang.String,
    selector: java.lang.String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): this.type = js.native
  /**
       * Remove an event handler.
       *
       * @param events An object where the string keys represent one or more space-separated event types and optional namespaces, and the values represent handler functions previously attached for the event(s).
       * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
       * @see {@link https://api.jquery.com/off/#off-events-selector}
       */
  def off(events: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
  /**
       * Remove an event handler.
       *
       * @param events An object where the string keys represent one or more space-separated event types and optional namespaces, and the values represent handler functions previously attached for the event(s).
       * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
       * @see {@link https://api.jquery.com/off/#off-events-selector}
       */
  def off(events: org.scalablytyped.runtime.StringDictionary[js.Any], selector: java.lang.String): this.type = js.native
  /**
       * Attach an event handler function for one or more events to the selected elements.
       *
       * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
       * @param data Data to be passed to the handler in event.data when an event is triggered.
       * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
       * @see {@link https://api.jquery.com/on/#on-events-selector-data-handler}
       */
  def on(
    events: java.lang.String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */js.Any, _]
  ): this.type = js.native
  /**
       * Attach an event handler function for one or more events to the selected elements.
       *
       * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
       * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false. Rest parameter args is for optional parameters passed to jQuery.trigger(). Note that the actual parameters on the event handler function must be marked as optional (? syntax).
       * @see {@link https://api.jquery.com/on/#on-events-selector-data-handler}
       */
  def on(
    events: java.lang.String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */js.Any, _]
  ): this.type = js.native
  /**
       * Attach an event handler function for one or more events to the selected elements.
       *
       * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
       * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
       * @param data Data to be passed to the handler in event.data when an event is triggered.
       * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
       * @see {@link https://api.jquery.com/on/#on-events-selector-data-handler}
       */
  def on(
    events: java.lang.String,
    selector: java.lang.String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */js.Any, _]
  ): this.type = js.native
  /**
       * Attach an event handler function for one or more events to the selected elements.
       *
       * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
       * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
       * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
       * @see {@link https://api.jquery.com/on/#on-events-selector-data-handler}
       */
  def on(
    events: java.lang.String,
    selector: java.lang.String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */js.Any, _]
  ): this.type = js.native
  /**
       * Attach an event handler function for one or more events to the selected elements.
       *
       * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
       * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If the selector is null or omitted, the handler is always called when it reaches the selected element.
       * @param data Data to be passed to the handler in event.data when an event occurs.
       * @see {@link https://api.jquery.com/on/#on-events-selector-data}
       */
  def on(
    events: org.scalablytyped.runtime.StringDictionary[js.Function2[/* eventObject */ JQueryEventObject, /* repeated */js.Any, _]]
  ): this.type = js.native
  /**
       * Attach an event handler function for one or more events to the selected elements.
       *
       * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
       * @param data Data to be passed to the handler in event.data when an event occurs.
       * @see {@link https://api.jquery.com/on/#on-events-selector-data}
       */
  def on(
    events: org.scalablytyped.runtime.StringDictionary[js.Function2[/* eventObject */ JQueryEventObject, /* repeated */js.Any, _]],
    data: js.Any
  ): this.type = js.native
  /**
       * Attach an event handler function for one or more events to the selected elements.
       *
       * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
       * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If the selector is null or omitted, the handler is always called when it reaches the selected element.
       * @param data Data to be passed to the handler in event.data when an event occurs.
       * @see {@link https://api.jquery.com/on/#on-events-selector-data}
       */
  def on(
    events: org.scalablytyped.runtime.StringDictionary[js.Function2[/* eventObject */ JQueryEventObject, /* repeated */js.Any, _]],
    selector: java.lang.String
  ): this.type = js.native
  /**
       * Attach an event handler function for one or more events to the selected elements.
       *
       * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
       * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If the selector is null or omitted, the handler is always called when it reaches the selected element.
       * @param data Data to be passed to the handler in event.data when an event occurs.
       * @see {@link https://api.jquery.com/on/#on-events-selector-data}
       */
  def on(
    events: org.scalablytyped.runtime.StringDictionary[js.Function2[/* eventObject */ JQueryEventObject, /* repeated */js.Any, _]],
    selector: java.lang.String,
    data: js.Any
  ): this.type = js.native
  /**
       * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
       *
       * @param events A string containing one or more JavaScript event types, such as "click" or "submit," or custom event names.
       * @param data An object containing data that will be passed to the event handler.
       * @param handler A function to execute at the time the event is triggered.
       * @see {@link https://api.jquery.com/one/#one-events-data-handler}
       */
  def one(
    events: java.lang.String,
    data: js.Object,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): this.type = js.native
  /**
       * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
       *
       * @param events A string containing one or more JavaScript event types, such as "click" or "submit," or custom event names.
       * @param handler A function to execute at the time the event is triggered.
       * @see {@link https://api.jquery.com/one/#one-events-data-handler}
       */
  def one(events: java.lang.String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): this.type = js.native
  /**
       * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
       *
       * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
       * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
       * @param data Data to be passed to the handler in event.data when an event is triggered.
       * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
       * @see {@link https://api.jquery.com/one/#one-events-selector-data-handler}
       */
  def one(
    events: java.lang.String,
    selector: java.lang.String,
    data: js.Any,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): this.type = js.native
  /**
       * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
       *
       * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
       * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
       * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
       * @see {@link https://api.jquery.com/one/#one-events-selector-data-handler}
       */
  def one(
    events: java.lang.String,
    selector: java.lang.String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): this.type = js.native
  /**
       * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
       *
       * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
       * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If the selector is null or omitted, the handler is always called when it reaches the selected element.
       * @param data Data to be passed to the handler in event.data when an event occurs.
       * @see {@link https://api.jquery.com/one/#one-events-selector-data}
       */
  def one(events: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
  /**
       * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
       *
       * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
       * @param data Data to be passed to the handler in event.data when an event occurs.
       * @see {@link https://api.jquery.com/one/#one-events-selector-data}
       */
  def one(events: org.scalablytyped.runtime.StringDictionary[js.Any], data: js.Any): this.type = js.native
  /**
       * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
       *
       * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
       * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If the selector is null or omitted, the handler is always called when it reaches the selected element.
       * @param data Data to be passed to the handler in event.data when an event occurs.
       * @see {@link https://api.jquery.com/one/#one-events-selector-data}
       */
  def one(events: org.scalablytyped.runtime.StringDictionary[js.Any], selector: java.lang.String): this.type = js.native
  /**
       * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
       *
       * @param events An object in which the string keys represent one or more space-separated event types and optional namespaces, and the values represent a handler function to be called for the event(s).
       * @param selector A selector string to filter the descendants of the selected elements that will call the handler. If the selector is null or omitted, the handler is always called when it reaches the selected element.
       * @param data Data to be passed to the handler in event.data when an event occurs.
       * @see {@link https://api.jquery.com/one/#one-events-selector-data}
       */
  def one(
    events: org.scalablytyped.runtime.StringDictionary[js.Any],
    selector: java.lang.String,
    data: js.Any
  ): this.type = js.native
  /**
       * Get the parent of each element in the current set of matched elements, optionally filtered by a selector.
       *
       * @see {@link https://api.jquery.com/parent/}
       */
  def parent(): this.type = js.native
  /**
       * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
       *
       * @param content1 DOM element, DocumentFragment, array of elements, HTML string, or jQuery object to insert at the beginning of each element in the set of matched elements.
       * @param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the beginning of each element in the set of matched elements.
       * @see {@link https://api.jquery.com/prepend/#prepend-content-content}
       */
  def prepend(content1: JQuery, content2: js.Any*): this.type = js.native
  /**
       * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
       *
       * @param content1 DOM element, DocumentFragment, array of elements, HTML string, or jQuery object to insert at the beginning of each element in the set of matched elements.
       * @param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the beginning of each element in the set of matched elements.
       * @see {@link https://api.jquery.com/prepend/#prepend-content-content}
       */
  def prepend(content1: java.lang.String, content2: js.Any*): this.type = js.native
  /**
       * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
       *
       * @param content1 DOM element, DocumentFragment, array of elements, HTML string, or jQuery object to insert at the beginning of each element in the set of matched elements.
       * @param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the beginning of each element in the set of matched elements.
       * @see {@link https://api.jquery.com/prepend/#prepend-content-content}
       */
  def prepend(content1: js.Array[_], content2: js.Any*): this.type = js.native
  /**
       * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
       *
       * @param content1 DOM element, DocumentFragment, array of elements, HTML string, or jQuery object to insert at the beginning of each element in the set of matched elements.
       * @param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the beginning of each element in the set of matched elements.
       * @see {@link https://api.jquery.com/prepend/#prepend-content-content}
       */
  def prepend(content1: stdLib.DocumentFragment, content2: js.Any*): this.type = js.native
  /**
       * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
       *
       * @param content1 DOM element, DocumentFragment, array of elements, HTML string, or jQuery object to insert at the beginning of each element in the set of matched elements.
       * @param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the beginning of each element in the set of matched elements.
       * @see {@link https://api.jquery.com/prepend/#prepend-content-content}
       */
  def prepend(content1: stdLib.Element, content2: js.Any*): this.type = js.native
  /**
       * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
       *
       * @param content1 DOM element, DocumentFragment, array of elements, HTML string, or jQuery object to insert at the beginning of each element in the set of matched elements.
       * @param content2 One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the beginning of each element in the set of matched elements.
       * @see {@link https://api.jquery.com/prepend/#prepend-content-content}
       */
  def prepend(content1: stdLib.Text, content2: js.Any*): this.type = js.native
  /**
       * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
       *
       * @param func A function that returns an HTML string, DOM element(s), or jQuery object to insert at the beginning of each element in the set of matched elements. Receives the index position of the element in the set and the old HTML value of the element as arguments. Within the function, this refers to the current element in the set.
       * @see {@link https://api.jquery.com/prepend/#prepend-function}
       */
  def prepend(
    func: js.Function2[
      /* index */ scala.Double, 
      /* html */ java.lang.String, 
      java.lang.String | stdLib.Element | this.type
    ]
  ): this.type = js.native
  /**
       * Set one or more properties for the set of matched elements.
       *
       * @param properties An object of property-value pairs to set.
       * @see {@link https://api.jquery.com/prop/#prop-properties}
       */
  def prop(properties: js.Object): this.type = js.native
  /**
       * Get the value of a property for the first element in the set of matched elements.
       *
       * @param propertyName The name of the property to get.
       * @see {@link https://api.jquery.com/prop/#prop-propertyName}
       */
  def prop(propertyName: java.lang.String): js.Any = js.native
  /**
       * Set one or more properties for the set of matched elements.
       *
       * @param propertyName The name of the property to set.
       * @param func A function returning the value to set. Receives the index position of the element in the set and the old property value as arguments. Within the function, the keyword this refers to the current element.
       * @see {@link https://api.jquery.com/prop/#prop-propertyName-function}
       */
  def prop(
    propertyName: java.lang.String,
    func: js.Function2[/* index */ scala.Double, /* oldPropertyValue */ js.Any, _]
  ): this.type = js.native
  /**
       * Set one or more properties for the set of matched elements.
       *
       * @param propertyName The name of the property to set.
       * @param value A value to set for the property.
       * @see {@link https://api.jquery.com/prop/#prop-propertyName-value}
       */
  def prop(propertyName: java.lang.String, value: java.lang.String): this.type = js.native
  /**
       * Set one or more properties for the set of matched elements.
       *
       * @param propertyName The name of the property to set.
       * @param value A value to set for the property.
       * @see {@link https://api.jquery.com/prop/#prop-propertyName-value}
       */
  def prop(propertyName: java.lang.String, value: scala.Boolean): this.type = js.native
  /**
       * Set one or more properties for the set of matched elements.
       *
       * @param propertyName The name of the property to set.
       * @param value A value to set for the property.
       * @see {@link https://api.jquery.com/prop/#prop-propertyName-value}
       */
  def prop(propertyName: java.lang.String, value: scala.Double): this.type = js.native
  /**
       * Specify a function to execute when the DOM is fully loaded.
       *
       * @param handler A function to execute after the DOM is ready.
       * @see {@link https://api.jquery.com/ready/}
       */
  def ready(handler: js.Function1[/* jQueryAlias */ js.UndefOr[JQueryStatic], _]): this.type = js.native
  /**
       * Remove the set of matched elements from the DOM.
       *
       * @param selector A selector expression that filters the set of matched elements to be removed.
       * @see {@link https://api.jquery.com/remove/}
       */
  def remove(): this.type = js.native
  /**
       * Remove the set of matched elements from the DOM.
       *
       * @param selector A selector expression that filters the set of matched elements to be removed.
       * @see {@link https://api.jquery.com/remove/}
       */
  def remove(selector: java.lang.String): this.type = js.native
  /**
       * Remove an attribute from each element in the set of matched elements.
       *
       * @param attributeName An attribute to remove; as of version 1.7, it can be a space-separated list of attributes.
       * @see {@link https://api.jquery.com/removeAttr/}
       */
  def removeAttr(attributeName: java.lang.String): this.type = js.native
  /**
       * Remove a single class, multiple classes, or all classes from each element in the set of matched elements.
       *
       * @param className One or more space-separated classes to be removed from the class attribute of each matched element.
       * @see {@link https://api.jquery.com/removeClass/#removeClass-className}
       */
  def removeClass(): this.type = js.native
  /**
       * Remove a single class, multiple classes, or all classes from each element in the set of matched elements.
       *
       * @param className One or more space-separated classes to be removed from the class attribute of each matched element.
       * @see {@link https://api.jquery.com/removeClass/#removeClass-className}
       */
  def removeClass(className: java.lang.String): this.type = js.native
  /**
       * Remove all previously-stored piece of data.
       * @see {@link https://api.jquery.com/removeData/}
       */
  def removeData(): this.type = js.native
  /**
       * Remove a previously-stored piece of data.
       *
       * @param list An array of strings naming the pieces of data to delete.
       * @see {@link https://api.jquery.com/removeData/#removeData-list}
       */
  def removeData(list: js.Array[java.lang.String]): this.type = js.native
  /**
       * Remove a previously-stored piece of data.
       *
       * @param name A string naming the piece of data to delete or space-separated string naming the pieces of data to delete.
       * @see {@link https://api.jquery.com/removeData/#removeData-name}
       */
  def removeData(name: java.lang.String): this.type = js.native
  /**
       * Replace each element in the set of matched elements with the provided new content and return the set of elements that was removed.
       *
       * @param func A function that returns content with which to replace the set of matched elements.
       * @see {@link https://api.jquery.com/replaceWith/#replaceWith-function}
       */
  def replaceWith(func: js.Function0[stdLib.Element | this.type]): this.type = js.native
  /**
       * Replace each element in the set of matched elements with the provided new content and return the set of elements that was removed.
       *
       * @param newContent The content to insert. May be an HTML string, DOM element, array of DOM elements, or jQuery object.
       * @see {@link https://api.jquery.com/replaceWith/#replaceWith-newContent}
       */
  def replaceWith(newContent: JQuery): this.type = js.native
  /**
       * Replace each element in the set of matched elements with the provided new content and return the set of elements that was removed.
       *
       * @param newContent The content to insert. May be an HTML string, DOM element, array of DOM elements, or jQuery object.
       * @see {@link https://api.jquery.com/replaceWith/#replaceWith-newContent}
       */
  def replaceWith(newContent: java.lang.String): this.type = js.native
  /**
       * Replace each element in the set of matched elements with the provided new content and return the set of elements that was removed.
       *
       * @param newContent The content to insert. May be an HTML string, DOM element, array of DOM elements, or jQuery object.
       * @see {@link https://api.jquery.com/replaceWith/#replaceWith-newContent}
       */
  def replaceWith(newContent: js.Array[_]): this.type = js.native
  /**
       * Replace each element in the set of matched elements with the provided new content and return the set of elements that was removed.
       *
       * @param newContent The content to insert. May be an HTML string, DOM element, array of DOM elements, or jQuery object.
       * @see {@link https://api.jquery.com/replaceWith/#replaceWith-newContent}
       */
  def replaceWith(newContent: stdLib.Element): this.type = js.native
  /**
       * Replace each element in the set of matched elements with the provided new content and return the set of elements that was removed.
       *
       * @param newContent The content to insert. May be an HTML string, DOM element, array of DOM elements, or jQuery object.
       * @see {@link https://api.jquery.com/replaceWith/#replaceWith-newContent}
       */
  def replaceWith(newContent: stdLib.Text): this.type = js.native
  /**
       * Returns the `$scope` of the element.
       *
       * **IMPORTANT**: Requires `debugInfoEnabled` to be true.
       *
       * See https://docs.angularjs.org/guide/production#disabling-debug-data for more information.
       */
  def scope[T /* <: angularLib.angularMod.angularNs.IScope */](): T = js.native
  /**
       * Get the combined text contents of each element in the set of matched elements, including their descendants.
       * @see {@link https://api.jquery.com/text/#text}
       */
  def text(): java.lang.String = js.native
  /**
       * Set the content of each element in the set of matched elements to the specified text.
       *
       * @param func A function returning the text content to set. Receives the index position of the element in the set and the old text value as arguments.
       * @see {@link https://api.jquery.com/text/#text-function}
       */
  def text(func: js.Function2[/* index */ scala.Double, /* text */ java.lang.String, java.lang.String]): this.type = js.native
  /**
       * Set the content of each element in the set of matched elements to the specified text.
       *
       * @param text The text to set as the content of each matched element. When Number or Boolean is supplied, it will be converted to a String representation.
       * @see {@link https://api.jquery.com/text/#text-text}
       */
  def text(text: java.lang.String): this.type = js.native
  /**
       * Set the content of each element in the set of matched elements to the specified text.
       *
       * @param text The text to set as the content of each matched element. When Number or Boolean is supplied, it will be converted to a String representation.
       * @see {@link https://api.jquery.com/text/#text-text}
       */
  def text(text: scala.Boolean): this.type = js.native
  /**
       * Set the content of each element in the set of matched elements to the specified text.
       *
       * @param text The text to set as the content of each matched element. When Number or Boolean is supplied, it will be converted to a String representation.
       * @see {@link https://api.jquery.com/text/#text-text}
       */
  def text(text: scala.Double): this.type = js.native
  /**
       * Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the switch argument.
       *
       * @param swtch A boolean value to determine whether the class should be added or removed.
       * @see {@link https://api.jquery.com/toggleClass/#toggleClass-state}
       */
  def toggleClass(): this.type = js.native
  /**
       * Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the switch argument.
       *
       * @param className One or more class names (separated by spaces) to be toggled for each element in the matched set.
       * @param swtch A Boolean (not just truthy/falsy) value to determine whether the class should be added or removed.
       * @see {@link https://api.jquery.com/toggleClass/#toggleClass-className}
       */
  def toggleClass(className: java.lang.String): this.type = js.native
  /**
       * Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the switch argument.
       *
       * @param className One or more class names (separated by spaces) to be toggled for each element in the matched set.
       * @param swtch A Boolean (not just truthy/falsy) value to determine whether the class should be added or removed.
       * @see {@link https://api.jquery.com/toggleClass/#toggleClass-className}
       */
  def toggleClass(className: java.lang.String, swtch: scala.Boolean): this.type = js.native
  /**
       * Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the switch argument.
       *
       * @param swtch A boolean value to determine whether the class should be added or removed.
       * @see {@link https://api.jquery.com/toggleClass/#toggleClass-state}
       */
  def toggleClass(swtch: scala.Boolean): this.type = js.native
  /**
       * Execute all handlers attached to an element for an event.
       *
       * @param eventType A string containing a JavaScript event type, such as click or submit.
       * @param extraParameters An array of additional parameters to pass along to the event handler.
       * @see {@link https://api.jquery.com/triggerHandler/#triggerHandler-eventType-extraParameters}
       */
  def triggerHandler(eventType: java.lang.String, extraParameters: js.Any*): js.Object = js.native
  /**
       * Execute all handlers attached to an element for an event.
       *
       * @param event A jQuery.Event object.
       * @param extraParameters An array of additional parameters to pass along to the event handler.
       * @see {@link https://api.jquery.com/triggerHandler/#triggerHandler-event-extraParameters}
       */
  def triggerHandler(event: JQueryEventObject, extraParameters: js.Any*): js.Object = js.native
  /**
       * Remove a previously-attached event handler from the elements.
       *
       * @param eventType A string containing a JavaScript event type, such as click or submit.
       * @param handler The function that is to be no longer executed.
       * @see {@link https://api.jquery.com/unbind/#unbind-eventType-handler}
       */
  def unbind(): this.type = js.native
  /**
       * Remove a previously-attached event handler from the elements.
       *
       * @param eventType A string containing a JavaScript event type, such as click or submit.
       * @param handler The function that is to be no longer executed.
       * @see {@link https://api.jquery.com/unbind/#unbind-eventType-handler}
       */
  def unbind(eventType: java.lang.String): this.type = js.native
  /**
       * Remove a previously-attached event handler from the elements.
       *
       * @param eventType A string containing a JavaScript event type, such as click or submit.
       * @param fls Unbinds the corresponding 'return false' function that was bound using .bind( eventType, false ).
       * @see {@link https://api.jquery.com/unbind/#unbind-eventType-false}
       */
  def unbind(eventType: java.lang.String, fls: scala.Boolean): this.type = js.native
  /**
       * Remove a previously-attached event handler from the elements.
       *
       * @param eventType A string containing a JavaScript event type, such as click or submit.
       * @param handler The function that is to be no longer executed.
       * @see {@link https://api.jquery.com/unbind/#unbind-eventType-handler}
       */
  def unbind(eventType: java.lang.String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): this.type = js.native
  /**
       * Remove a previously-attached event handler from the elements.
       *
       * @param evt A JavaScript event object as passed to an event handler.
       * @see {@link https://api.jquery.com/unbind/#unbind-event}
       */
  def unbind(evt: js.Any): this.type = js.native
  /**
       * Get the current value of the first element in the set of matched elements.
       * @see {@link https://api.jquery.com/val/#val}
       */
  def `val`(): js.Any = js.native
  /**
       * Set the value of each element in the set of matched elements.
       *
       * @param func A function returning the value to set. this is the current element. Receives the index position of the element in the set and the old value as arguments.
       * @see {@link https://api.jquery.com/val/#val-function}
       */
  def `val`(func: js.Function2[/* index */ scala.Double, /* value */ java.lang.String, java.lang.String]): this.type = js.native
  /**
       * Set the value of each element in the set of matched elements.
       *
       * @param value A string of text, an array of strings or number corresponding to the value of each matched element to set as selected/checked.
       * @see {@link https://api.jquery.com/val/#val-value}
       */
  def `val`(value: java.lang.String): this.type = js.native
  /**
       * Set the value of each element in the set of matched elements.
       *
       * @param value A string of text, an array of strings or number corresponding to the value of each matched element to set as selected/checked.
       * @see {@link https://api.jquery.com/val/#val-value}
       */
  def `val`(value: js.Array[java.lang.String]): this.type = js.native
  /**
       * Set the value of each element in the set of matched elements.
       *
       * @param value A string of text, an array of strings or number corresponding to the value of each matched element to set as selected/checked.
       * @see {@link https://api.jquery.com/val/#val-value}
       */
  def `val`(value: scala.Double): this.type = js.native
  /**
       * Wrap an HTML structure around each element in the set of matched elements.
       *
       * @param func A callback function returning the HTML content or jQuery object to wrap around the matched elements. Receives the index position of the element in the set as an argument. Within the function, this refers to the current element in the set.
       * @see {@link https://api.jquery.com/wrap/#wrap-function}
       */
  def wrap(func: js.Function1[/* index */ scala.Double, java.lang.String | this.type]): this.type = js.native
  /**
       * Wrap an HTML structure around each element in the set of matched elements.
       *
       * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
       * @see {@link https://api.jquery.com/wrap/#wrap-wrappingElement}
       */
  def wrap(wrappingElement: JQuery): this.type = js.native
  /**
       * Wrap an HTML structure around each element in the set of matched elements.
       *
       * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
       * @see {@link https://api.jquery.com/wrap/#wrap-wrappingElement}
       */
  def wrap(wrappingElement: java.lang.String): this.type = js.native
  /**
       * Wrap an HTML structure around each element in the set of matched elements.
       *
       * @param wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
       * @see {@link https://api.jquery.com/wrap/#wrap-wrappingElement}
       */
  def wrap(wrappingElement: stdLib.Element): this.type = js.native
}

