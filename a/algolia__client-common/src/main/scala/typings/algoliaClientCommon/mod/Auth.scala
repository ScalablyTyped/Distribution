package typings.algoliaClientCommon.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth extends js.Object {
  /**
    * Returns the headers related to auth. Should be
    * merged to the transporter headers.
    */
  def headers(): Record[String, String]
  /**
    * Returns the query parameters related to auth. Should be
    * merged to the query parameters headers.
    */
  def queryParameters(): Record[String, String]
}

object Auth {
  @scala.inline
  def apply(headers: () => Record[String, String], queryParameters: () => Record[String, String]): Auth = {
    val __obj = js.Dynamic.literal(headers = js.Any.fromFunction0(headers), queryParameters = js.Any.fromFunction0(queryParameters))
  
    __obj.asInstanceOf[Auth]
  }
}

