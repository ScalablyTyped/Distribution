package typings
package atAngularCompilerLib.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileFactoryMetadata extends CompileIdentifierMetadata {
  var diDeps: js.Array[CompileDiDependencyMetadata]
}

object CompileFactoryMetadata {
  @scala.inline
  def apply(diDeps: js.Array[CompileDiDependencyMetadata], reference: js.Any): CompileFactoryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("diDeps")(diDeps)
    __obj.updateDynamic("reference")(reference)
    __obj.asInstanceOf[CompileFactoryMetadata]
  }
}

