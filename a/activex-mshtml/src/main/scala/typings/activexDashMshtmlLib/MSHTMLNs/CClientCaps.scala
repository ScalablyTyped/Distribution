package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.CClientCaps")
@js.native
class CClientCaps protected () extends js.Object {
  var `MSHTML.CClientCaps_typekey`: CClientCaps = js.native
  val availHeight: scala.Double = js.native
  val availWidth: scala.Double = js.native
  val bufferDepth: scala.Double = js.native
  val colorDepth: scala.Double = js.native
  val connectionSpeed: scala.Double = js.native
  val connectionType: java.lang.String = js.native
  val cookieEnabled: scala.Boolean = js.native
  val cpuClass: java.lang.String = js.native
  val height: scala.Double = js.native
  val javaEnabled: scala.Boolean = js.native
  val onLine: scala.Boolean = js.native
  val platform: java.lang.String = js.native
  val systemLanguage: java.lang.String = js.native
  val userLanguage: java.lang.String = js.native
  val width: scala.Double = js.native
  /** @param bStrVer [bStrVer=''] */
  def addComponentRequest(bstrName: java.lang.String, bstrURL: java.lang.String): scala.Unit = js.native
  /** @param bStrVer [bStrVer=''] */
  def addComponentRequest(bstrName: java.lang.String, bstrURL: java.lang.String, bStrVer: java.lang.String): scala.Unit = js.native
  def clearComponentRequest(): scala.Unit = js.native
  def compareVersions(bstrVer1: java.lang.String, bstrVer2: java.lang.String): scala.Double = js.native
  def doComponentRequest(): scala.Boolean = js.native
  def getComponentVersion(bstrName: java.lang.String, bstrURL: java.lang.String): java.lang.String = js.native
  /** @param bStrVer [bStrVer=''] */
  def isComponentInstalled(bstrName: java.lang.String, bstrURL: java.lang.String): scala.Boolean = js.native
  /** @param bStrVer [bStrVer=''] */
  def isComponentInstalled(bstrName: java.lang.String, bstrURL: java.lang.String, bStrVer: java.lang.String): scala.Boolean = js.native
}

