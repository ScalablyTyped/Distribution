package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.TextSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.TextSymbol3DLayer")
@js.native
/**
  * TextSymbol3DLayer is used to draw text labels for features of any geometry type.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html)
  */
class TextSymbol3DLayerCls ()
  extends StObject
     with typings.arcgisJsApi.esri.TextSymbol3DLayer {
  def this(properties: TextSymbol3DLayerProperties) = this()
  
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}
