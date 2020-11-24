package typings.arangodb.Foxx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schema extends js.Object {
  
  def validate[T](value: T): ValidationResult[T] = js.native
  def validate[T](value: T, options: js.Any): ValidationResult[T] = js.native
}
