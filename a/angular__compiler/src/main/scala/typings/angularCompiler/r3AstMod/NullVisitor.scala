package typings.angularCompiler.r3AstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "NullVisitor")
@js.native
class NullVisitor () extends Visitor[Unit] {
  /* CompleteClass */
  override def visitBoundAttribute(attribute: BoundAttribute): Unit = js.native
  /* CompleteClass */
  override def visitBoundEvent(attribute: BoundEvent): Unit = js.native
  /* CompleteClass */
  override def visitBoundText(text: BoundText): Unit = js.native
  /* CompleteClass */
  override def visitContent(content: Content): Unit = js.native
  /* CompleteClass */
  override def visitElement(element: Element): Unit = js.native
  /* CompleteClass */
  override def visitIcu(icu: Icu): Unit = js.native
  /* CompleteClass */
  override def visitReference(reference: Reference): Unit = js.native
  /* CompleteClass */
  override def visitTemplate(template: Template): Unit = js.native
  /* CompleteClass */
  override def visitText(text: Text): Unit = js.native
  /* CompleteClass */
  override def visitTextAttribute(attribute: TextAttribute): Unit = js.native
  /* CompleteClass */
  override def visitVariable(variable: Variable): Unit = js.native
}

