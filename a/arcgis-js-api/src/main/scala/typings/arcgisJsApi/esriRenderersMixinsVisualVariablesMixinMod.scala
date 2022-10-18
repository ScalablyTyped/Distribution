package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.VisualVariable
import typings.arcgisJsApi.esri.VisualVariablesMixin
import typings.arcgisJsApi.esri.VisualVariablesMixinConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersMixinsVisualVariablesMixinMod extends Shortcut {
  
  @JSImport("esri/renderers/mixins/VisualVariablesMixin", JSImport.Namespace)
  @js.native
  val ^ : VisualVariablesMixinConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/mixins/VisualVariablesMixin", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with VisualVariablesMixin {
    
    /**
      * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-mixins-VisualVariablesMixin.html#visualVariables)
      */
    /* CompleteClass */
    var visualVariables: js.Array[VisualVariable] = js.native
  }
  
  type _To = VisualVariablesMixinConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRenderersMixinsVisualVariablesMixinMod.foo` */
  override def _to: VisualVariablesMixinConstructor = ^
}
