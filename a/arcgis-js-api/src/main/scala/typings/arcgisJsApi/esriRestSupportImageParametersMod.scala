package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.supportImageParameters
import typings.arcgisJsApi.esri.supportImageParametersConstructor
import typings.arcgisJsApi.esri.supportImageParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportImageParametersMod extends Shortcut {
  
  @JSImport("esri/rest/support/ImageParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & supportImageParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/ImageParameters", JSImport.Namespace)
  @js.native
  /**
    * Represents the image parameter options used when calling [JobInfo.fetchResultImage()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html#fetchResultImage) and [JobInfo.fetchResultMapImageLayer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html#fetchResultMapImageLayer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageParameters.html)
    */
  open class Class ()
    extends StObject
       with supportImageParameters {
    def this(properties: supportImageParametersProperties) = this()
  }
  
  type _To = js.Object & supportImageParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportImageParametersMod.foo` */
  override def _to: js.Object & supportImageParametersConstructor = ^
}
