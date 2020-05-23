package typings.arcgisJsApi.global.esri.symbols

import typings.arcgisJsApi.esri.WebStyleSymbolProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.symbols.WebStyleSymbol")
@js.native
/**
  * WebStyleSymbol is a class used to conveniently create vector 2D symbols and realistic and thematic 3D symbols. It is a wrapper for creating [CIMSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html) and [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) objects that point to a web style resource available in the API.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html)
  */
class WebStyleSymbolCls ()
  extends typings.arcgisJsApi.esri.WebStyleSymbol {
  def this(properties: WebStyleSymbolProperties) = this()
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

