package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PixelBlock
import typings.arcgisJsApi.esri.PixelBlockProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportPixelBlockMod {
  
  @JSImport("esri/layers/support/PixelBlock", JSImport.Namespace)
  @js.native
  /**
  		 * An object representing the pixel arrays in the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html)
  		 */
  open class ^ ()
    extends StObject
       with PixelBlock {
    def this(properties: PixelBlockProperties) = this()
  }
}
