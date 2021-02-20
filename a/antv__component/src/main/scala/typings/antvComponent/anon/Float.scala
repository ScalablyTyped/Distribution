package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Float extends StObject {
  
  var backgroundColor: js.UndefOr[scala.Nothing] = js.native
  
  var borderRadius: js.UndefOr[scala.Nothing] = js.native
  
  var boxShadow: js.UndefOr[scala.Nothing] = js.native
  
  var color: js.UndefOr[scala.Nothing] = js.native
  
  var display: js.UndefOr[scala.Nothing] = js.native
  
  var float: js.UndefOr[scala.Nothing] = js.native
  
  var fontFamily: js.UndefOr[scala.Nothing] = js.native
  
  var fontSize: js.UndefOr[scala.Nothing] = js.native
  
  var height: js.UndefOr[scala.Nothing] = js.native
  
  var lineHeight: js.UndefOr[scala.Nothing] = js.native
  
  var listStyleType: String = js.native
  
  var margin: String = js.native
  
  var marginBottom: js.UndefOr[scala.Nothing] = js.native
  
  var marginLeft: js.UndefOr[scala.Nothing] = js.native
  
  var marginRight: js.UndefOr[scala.Nothing] = js.native
  
  var padding: String = js.native
  
  var position: js.UndefOr[scala.Nothing] = js.native
  
  var transition: js.UndefOr[scala.Nothing] = js.native
  
  var visibility: js.UndefOr[scala.Nothing] = js.native
  
  var width: js.UndefOr[scala.Nothing] = js.native
  
  var zIndex: js.UndefOr[scala.Nothing] = js.native
}
object Float {
  
  @scala.inline
  def apply(listStyleType: String, margin: String, padding: String): Float = {
    val __obj = js.Dynamic.literal(listStyleType = listStyleType.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Float]
  }
  
  @scala.inline
  implicit class FloatMutableBuilder[Self <: Float] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListStyleType(value: String): Self = StObject.set(x, "listStyleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
  }
}
