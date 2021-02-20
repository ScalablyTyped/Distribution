package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMaterialSymbolLayer
  extends CIMSymbolLayerBase
     with CIMSymbolLayerType {
  
  /**
    * The material color.
    */
  var color: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The mode in which the material is applied.
    */
  var materialMode: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MaterialMode * / any */ String
  ] = js.native
  
  @JSName("type")
  var type_CIMMaterialSymbolLayer: typings.arcgisJsApi.arcgisJsApiStrings.CIMMaterialSymbolLayer = js.native
}
object CIMMaterialSymbolLayer {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMaterialSymbolLayer): CIMMaterialSymbolLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMaterialSymbolLayer]
  }
  
  @scala.inline
  implicit class CIMMaterialSymbolLayerMutableBuilder[Self <: CIMMaterialSymbolLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setMaterialMode(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MaterialMode * / any */ String
    ): Self = StObject.set(x, "materialMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialModeUndefined: Self = StObject.set(x, "materialMode", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMaterialSymbolLayer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
