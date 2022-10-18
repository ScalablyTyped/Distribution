package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Collection
import typings.arcgisJsApi.esri.Sublayer
import typings.arcgisJsApi.esri.SublayersOwner
import typings.arcgisJsApi.esri.SublayersOwnerConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersMixinsSublayersOwnerMod extends Shortcut {
  
  @JSImport("esri/layers/mixins/SublayersOwner", JSImport.Namespace)
  @js.native
  val ^ : SublayersOwnerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/mixins/SublayersOwner", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with SublayersOwner {
    
    /**
      * Returns a deep clone of a map service's [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) as defined by the service.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SublayersOwner.html#createServiceSublayers)
      */
    /* CompleteClass */
    override def createServiceSublayers(): Collection[Sublayer] = js.native
    
    /**
      * Returns the sublayer with the given layerId.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SublayersOwner.html#findSublayerById)
      */
    /* CompleteClass */
    override def findSublayerById(id: Double): Sublayer = js.native
  }
  
  type _To = SublayersOwnerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersMixinsSublayersOwnerMod.foo` */
  override def _to: SublayersOwnerConstructor = ^
}
