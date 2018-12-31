package typings
package atAngularCompilerLib.srcRender3R3UnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor[Result] extends js.Object {
  var visit: js.UndefOr[js.Function1[/* node */ Node, Result]] = js.undefined
  def visitBoundAttribute(attribute: BoundAttribute): Result
  def visitBoundEvent(attribute: BoundEvent): Result
  def visitBoundText(text: BoundText): Result
  def visitContent(content: Content): Result
  def visitElement(element: Element): Result
  def visitIcu(icu: Icu): Result
  def visitReference(reference: Reference): Result
  def visitTemplate(template: Template): Result
  def visitText(text: Text): Result
  def visitTextAttribute(attribute: TextAttribute): Result
  def visitVariable(variable: Variable): Result
}

