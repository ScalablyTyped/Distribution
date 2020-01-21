package typings.angularCompiler.r3FactoryMod

import typings.angularCompiler.compileMetadataMod.CompileTypeMetadata
import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_factory", "dependenciesFromGlobalMetadata")
@js.native
object dependenciesFromGlobalMetadata extends js.Object {
  def apply(`type`: CompileTypeMetadata, outputCtx: OutputContext, reflector: CompileReflector): js.Array[R3DependencyMetadata] = js.native
}

