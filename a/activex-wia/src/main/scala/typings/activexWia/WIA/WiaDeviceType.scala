package typings.activexWia.WIA

import typings.activexWia.activexWiaNumbers.`0`
import typings.activexWia.activexWiaNumbers.`1`
import typings.activexWia.activexWiaNumbers.`2`
import typings.activexWia.activexWiaNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The WiaDeviceType enumeration specifies the type of device attached to a user's computer. Use the Type property on the DeviceInfo object or the Device
  * object to obtain these values from the device.
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexWia.activexWiaNumbers.`2`
  - typings.activexWia.activexWiaNumbers.`1`
  - typings.activexWia.activexWiaNumbers.`0`
  - typings.activexWia.activexWiaNumbers.`3`
*/
trait WiaDeviceType extends StObject
object WiaDeviceType {
  
  @scala.inline
  def CameraDeviceType: `2` = 2.asInstanceOf[`2`]
  
  @scala.inline
  def ScannerDeviceType: `1` = 1.asInstanceOf[`1`]
  
  @scala.inline
  def UnspecifiedDeviceType: `0` = 0.asInstanceOf[`0`]
  
  @scala.inline
  def VideoDeviceType: `3` = 3.asInstanceOf[`3`]
}
