package typings.angularCore.ngComponentTemplateMod

import typings.angularCore.AnonCharacter
import typings.typescript.mod.ClassDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedTemplate extends js.Object {
  /** Class declaration that contains this template. */
  var container: ClassDeclaration
  /** File content of the given template. */
  var content: String
  /** Path to the file that contains this template. */
  var filePath: String
  /** Whether the given template is inline or not. */
  var `inline`: Boolean
  /** Start offset of the template content (e.g. in the inline source file) */
  var start: Double
  /**
    * Gets the character and line of a given position index in the template.
    * If the template is declared inline within a TypeScript source file, the line and
    * character are based on the full source file content.
    */
  def getCharacterAndLineOfPosition(pos: Double): AnonCharacter
}

object ResolvedTemplate {
  @scala.inline
  def apply(
    container: ClassDeclaration,
    content: String,
    filePath: String,
    getCharacterAndLineOfPosition: Double => AnonCharacter,
    `inline`: Boolean,
    start: Double
  ): ResolvedTemplate = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], getCharacterAndLineOfPosition = js.Any.fromFunction1(getCharacterAndLineOfPosition), start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedTemplate]
  }
}

