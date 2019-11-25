package typings.atAngularCompiler

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileProviderMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Module extends js.Object {
  var module: CompileIdentifierMetadata
  var provider: CompileProviderMetadata
}

object Anon_Module {
  @scala.inline
  def apply(module: CompileIdentifierMetadata, provider: CompileProviderMetadata): Anon_Module = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Module]
  }
}

