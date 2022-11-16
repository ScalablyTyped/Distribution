package typings.arcgisJsApi.global.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Color")
@js.native
open class Color_ protected ()
  extends StObject
     with typings.arcgisJsApi.esri.Color_ {
  def this(color: String) = this()
  def this(color: js.Array[Double]) = this()
  def this(color: Any) = this()
}
/* static members */
object Color_ {
  
  @JSGlobal("__esri.Color")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a Color instance by blending two colors using a weight factor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#blendColors)
    */
  inline def blendColors(start: typings.arcgisJsApi.esri.Color_, end: typings.arcgisJsApi.esri.Color_, weight: Double): typings.arcgisJsApi.esri.Color_ = (^.asInstanceOf[js.Dynamic].applyDynamic("blendColors")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.Color_]
  inline def blendColors(
    start: typings.arcgisJsApi.esri.Color_,
    end: typings.arcgisJsApi.esri.Color_,
    weight: Double,
    out: typings.arcgisJsApi.esri.Color_
  ): typings.arcgisJsApi.esri.Color_ = (^.asInstanceOf[js.Dynamic].applyDynamic("blendColors")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], weight.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.Color_]
  
  /**
    * Creates a Color instance using a 3 or 4 element array, mapping each element in sequence to the rgb(a) values of the color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#fromArray)
    */
  inline def fromArray(a: js.Array[Double]): typings.arcgisJsApi.esri.Color_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(a.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Color_]
  inline def fromArray(a: js.Array[Double], t: typings.arcgisJsApi.esri.Color_): typings.arcgisJsApi.esri.Color_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(a.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.Color_]
  
  /**
    * Creates a Color instance from a hex string with a '#' prefix.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#fromHex)
    */
  inline def fromHex(colorStr: String): typings.arcgisJsApi.esri.Color_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(colorStr.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Color_]
  inline def fromHex(colorStr: String, t: typings.arcgisJsApi.esri.Color_): typings.arcgisJsApi.esri.Color_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(colorStr.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.Color_]
  
  /**
    * Creates a new Color instance, and initializes it with values from a JSON object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#fromJSON)
    */
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Color_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Color_]
  
  /**
    * Creates a Color instance from a string of the form "rgb()" or "rgba()".
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#fromRgb)
    */
  inline def fromRgb(color: String): typings.arcgisJsApi.esri.Color_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRgb")(color.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Color_]
  inline def fromRgb(color: String, out: typings.arcgisJsApi.esri.Color_): typings.arcgisJsApi.esri.Color_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRgb")(color.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.Color_]
  
  /**
    * Creates a Color instance by parsing a generic string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#fromString)
    */
  inline def fromString(str: String): typings.arcgisJsApi.esri.Color_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Color_]
  inline def fromString(str: String, obj: typings.arcgisJsApi.esri.Color_): typings.arcgisJsApi.esri.Color_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.Color_]
}
