package typings.atlaskitFeedbackCollector

import typings.atlaskitFeedbackCollector.mod.SelectValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atlaskitFeedbackCollectorStrings {
  @js.native
  sealed trait bug extends SelectValue
  
  @js.native
  sealed trait comment extends SelectValue
  
  @js.native
  sealed trait empty extends SelectValue
  
  @js.native
  sealed trait question extends SelectValue
  
  @js.native
  sealed trait suggestion extends SelectValue
  
  @scala.inline
  def bug: bug = "bug".asInstanceOf[bug]
  @scala.inline
  def comment: comment = "comment".asInstanceOf[comment]
  @scala.inline
  def empty: empty = "empty".asInstanceOf[empty]
  @scala.inline
  def question: question = "question".asInstanceOf[question]
  @scala.inline
  def suggestion: suggestion = "suggestion".asInstanceOf[suggestion]
}

