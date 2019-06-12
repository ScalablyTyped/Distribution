package typings
package amazonDashConnectDashStreamsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connectNs {
  /**
    *
    * A callback to receive agent details
    *
    * @param agent An Agent object containing information about the currently
    * signed-in agent.
    */
  type AgentCallback = js.Function1[/* agent */ Agent, scala.Unit]
  type AttributeDictionary = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type CONNECTION_ACTIVE_STATES = org.scalablytyped.runtime.StringDictionary[scala.Double]
  /**
    *
    * A callback to receive contact details
    *
    * @param agent A Contact object containing information about the current contact.
    */
  type ContactCallback = js.Function1[/* contact */ Contact, scala.Unit]
  /**
    *
    * A callback to receive agent details
    *
    * @param agent An Agent object containing information about the currently
    * signed-in agent.
    */
  type MuteCallback = js.Function1[/* muteState */ MuteState, scala.Unit]
  /*
    * A callback to receive notifications of success or failure.
    */
  type SuccessFailCallback = js.Function0[scala.Unit]
}
