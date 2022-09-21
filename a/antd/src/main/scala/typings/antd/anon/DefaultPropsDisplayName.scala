package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPropsDisplayName extends StObject {
  
  var defaultProps: PartialPropsWithChildrenD
  
  var displayName: js.UndefOr[String] = js.undefined
}
object DefaultPropsDisplayName {
  
  inline def apply(defaultProps: PartialPropsWithChildrenD): DefaultPropsDisplayName = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultPropsDisplayName]
  }
  
  extension [Self <: DefaultPropsDisplayName](x: Self) {
    
    inline def setDefaultProps(value: PartialPropsWithChildrenD): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
