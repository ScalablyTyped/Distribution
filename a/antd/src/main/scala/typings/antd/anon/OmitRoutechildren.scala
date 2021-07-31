package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/lib/_util/type.Omit<antd.antd/lib/breadcrumb/Breadcrumb.Route, 'children'> */
trait OmitRoutechildren extends StObject {
  
  var breadcrumbName: String
  
  var path: String
}
object OmitRoutechildren {
  
  @scala.inline
  def apply(breadcrumbName: String, path: String): OmitRoutechildren = {
    val __obj = js.Dynamic.literal(breadcrumbName = breadcrumbName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitRoutechildren]
  }
  
  @scala.inline
  implicit class OmitRoutechildrenMutableBuilder[Self <: OmitRoutechildren] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreadcrumbName(value: String): Self = StObject.set(x, "breadcrumbName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
