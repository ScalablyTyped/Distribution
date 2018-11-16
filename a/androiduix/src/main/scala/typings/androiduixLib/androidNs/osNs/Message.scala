package typings
package androiduixLib.androidNs.osNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.os.Message")
@js.native
class Message () extends js.Object {
  var arg1: scala.Double = js.native
  var arg2: scala.Double = js.native
  var callback: androiduixLib.javaNs.langNs.Runnable = js.native
  var mType: js.Any = js.native
  var obj: js.Any = js.native
  var target: Handler = js.native
  var what: scala.Double = js.native
  var when: scala.Double = js.native
  /* protected */ def clearForRecycle(): scala.Unit = js.native
  def copyFrom(o: Message): scala.Unit = js.native
  def getTarget(): Handler = js.native
  def recycle(): scala.Unit = js.native
  def sendToTarget(): scala.Unit = js.native
  def setTarget(target: Handler): scala.Unit = js.native
  def toString(now: scala.Double): java.lang.String = js.native
}

@JSGlobal("android.os.Message")
@js.native
object Message extends js.Object {
  var Type_Normal: scala.Double = js.native
  var Type_Traversal: scala.Double = js.native
  var sPool: js.Any = js.native
  def obtain(): androiduixLib.androidNs.osNs.Message = js.native
  def obtain(h: androiduixLib.androidNs.osNs.Handler): androiduixLib.androidNs.osNs.Message = js.native
  def obtain(h: androiduixLib.androidNs.osNs.Handler, callback: androiduixLib.javaNs.langNs.Runnable): androiduixLib.androidNs.osNs.Message = js.native
  def obtain(h: androiduixLib.androidNs.osNs.Handler, what: scala.Double): androiduixLib.androidNs.osNs.Message = js.native
  def obtain(
    h: androiduixLib.androidNs.osNs.Handler,
    what: scala.Double,
    arg1: scala.Double,
    arg2: scala.Double
  ): androiduixLib.androidNs.osNs.Message = js.native
  def obtain(
    h: androiduixLib.androidNs.osNs.Handler,
    what: scala.Double,
    arg1: scala.Double,
    arg2: scala.Double,
    obj: js.Any
  ): androiduixLib.androidNs.osNs.Message = js.native
  def obtain(h: androiduixLib.androidNs.osNs.Handler, what: scala.Double, obj: js.Any): androiduixLib.androidNs.osNs.Message = js.native
  def obtain(orig: androiduixLib.androidNs.osNs.Message): androiduixLib.androidNs.osNs.Message = js.native
}

