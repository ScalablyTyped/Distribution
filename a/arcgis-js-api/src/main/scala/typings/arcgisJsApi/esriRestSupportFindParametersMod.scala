package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FindParameters
import typings.arcgisJsApi.esri.FindParametersConstructor
import typings.arcgisJsApi.esri.FindParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportFindParametersMod extends Shortcut {
  
  @JSImport("esri/rest/support/FindParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FindParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/FindParameters", JSImport.Namespace)
  @js.native
  /**
    * Input parameters for [find](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-find.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FindParameters.html)
    */
  open class Class ()
    extends StObject
       with FindParameters {
    def this(properties: FindParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & FindParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportFindParametersMod.foo` */
  override def _to: js.Object & FindParametersConstructor = ^
}
