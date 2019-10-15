package typings.arcgisDashJsDashApi.__esri.content

import typings.arcgisDashJsDashApi.__esri.TextContentProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.content.TextContent")
@js.native
/**
  * A `TextContent` popup element is used to define descriptive text as an element within the [PopupTemplate's](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) content. The text may reference values returned from a field attribute or an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-TextContent.html)
  */
class TextContentCls ()
  extends typings.arcgisDashJsDashApi.__esri.TextContent {
  def this(properties: TextContentProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

