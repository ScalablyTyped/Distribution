package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnalyzedInjectables extends js.Object {
  var analyzedInjectables: js.Array[atAngularCompilerLib.srcAotCompilerMod.NgAnalyzedFileWithInjectables]
  var analyzedModules: atAngularCompilerLib.srcAotCompilerMod.NgAnalyzedModules
}

object Anon_AnalyzedInjectables {
  @scala.inline
  def apply(
    analyzedInjectables: js.Array[atAngularCompilerLib.srcAotCompilerMod.NgAnalyzedFileWithInjectables],
    analyzedModules: atAngularCompilerLib.srcAotCompilerMod.NgAnalyzedModules
  ): Anon_AnalyzedInjectables = {
    val __obj = js.Dynamic.literal(analyzedInjectables = analyzedInjectables, analyzedModules = analyzedModules)
  
    __obj.asInstanceOf[Anon_AnalyzedInjectables]
  }
}

