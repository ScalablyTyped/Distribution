package typings
package annyangLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object annyangLibStrings {
  @js.native
  sealed trait end
    extends annyangLib.annyangMod.Events
  
  @js.native
  sealed trait error
    extends annyangLib.annyangMod.Events
  
  @js.native
  sealed trait errorNetwork
    extends annyangLib.annyangMod.Events
  
  @js.native
  sealed trait errorPermissionBlocked
    extends annyangLib.annyangMod.Events
  
  @js.native
  sealed trait errorPermissionDenied
    extends annyangLib.annyangMod.Events
  
  @js.native
  sealed trait result
    extends annyangLib.annyangMod.Events
  
  @js.native
  sealed trait resultMatch
    extends annyangLib.annyangMod.Events
  
  @js.native
  sealed trait resultNoMatch
    extends annyangLib.annyangMod.Events
  
  @js.native
  sealed trait soundstart
    extends annyangLib.annyangMod.Events
  
  @js.native
  sealed trait start
    extends annyangLib.annyangMod.Events
  
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

