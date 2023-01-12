package typings.appBuilderLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outUtilBundledToolMod {
  
  @JSImport("app-builder-lib/out/util/bundledTool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeEnv(oldValue: String, newValues: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeEnv")(oldValue.asInstanceOf[js.Any], newValues.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def computeEnv(oldValue: Null, newValues: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeEnv")(oldValue.asInstanceOf[js.Any], newValues.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def computeEnv(oldValue: Unit, newValues: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeEnv")(oldValue.asInstanceOf[js.Any], newValues.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def computeToolEnv(libPath: js.Array[String]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("computeToolEnv")(libPath.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait ToolInfo extends StObject {
    
    var env: js.UndefOr[Any] = js.undefined
    
    var path: String
  }
  object ToolInfo {
    
    inline def apply(path: String): ToolInfo = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolInfo] (val x: Self) extends AnyVal {
      
      inline def setEnv(value: Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
