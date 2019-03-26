package typings
package arcgisDashJsDashApiLib.esriSupportContentElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/support/ContentElement", "Text")
@js.native
/**
  * A `TextContentElement` is used to define descriptive text as an element within the [PopupTemplate's](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) content. The text may reference values returned from a field attribute or an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Text.html)
  */
class TextCls ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Text {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.TextProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

