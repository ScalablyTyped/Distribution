package typings.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/environment", JSImport.Namespace)
@js.native
object environmentMod extends js.Object {
  
  @js.native
  class Environment () extends js.Object {
    
    var eGridDiv: js.Any = js.native
    
    def getSassVariable(theme: String, key: String): Double = js.native
    
    def getTheme(): String = js.native
    
    var gridSize: js.Any = js.native
    
    var iconSize: js.Any = js.native
    
    def loadSassVariables(): Unit = js.native
    
    var sassVariables: js.Any = js.native
  }
}
