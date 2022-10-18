package typings.angularDevkitSchematics

import typings.angularDevkitCore.mod.BaseException
import typings.angularDevkitSchematics.srcEngineInterfaceMod.Collection
import typings.angularDevkitSchematics.srcEngineInterfaceMod.Engine
import typings.angularDevkitSchematics.srcEngineInterfaceMod.RuleFactory
import typings.angularDevkitSchematics.srcEngineInterfaceMod.Schematic
import typings.angularDevkitSchematics.srcEngineInterfaceMod.SchematicDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEngineSchematicMod {
  
  @JSImport("@angular-devkit/schematics/src/engine/schematic", "InvalidSchematicsNameException")
  @js.native
  open class InvalidSchematicsNameException protected () extends BaseException {
    def this(name: String) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine/schematic", "SchematicImpl")
  @js.native
  open class SchematicImpl[CollectionT /* <: js.Object */, SchematicT /* <: js.Object */] protected ()
    extends StObject
       with Schematic[CollectionT, SchematicT] {
    def this(
      _description: SchematicDescription[CollectionT, SchematicT],
      _factory: RuleFactory[js.Object],
      _collection: Collection[CollectionT, SchematicT],
      _engine: Engine[CollectionT, SchematicT]
    ) = this()
    
    /* private */ var _collection: Any = js.native
    
    /* private */ var _description: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _factory: Any = js.native
    
    @JSName("collection")
    def collection_MSchematicImpl: Collection[CollectionT, SchematicT] = js.native
    
    @JSName("description")
    def description_MSchematicImpl: SchematicDescription[CollectionT, SchematicT] = js.native
  }
}
