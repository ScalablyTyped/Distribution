package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.supportFeatureEffect
import typings.arcgisJsApi.esri.supportFeatureEffectConstructor
import typings.arcgisJsApi.esri.supportFeatureEffectProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object supportFeatureEffectMod extends Shortcut {
  
  @JSImport("esri/views/layers/support/FeatureEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Object & supportFeatureEffectConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/layers/support/FeatureEffect", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with supportFeatureEffect {
    def this(properties: supportFeatureEffectProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & supportFeatureEffectConstructor
  
  /* This means you don't have to write `^`, but can instead just say `supportFeatureEffectMod.foo` */
  override def _to: js.Object & supportFeatureEffectConstructor = ^
}
