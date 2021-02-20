package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureTemplate
import typings.arcgisJsApi.esri.FeatureTemplateConstructor
import typings.arcgisJsApi.esri.FeatureTemplateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureTemplateMod extends Shortcut {
  
  @JSImport("esri/layers/support/FeatureTemplate", JSImport.Namespace)
  @js.native
  val ^ : FeatureTemplateConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/FeatureTemplate", JSImport.Namespace)
  @js.native
  class Class () extends FeatureTemplate {
    def this(properties: FeatureTemplateProperties) = this()
  }
  
  type _To = FeatureTemplateConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureTemplateMod.foo` */
  override def _to: FeatureTemplateConstructor = ^
}
