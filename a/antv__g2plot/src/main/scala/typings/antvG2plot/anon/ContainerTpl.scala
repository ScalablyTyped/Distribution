package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerTpl extends StObject {
  
  var containerTpl: String
  
  var crosshairs: `2`
  
  def customContent(x: String, data: js.Array[Any]): String
  
  var domStyles: G2tooltip
  
  var itemTpl: String
  
  var shared: Boolean
  
  var showCrosshairs: Boolean
  
  var showMarkers: Boolean
  
  var showTitle: Boolean
}
object ContainerTpl {
  
  inline def apply(
    containerTpl: String,
    crosshairs: `2`,
    customContent: (String, js.Array[Any]) => String,
    domStyles: G2tooltip,
    itemTpl: String,
    shared: Boolean,
    showCrosshairs: Boolean,
    showMarkers: Boolean,
    showTitle: Boolean
  ): ContainerTpl = {
    val __obj = js.Dynamic.literal(containerTpl = containerTpl.asInstanceOf[js.Any], crosshairs = crosshairs.asInstanceOf[js.Any], customContent = js.Any.fromFunction2(customContent), domStyles = domStyles.asInstanceOf[js.Any], itemTpl = itemTpl.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any], showCrosshairs = showCrosshairs.asInstanceOf[js.Any], showMarkers = showMarkers.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerTpl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerTpl] (val x: Self) extends AnyVal {
    
    inline def setContainerTpl(value: String): Self = StObject.set(x, "containerTpl", value.asInstanceOf[js.Any])
    
    inline def setCrosshairs(value: `2`): Self = StObject.set(x, "crosshairs", value.asInstanceOf[js.Any])
    
    inline def setCustomContent(value: (String, js.Array[Any]) => String): Self = StObject.set(x, "customContent", js.Any.fromFunction2(value))
    
    inline def setDomStyles(value: G2tooltip): Self = StObject.set(x, "domStyles", value.asInstanceOf[js.Any])
    
    inline def setItemTpl(value: String): Self = StObject.set(x, "itemTpl", value.asInstanceOf[js.Any])
    
    inline def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setShowCrosshairs(value: Boolean): Self = StObject.set(x, "showCrosshairs", value.asInstanceOf[js.Any])
    
    inline def setShowMarkers(value: Boolean): Self = StObject.set(x, "showMarkers", value.asInstanceOf[js.Any])
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
  }
}
