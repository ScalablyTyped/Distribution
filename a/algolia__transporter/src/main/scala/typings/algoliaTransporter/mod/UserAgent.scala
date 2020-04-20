package typings.algoliaTransporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgent extends js.Object {
  /**
    * The raw value of the user agent.
    *
    * @readonly
    */
  var value: String
  /**
    * Mutates the current user agent ading the given user agent options.
    */
  def add(options: UserAgentOptions): UserAgent
}

object UserAgent {
  @scala.inline
  def apply(add: UserAgentOptions => UserAgent, value: String): UserAgent = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgent]
  }
}

