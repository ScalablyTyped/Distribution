package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMTextMargin extends StObject {
  
  /**
    * The bottom margin.
    */
  var bottom: js.UndefOr[Double] = js.undefined
  
  /**
    * The left margin.
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * The right margin.
    */
  var right: js.UndefOr[Double] = js.undefined
  
  /**
    * The top margin.
    */
  var top: js.UndefOr[Double] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMTextMargin
}
object CIMTextMargin {
  
  @scala.inline
  def apply(): CIMTextMargin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMTextMargin")
    __obj.asInstanceOf[CIMTextMargin]
  }
  
  @scala.inline
  implicit class CIMTextMarginMutableBuilder[Self <: CIMTextMargin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMTextMargin): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
