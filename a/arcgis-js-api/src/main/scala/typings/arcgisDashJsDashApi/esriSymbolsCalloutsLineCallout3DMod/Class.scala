package typings.arcgisDashJsDashApi.esriSymbolsCalloutsLineCallout3DMod

import typings.arcgisDashJsDashApi.__esri.LineCallout3D
import typings.arcgisDashJsDashApi.__esri.LineCallout3DProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols/callouts/LineCallout3D", JSImport.Namespace)
@js.native
/**
  * This type of callout displays a line to connect a symbol or a label with its actual location in the scene. For example when displaying points of interest in a city, visualizing them with a callout line helps to understand where the points are actually located:
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html)
  */
class Class () extends LineCallout3D {
  def this(properties: LineCallout3DProperties) = this()
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

