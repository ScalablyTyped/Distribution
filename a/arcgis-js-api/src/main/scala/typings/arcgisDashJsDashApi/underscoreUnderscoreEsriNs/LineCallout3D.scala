package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineCallout3D extends Callout3D {
  /**
    * The border settings of the callout line. The border of the callout line can be used to improve the contrast of the callout line color against various background colors. If the border is `null`, then no border will be visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#border)
    */
  var border: LineCallout3DBorder = js.native
  /**
    * The color of the callout line. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#color)
    *
    * @default black
    */
  var color: Color = js.native
  /**
    * The width of the callout line in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#size)
    *
    * @default 1px
    */
  var size: Double = js.native
  /**
    * For LineCallout3D the type is always `line`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#type)
    */
  var `type`: String = js.native
}

@JSGlobal("__esri.LineCallout3D")
@js.native
/**
  * This type of callout displays a line to connect a symbol or a label with its actual location in the scene. For example when displaying points of interest in a city, visualizing them with a callout line helps to understand where the points are actually located:
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html)
  */
class LineCallout3DCls () extends LineCallout3D {
  def this(properties: LineCallout3DProperties) = this()
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

