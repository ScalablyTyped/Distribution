package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.arcgisJsApiStrings.enter
import typings.arcgisJsApi.arcgisJsApiStrings.exit
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widget {
  
  @JSGlobal("__esri.widget")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This convenience decorator is used to help simplify accessibility within the widget keyboard events.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#accessibleHandler)
    */
  @scala.inline
  def accessibleHandler(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("accessibleHandler")().asInstanceOf[js.Function]
  
  /**
    * Utility method used for creating CSS animation/transition functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#cssTransition)
    */
  @scala.inline
  def cssTransition_enter(`type`: enter, className: String): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("cssTransition")(`type`.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  @scala.inline
  def cssTransition_exit(`type`: exit, className: String): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("cssTransition")(`type`.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  /**
    * Utility method used to determine if the directionality of the text of the document is right-to-left.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#isRTL)
    */
  @scala.inline
  def isRTL(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRTL")().asInstanceOf[Boolean]
  
  /**
    * This convenience decorator marks a property for automatic rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#renderable)
    */
  @scala.inline
  def renderable(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("renderable")().asInstanceOf[js.Function]
  @scala.inline
  def renderable(propertyName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("renderable")(propertyName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  @scala.inline
  def renderable(propertyName: js.Array[String]): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("renderable")(propertyName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  /**
    * This convenience method is used to assign an [HTMLElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement) DOM node reference to a variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#storeNode)
    */
  @scala.inline
  def storeNode(node: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("storeNode")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object tsx {
    
    @JSGlobal("__esri.widget.tsx")
    @js.native
    val ^ : js.Any = js.native
    /**
      * This convenience method is used to render the JSX in the [widget.render()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#render) method.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#tsx)
      */
    @scala.inline
    def tsx(selector: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("tsx")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def tsx(selector: String, properties: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("tsx")(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def tsx(selector: String, properties: js.Any, children: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("tsx")(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def tsx(selector: String, properties: Unit, children: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("tsx")(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  /**
    * This convenience decorator helps dispatch view model events on the widget instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#vmEvent)
    */
  @scala.inline
  def vmEvent(eventNames: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("vmEvent")(eventNames.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  @scala.inline
  def vmEvent(eventNames: js.Array[String]): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("vmEvent")(eventNames.asInstanceOf[js.Any]).asInstanceOf[js.Function]
}
