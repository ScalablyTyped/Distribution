package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.CClientCaps")
@js.native
class CClientCaps protected () extends js.Object {
  @JSName("MSHTML.CClientCaps_typekey")
  var MSHTMLDotCClientCaps_typekey: CClientCaps = js.native
  val availHeight: Double = js.native
  val availWidth: Double = js.native
  val bufferDepth: Double = js.native
  val colorDepth: Double = js.native
  val connectionSpeed: Double = js.native
  val connectionType: String = js.native
  val cookieEnabled: Boolean = js.native
  val cpuClass: String = js.native
  val height: Double = js.native
  val javaEnabled: Boolean = js.native
  val onLine: Boolean = js.native
  val platform: String = js.native
  val systemLanguage: String = js.native
  val userLanguage: String = js.native
  val width: Double = js.native
  /** @param bStrVer [bStrVer=''] */
  def addComponentRequest(bstrName: String, bstrURL: String): Unit = js.native
  def addComponentRequest(bstrName: String, bstrURL: String, bStrVer: String): Unit = js.native
  def clearComponentRequest(): Unit = js.native
  def compareVersions(bstrVer1: String, bstrVer2: String): Double = js.native
  def doComponentRequest(): Boolean = js.native
  def getComponentVersion(bstrName: String, bstrURL: String): String = js.native
  /** @param bStrVer [bStrVer=''] */
  def isComponentInstalled(bstrName: String, bstrURL: String): Boolean = js.native
  def isComponentInstalled(bstrName: String, bstrURL: String, bStrVer: String): Boolean = js.native
}

