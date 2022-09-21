package typings.angularCompilerCli

import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object referenceTaggerMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/shims/src/reference_tagger", "ShimReferenceTagger")
  @js.native
  open class ShimReferenceTagger protected () extends StObject {
    def this(shimExtensions: js.Array[String]) = this()
    
    /**
      * Whether shim tagging is currently being performed.
      */
    /* private */ var enabled: Any = js.native
    
    /* private */ var suffixes: Any = js.native
    
    /**
      * Tag `sf` with any needed references if it's not a shim itself.
      */
    def tag(sf: SourceFile): Unit = js.native
    
    /**
      * Tracks which original files have been processed and had shims generated if necessary.
      *
      * This is used to avoid generating shims twice for the same file.
      */
    /* private */ var tagged: Any = js.native
  }
}
