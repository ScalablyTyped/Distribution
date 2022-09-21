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
  inline def accessibleHandler(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("accessibleHandler")().asInstanceOf[js.Function]
  
  /**
    * Utility method used for creating CSS animation/transition functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#cssTransition)
    */
  inline def cssTransition(`type`: enter | exit, className: String): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("cssTransition")(`type`.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  /**
    * Utility method used to determine if a pressed key should activate button behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#isActivationKey)
    */
  inline def isActivationKey(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActivationKey")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Utility method used to determine if the directionality of the text of the document is right-to-left.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#isRTL)
    */
  inline def isRTL(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRTL")().asInstanceOf[Boolean]
  
  /**
    * This convenience decorator is used to help simplify localization of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#messageBundle)
    */
  inline def messageBundle(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("messageBundle")().asInstanceOf[js.Function]
  inline def messageBundle(bundleId: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("messageBundle")(bundleId.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  /**
    * This convenience method is used to assign an [HTMLElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement) DOM node reference to a variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#storeNode)
    */
  inline def storeNode(node: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("storeNode")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object tsx {
    
    @JSGlobal("__esri.widget.tsx")
    @js.native
    val ^ : js.Any = js.native
    /**
      * This convenience method is used to render the JSX in the [widget.render()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#render) method.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#tsx)
      */
    inline def tsx(selector: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("tsx")(selector.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def tsx(selector: String, properties: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("tsx")(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def tsx(selector: String, properties: Any, children: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("tsx")(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def tsx(selector: String, properties: Unit, children: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("tsx")(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  /**
    * This convenience decorator helps dispatch view model events on the widget instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#vmEvent)
    */
  inline def vmEvent(eventNames: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("vmEvent")(eventNames.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  inline def vmEvent(eventNames: js.Array[String]): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("vmEvent")(eventNames.asInstanceOf[js.Any]).asInstanceOf[js.Function]
}
