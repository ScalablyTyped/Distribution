package typings.antd.anon

import typings.antd.anchorAnchorMod.AntAnchor
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAnchorLink extends StObject {
  
  /* static member */
  var contextType: Context[AntAnchor] = js.native
  
  /* static member */
  var defaultProps: HrefString = js.native
}
object TypeofAnchorLink {
  
  @scala.inline
  def apply(contextType: Context[AntAnchor], defaultProps: HrefString): TypeofAnchorLink = {
    val __obj = js.Dynamic.literal(contextType = contextType.asInstanceOf[js.Any], defaultProps = defaultProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAnchorLink]
  }
  
  @scala.inline
  implicit class TypeofAnchorLinkMutableBuilder[Self <: TypeofAnchorLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextType(value: Context[AntAnchor]): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultProps(value: HrefString): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
  }
}
