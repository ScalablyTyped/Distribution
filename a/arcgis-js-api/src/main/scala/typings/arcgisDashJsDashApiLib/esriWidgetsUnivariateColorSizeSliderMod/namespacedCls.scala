package typings
package arcgisDashJsDashApiLib.esriWidgetsUnivariateColorSizeSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/UnivariateColorSizeSlider", JSImport.Namespace)
@js.native
/**
  * The UnivariateColorSizeSlider is a widget intended for authoring and exploring data-driven univariate visualizations in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html)  or [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) using color and size. To display properly, this slider requires [color and size visual variables](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#visualVariables) and a [statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#statistics) object. Other optional properties may be used including adding a [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#histogram). Most of the various options that affect the UI of the slider are labeled in the image below.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html)
  */
class namespacedCls ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.UnivariateColorSizeSlider {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.UnivariateColorSizeSliderProperties) = this()
  /**
    * The ID or node representing the DOM element containing the widget.  Note that once set, this property cannot be modified afterwards.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widgette.html#container)
    */
  /* CompleteClass */
  override var container: java.lang.String | stdLib.HTMLElement = js.native
  /**
    * Indicates whether the widget is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widgette.html#visible)
    *
    * @default true
    */
  /* CompleteClass */
  override var visible: scala.Boolean = js.native
  /**
    * Destroys the widget instance. Call this method when the widget is no longer needed by the application.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widgette.html#destroy)
    *
    *
    */
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /**
    * Registers an event handler on the widget instance. Call this method to hook an event with a listener. See the [Events summary table](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widgette.html#events-summary) for a list of supported events.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widgette.html#on)
    *
    * @param type The name of the event.
    * @param listener The function to call when the event is fired.
    *
    */
  /* CompleteClass */
  override def on(`type`: java.lang.String, listener: js.Function): js.Any = js.native
}

