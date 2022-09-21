package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RelationParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.RelationParameters")
@js.native
/**
  * Sets the relation and other parameters for the [geometryService.relation()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#relation) operation.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationParameters.html)
  */
open class RelationParametersCls ()
  extends StObject
     with typings.arcgisJsApi.esri.RelationParameters {
  def this(properties: RelationParametersProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
