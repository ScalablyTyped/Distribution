package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomContent extends StObject {
  
  var containerTpl: String
  
  def customContent(x: String, data: js.Array[Any]): String
  
  var domStyles: G2tooltip
  
  var itemTpl: String
  
  var shared: Boolean
  
  var showMarkers: Boolean
  
  var showTitle: Boolean
}
object CustomContent {
  
  inline def apply(
    containerTpl: String,
    customContent: (String, js.Array[Any]) => String,
    domStyles: G2tooltip,
    itemTpl: String,
    shared: Boolean,
    showMarkers: Boolean,
    showTitle: Boolean
  ): CustomContent = {
    val __obj = js.Dynamic.literal(containerTpl = containerTpl.asInstanceOf[js.Any], customContent = js.Any.fromFunction2(customContent), domStyles = domStyles.asInstanceOf[js.Any], itemTpl = itemTpl.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any], showMarkers = showMarkers.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomContent] (val x: Self) extends AnyVal {
    
    inline def setContainerTpl(value: String): Self = StObject.set(x, "containerTpl", value.asInstanceOf[js.Any])
    
    inline def setCustomContent(value: (String, js.Array[Any]) => String): Self = StObject.set(x, "customContent", js.Any.fromFunction2(value))
    
    inline def setDomStyles(value: G2tooltip): Self = StObject.set(x, "domStyles", value.asInstanceOf[js.Any])
    
    inline def setItemTpl(value: String): Self = StObject.set(x, "itemTpl", value.asInstanceOf[js.Any])
    
    inline def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setShowMarkers(value: Boolean): Self = StObject.set(x, "showMarkers", value.asInstanceOf[js.Any])
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
  }
}
