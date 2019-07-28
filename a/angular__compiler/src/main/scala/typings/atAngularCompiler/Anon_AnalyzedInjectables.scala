package typings.atAngularCompiler

import typings.atAngularCompiler.srcAotCompilerMod.NgAnalyzedFileWithInjectables
import typings.atAngularCompiler.srcAotCompilerMod.NgAnalyzedModules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnalyzedInjectables extends js.Object {
  var analyzedInjectables: js.Array[NgAnalyzedFileWithInjectables]
  var analyzedModules: NgAnalyzedModules
}

object Anon_AnalyzedInjectables {
  @scala.inline
  def apply(analyzedInjectables: js.Array[NgAnalyzedFileWithInjectables], analyzedModules: NgAnalyzedModules): Anon_AnalyzedInjectables = {
    val __obj = js.Dynamic.literal(analyzedInjectables = analyzedInjectables, analyzedModules = analyzedModules)
  
    __obj.asInstanceOf[Anon_AnalyzedInjectables]
  }
}

