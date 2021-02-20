package typings.appBuilderLib

import typings.appBuilderLib.appBuilderLibStrings.`win-10`
import typings.appBuilderLib.appBuilderLibStrings.elementary
import typings.appBuilderLib.appBuilderLibStrings.running
import typings.appBuilderLib.appBuilderLibStrings.stopped
import typings.appBuilderLib.appBuilderLibStrings.suspended
import typings.appBuilderLib.appBuilderLibStrings.ubuntu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parallelsVmMod {
  
  @JSImport("app-builder-lib/out/vm/ParallelsVm", "macPathToParallelsWindows")
  @js.native
  def macPathToParallelsWindows(file: String): String = js.native
  
  @js.native
  trait ParallelsVm extends StObject {
    
    var id: String = js.native
    
    var name: String = js.native
    
    var os: `win-10` | ubuntu | elementary = js.native
    
    var state: running | suspended | stopped = js.native
  }
  object ParallelsVm {
    
    @scala.inline
    def apply(id: String, name: String, os: `win-10` | ubuntu | elementary, state: running | suspended | stopped): ParallelsVm = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParallelsVm]
    }
    
    @scala.inline
    implicit class ParallelsVmMutableBuilder[Self <: ParallelsVm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOs(value: `win-10` | ubuntu | elementary): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: running | suspended | stopped): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
