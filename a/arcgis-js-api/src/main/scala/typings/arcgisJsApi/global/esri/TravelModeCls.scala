package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.TravelModeProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.TravelMode")
@js.native
/**
  * A TravelMode is a set of characteristics that define how an object like a vehicle, bicycle, or pedestrian moves along a street network.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html)
  */
open class TravelModeCls ()
  extends StObject
     with typings.arcgisJsApi.esri.TravelMode {
  def this(properties: TravelModeProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
