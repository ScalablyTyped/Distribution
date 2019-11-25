package typings.annyang.annyangMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.annyang.annyangStrings.start
  - typings.annyang.annyangStrings.soundstart
  - typings.annyang.annyangStrings.error
  - typings.annyang.annyangStrings.end
  - typings.annyang.annyangStrings.result
  - typings.annyang.annyangStrings.resultMatch
  - typings.annyang.annyangStrings.resultNoMatch
  - typings.annyang.annyangStrings.errorNetwork
  - typings.annyang.annyangStrings.errorPermissionBlocked
  - typings.annyang.annyangStrings.errorPermissionDenied
*/
trait Events extends js.Object

object Events {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def end: typings.annyang.annyangStrings.end = this.cast("end")
  @scala.inline
  def error: typings.annyang.annyangStrings.error = this.cast("error")
  @scala.inline
  def errorNetwork: typings.annyang.annyangStrings.errorNetwork = this.cast("errorNetwork")
  @scala.inline
  def errorPermissionBlocked: typings.annyang.annyangStrings.errorPermissionBlocked = this.cast("errorPermissionBlocked")
  @scala.inline
  def errorPermissionDenied: typings.annyang.annyangStrings.errorPermissionDenied = this.cast("errorPermissionDenied")
  @scala.inline
  def result: typings.annyang.annyangStrings.result = this.cast("result")
  @scala.inline
  def resultMatch: typings.annyang.annyangStrings.resultMatch = this.cast("resultMatch")
  @scala.inline
  def resultNoMatch: typings.annyang.annyangStrings.resultNoMatch = this.cast("resultNoMatch")
  @scala.inline
  def soundstart: typings.annyang.annyangStrings.soundstart = this.cast("soundstart")
  @scala.inline
  def start: typings.annyang.annyangStrings.start = this.cast("start")
}

