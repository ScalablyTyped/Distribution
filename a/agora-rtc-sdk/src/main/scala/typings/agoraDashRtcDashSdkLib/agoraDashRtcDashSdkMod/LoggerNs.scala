package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agora-rtc-sdk", "Logger")
@js.native
object LoggerNs extends js.Object {
  def debug(args: js.Any): scala.Unit = js.native
  def error(args: js.Any): scala.Unit = js.native
  def info(args: js.Any): scala.Unit = js.native
  def log(args: js.Any): scala.Unit = js.native
  def setLogLevel(level: DEBUG): scala.Unit = js.native
  def setLogLevel(level: INFO): scala.Unit = js.native
  def setLogLevel(level: NONE): scala.Unit = js.native
  def setLogLevel(level: WARNING): scala.Unit = js.native
  def warning(args: js.Any): scala.Unit = js.native
  /*~ For example, given this definition, someone could write:
       *~   import { subProp } from 'yourModule';
       *~   subProp.foo();
       *~ or
       *~   import * as yourMod from 'yourModule';
       *~   yourMod.subProp.foo();
       */
  type DEBUG = agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`0`
  type ERROR = agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`3`
  type INFO = agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`1`
  type NONE = agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`4`
  type WARNING = agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`2`
}

