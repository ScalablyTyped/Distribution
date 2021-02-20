package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxDeviceIds Class */
@js.native
trait FaxDeviceIds extends StObject {
  
  def apply(lIndex: Double): Double = js.native
  
  /** Add a device */
  def Add(lDeviceId: Double): Unit = js.native
  
  val Count: Double = js.native
  
  def Item(lIndex: Double): Double = js.native
  
  /** Remove a device */
  def Remove(lIndex: Double): Unit = js.native
  
  /** Set order of the device */
  def SetOrder(lDeviceId: Double, lNewOrder: Double): Unit = js.native
}
