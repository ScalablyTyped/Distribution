package typings.asyncValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.asyncValidator.asyncValidatorStrings.string
  - typings.asyncValidator.asyncValidatorStrings.number
  - typings.asyncValidator.asyncValidatorStrings.boolean
  - typings.asyncValidator.asyncValidatorStrings.method
  - typings.asyncValidator.asyncValidatorStrings.regexp
  - typings.asyncValidator.asyncValidatorStrings.integer
  - typings.asyncValidator.asyncValidatorStrings.float
  - typings.asyncValidator.asyncValidatorStrings.array
  - typings.asyncValidator.asyncValidatorStrings.`object`
  - typings.asyncValidator.asyncValidatorStrings.enum
  - typings.asyncValidator.asyncValidatorStrings.date
  - typings.asyncValidator.asyncValidatorStrings.url
  - typings.asyncValidator.asyncValidatorStrings.hex
  - typings.asyncValidator.asyncValidatorStrings.email
  - typings.asyncValidator.asyncValidatorStrings.any
*/
trait RuleType extends js.Object

object RuleType {
  @scala.inline
  def any: typings.asyncValidator.asyncValidatorStrings.any = this.cast("any")
  @scala.inline
  def array: typings.asyncValidator.asyncValidatorStrings.array = this.cast("array")
  @scala.inline
  def boolean: typings.asyncValidator.asyncValidatorStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typings.asyncValidator.asyncValidatorStrings.date = this.cast("date")
  @scala.inline
  def email: typings.asyncValidator.asyncValidatorStrings.email = this.cast("email")
  @scala.inline
  def enum: typings.asyncValidator.asyncValidatorStrings.enum = this.cast("enum")
  @scala.inline
  def float: typings.asyncValidator.asyncValidatorStrings.float = this.cast("float")
  @scala.inline
  def hex: typings.asyncValidator.asyncValidatorStrings.hex = this.cast("hex")
  @scala.inline
  def integer: typings.asyncValidator.asyncValidatorStrings.integer = this.cast("integer")
  @scala.inline
  def method: typings.asyncValidator.asyncValidatorStrings.method = this.cast("method")
  @scala.inline
  def number: typings.asyncValidator.asyncValidatorStrings.number = this.cast("number")
  @scala.inline
  def `object`: typings.asyncValidator.asyncValidatorStrings.`object` = this.cast("object")
  @scala.inline
  def regexp: typings.asyncValidator.asyncValidatorStrings.regexp = this.cast("regexp")
  @scala.inline
  def string: typings.asyncValidator.asyncValidatorStrings.string = this.cast("string")
  @scala.inline
  def url: typings.asyncValidator.asyncValidatorStrings.url = this.cast("url")
}

