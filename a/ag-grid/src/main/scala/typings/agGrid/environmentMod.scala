package typings.agGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentMod {
  
  @JSImport("ag-grid/dist/lib/environment", "Environment")
  @js.native
  class Environment () extends StObject {
    
    /* private */ var eGridDiv: js.Any = js.native
    
    def getSassVariable(theme: String, key: String): Double = js.native
    
    def getTheme(): String = js.native
    
    /* private */ var gridSize: js.Any = js.native
    
    /* private */ var iconSize: js.Any = js.native
    
    def loadSassVariables(): Unit = js.native
    
    /* private */ var sassVariables: js.Any = js.native
  }
}
