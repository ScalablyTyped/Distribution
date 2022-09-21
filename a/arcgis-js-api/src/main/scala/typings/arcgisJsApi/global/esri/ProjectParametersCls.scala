package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ProjectParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.ProjectParameters")
@js.native
/**
  * Defines the projection parameters used when calling the [geometryService.project()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#project).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ProjectParameters.html)
  */
open class ProjectParametersCls ()
  extends StObject
     with typings.arcgisJsApi.esri.ProjectParameters {
  def this(properties: ProjectParametersProperties) = this()
}
