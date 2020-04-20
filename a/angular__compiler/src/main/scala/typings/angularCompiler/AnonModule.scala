package typings.angularCompiler

import typings.angularCompiler.compileMetadataMod.CompileIdentifierMetadata
import typings.angularCompiler.compileMetadataMod.CompileProviderMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonModule extends js.Object {
  var module: CompileIdentifierMetadata
  var provider: CompileProviderMetadata
}

object AnonModule {
  @scala.inline
  def apply(module: CompileIdentifierMetadata, provider: CompileProviderMetadata): AnonModule = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonModule]
  }
}

