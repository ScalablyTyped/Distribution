package typings.amplitudeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("amplitude-js", "Identify")
@js.native
class Identify_ () extends js.Object {
  
  def add(key: String, value: String): Identify_ = js.native
  /** increment a user property by a given value (can also be negative to decrement). */
  def add(key: String, value: Double): Identify_ = js.native
  
  def append(key: String, value: String): Identify_ = js.native
  def append(key: String, value: js.Array[_]): Identify_ = js.native
  def append(key: String, value: js.Object): Identify_ = js.native
  /** Append a value or values to a user property */
  def append(key: String, value: Double): Identify_ = js.native
  
  def prepend(key: String, value: String): Identify_ = js.native
  def prepend(key: String, value: js.Array[_]): Identify_ = js.native
  def prepend(key: String, value: js.Object): Identify_ = js.native
  /** Prepend a value or values to a user property */
  def prepend(key: String, value: Boolean): Identify_ = js.native
  def prepend(key: String, value: Double): Identify_ = js.native
  
  def set(key: String, value: String): Identify_ = js.native
  def set(key: String, value: js.Array[_]): Identify_ = js.native
  def set(key: String, value: js.Object): Identify_ = js.native
  /** Sets the value of a given user property */
  def set(key: String, value: Boolean): Identify_ = js.native
  def set(key: String, value: Double): Identify_ = js.native
  
  def setOnce(key: String, value: String): Identify_ = js.native
  def setOnce(key: String, value: js.Array[_]): Identify_ = js.native
  def setOnce(key: String, value: js.Object): Identify_ = js.native
  /** Sets the value of a given user property only once */
  def setOnce(key: String, value: Boolean): Identify_ = js.native
  def setOnce(key: String, value: Double): Identify_ = js.native
  
  /** Unset and remove a user property */
  def unset(key: String): Identify_ = js.native
}
