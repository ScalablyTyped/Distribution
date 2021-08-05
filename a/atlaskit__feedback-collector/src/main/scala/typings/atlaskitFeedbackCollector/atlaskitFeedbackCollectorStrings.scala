package typings.atlaskitFeedbackCollector

import typings.atlaskitFeedbackCollector.mod.SelectValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atlaskitFeedbackCollectorStrings {
  
  @js.native
  sealed trait bug
    extends StObject
       with SelectValue
  inline def bug: bug = "bug".asInstanceOf[bug]
  
  @js.native
  sealed trait comment
    extends StObject
       with SelectValue
  inline def comment: comment = "comment".asInstanceOf[comment]
  
  @js.native
  sealed trait empty
    extends StObject
       with SelectValue
  inline def empty: empty = "empty".asInstanceOf[empty]
  
  @js.native
  sealed trait question
    extends StObject
       with SelectValue
  inline def question: question = "question".asInstanceOf[question]
  
  @js.native
  sealed trait suggestion
    extends StObject
       with SelectValue
  inline def suggestion: suggestion = "suggestion".asInstanceOf[suggestion]
}
