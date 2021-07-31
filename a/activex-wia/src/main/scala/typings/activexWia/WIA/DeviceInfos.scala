package typings.activexWia.WIA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The DeviceInfos object is a collection of all the imaging devices currently connected to the computer. See the DeviceInfos property on the
  * DeviceManager object for detail on accessing the DeviceInfos object.
  */
@js.native
trait DeviceInfos extends StObject {
  
  def apply(Index: String): DeviceInfo = js.native
  /** Returns the specified item in the collection either by position or Device ID */
  def apply(Index: Double): DeviceInfo = js.native
  
  /** Returns the number of members in the collection */
  val Count: Double = js.native
  
  def Item(Index: String): DeviceInfo = js.native
  /** Returns the specified item in the collection either by position or Device ID */
  def Item(Index: Double): DeviceInfo = js.native
}
