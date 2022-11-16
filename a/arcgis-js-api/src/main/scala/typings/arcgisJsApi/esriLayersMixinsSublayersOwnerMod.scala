package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Collection
import typings.arcgisJsApi.esri.Sublayer
import typings.arcgisJsApi.esri.SublayersOwner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersMixinsSublayersOwnerMod {
  
  @JSImport("esri/layers/mixins/SublayersOwner", JSImport.Namespace)
  @js.native
  open class ^ ()
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
}
