package typings.arcgisJsApi.esriSymbolsMod

import typings.arcgisJsApi.esri.ExtrudeSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("esri/symbols", "ExtrudeSymbol3DLayer")
@js.native
/**
		 * ExtrudeSymbol3DLayer is used to render [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometries by extruding them upward from the ground, creating a 3D volumetric object.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html)
		 */
open class ExtrudeSymbol3DLayerCls ()
  extends StObject
     with typings.arcgisJsApi.esri.ExtrudeSymbol3DLayer {
  def this(properties: ExtrudeSymbol3DLayerProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
