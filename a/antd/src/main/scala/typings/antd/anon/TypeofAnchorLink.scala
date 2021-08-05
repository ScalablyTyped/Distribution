package typings.antd.anon

import typings.antd.anchorAnchorMod.AntAnchor
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAnchorLink extends StObject {
  
  /* static member */
  var contextType: Context[AntAnchor]
  
  /* static member */
  var defaultProps: HrefString
}
object TypeofAnchorLink {
  
  inline def apply(contextType: Context[AntAnchor], defaultProps: HrefString): TypeofAnchorLink = {
    val __obj = js.Dynamic.literal(contextType = contextType.asInstanceOf[js.Any], defaultProps = defaultProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAnchorLink]
  }
  
  extension [Self <: TypeofAnchorLink](x: Self) {
    
    inline def setContextType(value: Context[AntAnchor]): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
    
    inline def setDefaultProps(value: HrefString): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
  }
}
