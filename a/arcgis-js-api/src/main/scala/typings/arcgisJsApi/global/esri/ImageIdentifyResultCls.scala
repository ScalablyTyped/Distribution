package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ImageIdentifyResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.ImageIdentifyResult")
@js.native
/**
  * The results from [imageService](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyResult.html)
  */
open class ImageIdentifyResultCls ()
  extends StObject
     with typings.arcgisJsApi.esri.ImageIdentifyResult {
  def this(properties: ImageIdentifyResultProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
