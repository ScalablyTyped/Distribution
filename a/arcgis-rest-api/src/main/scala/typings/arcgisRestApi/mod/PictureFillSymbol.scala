package typings.arcgisRestApi.mod

import typings.arcgisRestApi.arcgisRestApiStrings.esriPFS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PictureFillSymbol
  extends Symbol
     with PictureSourced {
  
  var outline: js.UndefOr[SimpleLineSymbol] = js.native
  
  @JSName("type")
  var type_PictureFillSymbol: esriPFS = js.native
  
  // if outline has been specified
  var xscale: js.UndefOr[Double] = js.native
  
  var yscale: js.UndefOr[Double] = js.native
}
object PictureFillSymbol {
  
  @scala.inline
  def apply(`type`: esriPFS): PictureFillSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureFillSymbol]
  }
  
  @scala.inline
  implicit class PictureFillSymbolMutableBuilder[Self <: PictureFillSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutline(value: SimpleLineSymbol): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    @scala.inline
    def setType(value: esriPFS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXscale(value: Double): Self = StObject.set(x, "xscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXscaleUndefined: Self = StObject.set(x, "xscale", js.undefined)
    
    @scala.inline
    def setYscale(value: Double): Self = StObject.set(x, "yscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYscaleUndefined: Self = StObject.set(x, "yscale", js.undefined)
  }
}
