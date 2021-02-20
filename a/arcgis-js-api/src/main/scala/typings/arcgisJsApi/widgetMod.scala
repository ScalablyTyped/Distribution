package typings.arcgisJsApi

import typings.arcgisJsApi.arcgisJsApiStrings.enter
import typings.arcgisJsApi.arcgisJsApiStrings.exit
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetMod {
  
  /**
    * This convenience decorator is used to help simplify accessibility within the widget keyboard events.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#accessibleHandler)
    */
  @JSImport("esri/widgets/support/widget", "accessibleHandler")
  @js.native
  def accessibleHandler(): js.Function = js.native
  
  /**
    * Utility method used for creating CSS animation/transition functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#cssTransition)
    */
  @JSImport("esri/widgets/support/widget", "cssTransition")
  @js.native
  def cssTransition_enter(`type`: enter, className: String): js.Function = js.native
  @JSImport("esri/widgets/support/widget", "cssTransition")
  @js.native
  def cssTransition_exit(`type`: exit, className: String): js.Function = js.native
  
  /**
    * Utility method used to determine if the directionality of the text of the document is right-to-left.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#isRTL)
    */
  @JSImport("esri/widgets/support/widget", "isRTL")
  @js.native
  def isRTL(): Boolean = js.native
  
  /**
    * This convenience decorator marks a property for automatic rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#renderable)
    */
  @JSImport("esri/widgets/support/widget", "renderable")
  @js.native
  def renderable(): js.Function = js.native
  @JSImport("esri/widgets/support/widget", "renderable")
  @js.native
  def renderable(propertyName: String): js.Function = js.native
  @JSImport("esri/widgets/support/widget", "renderable")
  @js.native
  def renderable(propertyName: js.Array[String]): js.Function = js.native
  
  /**
    * This convenience method is used to assign an [HTMLElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement) DOM node reference to a variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#storeNode)
    */
  @JSImport("esri/widgets/support/widget", "storeNode")
  @js.native
  def storeNode(node: HTMLElement): Unit = js.native
  
  object tsx {
    
    /**
      * This convenience method is used to render the JSX in the [widget.render()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#render) method.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#tsx)
      */
    @JSImport("esri/widgets/support/widget", "tsx.tsx")
    @js.native
    def tsx(selector: String): js.Any = js.native
    @JSImport("esri/widgets/support/widget", "tsx.tsx")
    @js.native
    def tsx(selector: String, properties: js.UndefOr[scala.Nothing], children: js.Any): js.Any = js.native
    @JSImport("esri/widgets/support/widget", "tsx.tsx")
    @js.native
    def tsx(selector: String, properties: js.Any): js.Any = js.native
    @JSImport("esri/widgets/support/widget", "tsx.tsx")
    @js.native
    def tsx(selector: String, properties: js.Any, children: js.Any): js.Any = js.native
  }
  
  /**
    * This convenience decorator helps dispatch view model events on the widget instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#vmEvent)
    */
  @JSImport("esri/widgets/support/widget", "vmEvent")
  @js.native
  def vmEvent(eventNames: String): js.Function = js.native
  @JSImport("esri/widgets/support/widget", "vmEvent")
  @js.native
  def vmEvent(eventNames: js.Array[String]): js.Function = js.native
}
