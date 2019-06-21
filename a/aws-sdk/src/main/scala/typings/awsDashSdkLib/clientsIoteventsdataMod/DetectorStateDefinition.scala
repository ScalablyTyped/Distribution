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
    * The new values of the detector's timers. Any timer whose value isn't specified is cleared, and its timeout event won't occur.
    */
  var timers: TimerDefinitions
  /**
    * The new values of the detector's variables. Any variable whose value isn't specified is cleared.
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

