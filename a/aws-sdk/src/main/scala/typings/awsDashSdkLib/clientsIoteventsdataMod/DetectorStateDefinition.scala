package typings
package awsDashSdkLib.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectorStateDefinition extends js.Object {
  /**
    * The name of the new state of the detector (instance).
    */
  var stateName: StateName
  /**
    * The new values of the detector's timers. Any timer whose value is not specified will be cleared and its timeout event will not occur.
    */
  var timers: TimerDefinitions
  /**
    * The new values of the detector's variables. Any variable whose value is not specified will be cleared.
    */
  var variables: VariableDefinitions
}

object DetectorStateDefinition {
  @scala.inline
  def apply(stateName: StateName, timers: TimerDefinitions, variables: VariableDefinitions): DetectorStateDefinition = {
    val __obj = js.Dynamic.literal(stateName = stateName, timers = timers, variables = variables)
  
    __obj.asInstanceOf[DetectorStateDefinition]
  }
}

