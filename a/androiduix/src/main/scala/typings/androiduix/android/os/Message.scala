package typings.androiduix.android.os

import typings.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends js.Object {
  
  var arg1: Double = js.native
  
  var arg2: Double = js.native
  
  var callback: Runnable = js.native
  
  /* protected */ def clearForRecycle(): Unit = js.native
  
  def copyFrom(o: Message): Unit = js.native
  
  def getTarget(): Handler = js.native
  
  var mType: js.Any = js.native
  
  var obj: js.Any = js.native
  
  def recycle(): Unit = js.native
  
  def sendToTarget(): Unit = js.native
  
  def setTarget(target: Handler): Unit = js.native
  
  var target: Handler = js.native
  
  def toString(now: Double): String = js.native
  
  var what: Double = js.native
  
  var when: Double = js.native
}
