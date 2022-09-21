package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.CustomParametersMixin
import typings.arcgisJsApi.esri.CustomParametersMixinConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customParametersMixinMod extends Shortcut {
  
  @JSImport("esri/layers/mixins/CustomParametersMixin", JSImport.Namespace)
  @js.native
  val ^ : CustomParametersMixinConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/mixins/CustomParametersMixin", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with CustomParametersMixin {
    
    /**
      * A list of custom parameters appended to the URL of all resources fetched by the layer.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-CustomParametersMixin.html#customParameters)
      */
    /* CompleteClass */
    var customParameters: Any = js.native
  }
  
  type _To = CustomParametersMixinConstructor
  
  /* This means you don't have to write `^`, but can instead just say `customParametersMixinMod.foo` */
  override def _to: CustomParametersMixinConstructor = ^
}
