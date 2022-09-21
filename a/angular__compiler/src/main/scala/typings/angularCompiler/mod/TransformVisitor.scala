package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformVisitor
  extends StObject
     with Visitor3[TmplAstNode]
object TransformVisitor {
  
  inline def apply(
    visitBoundAttribute: TmplAstBoundAttribute => TmplAstNode,
    visitBoundEvent: TmplAstBoundEvent => TmplAstNode,
    visitBoundText: TmplAstBoundText => TmplAstNode,
    visitContent: TmplAstContent => TmplAstNode,
    visitElement: TmplAstElement => TmplAstNode,
    visitIcu: TmplAstIcu => TmplAstNode,
    visitReference: TmplAstReference => TmplAstNode,
    visitTemplate: TmplAstTemplate => TmplAstNode,
    visitText: TmplAstText => TmplAstNode,
    visitTextAttribute: TmplAstTextAttribute => TmplAstNode,
    visitVariable: TmplAstVariable => TmplAstNode
  ): TransformVisitor = {
    val __obj = js.Dynamic.literal(visitBoundAttribute = js.Any.fromFunction1(visitBoundAttribute), visitBoundEvent = js.Any.fromFunction1(visitBoundEvent), visitBoundText = js.Any.fromFunction1(visitBoundText), visitContent = js.Any.fromFunction1(visitContent), visitElement = js.Any.fromFunction1(visitElement), visitIcu = js.Any.fromFunction1(visitIcu), visitReference = js.Any.fromFunction1(visitReference), visitTemplate = js.Any.fromFunction1(visitTemplate), visitText = js.Any.fromFunction1(visitText), visitTextAttribute = js.Any.fromFunction1(visitTextAttribute), visitVariable = js.Any.fromFunction1(visitVariable))
    __obj.asInstanceOf[TransformVisitor]
  }
}
