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

object Visitor {
  @scala.inline
  def apply[Result](
    visitBoundAttribute: js.Function1[BoundAttribute, Result],
    visitBoundEvent: js.Function1[BoundEvent, Result],
    visitBoundText: js.Function1[BoundText, Result],
    visitContent: js.Function1[Content, Result],
    visitElement: js.Function1[Element, Result],
    visitIcu: js.Function1[Icu, Result],
    visitReference: js.Function1[Reference, Result],
    visitTemplate: js.Function1[Template, Result],
    visitText: js.Function1[Text, Result],
    visitTextAttribute: js.Function1[TextAttribute, Result],
    visitVariable: js.Function1[Variable, Result],
    visit: js.Function1[/* node */ Node, Result] = null
  ): Visitor[Result] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("visitBoundAttribute")(visitBoundAttribute)
    __obj.updateDynamic("visitBoundEvent")(visitBoundEvent)
    __obj.updateDynamic("visitBoundText")(visitBoundText)
    __obj.updateDynamic("visitContent")(visitContent)
    __obj.updateDynamic("visitElement")(visitElement)
    __obj.updateDynamic("visitIcu")(visitIcu)
    __obj.updateDynamic("visitReference")(visitReference)
    __obj.updateDynamic("visitTemplate")(visitTemplate)
    __obj.updateDynamic("visitText")(visitText)
    __obj.updateDynamic("visitTextAttribute")(visitTextAttribute)
    __obj.updateDynamic("visitVariable")(visitVariable)
    if (visit != null) __obj.updateDynamic("visit")(visit)
    __obj.asInstanceOf[Visitor[Result]]
  }
}

