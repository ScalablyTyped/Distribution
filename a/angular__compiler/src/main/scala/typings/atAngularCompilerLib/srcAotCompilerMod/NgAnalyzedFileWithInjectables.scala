package typings
package atAngularCompilerLib.srcAotCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgAnalyzedFileWithInjectables extends js.Object {
  var fileName: java.lang.String
  var injectables: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileInjectableMetadata]
  var shallowModules: js.Array[
    atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileShallowModuleMetadata
  ]
}

object NgAnalyzedFileWithInjectables {
  @scala.inline
  def apply(
    fileName: java.lang.String,
    injectables: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileInjectableMetadata],
    shallowModules: js.Array[
      atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileShallowModuleMetadata
    ]
  ): NgAnalyzedFileWithInjectables = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("injectables")(injectables)
    __obj.updateDynamic("shallowModules")(shallowModules)
    __obj.asInstanceOf[NgAnalyzedFileWithInjectables]
  }
}

