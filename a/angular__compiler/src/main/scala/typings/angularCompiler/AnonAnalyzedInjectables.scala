package typings.angularCompiler

import typings.angularCompiler.compilerMod.NgAnalyzedFileWithInjectables
import typings.angularCompiler.compilerMod.NgAnalyzedModules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnalyzedInjectables extends js.Object {
  var analyzedInjectables: js.Array[NgAnalyzedFileWithInjectables]
  var analyzedModules: NgAnalyzedModules
}

object AnonAnalyzedInjectables {
  @scala.inline
  def apply(analyzedInjectables: js.Array[NgAnalyzedFileWithInjectables], analyzedModules: NgAnalyzedModules): AnonAnalyzedInjectables = {
    val __obj = js.Dynamic.literal(analyzedInjectables = analyzedInjectables.asInstanceOf[js.Any], analyzedModules = analyzedModules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnalyzedInjectables]
  }
}

