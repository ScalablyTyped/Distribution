package typings.angularDevkitSchematics.mod

import typings.angularDevkitSchematics.interfaceMod.Collection
import typings.angularDevkitSchematics.interfaceMod.Engine
import typings.angularDevkitSchematics.interfaceMod.RuleFactory
import typings.angularDevkitSchematics.interfaceMod.SchematicDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular-devkit/schematics", "SchematicImpl")
@js.native
open class SchematicImpl[CollectionT /* <: js.Object */, SchematicT /* <: js.Object */] protected ()
  extends typings.angularDevkitSchematics.engineMod.SchematicImpl[CollectionT, SchematicT] {
  def this(
    _description: SchematicDescription[CollectionT, SchematicT],
    _factory: RuleFactory[js.Object],
    _collection: Collection[CollectionT, SchematicT],
    _engine: Engine[CollectionT, SchematicT]
  ) = this()
}
