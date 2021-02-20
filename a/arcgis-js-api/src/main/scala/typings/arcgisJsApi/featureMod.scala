package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Feature
import typings.arcgisJsApi.esri.FeatureConstructor
import typings.arcgisJsApi.esri.FeatureProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureMod extends Shortcut {
  
  @JSImport("esri/widgets/Feature", JSImport.Namespace)
  @js.native
  val ^ : FeatureConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Feature", JSImport.Namespace)
  @js.native
  class Class () extends Feature {
    def this(properties: FeatureProperties) = this()
  }
  
  type _To = FeatureConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureMod.foo` */
  override def _to: FeatureConstructor = ^
}
