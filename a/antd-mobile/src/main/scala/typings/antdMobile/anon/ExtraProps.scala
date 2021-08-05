package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtraProps extends StObject {
  
  var extraProps: RenderBodyComponent
  
  var restProps: ClassName
}
object ExtraProps {
  
  inline def apply(extraProps: RenderBodyComponent, restProps: ClassName): ExtraProps = {
    val __obj = js.Dynamic.literal(extraProps = extraProps.asInstanceOf[js.Any], restProps = restProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraProps]
  }
  
  extension [Self <: ExtraProps](x: Self) {
    
    inline def setExtraProps(value: RenderBodyComponent): Self = StObject.set(x, "extraProps", value.asInstanceOf[js.Any])
    
    inline def setRestProps(value: ClassName): Self = StObject.set(x, "restProps", value.asInstanceOf[js.Any])
  }
}
