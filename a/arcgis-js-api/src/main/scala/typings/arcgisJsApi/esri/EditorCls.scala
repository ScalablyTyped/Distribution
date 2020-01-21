package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.Editor")
@js.native
/**
  * This widget provides an out-of-the-box editing experience to help streamline the editing experience within a web application. The widget has two different [Workflows](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html), `create` and `update`. These workflows allow you to either add features or edit and/or delete existing features within an editable feature layer. The widget automatically recognizes if there are editable feature layers within the map. If it recognizes that they are editable, the layers can be used by the widget. In addition, it is also possible to configure how the `Editor` behaves by setting its [layerInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#layerInfos) property. This property takes an array of configuration objects which allow you to configure the editing experience for these layers.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html)
  */
class EditorCls () extends Editor {
  def this(properties: EditorProperties) = this()
}

