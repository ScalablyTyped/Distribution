package typings.annyang

import typings.annyang.annyangMod.Events
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object annyangStrings {
  @js.native
  sealed trait end extends Events
  
  @js.native
  sealed trait error extends Events
  
  @js.native
  sealed trait errorNetwork extends Events
  
  @js.native
  sealed trait errorPermissionBlocked extends Events
  
  @js.native
  sealed trait errorPermissionDenied extends Events
  
  @js.native
  sealed trait result extends Events
  
  @js.native
  sealed trait resultMatch extends Events
  
  @js.native
  sealed trait resultNoMatch extends Events
  
  @js.native
  sealed trait soundstart extends Events
  
  @js.native
  sealed trait start extends Events
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def errorNetwork: errorNetwork = "errorNetwork".asInstanceOf[errorNetwork]
  @scala.inline
  def errorPermissionBlocked: errorPermissionBlocked = "errorPermissionBlocked".asInstanceOf[errorPermissionBlocked]
  @scala.inline
  def errorPermissionDenied: errorPermissionDenied = "errorPermissionDenied".asInstanceOf[errorPermissionDenied]
  @scala.inline
  def result: result = "result".asInstanceOf[result]
  @scala.inline
  def resultMatch: resultMatch = "resultMatch".asInstanceOf[resultMatch]
  @scala.inline
  def resultNoMatch: resultNoMatch = "resultNoMatch".asInstanceOf[resultNoMatch]
  @scala.inline
  def soundstart: soundstart = "soundstart".asInstanceOf[soundstart]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
}

