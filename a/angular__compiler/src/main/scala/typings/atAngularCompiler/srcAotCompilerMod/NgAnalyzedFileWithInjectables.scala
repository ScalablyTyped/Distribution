package typings.atAngularCompiler.srcAotCompilerMod

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileInjectableMetadata
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileShallowModuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgAnalyzedFileWithInjectables extends js.Object {
  var fileName: String
  var injectables: js.Array[CompileInjectableMetadata]
  var shallowModules: js.Array[CompileShallowModuleMetadata]
}

object NgAnalyzedFileWithInjectables {
  @scala.inline
  def apply(
    fileName: String,
    injectables: js.Array[CompileInjectableMetadata],
    shallowModules: js.Array[CompileShallowModuleMetadata]
  ): NgAnalyzedFileWithInjectables = {
    val __obj = js.Dynamic.literal(fileName = fileName, injectables = injectables, shallowModules = shallowModules)
  
    __obj.asInstanceOf[NgAnalyzedFileWithInjectables]
  }
}

