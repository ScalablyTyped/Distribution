package typings.angularCompilerCli

import typings.babelCore.mod.BabelFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Augment some Babel types to add symbols that we rely on, but are not included in the Babel typings.
  */
object babelTraverseMod {
  
  trait Hub extends StObject {
    
    var file: BabelFile
  }
  object Hub {
    
    inline def apply(file: BabelFile): Hub = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hub]
    }
    
    extension [Self <: Hub](x: Self) {
      
      inline def setFile(value: BabelFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
}
