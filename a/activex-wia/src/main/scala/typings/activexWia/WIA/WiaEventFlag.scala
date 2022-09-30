package typings.activexWia.WIA

import typings.activexWia.activexWiaInts.`1`
import typings.activexWia.activexWiaInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A DeviceEvent's type is composed of bits from the WiaEventFlags enumeration. You can test a DeviceEvent's type by using the AND operation with
  * DeviceEvent.Type and a member from the WiaEventFlags enumeration.
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexWia.activexWiaInts.`2`
  - typings.activexWia.activexWiaInts.`1`
*/
trait WiaEventFlag extends StObject
object WiaEventFlag {
  
  inline def ActionEvent: `2` = 2.asInstanceOf[`2`]
  
  inline def NotificationEvent: `1` = 1.asInstanceOf[`1`]
}
