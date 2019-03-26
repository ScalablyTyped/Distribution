package typings
package arcgisDashJsDashApiLib.esriWidgetsSizeSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/SizeSlider", JSImport.Namespace)
@js.native
/**
  * The SizeSlider is a widget intended for authoring and exploring data-driven visualizations in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) or [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) using the size of marker symbols or 3D object symbol layers. To display properly, this slider requires a [size visual variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#visualVariable) and [statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#statistics) object. Other optional properties may be used including adding a [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#histogram). Most of the various options that affect the UI of the slider are labeled in the image below.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html)
  */
class namespacedCls ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.SizeSlider {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.SizeSliderProperties) = this()
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

