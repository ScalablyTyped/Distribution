package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.APIKeyMixin
import typings.arcgisJsApi.esri.APIKeyMixinConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersMixinsApikeymixinMod extends Shortcut {
  
  @JSImport("esri/layers/mixins/APIKeyMixin", JSImport.Namespace)
  @js.native
  val ^ : APIKeyMixinConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/mixins/APIKeyMixin", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with APIKeyMixin {
    
    /**
      * An authorization string used to access a resource or service.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-APIKeyMixin.html#apiKey)
      */
    /* CompleteClass */
    var apiKey: String = js.native
  }
  
  type _To = APIKeyMixinConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersMixinsApikeymixinMod.foo` */
  override def _to: APIKeyMixinConstructor = ^
}
