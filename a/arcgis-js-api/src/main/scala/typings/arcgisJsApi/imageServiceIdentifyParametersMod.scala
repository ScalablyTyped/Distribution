package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ImageServiceIdentifyParameters
import typings.arcgisJsApi.esri.ImageServiceIdentifyParametersConstructor
import typings.arcgisJsApi.esri.ImageServiceIdentifyParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageServiceIdentifyParametersMod extends Shortcut {
  
  @JSImport("esri/tasks/support/ImageServiceIdentifyParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ImageServiceIdentifyParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/ImageServiceIdentifyParameters", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with ImageServiceIdentifyParameters {
    def this(properties: ImageServiceIdentifyParametersProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  type _To = js.Object & ImageServiceIdentifyParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `imageServiceIdentifyParametersMod.foo` */
  override def _to: js.Object & ImageServiceIdentifyParametersConstructor = ^
}
