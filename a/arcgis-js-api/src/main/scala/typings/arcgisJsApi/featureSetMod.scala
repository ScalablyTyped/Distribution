package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureSet
import typings.arcgisJsApi.esri.FeatureSetConstructor
import typings.arcgisJsApi.esri.FeatureSetProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureSetMod extends Shortcut {
  
  @JSImport("esri/rest/support/FeatureSet", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureSetConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/FeatureSet", JSImport.Namespace)
  @js.native
  /**
    * A collection of features returned from ArcGIS Server or used as input to methods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html)
    */
  open class Class ()
    extends StObject
       with FeatureSet {
    def this(properties: FeatureSetProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & FeatureSetConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureSetMod.foo` */
  override def _to: js.Object & FeatureSetConstructor = ^
}
