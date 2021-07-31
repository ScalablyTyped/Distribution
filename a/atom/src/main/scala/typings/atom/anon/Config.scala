package typings.atom.anon

import typings.atom.mod.Project
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var config: js.UndefOr[typings.atom.mod.Config] = js.undefined
  
  var project: js.UndefOr[Project] = js.undefined
  
  var refreshOnWindowFocus: js.UndefOr[Boolean] = js.undefined
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: typings.atom.mod.Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setRefreshOnWindowFocus(value: Boolean): Self = StObject.set(x, "refreshOnWindowFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshOnWindowFocusUndefined: Self = StObject.set(x, "refreshOnWindowFocus", js.undefined)
  }
}
