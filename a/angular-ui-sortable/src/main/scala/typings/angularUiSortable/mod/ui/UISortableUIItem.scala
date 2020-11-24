package typings.angularUiSortable.mod.ui

import typings.angular.JQuery
import typings.angular.JQueryEventObject
import typings.angular.JQueryStatic
import typings.angular.mod.IScope
import typings.angular.mod.auto.IInjectorService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<angular.angular.IAugmentedJQuery, 'sortable'> */
@js.native
trait UISortableUIItem[T] extends js.Object {
  
  def addClass(className: String): this.type = js.native
  @JSName("addClass")
  var addClass_Original: js.Function1[/* className */ String, this.type] = js.native
  
  def after(content1: JQuery, content2: js.Any*): this.type = js.native
  @JSName("after")
  var after_Original: js.Function2[/* content1 */ JQuery, /* repeated */ js.Any, this.type] = js.native
  
  def append(content1: JQuery, content2: js.Any*): this.type = js.native
  @JSName("append")
  var append_Original: js.Function2[/* content1 */ JQuery, /* repeated */ js.Any, this.type] = js.native
  
  def attr(attributeName: String): String = js.native
  @JSName("attr")
  var attr_Original: js.Function1[/* attributeName */ String, String] = js.native
  
  def bind(eventType: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): this.type = js.native
  @JSName("bind")
  var bind_Original: js.Function2[
    /* eventType */ String, 
    /* handler */ js.Function1[/* eventObject */ JQueryEventObject, _], 
    this.type
  ] = js.native
  
  def children(): this.type = js.native
  @JSName("children")
  var children_Original: js.Function0[this.type] = js.native
  
  @JSName("clone")
  var clone_Original: js.Function0[this.type] = js.native
  
  def contents(): this.type = js.native
  @JSName("contents")
  var contents_Original: js.Function0[this.type] = js.native
  
  def controller(): js.Any = js.native
  @JSName("controller")
  var controller_Original: js.Function0[_] = js.native
  
  def css(propertyName: String): String = js.native
  @JSName("css")
  var css_Original: js.Function1[/* propertyName */ String, String] = js.native
  
  def data(key: String, value: js.Any): this.type = js.native
  @JSName("data")
  var data_Original: js.Function2[/* key */ String, /* value */ js.Any, this.type] = js.native
  
  def detach(): this.type = js.native
  @JSName("detach")
  var detach_Original: js.Function0[this.type] = js.native
  
  def empty(): this.type = js.native
  @JSName("empty")
  var empty_Original: js.Function0[this.type] = js.native
  
  def eq(index: Double): this.type = js.native
  @JSName("eq")
  var eq_Original: js.Function1[/* index */ Double, this.type] = js.native
  
  def find(selector: String): this.type = js.native
  @JSName("find")
  var find_Original: js.Function1[/* selector */ String, this.type] = js.native
  
  def hasClass(className: String): Boolean = js.native
  @JSName("hasClass")
  var hasClass_Original: js.Function1[/* className */ String, Boolean] = js.native
  
  def html(): String = js.native
  @JSName("html")
  var html_Original: js.Function0[String] = js.native
  
  def inheritedData(key: String, value: js.Any): this.type = js.native
  @JSName("inheritedData")
  var inheritedData_Original: js.Function2[/* key */ String, /* value */ js.Any, this.type] = js.native
  
  def injector(): IInjectorService = js.native
  @JSName("injector")
  var injector_Original: js.Function0[IInjectorService] = js.native
  
  def isolateScope[T /* <: IScope */](): T = js.native
  @JSName("isolateScope")
  var isolateScope_Original: js.Function0[IScope] = js.native
  
  var length: Double = js.native
  
  def next(): this.type = js.native
  @JSName("next")
  var next_Original: js.Function0[this.type] = js.native
  
  def off(): this.type = js.native
  @JSName("off")
  var off_Original: js.Function0[this.type] = js.native
  
  def on(
    events: String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): this.type = js.native
  @JSName("on")
  var on_Original: js.Function2[
    /* events */ String, 
    /* handler */ js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _], 
    this.type
  ] = js.native
  
  def one(events: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): this.type = js.native
  @JSName("one")
  var one_Original: js.Function2[
    /* events */ String, 
    /* handler */ js.Function1[/* eventObject */ JQueryEventObject, _], 
    this.type
  ] = js.native
  
  def parent(): this.type = js.native
  @JSName("parent")
  var parent_Original: js.Function0[this.type] = js.native
  
  def prepend(content1: JQuery, content2: js.Any*): this.type = js.native
  @JSName("prepend")
  var prepend_Original: js.Function2[/* content1 */ JQuery, /* repeated */ js.Any, this.type] = js.native
  
  def prop(propertyName: String): js.Any = js.native
  @JSName("prop")
  var prop_Original: js.Function1[/* propertyName */ String, _] = js.native
  
  def ready(handler: js.Function1[/* jQueryAlias */ js.UndefOr[JQueryStatic], _]): this.type = js.native
  @JSName("ready")
  var ready_Original: js.Function1[
    /* handler */ js.Function1[/* jQueryAlias */ js.UndefOr[JQueryStatic], _], 
    this.type
  ] = js.native
  
  def remove(): this.type = js.native
  
  def removeAttr(attributeName: String): this.type = js.native
  @JSName("removeAttr")
  var removeAttr_Original: js.Function1[/* attributeName */ String, this.type] = js.native
  
  def removeClass(): this.type = js.native
  @JSName("removeClass")
  var removeClass_Original: js.Function0[this.type] = js.native
  
  def removeData(name: String): this.type = js.native
  @JSName("removeData")
  var removeData_Original: js.Function1[/* name */ String, this.type] = js.native
  
  @JSName("remove")
  var remove_Original: js.Function0[this.type] = js.native
  
  def replaceWith(newContent: JQuery): this.type = js.native
  @JSName("replaceWith")
  var replaceWith_Original: js.Function1[/* newContent */ JQuery, this.type] = js.native
  
  def scope[T /* <: IScope */](): T = js.native
  @JSName("scope")
  var scope_Original: js.Function0[IScope] = js.native
  
  var sortable: UISortableProperties[T] = js.native
  
  def text(): String = js.native
  @JSName("text")
  var text_Original: js.Function0[String] = js.native
  
  def toggleClass(className: String): this.type = js.native
  @JSName("toggleClass")
  var toggleClass_Original: js.Function1[/* className */ String, this.type] = js.native
  
  def triggerHandler(eventType: String, extraParameters: js.Any*): js.Object = js.native
  @JSName("triggerHandler")
  var triggerHandler_Original: js.Function2[/* eventType */ String, /* repeated */ js.Any, js.Object] = js.native
  
  def unbind(): this.type = js.native
  @JSName("unbind")
  var unbind_Original: js.Function0[this.type] = js.native
  
  def `val`(): js.Any = js.native
  @JSName("val")
  var val_Original: js.Function0[_] = js.native
  
  def wrap(wrappingElement: JQuery): this.type = js.native
  @JSName("wrap")
  var wrap_Original: js.Function1[/* wrappingElement */ JQuery, this.type] = js.native
}
