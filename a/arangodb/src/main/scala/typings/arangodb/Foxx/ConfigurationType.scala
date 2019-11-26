package typings.arangodb.Foxx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.arangodb.arangodbStrings.integer
  - typings.arangodb.arangodbStrings.boolean
  - typings.arangodb.arangodbStrings.string
  - typings.arangodb.arangodbStrings.number
  - typings.arangodb.arangodbStrings.json
  - typings.arangodb.arangodbStrings.password
  - typings.arangodb.arangodbStrings.int
  - typings.arangodb.arangodbStrings.bool
*/
trait ConfigurationType extends js.Object

object ConfigurationType {
  @scala.inline
  def bool: typings.arangodb.arangodbStrings.bool = this.cast("bool")
  @scala.inline
  def boolean: typings.arangodb.arangodbStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def int: typings.arangodb.arangodbStrings.int = this.cast("int")
  @scala.inline
  def integer: typings.arangodb.arangodbStrings.integer = this.cast("integer")
  @scala.inline
  def json: typings.arangodb.arangodbStrings.json = this.cast("json")
  @scala.inline
  def number: typings.arangodb.arangodbStrings.number = this.cast("number")
  @scala.inline
  def password: typings.arangodb.arangodbStrings.password = this.cast("password")
  @scala.inline
  def string: typings.arangodb.arangodbStrings.string = this.cast("string")
}

