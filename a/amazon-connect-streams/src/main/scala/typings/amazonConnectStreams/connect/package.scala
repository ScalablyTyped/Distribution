package typings.amazonConnectStreams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connect {
  /**
    *
    * A callback to receive agent details
    *
    * @param agent An Agent object containing information about the currently
    * signed-in agent.
    */
  type AgentCallback = js.Function1[/* agent */ typings.amazonConnectStreams.connect.Agent, scala.Unit]
  type AttributeDictionary = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type CONNECTION_ACTIVE_STATES = org.scalablytyped.runtime.StringDictionary[scala.Double]
  /**
    *
    * A callback to receive contact details
    *
    * @param agent A Contact object containing information about the current contact.
    */
  type ContactCallback = js.Function1[/* contact */ typings.amazonConnectStreams.connect.Contact, scala.Unit]
  /**
    *
    * A callback to receive agent details
    *
    * @param agent An Agent object containing information about the currently
    * signed-in agent.
    */
  type MuteCallback = js.Function1[/* muteState */ typings.amazonConnectStreams.connect.MuteState, scala.Unit]
  /*
    * A callback to receive notifications of success or failure.
    */
  type SuccessFailCallback = js.Function0[scala.Unit]
}
