package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureFenceParameters
import typings.arcgisJsApi.esri.FeatureFenceParametersConstructor
import typings.arcgisJsApi.esri.FeatureFenceParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebdocGeotriggersInfoFeatureFenceParametersMod extends Shortcut {
  
  @JSImport("esri/webdoc/geotriggersInfo/FeatureFenceParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureFenceParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webdoc/geotriggersInfo/FeatureFenceParameters", JSImport.Namespace)
  @js.native
  /**
    * Fence parameters for a Geotrigger that uses feature data from an online feature service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureFenceParameters.html)
    */
  open class Class ()
    extends StObject
       with FeatureFenceParameters {
    def this(properties: FeatureFenceParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & FeatureFenceParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWebdocGeotriggersInfoFeatureFenceParametersMod.foo` */
  override def _to: js.Object & FeatureFenceParametersConstructor = ^
}
