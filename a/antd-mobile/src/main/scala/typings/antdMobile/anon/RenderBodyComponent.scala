package typings.antdMobile.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderBodyComponent extends StObject {
  
  def renderBodyComponent(): Element
  
  var renderFooter: js.Any
  
  var renderHeader: js.Any
  
  var renderSectionHeader: js.Any
}
object RenderBodyComponent {
  
  inline def apply(
    renderBodyComponent: () => Element,
    renderFooter: js.Any,
    renderHeader: js.Any,
    renderSectionHeader: js.Any
  ): RenderBodyComponent = {
    val __obj = js.Dynamic.literal(renderBodyComponent = js.Any.fromFunction0(renderBodyComponent), renderFooter = renderFooter.asInstanceOf[js.Any], renderHeader = renderHeader.asInstanceOf[js.Any], renderSectionHeader = renderSectionHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderBodyComponent]
  }
  
  extension [Self <: RenderBodyComponent](x: Self) {
    
    inline def setRenderBodyComponent(value: () => Element): Self = StObject.set(x, "renderBodyComponent", js.Any.fromFunction0(value))
    
    inline def setRenderFooter(value: js.Any): Self = StObject.set(x, "renderFooter", value.asInstanceOf[js.Any])
    
    inline def setRenderHeader(value: js.Any): Self = StObject.set(x, "renderHeader", value.asInstanceOf[js.Any])
    
    inline def setRenderSectionHeader(value: js.Any): Self = StObject.set(x, "renderSectionHeader", value.asInstanceOf[js.Any])
  }
}
