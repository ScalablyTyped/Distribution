package typings.appframework

import typings.appframework.anon.Bottom
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait appFrameworkCollection extends StObject {
  
  /**
    * Adds a css class to elements.
    ```
    $().addClass("selected");
    ```
    * @param {String} classes that are space delimited
    * @return {Object} appframework object
    * @title $().addClass(name)
    */
  def addClass(className: String): appFrameworkCollection = js.native
  
  /**
    * Appends to the elements
    * We boil everything down to an appframework object and then loop through that.
    * If it's HTML, we create a dom element so we do not break event bindings.
    * if it's a script tag, we evaluate it.
    ```
    $().append("<div></div>"); //Creates the object from the string and appends it
    $().append($("#foo")); //Append an object;
    ```
    * @param {String|Object} Element/string to add
    * @param {Boolean} [insert] insert or append
    * @return {Object} appframework object
    * @title $().append(element,[insert])
    */
  def append(content: Any): appFrameworkCollection = js.native
  
  /**
    * Appends the current collection to the selector
    ```
    $().appendTo("#foo"); //Append an object;
    ```
    * @param {String|Object} Selector to append to
    * @param {Boolean} [insert] insert or append
    * @title $().appendTo(element,[insert])
    */
  def appendTo(target: Any): appFrameworkCollection = js.native
  
  def attr(attributeHash: js.Object): appFrameworkCollection = js.native
  /**
    * Gets or sets an attribute on an element
    * If used as a getter, we return the first elements value.  If nothing is in the collection, we return undefined
    ```
    $().attr("foo"); //Gets the first elements 'foo' attribute
    $().attr("foo","bar");//Sets the elements 'foo' attribute to 'bar'
    $().attr("foo",{bar:'bar'}) //Adds the object to an internal cache
    ```
    * @param {String|Object} attribute to act upon.  If it's an object (hashmap), it will set the attributes based off the kvp.
    * @param {String|Array|Object|function} [value] to set
    * @return {String|Object|Array|Function} If used as a getter, return the attribute value.  If a setter, return an appframework object
    * @title $().attr(attribute,[value])
    */
  def attr(attribute: String): Any = js.native
  def attr(attribute: String, value: String): appFrameworkCollection = js.native
  def attr(attribute: String, value: Any): appFrameworkCollection = js.native
  
  /**
    * Binds an event to each element in the collection and executes the callback
    ```
    $().bind('click',function(){console.log('I clicked '+this.id);});
    ```
    * @param {String|Object} event
    * @param {Function} callback
    * @return {Object} appframework object
    * @title $().bind(event,callback)
    */
  def bind(eventHash: js.Object): appFrameworkCollection = js.native
  def bind(eventName: String, fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  
  /**
    custom events since people want to do $().blur instead of $().bind("blur")
    */
  def blur(): appFrameworkCollection = js.native
  def blur(fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  
  /**
    custom events since people want to do $().change instead of $().bind("change")
    */
  def change(): appFrameworkCollection = js.native
  def change(fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  
  /**
    * Returns the child nodes of the elements based off the selector
    ```
    $("#foo").children('.bar'); //Selector
    $("#foo").children($('.bar')); //Objects
    $("#foo").children($('.bar').get(0)); //Single element
    ```
    * @param {String|Array|Object} [selector]
    * @return {Object} appframework object with unique children
    * @title $().children(selector)
    */
  def children(): appFrameworkCollection = js.native
  def children(selector: Any): appFrameworkCollection = js.native
  
  /**
    custom events since people want to do $().click instead of $().bind("click")
    */
  def click(): appFrameworkCollection = js.native
  def click(fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  
  def clone(deep: Boolean): appFrameworkCollection = js.native
  
  /**
    * Returns the closest element based off the selector and optional context
    ```
    $("#foo").closest('.bar'); //Selector
    $("#foo").closest($('.bar')); //Objects
    $("#foo").closest($('.bar').get(0)); //Single element
    ```
    * @param {String|Array|Object} selector
    * @param {Object} [context]
    * @return {Object} Returns an appframework object with the closest element based off the selector
    * @title $().closest(selector,[context]);
    */
  def closest(): appFrameworkCollection = js.native
  def closest(selector: Any): appFrameworkCollection = js.native
  
  /**
    * Gets the computed style of CSS values
    *
    ```
    $("#main").computedStyle('display');
    ```
    * @param {String} css property
    * @return {Int|String|Float|} css vlaue
    * @title $().computedStyle()
    */
  def computedStyle(css: String): appFrameworkCollection = js.native
  
  def concat(items: appFrameworkCollection*): js.Array[appFrameworkCollection] = js.native
  
  def css(properties: Any): appFrameworkCollection = js.native
  /**
    * Gets or sets a css property for the collection
    * If used as a get, the first elements css property is returned
    * This will add px to properties that need it.
    ```
    $().css("background"); // Gets the first elements background
    $().css("background","red")  //Sets the elements background to red
    ```
    * @param {String} attribute to get
    * @param {String} value to set as
    * @return {Object} an appframework object
    * @title $().css(attribute,[value])
    */
  def css(property: String): Any = js.native
  def css(property: String, value: Any): appFrameworkCollection = js.native
  
  /**
    * Gets or set data-* attribute parameters on elements (when a string)
    * When used as a getter, it's only the first element
    ```
    $().data("foo"); //Gets the data-foo attribute for the first element
    $().data("foo","bar"); //Sets the data-foo attribute for all elements
    $().data("foo",{bar:'bar'});//object as the data
    ```
    * @param {String} key
    * @param {String|Array|Object} value
    * @return {String|Object} returns the value or appframework object
    * @title $().data(key,[value]);
    */
  def data(attribute: String): Any = js.native
  def data(attribute: String, value: String): appFrameworkCollection = js.native
  def data(attribute: String, value: Any): appFrameworkCollection = js.native
  
  /**
    * Delegate an event based off the selector.  The event will be registered at the parent level, but executes on the selector.
    ```
    $("#div").delegate("p",'click',callback);
    ```
    * @param {String|Array|Object} selector
    * @param {String|Object} event
    * @param {Function} callback
    * @return {Object} appframework object
    * @title $().delegate(selector,event,callback)
    */
  def delegate(selector: Any, eventHash: js.Object): appFrameworkCollection = js.native
  def delegate(selector: Any, eventName: String, fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  
  /**
    * Iterates through all elements and applys a callback function
    ```
    $().each(function(){console.log(this.value)});
    ```
    * @param {Function} callback
    * @return {Object} an appframework object
    * @title $().each(function)
    */
  def each(fn: js.Function2[/* index */ Double, /* item */ Any, Any]): appFrameworkCollection = js.native
  
  /**
    * Sets the innerHTML of all elements to an empty string
    ```
    $().empty();
    ```
    * @return {Object} an appframework object
    * @title $().empty()
    */
  def empty(): appFrameworkCollection = js.native
  
  /**
    * Rolls back the appframework elements when filters were applied
    * This can be used after .not(), .filter(), .children(), .parent()
    ```
    $().filter(".panel").end(); //This will return the collection BEFORE filter is applied
    ```
    * @return {Object} returns the previous appframework object before filter was applied
    * @title $().end();
    */
  def end(): appFrameworkCollection = js.native
  
  /* added in 1.2 */
  /**
    * Reduce the set of elements based off index
    ```
    $().eq(index)
    ```
    * @param {Int} index - Index to filter by. If negative, it will go back from the end
    * @return {Object} appframework object
    * @title $().eq(index)
    */
  def eq(index: Double): appFrameworkCollection = js.native
  
  /**
    custom events since people want to do $().error instead of $().bind("error")
    */
  def error(): appFrameworkCollection = js.native
  def error(fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  
  /**
    * Filters elements based off the selector
    ```
    $("#foo").filter('.bar'); //Selector
    $("#foo").filter($('.bar')); //Objects
    $("#foo").filter($('.bar').get(0)); //Single element
    ```
    * @param {String|Array|Object} selector
    * @return {Object} Returns an appframework object after the filter was run
    * @title $().filter(selector);
    */
  def filter(): appFrameworkCollection = js.native
  def filter(selector: Any): appFrameworkCollection = js.native
  
  /**
    * Searches through the collection and reduces them to elements that match the selector
    ```
    $("#foo").find('.bar');
    $("#foo").find($('.bar'));
    $("#foo").find($('.bar').get(0));
    ```
    * @param {String|Object|Array} selector
    * @return {Object} an appframework object filtered
    * @title $().find(selector)
    */
  def find(selector: String): appFrameworkCollection = js.native
  
  /**
    custom events since people want to do $().focus instead of $().bind("focus")
    */
  def focus(): appFrameworkCollection = js.native
  def focus(fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  
  def forEach(fn: js.Function2[/* item */ Any, /* index */ Double, Any]): Unit = js.native
  
  /**
    * Returns the raw DOM element.
    ```
    $().get(0); //returns the first element
    $().get(2);// returns the third element
    ```
    * @param {Int} [index]
    * @return {Object} raw DOM element
    * @title $().get([index])
    */
  def get(): js.Array[HTMLElement] = js.native
  def get(index: Double): HTMLElement = js.native
  
  /**
    * Checks to see if an element has a class.
    ```
    $().hasClass('foo');
    $().hasClass('foo',element);
    ```
    * @param {String} class name to check against
    * @param {Object} [element] to check against
    * @return {Boolean}
    * @title $().hasClass(name,[element])
    */
  def hasClass(className: String, element: HTMLElement): Boolean = js.native
  
  /**
    * returns the height of the element, including padding on IE
    ```
    $().height();
    ```
    * @return {string} height
    * @title $().height()
    */
  def height(): String = js.native
  
  /**
    * Sets the elements display property to "none".
    * This will also store the old property into an attribute for hide
    ```
    $().hide();
    ```
    * @return {Object} an appframework object
    * @title $().hide()
    */
  def hide(): appFrameworkCollection = js.native
  
  /**
    * Gets or sets the innerHTML for the collection.
    * If used as a get, the first elements innerHTML is returned
    ```
    $("#foo").html(); //gets the first elements html
    $("#foo").html('new html');//sets the html
    $("#foo").html('new html',false); //Do not do memory management cleanup
    ```
    * @param {String} html to set
    * @param {Bool} [cleanup] - set to false for performance tests and if you do not want to execute memory management cleanup
    * @return {Object} an appframework object
    * @title $().html([html])
    */
  def html(): String = js.native
  def html(html: String): appFrameworkCollection = js.native
  def html(html: String, cleanup: Boolean): appFrameworkCollection = js.native
  
  /**
    * Returns the index of the selected element in the collection
    ```
    $().index(elem)
    ```
    * @param {String|Object} element to look for.  Can be a selector or object
    * @return integer - index of selected element
    * @title $().index(elem)
    */
  def index(): Double = js.native
  def index(selector: Any): Double = js.native
  
  def indexOf(searchElement: appFrameworkCollection): Double = js.native
  def indexOf(searchElement: appFrameworkCollection, fromIndex: Double): Double = js.native
  
  /**
    * Inserts collection after the target (adjacent)
    ```
    $().insertAfter(af("#target"));
    ```
    * @param {String|Object} target
    * @title $().insertAfter(target);
    */
  def insertAfter(target: Any): Unit = js.native
  
  /**
    * Inserts collection before the target (adjacent)
    ```
    $().insertBefore(af("#target"));
    ```
    * @param {String|Object} Target
    * @title $().insertBefore(target);
    */
  def insertBefore(target: Any): appFrameworkCollection = js.native
  
  /**
    * Returns boolean if the object is a type of the selector
    ```
    $().is(selector)
    ```
    * param {String|Object} selector to act upon
    * @return boolean
    * @title $().is(selector)
    */
  def is(selector: Any): Double = js.native
  
  /**
    custom events since people want to do $().keydown instead of $().bind("keydown")
    */
  def keydown(): appFrameworkCollection = js.native
  def keydown(fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  
  /**
    custom events since people want to do $().keypress instead of $().bind("keypress")
    */
  def keypress(): appFrameworkCollection = js.native
  def keypress(fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  
  /**
    custom events since people want to do $().keyup instead of $().bind("keyup")
    */
  def keyup(): appFrameworkCollection = js.native
  def keyup(fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  
  var length: Double = js.native
  
  /**
    custom events since people want to do $().load instead of $().bind("load")
    */
  def load(): appFrameworkCollection = js.native
  def load(fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  
  /**
    * This is a wrapper to $.map on the selected elements
    ```
    $().map(function(){this.value+=ind});
    ```
    * @param {Function} callback
    * @return {Object} an appframework object
    * @title $().map(function)
    */
  def map(fn: js.Function2[/* index */ Double, /* item */ Any, Any]): appFrameworkCollection = js.native
  
  /**
    * Basically the reverse of filter.  Return all elements that do NOT match the selector
    ```
    $("#foo").not('.bar'); //Selector
    $("#foo").not($('.bar')); //Objects
    $("#foo").not($('.bar').get(0)); //Single element
    ```
    * @param {String|Array|Object} selector
    * @return {Object} Returns an appframework object after the filter was run
    * @title $().not(selector);
    */
  def not(): appFrameworkCollection = js.native
  def not(selector: Any): appFrameworkCollection = js.native
  
  /**
    * Removes event listeners for .on()
    * If selector is undefined or a function, we call unbind, otherwise it's undelegate
    ```
    $().off("click","p",callback); //Remove callback function for click events
    $().off("click","p") //Remove all click events
    ```
    * @param {String|Object} event
    * @param {String|Array|Object} selector
    * @param {Sunction} callback
    * @return {Object} appframework object
    * @title $().off(event,selector,[callback])
    */
  def off(eventHash: js.Object): appFrameworkCollection = js.native
  def off(eventHash: js.Object, selector: Any): appFrameworkCollection = js.native
  def off(eventName: String, fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  def off(eventName: String, selector: String, fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  
  /**
    * Returns the offset of the element, including traversing up the tree
    ```
    $().offset();
    ```
    * @return {Object} with left, top, width and height properties
    * @title $().offset()
    */
  def offset(): Bottom = js.native
  
  /**
    * Similar to delegate, but the function parameter order is easier to understand.
    * If selector is undefined or a function, we just call .bind, otherwise we use .delegate
    ```
    $("#div").on("click","p",callback);
    ```
    * @param {String|Array|Object} selector
    * @param {String|Object} event
    * @param {Function} callback
    * @return {Object} appframework object
    * @title $().on(event,selector,callback);
    */
  def on(eventHash: js.Object): appFrameworkCollection = js.native
  def on(eventHash: js.Object, selector: Any): appFrameworkCollection = js.native
  def on(eventName: String, fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  def on(eventName: String, selector: String, fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  
  /**
    * Binds an event to each element in the collection that will only execute once.  When it executes, we remove the event listener then right away so it no longer happens
    ```
    $().one('click',function(){console.log('I was clicked once');});
    ```
    * @param {String|Object} event
    * @param {Function} [callback]
    * @return appframework object
    * @title $().one(event,callback);
    */
  def one(eventHash: js.Object): appFrameworkCollection = js.native
  def one(eventName: String, fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  
  /**
    * Returns the parent nodes of the elements based off the selector
    ```
    $("#foo").parent('.bar');
    $("#foo").parent($('.bar'));
    $("#foo").parent($('.bar').get(0));
    ```
    * @param {String|Array|Object} [selector]
    * @return {Object} appframework object with unique parents
    * @title $().parent(selector)
    */
  def parent(): appFrameworkCollection = js.native
  def parent(selector: Any): appFrameworkCollection = js.native
  
  /**
    * Returns the parents of the elements based off the selector (traversing up until html document)
    ```
    $("#foo").parents('.bar');
    $("#foo").parents($('.bar'));
    $("#foo").parents($('.bar').get(0));
    ```
    * @param {String|Array|Object} [selector]
    * @return {Object} appframework object with unique parents
    * @title $().parents(selector)
    */
  def parents(): appFrameworkCollection = js.native
  def parents(selector: Any): appFrameworkCollection = js.native
  
  /**
    * Prepends to the elements
    * This simply calls append and sets insert to true
    ```
    $().prepend("<div></div>");//Creates the object from the string and appends it
    $().prepend($("#foo")); //Prepends an object
    ```
    * @param {String|Object} Element/string to add
    * @return {Object} appframework object
    * @title $().prepend(element)
    */
  def prepend(content: Any): appFrameworkCollection = js.native
  
  /**
    * Prepends the current collection to the selector
    ```
    $().prependTo("#foo"); //Prepend an object;
    ```
    * @param {String|Object} Selector to prepent to
    * @title $().prependTo(element)
    */
  def prependTo(target: Any): appFrameworkCollection = js.native
  
  def prop(attributeHash: js.Object): appFrameworkCollection = js.native
  /**
    * Gets or sets a property on an element
    * If used as a getter, we return the first elements value.  If nothing is in the collection, we return undefined
    ```
    $().prop("foo"); //Gets the first elements 'foo' property
    $().prop("foo","bar");//Sets the elements 'foo' property to 'bar'
    $().prop("foo",{bar:'bar'}) //Adds the object to an internal cache
    ```
    * @param {String|Object} property to act upon.  If it's an object (hashmap), it will set the attributes based off the kvp.
    * @param {String|Array|Object|function} [value] to set
    * @return {String|Object|Array|Function} If used as a getter, return the property value.  If a setter, return an appframework object
    * @title $().prop(property,[value])
    */
  def prop(attribute: String): Any = js.native
  def prop(attribute: String, value: String): appFrameworkCollection = js.native
  def prop(attribute: String, value: Any): appFrameworkCollection = js.native
  
  def push(items: appFrameworkCollection*): Double = js.native
  
  /**
    * This is executed when DOMContentLoaded happens, or after if you've registered for it.
    ```
    $(document).ready(function(){console.log('I'm ready');});
    ```
    * @param {Function} callback
    * @return {Object} an appframework object
    * @title $().ready(function)
    */
  def ready(fn: js.Function): appFrameworkStatic = js.native
  
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ this.type, 
      /* currentValue */ this.type, 
      /* currentIndex */ Double, 
      /* array */ js.Array[this.type], 
      this.type
    ]
  ): appFrameworkCollection = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ this.type, 
      /* currentValue */ this.type, 
      /* currentIndex */ Double, 
      /* array */ js.Array[this.type], 
      this.type
    ],
    initialValue: appFrameworkCollection
  ): appFrameworkCollection = js.native
  
  /**
    * Removes elements based off a selector
    ```
    $().remove();  //Remove all
    $().remove(".foo");//Remove off a string selector
    var element=$("#foo").get(0);
    $().remove(element); //Remove by an element
    $().remove($(".foo"));  //Remove by a collection
    ```
    * @param {String|Object|Array} selector to filter against
    * @return {Object} appframework object
    * @title $().remove(selector)
    */
  def remove(): appFrameworkCollection = js.native
  def remove(elements: js.Array[Any]): appFrameworkCollection = js.native
  def remove(elements: appFrameworkCollection): appFrameworkCollection = js.native
  def remove(element: HTMLElement): appFrameworkCollection = js.native
  def remove(selector: String): appFrameworkCollection = js.native
  
  /**
    * Removes an attribute on the elements
    ```
    $().removeAttr("foo");
    ```
    * @param {String} attributes that can be space delimited
    * @return {Object} appframework object
    * @title $().removeAttr(attribute)
    */
  def removeAttr(attribute: String): appFrameworkCollection = js.native
  
  /**
    * Removes a css class from elements.
    ```
    $().removeClass("foo"); //single class
    $().removeClass("foo selected");//remove multiple classess
    ```
    * @param {String} classes that are space delimited
    * @return {Object} appframework object
    * @title $().removeClass(name)
    */
  def removeClass(className: String): appFrameworkCollection = js.native
  
  /**
    * Removes a property on the elements
    ```
    $().removeProp("foo");
    ```
    * @param {String} properties that can be space delimited
    * @return {Object} appframework object
    * @title $().removeProp(attribute)
    */
  def removeProp(attribute: String): appFrameworkCollection = js.native
  
  /**
    * Replaces a css class on elements.
    ```
    $().replaceClass("on", "off");
    ```
    * @param {String} classes that are space delimited
    * @param {String} classes that are space delimited
    * @return {Object} appframework object
    * @title $().replaceClass(old, new)
    */
  def replaceClass(oldClassName: String, newClassName: String): appFrameworkCollection = js.native
  
  /**
    custom events since people want to do $().resize instead of $().bind("resize")
    */
  def resize(): appFrameworkCollection = js.native
  def resize(fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  
  /**
    custom events since people want to do $().select instead of $().bind("select")
    */
  def select(): appFrameworkCollection = js.native
  def select(fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  
  /**
    * Serailizes a form into a query string
    ```
    $().serialize();
    ```
    * @return {String}
    * @title $().serialize()
    */
  def serialize(): String = js.native
  
  /**
    * Shows all the elements by setting the css display property
    * We look to see if we were retaining an old style (like table-cell) and restore that, otherwise we set it to block
    ```
    $().show();
    ```
    * @return {Object} an appframework object
    * @title $().show()
    */
  def show(): appFrameworkCollection = js.native
  
  /**
    * Returns the siblings of the element based off the selector
    ```
    $("#foo").siblings('.bar'); //Selector
    $("#foo").siblings($('.bar')); //Objects
    $("#foo").siblings($('.bar').get(0)); //Single element
    ```
    * @param {String|Array|Object} [selector]
    * @return {Object} appframework object with unique siblings
    * @title $().siblings(selector)
    */
  def siblings(): appFrameworkCollection = js.native
  def siblings(selector: Any): appFrameworkCollection = js.native
  
  /**
    * Returns the number of elements in the collection
    ```
    $().size();
    ```
    * @return {Int}
    * @title $().size();
    */
  def size(): Double = js.native
  
  def slice(start: Double): js.Array[appFrameworkCollection] = js.native
  def slice(start: Double, end: Double): js.Array[appFrameworkCollection] = js.native
  
  /**
    custom events since people want to do $().submit instead of $().bind("submit")
    */
  def submit(): appFrameworkCollection = js.native
  def submit(fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  
  /**
    * Gets or sets the innerText for the collection.
    * If used as a get, the first elements innerText is returned
    ```
    $("#foo").text(); //gets the first elements text;
    $("#foo").text('new text'); //sets the text
    ```
    * @param {String} text to set
    * @return {Object} an appframework object
    * @title $().text([text])
    */
  def text(): String = js.native
  def text(text: String): appFrameworkCollection = js.native
  
  /**
    * Toggle the visibility of a div
    ```
    $().toggle();
    $().toggle(true); //force showing
    ```
    * @param {Boolean} [show] -force the hiding or showing of the element
    * @return {Object} an appframework object
    * @title $().toggle([show])
    */
  def toggle(): appFrameworkCollection = js.native
  def toggle(show: Boolean): appFrameworkCollection = js.native
  
  /**
    * Adds or removes a css class to elements.
    ```
    $().toggleClass("selected");
    ```
    * @param {String} classes that are space delimited
    * @param {Boolean} [state] force toggle to add or remove classes
    * @return {Object} appframework object
    * @title $().toggleClass(name)
    */
  def toggleClass(name: String): appFrameworkCollection = js.native
  def toggleClass(name: String, state: Boolean): appFrameworkCollection = js.native
  
  def trigger(eventHash: js.Object): appFrameworkCollection = js.native
  def trigger(eventHash: js.Object, data: Any): appFrameworkCollection = js.native
  /**
    This triggers an event to be dispatched.  Usefull for emulating events, etc.
    ```
    $().trigger("click",{foo:'bar'});//Trigger the click event and pass in data
    ```
    * @param {String|Object} event
    * @param {Object} [data]
    * @return {Object} appframework object
    * @title $().trigger(event,data);
    */
  def trigger(eventName: String): appFrameworkCollection = js.native
  def trigger(eventName: String, data: Any): appFrameworkCollection = js.native
  
  def unbind(): appFrameworkCollection = js.native
  /**
    * Unbinds an event to each element in the collection.  If a callback is passed in, we remove just that one, otherwise we remove all callbacks for those events
    ```
    $().unbind('click'); //Unbinds all click events
    $().unbind('click',myFunc); //Unbinds myFunc
    ```
    * @param {String|Object} event
    * @param {Function} [callback]
    * @return {Object} appframework object
    * @title $().unbind(event,[callback]);
    */
  def unbind(eventHash: js.Object): appFrameworkCollection = js.native
  def unbind(eventName: String): appFrameworkCollection = js.native
  def unbind(eventName: String, fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  
  /**
    * Unbinds events that were registered through delegate.  It acts upon the selector and event.  If a callback is specified, it will remove that one, otherwise it removes all of them.
    ```
    $("#div").undelegate("p",'click',callback);//Undelegates callback for the click event
    $("#div").undelegate("p",'click');//Undelegates all click events
    ```
    * @param {String|Array|Object} selector
    * @param {String|Object} event
    * @param {Function} callback
    * @return {Object} appframework object
    * @title $().undelegate(selector,event,[callback]);
    */
  def undelegate(selector: Any, eventHash: js.Object): appFrameworkCollection = js.native
  def undelegate(selector: Any, eventName: String, fn: js.Function1[/* e */ Event, Any]): appFrameworkCollection = js.native
  
  /**
    * Gets or sets an elements value
    * If used as a getter, we return the first elements value.  If nothing is in the collection, we return undefined
    ```
    $().value; //Gets the first elements value;
    $().value="bar"; //Sets all elements value to bar
    ```
    * @param {String} [value] to set
    * @return {String|Object} A string as a getter, appframework object as a setter
    * @title $().val([value])
    */
  def `val`(): String = js.native
  def `val`(value: String): appFrameworkCollection = js.native
  
  /**
    * Performs a css vendor specific transform:translate operation on the collection.
    *
    ```
    $("#main").cssTranslate('200px,0,0');
    ```
    * @param {String} Transform values
    * @return {Object} an appframework object
    * @title $().vendorCss(value)
    */
  def vendorCss(transform: String): appFrameworkCollection = js.native
  
  /**
    * returns the width of the element, including padding on IE
    ```
    $().width();
    ```
    * @return {string} width
    * @title $().width()
    */
  def width(): String = js.native
}
