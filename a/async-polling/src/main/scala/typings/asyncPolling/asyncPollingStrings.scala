package typings.asyncPolling

import typings.asyncPolling.mod.EventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncPollingStrings {
  
  @js.native
  sealed trait end extends EventName
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error extends EventName
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait result extends EventName
  @scala.inline
  def result: result = "result".asInstanceOf[result]
  
  @js.native
  sealed trait run extends EventName
  @scala.inline
  def run: run = "run".asInstanceOf[run]
  
  @js.native
  sealed trait schedule extends EventName
  @scala.inline
  def schedule: schedule = "schedule".asInstanceOf[schedule]
  
  @js.native
  sealed trait start extends EventName
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait stop extends EventName
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
}
