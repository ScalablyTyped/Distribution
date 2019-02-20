package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link XControllerManager} gives access to the controllers of the drawing framework.
  *
  * The {@link XControllerManager} interface is typically implemented by the same object that implements {@link com.sun.star.frame.XController} .
  */
trait XControllerManager extends js.Object {
  /**
    * Return the {@link XConfigurationController} object.
    * @returns The returned reference is never empty.
    */
  val ConfigurationController: XConfigurationController
  /**
    * Return the {@link XModuleController} object.
    * @returns The returned reference is never empty.
    */
  val ModuleController: XModuleController
  /**
    * Return the {@link XConfigurationController} object.
    * @returns The returned reference is never empty.
    */
  def getConfigurationController(): XConfigurationController
  /**
    * Return the {@link XModuleController} object.
    * @returns The returned reference is never empty.
    */
  def getModuleController(): XModuleController
}

