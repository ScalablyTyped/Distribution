package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RouteParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.RouteParameters")
@js.native
/**
  * Input parameters for [route](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-route.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html)
  */
open class RouteParametersCls ()
  extends StObject
     with typings.arcgisJsApi.esri.RouteParameters {
  def this(properties: RouteParametersProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
