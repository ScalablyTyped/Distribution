package typings.atAngularCompiler.srcRender3R3UnderscoreAstMod

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

object Visitor {
  @scala.inline
  def apply[Result](
    visitBoundAttribute: BoundAttribute => Result,
    visitBoundEvent: BoundEvent => Result,
    visitBoundText: BoundText => Result,
    visitContent: Content => Result,
    visitElement: Element => Result,
    visitIcu: Icu => Result,
    visitReference: Reference => Result,
    visitTemplate: Template => Result,
    visitText: Text => Result,
    visitTextAttribute: TextAttribute => Result,
    visitVariable: Variable => Result,
    visit: /* node */ Node => Result = null
  ): Visitor[Result] = {
    val __obj = js.Dynamic.literal(visitBoundAttribute = js.Any.fromFunction1(visitBoundAttribute), visitBoundEvent = js.Any.fromFunction1(visitBoundEvent), visitBoundText = js.Any.fromFunction1(visitBoundText), visitContent = js.Any.fromFunction1(visitContent), visitElement = js.Any.fromFunction1(visitElement), visitIcu = js.Any.fromFunction1(visitIcu), visitReference = js.Any.fromFunction1(visitReference), visitTemplate = js.Any.fromFunction1(visitTemplate), visitText = js.Any.fromFunction1(visitText), visitTextAttribute = js.Any.fromFunction1(visitTextAttribute), visitVariable = js.Any.fromFunction1(visitVariable))
    if (visit != null) __obj.updateDynamic("visit")(js.Any.fromFunction1(visit))
    __obj.asInstanceOf[Visitor[Result]]
  }
}

