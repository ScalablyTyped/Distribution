package typings.appBuilderLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bundledToolMod {
  
  @JSImport("app-builder-lib/out/util/bundledTool", "computeEnv")
  @js.native
  def computeEnv(oldValue: js.UndefOr[scala.Nothing], newValues: js.Array[String]): String = js.native
  @JSImport("app-builder-lib/out/util/bundledTool", "computeEnv")
  @js.native
  def computeEnv(oldValue: String, newValues: js.Array[String]): String = js.native
  @JSImport("app-builder-lib/out/util/bundledTool", "computeEnv")
  @js.native
  def computeEnv(oldValue: Null, newValues: js.Array[String]): String = js.native
  
  @JSImport("app-builder-lib/out/util/bundledTool", "computeToolEnv")
  @js.native
  def computeToolEnv(libPath: js.Array[String]): js.Any = js.native
  
  @js.native
  trait ToolInfo extends StObject {
    
    var env: js.UndefOr[js.Any] = js.native
    
    var path: String = js.native
  }
  object ToolInfo {
    
    @scala.inline
    def apply(path: String): ToolInfo = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolInfo]
    }
    
    @scala.inline
    implicit class ToolInfoMutableBuilder[Self <: ToolInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnv(value: js.Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
