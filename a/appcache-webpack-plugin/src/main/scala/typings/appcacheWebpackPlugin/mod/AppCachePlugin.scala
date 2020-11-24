package typings.appcacheWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generate an HTML5 Application Cache for a Webpack build
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin * / any */ @js.native
trait AppCachePlugin extends js.Object {
  
  var AppCache: typings.appcacheWebpackPlugin.mod.AppCache = js.native
}
object AppCachePlugin {
  
  @scala.inline
  def apply(AppCache: AppCache): AppCachePlugin = {
    val __obj = js.Dynamic.literal(AppCache = AppCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCachePlugin]
  }
  
  @scala.inline
  implicit class AppCachePluginOps[Self <: AppCachePlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppCache(value: AppCache): Self = this.set("AppCache", value.asInstanceOf[js.Any])
  }
}
