package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.testNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XUIObject extends js.Object {
  val Children: activexDashInteropLib.SafeArray[java.lang.String]
  val State: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  val Type: java.lang.String
  def executeAction(
    action: java.lang.String,
    propValues: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  ): scala.Unit
  def getChild(id: java.lang.String): XUIObject
  def getChildren(): activexDashInteropLib.SafeArray[java.lang.String]
  def getState(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  def getType(): java.lang.String
}

