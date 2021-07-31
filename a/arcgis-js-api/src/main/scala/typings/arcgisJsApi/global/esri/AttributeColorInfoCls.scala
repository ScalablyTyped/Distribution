package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.AttributeColorInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.AttributeColorInfo")
@js.native
/**
  * Defines the symbology for a [DotDensityRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html) in the renderer's [attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#attributes) property.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html)
  */
class AttributeColorInfoCls ()
  extends StObject
     with typings.arcgisJsApi.esri.AttributeColorInfo {
  def this(properties: AttributeColorInfoProperties) = this()
  
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}
