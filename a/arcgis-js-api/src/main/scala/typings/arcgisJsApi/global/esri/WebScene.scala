package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.WebSceneProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.WebScene")
@js.native
/**
  * The web scene is the core element of 3D mapping across ArcGIS.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html)
  */
open class WebScene ()
  extends StObject
     with typings.arcgisJsApi.esri.WebScene {
  def this(properties: WebSceneProperties) = this()
  
  /**
    * Returns a table based on the given table ID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-TablesMixin.html#findTableById)
    */
  /* CompleteClass */
  override def findTableById(tableId: String): typings.arcgisJsApi.esri.Layer = js.native
  
  /**
    * A collection of [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) instances that are tables saved in a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) and/or a [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-TablesMixin.html#tables)
    */
  /* CompleteClass */
  var tables: typings.arcgisJsApi.esri.Collection[typings.arcgisJsApi.esri.Layer] = js.native
}
/* static members */
object WebScene {
  
  @JSGlobal("__esri.WebScene")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new instance of this class and initializes it with values from a JSON object generated from an ArcGIS product.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#fromJSON)
    */
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.WebScene = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.WebScene]
  
  /**
    * The latest supported webscene spec version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#version)
    */
  @JSGlobal("__esri.WebScene.version")
  @js.native
  val version: String = js.native
}
