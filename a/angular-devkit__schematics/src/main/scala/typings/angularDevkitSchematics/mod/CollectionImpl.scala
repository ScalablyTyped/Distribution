package typings.angularDevkitSchematics.mod

import typings.angularDevkitSchematics.interfaceMod.CollectionDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular-devkit/schematics", "CollectionImpl")
@js.native
open class CollectionImpl[CollectionT /* <: js.Object */, SchematicT /* <: js.Object */] protected ()
  extends typings.angularDevkitSchematics.engineMod.CollectionImpl[CollectionT, SchematicT] {
  def this(
    _description: CollectionDescription[CollectionT],
    _engine: typings.angularDevkitSchematics.engineEngineMod.SchematicEngine[CollectionT, SchematicT]
  ) = this()
  def this(
    _description: CollectionDescription[CollectionT],
    _engine: typings.angularDevkitSchematics.engineEngineMod.SchematicEngine[CollectionT, SchematicT],
    baseDescriptions: js.Array[CollectionDescription[CollectionT]]
  ) = this()
}
