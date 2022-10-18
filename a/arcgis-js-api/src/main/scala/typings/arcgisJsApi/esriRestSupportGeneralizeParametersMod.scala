package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GeneralizeParameters
import typings.arcgisJsApi.esri.GeneralizeParametersConstructor
import typings.arcgisJsApi.esri.GeneralizeParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportGeneralizeParametersMod extends Shortcut {
  
  @JSImport("esri/rest/support/GeneralizeParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & GeneralizeParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/GeneralizeParameters", JSImport.Namespace)
  @js.native
  /**
    * Sets the geometries, maximum deviation and units for the [generalize](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#generalize) operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-GeneralizeParameters.html)
    */
  open class Class ()
    extends StObject
       with GeneralizeParameters {
    def this(properties: GeneralizeParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & GeneralizeParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportGeneralizeParametersMod.foo` */
  override def _to: js.Object & GeneralizeParametersConstructor = ^
}
