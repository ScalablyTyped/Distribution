package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.FieldInfoFormatProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.FieldInfoFormat")
@js.native
/**
  * The `FieldInfoFormat` class is used with numerical or date fields to provide more detail about how the value should be displayed in a popup.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-FieldInfoFormat.html)
  */
class FieldInfoFormatCls ()
  extends StObject
     with typings.arcgisJsApi.esri.FieldInfoFormat {
  def this(properties: FieldInfoFormatProperties) = this()
  
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}
