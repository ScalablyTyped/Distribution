package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscSourcemapsSrcContentOriginMod {
  
  @js.native
  sealed trait ContentOrigin extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/sourcemaps/src/content_origin", "ContentOrigin")
  @js.native
  object ContentOrigin extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ContentOrigin & Double] = js.native
    
    /**
      * The contents were loaded from the file-system, after being explicitly referenced or inferred
      * from the referring file.
      */
    @js.native
    sealed trait FileSystem
      extends StObject
         with ContentOrigin
    /* 2 */ val FileSystem: typings.angularCompilerCli.srcNgtscSourcemapsSrcContentOriginMod.ContentOrigin.FileSystem & Double = js.native
    
    /**
      * The contents were extracted directly form the contents of the referring file.
      */
    @js.native
    sealed trait Inline
      extends StObject
         with ContentOrigin
    /* 1 */ val Inline: typings.angularCompilerCli.srcNgtscSourcemapsSrcContentOriginMod.ContentOrigin.Inline & Double = js.native
    
    /**
      * The contents were provided programmatically when calling `loadSourceFile()`.
      */
    @js.native
    sealed trait Provided
      extends StObject
         with ContentOrigin
    /* 0 */ val Provided: typings.angularCompilerCli.srcNgtscSourcemapsSrcContentOriginMod.ContentOrigin.Provided & Double = js.native
  }
}
