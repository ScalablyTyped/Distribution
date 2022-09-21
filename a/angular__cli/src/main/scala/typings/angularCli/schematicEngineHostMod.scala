package typings.angularCli

import typings.angularCli.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicEngineHostMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeModulesEngineHost * / any */ @JSImport("@angular/cli/src/command-builder/utilities/schematic-engine-host", "SchematicEngineHost")
  @js.native
  open class SchematicEngineHost () extends StObject {
    
    /* protected */ def _resolveReferenceString(refString: String, parentPath: String): Path | Null = js.native
    /* protected */ def _resolveReferenceString(
      refString: String,
      parentPath: String,
      collectionDescription: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileSystemCollectionDesc */ Any
    ): Path | Null = js.native
  }
}
