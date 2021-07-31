package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FieldGroupConfig
import typings.arcgisJsApi.esri.FieldGroupConfigConstructor
import typings.arcgisJsApi.esri.FieldGroupConfigProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldGroupConfigMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureForm/FieldGroupConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FieldGroupConfigConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureForm/FieldGroupConfig", JSImport.Namespace)
  @js.native
  /**
    * Configuration options for displaying a group of fields within the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html)
    */
  class Class ()
    extends StObject
       with FieldGroupConfig {
    def this(properties: FieldGroupConfigProperties) = this()
  }
  
  type _To = js.Object & FieldGroupConfigConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fieldGroupConfigMod.foo` */
  override def _to: js.Object & FieldGroupConfigConstructor = ^
}
