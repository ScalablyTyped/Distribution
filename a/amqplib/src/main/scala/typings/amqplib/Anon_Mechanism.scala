package typings.amqplib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mechanism extends js.Object {
  var mechanism: String
  def response(): Buffer
}

object Anon_Mechanism {
  @scala.inline
  def apply(mechanism: String, response: () => Buffer): Anon_Mechanism = {
    val __obj = js.Dynamic.literal(mechanism = mechanism, response = js.Any.fromFunction0(response))
  
    __obj.asInstanceOf[Anon_Mechanism]
  }
}

