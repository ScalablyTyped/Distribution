package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.IdentifyParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.IdentifyParameters")
@js.native
/**
  * Input parameters for the [identify](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-identify.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html)
  */
open class IdentifyParametersCls ()
  extends StObject
     with typings.arcgisJsApi.esri.IdentifyParameters {
  def this(properties: IdentifyParametersProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
