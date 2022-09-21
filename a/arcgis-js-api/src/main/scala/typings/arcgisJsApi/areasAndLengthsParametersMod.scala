package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.AreasAndLengthsParameters
import typings.arcgisJsApi.esri.AreasAndLengthsParametersConstructor
import typings.arcgisJsApi.esri.AreasAndLengthsParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object areasAndLengthsParametersMod extends Shortcut {
  
  @JSImport("esri/rest/support/AreasAndLengthsParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AreasAndLengthsParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/AreasAndLengthsParameters", JSImport.Namespace)
  @js.native
  /**
    * Input parameters for the areasAndLengths() method on the GeometryService.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AreasAndLengthsParameters.html)
    */
  open class Class ()
    extends StObject
       with AreasAndLengthsParameters {
    def this(properties: AreasAndLengthsParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & AreasAndLengthsParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `areasAndLengthsParametersMod.foo` */
  override def _to: js.Object & AreasAndLengthsParametersConstructor = ^
}
