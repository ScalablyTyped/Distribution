package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectorModelDefinition extends js.Object {
  /**
    * The state that is entered at the creation of each detector (instance).
    */
  var initialStateName: StateName
  /**
    * Information about the states of the detector.
    */
  var states: States
}

object DetectorModelDefinition {
  @scala.inline
  def apply(initialStateName: StateName, states: States): DetectorModelDefinition = {
    val __obj = js.Dynamic.literal(initialStateName = initialStateName, states = states)
  
    __obj.asInstanceOf[DetectorModelDefinition]
  }
}

