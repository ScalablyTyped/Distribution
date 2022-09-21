package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FacilityLayerInfo
import typings.arcgisJsApi.esri.FacilityLayerInfoConstructor
import typings.arcgisJsApi.esri.FacilityLayerInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facilityLayerInfoMod extends Shortcut {
  
  @JSImport("esri/layers/support/FacilityLayerInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FacilityLayerInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/FacilityLayerInfo", JSImport.Namespace)
  @js.native
  /**
    * The FacilityLayerInfo describes the footprints of managed buildings and other structures.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FacilityLayerInfo.html)
    */
  open class Class ()
    extends StObject
       with FacilityLayerInfo {
    def this(properties: FacilityLayerInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & FacilityLayerInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `facilityLayerInfoMod.foo` */
  override def _to: js.Object & FacilityLayerInfoConstructor = ^
}
