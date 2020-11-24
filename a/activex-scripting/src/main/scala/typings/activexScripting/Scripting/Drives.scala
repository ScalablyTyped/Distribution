package typings.activexScripting.Scripting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Collection of drives associated with drive letters */
@js.native
trait Drives extends js.Object {
  
  /** Get drive using the drive letter (`C`) or path (`C:\\`) */
  def apply(Key: String): Drive = js.native
  
  /** Number of drives */
  val Count: Double = js.native
  
  /** Get drive using the drive letter (`C`) or path (`C:\\`) */
  def Item(Key: String): Drive = js.native
}
