package typings.appBuilderLib.fileMatcherMod

import typings.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileMatchersOptions extends js.Object {
  val customBuildOptions: PlatformSpecificBuildOptions
  val defaultSrc: String
  val globalOutDir: String
  def macroExpander(pattern: String): String
}

object GetFileMatchersOptions {
  @scala.inline
  def apply(
    customBuildOptions: PlatformSpecificBuildOptions,
    defaultSrc: String,
    globalOutDir: String,
    macroExpander: String => String
  ): GetFileMatchersOptions = {
    val __obj = js.Dynamic.literal(customBuildOptions = customBuildOptions.asInstanceOf[js.Any], defaultSrc = defaultSrc.asInstanceOf[js.Any], globalOutDir = globalOutDir.asInstanceOf[js.Any], macroExpander = js.Any.fromFunction1(macroExpander))
  
    __obj.asInstanceOf[GetFileMatchersOptions]
  }
}

