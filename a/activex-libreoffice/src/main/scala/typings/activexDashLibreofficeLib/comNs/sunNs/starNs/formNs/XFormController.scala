package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is superseded by {@link com.sun.star.form.runtime.XFormController} .
  * @deprecated Deprecated
  */
trait XFormController
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabController {
  val CurrentControl: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl
  def addActivateListener(l: XFormControllerListener): scala.Unit
  def getCurrentControl(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl
  def removeActivateListener(l: XFormControllerListener): scala.Unit
}

