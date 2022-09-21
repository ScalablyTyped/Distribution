package typings.antvG2plot.anon

import typings.antvG2.libInterfaceMod.ViewAppendPadding
import typings.antvG2.libInterfaceMod.ViewPadding
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppendPadding extends StObject {
  
  var appendPadding: ViewAppendPadding
  
  var autoFit: Boolean
  
  var container: HTMLElement
  
  var height: Double
  
  var padding: ViewPadding
  
  var width: Double
}
object AppendPadding {
  
  inline def apply(
    appendPadding: ViewAppendPadding,
    autoFit: Boolean,
    container: HTMLElement,
    height: Double,
    padding: ViewPadding,
    width: Double
  ): AppendPadding = {
    val __obj = js.Dynamic.literal(appendPadding = appendPadding.asInstanceOf[js.Any], autoFit = autoFit.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendPadding]
  }
  
  extension [Self <: AppendPadding](x: Self) {
    
    inline def setAppendPadding(value: ViewAppendPadding): Self = StObject.set(x, "appendPadding", value.asInstanceOf[js.Any])
    
    inline def setAppendPaddingVarargs(value: Double*): Self = StObject.set(x, "appendPadding", js.Array(value*))
    
    inline def setAutoFit(value: Boolean): Self = StObject.set(x, "autoFit", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: ViewPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
