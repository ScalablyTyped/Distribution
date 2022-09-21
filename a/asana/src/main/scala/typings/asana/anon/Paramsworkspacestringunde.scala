package typings.asana.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined asana.asana.resources.Params & {  workspace :string | undefined} */
trait Paramsworkspacestringunde extends StObject {
  
  var opt_expand: js.UndefOr[String] = js.undefined
  
  var opt_fields: js.UndefOr[String] = js.undefined
  
  var workspace: js.UndefOr[String] = js.undefined
}
object Paramsworkspacestringunde {
  
  inline def apply(): Paramsworkspacestringunde = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Paramsworkspacestringunde]
  }
  
  extension [Self <: Paramsworkspacestringunde](x: Self) {
    
    inline def setOpt_expand(value: String): Self = StObject.set(x, "opt_expand", value.asInstanceOf[js.Any])
    
    inline def setOpt_expandUndefined: Self = StObject.set(x, "opt_expand", js.undefined)
    
    inline def setOpt_fields(value: String): Self = StObject.set(x, "opt_fields", value.asInstanceOf[js.Any])
    
    inline def setOpt_fieldsUndefined: Self = StObject.set(x, "opt_fields", js.undefined)
    
    inline def setWorkspace(value: String): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
  }
}
