package typings.appBuilderLib

import typings.appBuilderLib.packagerMod.Packager
import typings.builderUtil.fsMod.Filter
import typings.fsExtra.mod.Stats
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appFileWalkerMod {
  
  @JSImport("app-builder-lib/out/util/AppFileWalker", "FileCopyHelper")
  @js.native
  abstract class FileCopyHelper protected () extends StObject {
    /* protected */ def this(
      matcher: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileMatcher */ Any,
      filter: Null,
      packager: Packager
    ) = this()
    /* protected */ def this(
      matcher: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileMatcher */ Any,
      filter: Filter,
      packager: Packager
    ) = this()
    
    val filter: Filter | Null = js.native
    
    /* protected */ def handleFile(file: String, parent: String, fileStat: Stats): (js.Promise[Stats | Null]) | Null = js.native
    
    /* private */ var handleSymlink: Any = js.native
    
    /* protected */ val matcher: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileMatcher */ Any = js.native
    
    val metadata: Map[String, Stats] = js.native
    
    /* protected */ val packager: Packager = js.native
  }
}
