package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxShadow extends StObject {
  
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
  
  var listStyleType: js.UndefOr[scala.Nothing] = js.native
  
  var margin: js.UndefOr[scala.Nothing] = js.native
  
  var marginBottom: String = js.native
  
  var marginLeft: js.UndefOr[scala.Nothing] = js.native
  
  var marginRight: js.UndefOr[scala.Nothing] = js.native
  
  var padding: js.UndefOr[scala.Nothing] = js.native
  
  var position: js.UndefOr[scala.Nothing] = js.native
  
  var transition: js.UndefOr[scala.Nothing] = js.native
  
  var visibility: js.UndefOr[scala.Nothing] = js.native
  
  var width: js.UndefOr[scala.Nothing] = js.native
  
  var zIndex: js.UndefOr[scala.Nothing] = js.native
}
object BoxShadow {
  
  @scala.inline
  def apply(marginBottom: String): BoxShadow = {
    val __obj = js.Dynamic.literal(marginBottom = marginBottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxShadow]
  }
  
  @scala.inline
  implicit class BoxShadowMutableBuilder[Self <: BoxShadow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarginBottom(value: String): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
  }
}
