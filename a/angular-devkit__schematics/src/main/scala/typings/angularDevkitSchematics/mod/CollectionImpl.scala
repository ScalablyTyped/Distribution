package typings.angularDevkitSchematics.mod

import typings.angularDevkitSchematics.srcEngineInterfaceMod.CollectionDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular-devkit/schematics", "CollectionImpl")
@js.native
open class CollectionImpl[CollectionT /* <: js.Object */, SchematicT /* <: js.Object */] protected ()
  extends typings.angularDevkitSchematics.srcEngineMod.CollectionImpl[CollectionT, SchematicT] {
  def this(
    _description: CollectionDescription[CollectionT],
    _engine: typings.angularDevkitSchematics.srcEngineEngineMod.SchematicEngine[CollectionT, SchematicT]
  ) = this()
  def this(
    _description: CollectionDescription[CollectionT],
    _engine: typings.angularDevkitSchematics.srcEngineEngineMod.SchematicEngine[CollectionT, SchematicT],
    baseDescriptions: js.Array[CollectionDescription[CollectionT]]
  ) = this()
}
