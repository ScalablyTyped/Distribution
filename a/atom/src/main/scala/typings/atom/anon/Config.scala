package typings.atom.anon

import typings.atom.srcProjectMod.Project
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var config: js.UndefOr[typings.atom.srcConfigMod.Config] = js.undefined
  
  var project: js.UndefOr[Project] = js.undefined
  
  var refreshOnWindowFocus: js.UndefOr[Boolean] = js.undefined
}
object Config {
  
  inline def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setConfig(value: typings.atom.srcConfigMod.Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRefreshOnWindowFocus(value: Boolean): Self = StObject.set(x, "refreshOnWindowFocus", value.asInstanceOf[js.Any])
    
    inline def setRefreshOnWindowFocusUndefined: Self = StObject.set(x, "refreshOnWindowFocus", js.undefined)
  }
}
