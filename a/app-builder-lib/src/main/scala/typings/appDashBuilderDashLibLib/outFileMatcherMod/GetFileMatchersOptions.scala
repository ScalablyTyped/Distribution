package typings
package appDashBuilderDashLibLib.outFileMatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileMatchersOptions extends js.Object {
  val customBuildOptions: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PlatformSpecificBuildOptions */ js.Any
  val defaultSrc: java.lang.String
  val globalOutDir: java.lang.String
  def macroExpander(pattern: java.lang.String): java.lang.String
}

object GetFileMatchersOptions {
  @scala.inline
  def apply(
    customBuildOptions: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PlatformSpecificBuildOptions */ js.Any,
    defaultSrc: java.lang.String,
    globalOutDir: java.lang.String,
    macroExpander: java.lang.String => java.lang.String
  ): GetFileMatchersOptions = {
    val __obj = js.Dynamic.literal(customBuildOptions = customBuildOptions, defaultSrc = defaultSrc, globalOutDir = globalOutDir, macroExpander = js.Any.fromFunction1(macroExpander))
  
    __obj.asInstanceOf[GetFileMatchersOptions]
  }
}

