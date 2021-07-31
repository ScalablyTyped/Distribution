package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DirectionsFeatureSet
import typings.arcgisJsApi.esri.DirectionsFeatureSetConstructor
import typings.arcgisJsApi.esri.DirectionsFeatureSetProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directionsFeatureSetMod extends Shortcut {
  
  @JSImport("esri/tasks/support/DirectionsFeatureSet", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DirectionsFeatureSetConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/DirectionsFeatureSet", JSImport.Namespace)
  @js.native
  /**
    * A [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) that has properties specific to routing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html)
    */
  class Class ()
    extends StObject
       with DirectionsFeatureSet {
    def this(properties: DirectionsFeatureSetProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  type _To = js.Object & DirectionsFeatureSetConstructor
  
  /* This means you don't have to write `^`, but can instead just say `directionsFeatureSetMod.foo` */
  override def _to: js.Object & DirectionsFeatureSetConstructor = ^
}
