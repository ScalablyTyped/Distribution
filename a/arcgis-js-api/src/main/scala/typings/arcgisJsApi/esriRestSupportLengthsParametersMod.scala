package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LengthsParameters
import typings.arcgisJsApi.esri.LengthsParametersConstructor
import typings.arcgisJsApi.esri.LengthsParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportLengthsParametersMod extends Shortcut {
  
  @JSImport("esri/rest/support/LengthsParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LengthsParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/LengthsParameters", JSImport.Namespace)
  @js.native
  /**
    * Sets the length units and other parameters for the [geometryService.lengths()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#lengths) operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LengthsParameters.html)
    */
  open class Class ()
    extends StObject
       with LengthsParameters {
    def this(properties: LengthsParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & LengthsParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportLengthsParametersMod.foo` */
  override def _to: js.Object & LengthsParametersConstructor = ^
}
