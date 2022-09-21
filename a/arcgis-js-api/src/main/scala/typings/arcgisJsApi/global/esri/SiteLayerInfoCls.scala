package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.SiteLayerInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.SiteLayerInfo")
@js.native
/**
  * The SiteLayerInfo class describes the boundaries of managed sites and is used for visualizing groups of facilities.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SiteLayerInfo.html)
  */
open class SiteLayerInfoCls ()
  extends StObject
     with typings.arcgisJsApi.esri.SiteLayerInfo {
  def this(properties: SiteLayerInfoProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
