package typings.angularCompiler

import typings.angularCompiler.outputAstMod.JSDocTagName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object angularCompilerStrings {
  @js.native
  sealed trait desc extends JSDocTagName
  
  @js.native
  sealed trait directiveInject extends js.Object
  
  @js.native
  sealed trait id extends JSDocTagName
  
  @js.native
  sealed trait inject extends js.Object
  
  @js.native
  sealed trait invalid extends js.Object
  
  @js.native
  sealed trait meaning extends JSDocTagName
  
  @js.native
  sealed trait ngtsc extends js.Object
  
  @js.native
  sealed trait root extends js.Object
  
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  @scala.inline
  def directiveInject: directiveInject = "directiveInject".asInstanceOf[directiveInject]
  @scala.inline
  def id: id = "id".asInstanceOf[id]
  @scala.inline
  def inject: inject = "inject".asInstanceOf[inject]
  @scala.inline
  def invalid: invalid = "invalid".asInstanceOf[invalid]
  @scala.inline
  def meaning: meaning = "meaning".asInstanceOf[meaning]
  @scala.inline
  def ngtsc: ngtsc = "ngtsc".asInstanceOf[ngtsc]
  @scala.inline
  def root: root = "root".asInstanceOf[root]
}

